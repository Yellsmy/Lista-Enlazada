
package registro;
//import java.util.Scanner;
public class Persona {
    
    private String nombres;
    private String apellidos;
    private String fNacimiento;
    private String dpi;
    private String genero;
    private String telefono;
    private String direccion;
    
    //Constructor
    public Persona(){
        nombres = " ";
        apellidos = " ";
        fNacimiento = "";
        dpi = "";
        genero = " ";
        telefono = "";
        direccion = " ";     
    }
    
    //Get y Set de cada variable
    public void setnombres(String nombres){
        this.nombres = nombres; 
    }
    
    public String getnombres(){
        return nombres;
    }
    
    public void setapellidos(String apellidos){
        this.apellidos = apellidos; 
    }
    
    public String getapellidos(){
        return apellidos;
    }
    public void setfNaciminto(String fNacimiento){
        this.fNacimiento = fNacimiento; 
    }
    
    public String getfNacimiento(){
        return fNacimiento;
    }
    public void setdpi(String dpi){
        this.dpi = dpi; 
    }
    
    public String getdpi(){
        return dpi;
    }
    public void setgenero(String genero){
        if(genero.equalsIgnoreCase("1")){
            this.genero = "Mujer";
        }
        else if(genero.equalsIgnoreCase("2")){
            this.genero = "Hombre";
        }
        else{
            this.genero = "N/E"; 
        }
    }
    
    public String getgenero(){
        return genero;
    }
    public void settelefono(String telefono){
        this.telefono = telefono; 
    }
    
    public String gettlefono(){
        return telefono;
    }
    public void setdireccion(String direccion){
        this.direccion = direccion; 
    }
    
    public String getdireccion(){
        return direccion;
    }

    /*public void registrar(Persona [] arreglo){
        Scanner captura = new Scanner(System.in);
        int temp;
        System.out.println("Ingresa tus nombres: ");
        nombres = captura.nextLine();
        System.out.println("Ingresa tus apellidos: ");
        apellidos = captura.nextLine();
        System.out.println("Ingresa tu fecha de nacimiento: ");
        fNacimiento = captura.nextLine();
        System.out.println("Ingresa tu número de DPI: ");
        dpi = captura.nextLine();
        System.out.println("Ingresa tus género: 1.Mujer /n  2.Hombre   /n    3.Indefinido");
        temp = captura.nextInt();
        System.out.println("Ingresa tu número de teléfono: ");
        telefono = captura.nextInt();
        System.out.println("Ingresa tu dirección: ");
        direccion = captura.nextLine();
        
        ArregloObjeto objeto = new ArregloObjeto();
    }*/
}
