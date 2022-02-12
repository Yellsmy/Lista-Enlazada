
package registro;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Registro {
    String ArregloOriginal[][];
    int nFila;
    //Constructor
    public Registro(){
        ArregloOriginal =new String[20][7];
        int nFila=0;
    }
    //Métodos set y get
    public void setArreglo(int fila, int columna, String dato){
        ArregloOriginal[fila][columna] = dato;
    }
    public String getArreglo(int fila, int columna){
        return ArregloOriginal[fila][columna];
    }
    public void setFila(int N){
        nFila = N;
    }
    public int getFila(){
        return nFila;
    }
    
    //Método para el menú principal
    public void Menu(){
        Scanner op = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
        while(!salir){
            System.out.println("-------BIENVENIDO AL REGISTRO DE PERSONAS-------");
            System.out.println("El registro más seguro y óptimo que podrás encontrar XD");
            System.out.println("Elije una de las opciones a continuación");
            System.out.println("1. Agregar");
            System.out.println("2. Listar");
            System.out.println("3. Buscar");
            System.out.println("4. Salir");
            try{
                opcion = op.nextInt();  

                switch(opcion){
                    case 1:
                        System.out.println("INICIO DE TU REGISTRO");
                        Registrar();                       
                        break;
                    case 2:
                        System.out.println("A CONTINUACIÓN VERÁS TODAS LAS PERSONAS REGISTRADAS AL MOMENTO");
                        mostrarDatos();
                        break;
                    case 3:
                        Buscar();
                        break;
                    case 4:
                        salir = true;
                        System.out.println("Gracias por utilizar nuestro sistema de registro");
                        break;
                    default:
                        System.out.println("La opcion elegida es incorrecta, intente nuevamente");         
                }   
            }catch(InputMismatchException e){
                System.out.println("Debes introducir un número");
                op.next();
            }
        }        
    }
    
    
    public void Registrar(){
        //Variables para éste método
        int fila = 1;
        int columna = 7;
        int temp = 0;
        ArregloObjeto a = new ArregloObjeto(); //Llamamos a la clase ArregloObjeto
        Persona p = new Persona(); //Llamamos a la clase Persona  
        Scanner captura = new Scanner(System.in);
        for(int f=0; f< fila; f++){ //Llenamos el arreglo Original con los datos almacenados en el arreglo de la clase ArregloObjeto
            for(int c=0; c < ArregloOriginal[f].length; c++){
                setArreglo(f,c,a.getArreglo(f,c));
            }
        }
        while(true){
            String ArregloTemporal [][]= new String[fila][columna]; //Creamos una matriz temporal
            for(int f=0; f< fila-1; f++){ //Llenamos la matriz temporal con los datos que tiene la matrz de ésta clase
                for(int c=0; c < ArregloTemporal[f].length; c++){
                    ArregloTemporal[f][c] = getArreglo(f,c);
                }
            }
            //Pedimos datos al usuario y los asignamos a los atributos de la clase Persona
            System.out.println("Ingresa tus nombres: ");
            p.setnombres(captura.nextLine());
            System.out.println("Ingresa tus apellidos: ");
            p.setapellidos(captura.nextLine());
            System.out.println("Ingresa tu fecha de nacimiento: dd/MM/yyyy");
            p.setfNaciminto(captura.nextLine());
            System.out.println("Ingresa tu número de DPI: ");
            p.setdpi(captura.nextLine());
            System.out.println("Ingresa tus género:\n1.Mujer \n2.Hombre");           
            p.setgenero(captura.nextLine());
            System.out.println("Ingresa tu número de teléfono: ");
            p.settelefono(captura.nextLine());
            System.out.println("Ingresa tu dirección: ");
            p.setdireccion(captura.nextLine());
            for(int f=0; f< ArregloOriginal.length; f++){ //A la matriz temporal en la última fila la llenamos con los datos recabados
                ArregloTemporal[fila-1][0]= p.getnombres();
                ArregloTemporal[fila-1][1]= p.getapellidos();
                ArregloTemporal[fila-1][2]= p.getfNacimiento();
                ArregloTemporal[fila-1][3]= p.getdpi();
                ArregloTemporal[fila-1][4]= p.getgenero();
                ArregloTemporal[fila-1][5]= p.gettlefono();
                ArregloTemporal[fila-1][6]= p.getdireccion();
            }
            for(int f=0; f< fila; f++){ //Llenamos la matriz de ésta clase con los datos de la matriz temporal
                for(int c=0; c < ArregloOriginal[f].length; c++){
                    setArreglo(f,c,ArregloTemporal[f][c]);
                }
            }
            //Pregunta si el usuario quiere registrar a otra persona
            System.out.println("Desea hacer otro registro");
            System.out.println("1. Sí");
            System.out.println("1. No");
            temp = captura.nextInt();
            captura.nextLine();
            if (temp==1){ //Si la respuesta es "sí", que fila se incremente en uno y que el ciclo while continue
                fila = fila +1;
                continue;
            }
            else{  //Si la respusta es "No" que el ciclo se termine
                break;
            }
            
        }
        setFila(fila); //Asignamos el número total de filas que hemos usado al atributo "fila" de ésta clase
        //Llenamos la matriz de la clase ArregloObjeto para que el usuario al querer registrar de nuevo a otro usuario
        //no se pierda la información hasta el momento obtenida
        for(int f=0; f< a.arreglo.length; f++){ 
            for(int c=0; c < a.arreglo[0].length ; c++){
                a.setArreglo(f, c, ArregloOriginal[f][c]);                  
            }
        }
    }
    
    //Método para mostrar todos los datos
    public void mostrarDatos(){
        ArregloObjeto a = new ArregloObjeto(); //LLamamos de nuevo a la clase ArregloObjeto donde ya están guardados nuestros datos
        for(int f=0; f < getFila(); f++){ //Imprimimos todos los datos almacenados hasta el momento
            System.out.println("Nombres: "+getArreglo(f,0)+"\t Apellidos: "+getArreglo(f,1)+"\t Fecha de Nacimiento: "+getArreglo(f,2)+"\t DPI: "+getArreglo(f,3)+"\t Género: "+getArreglo(f,4)+"\t Teléfono: "+getArreglo(f,5)+"\t Dirección: "+getArreglo(f,6));
        }      
    }
    
    //Método para buscar datos
    public void Buscar(){
        Scanner captura = new Scanner(System.in);
        //Variables para éste método:
        int posicion;
        int valor;
        System.out.println("Elija una opción");
        System.out.println("1. Hacer Búsqueda por nombres y apellidos");
        System.out.println("2. Hacer búsqueda por DPI "); 
        valor = captura.nextInt();
        captura.nextLine();
        //String acceso = "si";

        while(true){
            try{
                if(valor==1){
                    String nombre, apellido;            
                    System.out.println("Ingrese su nombre");
                    nombre = captura.nextLine();
                    System.out.println("Ingrese su apellido");
                    apellido = captura.nextLine();
                    for(int f=0; f < getFila(); f++){ //Recorremos la matriz 
                        if(nombre.equalsIgnoreCase(getArreglo(f,0)) && apellido.equalsIgnoreCase(getArreglo(f,1))){
                            posicion = f;
                            System.out.println("Nombres: "+getArreglo(posicion,0)+"\t Apellidos: "+getArreglo(posicion,1)+"\t Fecha de Nacimiento: "+getArreglo(posicion,2)+"\t DPI: "+getArreglo(posicion,3)+"\t Género: "+getArreglo(posicion,4)+"\t Teléfono: "+getArreglo(posicion,5)+"\t Dirección: "+getArreglo(posicion,6));                     
                            
                        }break;                                 
                    }
                    break;                  
                }
                
                else if(valor==2){
                    String dpi;
                    System.out.println("Ingrese su número de DPI");
                    dpi = captura.nextLine();
                    for(int f=0; f < getFila(); f++){
                        if(dpi.equalsIgnoreCase(getArreglo(f,3))){
                            posicion = f;
                            System.out.println("Nombres. "+getArreglo(posicion,0)+"\t Apellidos. "+getArreglo(posicion,1)+"\t Fecha de Nacimiento: "+getArreglo(posicion,2)+"\t DPI. "+getArreglo(posicion,3)+"\t Género: "+getArreglo(posicion,4)+"\t Teléfono: "+getArreglo(posicion,5)+"\t Dirección: "+getArreglo(posicion,6));
                            break;
                        }
                    }break;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Solo puede ingresa números");
            }
        }

    }
    
    //Método Principal
    public static void main(String[] args) {
        Registro usuario = new Registro(); //Creamos un objeto
        usuario.Menu(); //Usamos el método Menú
    }
}
