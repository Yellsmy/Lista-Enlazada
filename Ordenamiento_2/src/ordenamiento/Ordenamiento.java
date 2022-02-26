
package ordenamiento;

import java.util.Scanner;
import java.util.Arrays;

public class Ordenamiento {
    int opcion;
    Scanner op = new Scanner(System.in);
    Arreglo a = new Arreglo();
    
    public void menu(){
        boolean salir = false;        
        while(!salir){
           System.out.println("------ORDENAMIENTO DE ARREGLO-----"); 
           System.out.println("1. Agregar datos"); 
           System.out.println("2. Mostrar datos");
           System.out.println("3. Ordenar Ascendentemente");
           System.out.println("4. Ordenar Descendentemente");
           System.out.println("5. Salir");
           System.out.println("Ingresa una la opción");
           opcion = op.nextInt();
           op.nextLine();
           switch(opcion){
            case 1:
                AgregarDatos();
                break;
            case 2:
                a.Mostrar();
                break;
            case 3:
                System.out.println("Ordenamiento Ascendente\n");
                Ascendente();
                break;
                
            case 4:
                System.out.println("Ordenamiento Descendente\n");
                Descendente();
                break;
            case 5:
                salir = true;               
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            }
        }
    }
    
    public void AgregarDatos(){     
        int dato;
        System.out.println("Ingrese 10 números: ");
        for(int i=0; i < a.arreglo.length; i++){
            dato= op.nextInt();
            a.setArreglo(i, dato);           
        }
        System.out.println("FELICIDADES, HAS LLENADO TU ARREGLO");
    }
    
    public void Ascendente(){
        int[] arregloA = Arrays.copyOf(a.arreglo,a.arreglo.length);
        int temp;
        for(int i=0; i < arregloA.length; i++){
            for(int j=1; j < arregloA.length; j++){
                if(arregloA[j-1] > arregloA[j]){
                    temp = arregloA[j-1];
                    arregloA[j-1] = arregloA[j];
                    arregloA[j] = temp;
                }
            }
        }
        for(int i=0; i < arregloA.length; i++){
            System.out.print("\t"+arregloA[i]+"\n");
        }      
    }
    
    public void Descendente(){
        int[] arregloD = Arrays.copyOf(a.arreglo,a.arreglo.length);
        int temp;
        for(int i=0; i < arregloD.length; i++){
            for(int j=1; j < arregloD.length; j++){
                if(arregloD[j-1] < arregloD[j]){
                    temp = arregloD[j-1];
                    arregloD[j-1] = arregloD[j];
                    arregloD[j] = temp;
                }
            }
        }
        for(int i=0; i < arregloD.length; i++){
            System.out.print("\t"+arregloD[i]+"\n");
        }
    }
    
    public static void main(String[] args) {
       Ordenamiento persona = new Ordenamiento(); 
        persona.menu();
        
    }
    
}
