
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
           System.out.println("1. Agregar"); 
           System.out.println("2. Mostrar");
           System.out.println("3. Buscar");
           System.out.println("4. Salir");
           System.out.println("Selecciona la opción");
           opcion = op.nextInt();
           op.nextLine();
           switch(opcion){
            case 1:
                agregar();
                break;
            case 2:
                lista.imprimirNombres();
                break;
            case 3:
                //buscarN();
                System.out.println("Ingrese nombre a buscar: ");
                lista.buscar(op.nextLine());
                break;
            case 4:
                salir = true;               
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            }
        }
    }
    
    public void agregar(){
        String nombre;
        System.out.println("Ingrese nombre: ");
        nombre = op.nextLine();
        lista.agregar(nombre);
    }
    
    public void buscarN(){
        String busqueda;
        System.out.println("Ingrese nombre a buscar: ");
        busqueda = op.nextLine();
        System.out.println("El nombre capturado es: "+busqueda);
        lista.buscar(busqueda);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ManejadorDatos objeto = new ManejadorDatos();
        objeto.menu();
    }
    
}
