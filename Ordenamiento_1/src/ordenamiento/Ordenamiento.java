
package ordenamiento;

public class Ordenamiento {
    //Método de Burbuja
    static void Burbuja(int[] arreglo) {
        int n = arreglo.length;
        int temp = 0;
        for(int i=0; i < n; i++){
             for(int j=1; j < (n-i); j++){
                if(arreglo[j-1] > arreglo[j]){
                    temp = arreglo[j-1];
                    arreglo[j-1] = arreglo[j];
                    arreglo[j] = temp;
                }
             }
         }
    }
    
//Método Quicksort
    public static int Quicksort(int[]arreglo, int inicio, int fin){
        int pivote = arreglo[inicio];     //El primer elemento del arreglo será el pivote
        int temporal;                 
        while (true){
            while (arreglo[inicio] < pivote){                //busca el elemento mayor del pivote
                inicio ++;               
            }
            while (arreglo[fin] > pivote){                   //busca el elemento menor del pivote
                fin --;
            }
            if (inicio >= fin){                              //Si el inicio es mayor o igual al fin se rompe el ciclo
                break;
            }
            else {                                           //Sino hace el intercambio de dato para ordenar el arreglo
                temporal = arreglo[inicio];
                arreglo[inicio] = arreglo[fin];
                arreglo[inicio]= temporal;
                inicio ++;
                fin --;               
            }
        }
        return 0;
                
    }
    
    //Método Principal
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.agregarAlInicio("Wenas");
        lista.agregarAlInicio("Wilson");
        lista.agregarAlInicio("Es");
        lista.agregarAlInicio("Mi nombre");
        lista.agregarAlInicio("Hola");
        lista.mostrarLista();
    }
    
   
}