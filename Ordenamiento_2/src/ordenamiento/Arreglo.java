
package ordenamiento;

public class Arreglo {
    int arreglo [];
    
    public Arreglo(){
        arreglo = new int[10];
    }
    
    public void setArreglo(int posicion, int dato){
        arreglo[posicion] = dato;
    }
    
    public int getArreglo(int pocision){
        return arreglo[pocision];
    }
    
    public void Mostrar(){
        System.out.println("Los datos ingresados en la lista son: ");
        for(int i=0; i < arreglo.length; i++){ 
            System.out.println("\t"+getArreglo(i)+"\n");
        }      
    }
    
}