
package manejadordatos;

import java.util.Scanner;
public class ManejadorDatos {
Scanner op = new Scanner(System.in);
    Lista lista = new Lista();
    
    public void menu(){
        boolean salir = false;
        int opcion;
        
        while(!salir){
           System.out.println("------BIENVENIDO-----"); 
           System.out.println("1. Agregar número al inicio");
           System.out.println("2. Agregar número al Final");
           System.out.println("3. Mostrar número en la lista");
           System.out.println("4. Buscar un número");
           System.out.println("5. Eliminar Primer dato");
           System.out.println("6. Eliminar Último dato");
           System.out.println("7. Eliminar Dato Específico");
           System.out.println("8. Salir");
           System.out.println("Selecciona la opción");
           opcion = op.nextInt();
           op.nextLine();
           switch(opcion){
            case 1:
                agregar();
                break;
            case 2:
                agregarFinal();
                break;
            case 3:
                lista.imprimirDato();
                break;
            case 4:
                System.out.println("Ingrese un número a buscar: ");
                lista.buscar(op.nextInt());
                break;
            case 5:
                System.out.println("El número eliminado es: "+ lista.eliminarAlInicio());
                break;
            case 6:
                System.out.println("El número eliminado es: "+ lista.eliminarAlFinal());
                break;
            case 7:
                System.out.println("Ingrese Dato a Eliminar: ");
                lista.eliminarDato(op.nextInt());
                break;
            case 8:
                salir = true;
                System.out.println("GRACIAS POR UTILIZAR NUESTRO SERVICIO ");
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            }
        }
    }
    
    public void agregar(){
        int nombre;
        System.out.println("Ingrese número: ");
        nombre = op.nextInt();
        lista.agregar(nombre);
    }
    
    public void agregarFinal(){
        int numero;
        System.out.println("Ingrese número: ");
        numero = op.nextInt();
        lista.agregarFinal(numero);
    }
       
    public static void main(String[] args) {
        // TODO code application logic here
        ManejadorDatos objeto = new ManejadorDatos();
        objeto.menu();
    }
    
}
