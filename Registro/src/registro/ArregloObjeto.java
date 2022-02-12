
package registro;


public class ArregloObjeto {
    int fila;
    int columna;
    String arreglo[][];
    
    public ArregloObjeto(){
        fila = 0;
        columna = 0;
        arreglo = new String[20][7];
    }
    
    //public void CrearArreglo(int f, int c){
       // arreglo = new String[f][c];
    //}
    public void setFila(int N){
        fila = N;
    }
    public int getFila(){
        return fila;
    }
    public void setColumna(int N){
        columna = N;
    }
    public int getColumna(){
        return columna;
    }
    public void setArreglo(int fila, int columna, String dato){
        arreglo[fila][columna] = dato;
    }
    public String getArreglo(int fila, int columna){
        return arreglo[fila][columna];
    }

}

/*public class ArregloObjeto {
    int tamano;
    Persona arreglo[];
    
    public ArregloObjeto(){
        tamano = 0;
        arreglo = null;
    }
    
    public void CrearArreglo(){
        arreglo = new Persona[tamano];
    }
    public void setTamaño(int N){
        tamano = N;
    }
    public int getTamaño(){
        return tamano;
    }
    public void setArreglo(int posicion, Persona a){
        arreglo[posicion] = a;
    }
    public Persona getArreglo( int posicion){
        return arreglo[posicion];
    }
    
    public class ArregloObjeto {
    int fila;
    int columna;
    String arreglo[][];
    
    public ArregloObjeto(){
        fila = 0;
        columna = 0;
        arreglo = null;
    }
    
    public void CrearArreglo(int f, int c){
        arreglo = new String[f][c];
    }
    public void setFila(int N){
        fila = N;
    }
    public int getFila(){
        return fila;
    }
    public void setColumna(int N){
        columna = N;
    }
    public int getColumna(){
        return columna;
    }
    public void setArreglo(int fila, int columna, String dato){
        arreglo[fila][columna] = dato;
    }
    public String getArreglo( int fila, int columna){
        return arreglo[fila][columna];
    }

}
*/
