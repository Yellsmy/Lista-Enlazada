
package manejadordatos;


public class Lista {
    protected Nodo inicio, fin;
    public Lista(){
        this.inicio = null;
        this.fin = null;       
    }
    
    public void agregar(String dato){
        inicio = new Nodo(dato, this.inicio);  //El puntero apuntara al nuevo elemento que se agrega y agregará un nuevo espacio vacío/null
        if(fin==null){
            fin = inicio; //El puntero se posicionará en el último dato ingresado
        }       
    }
    
    public void imprimirNombres(){
        Nodo temp = inicio;
        while(temp!= null){
            System.out.println("[" + temp.dato + "]");
            temp = temp.siguiente;
        }
    }
    
    public void buscar(String busqueda){
        Nodo temp = inicio;
        while(temp!= null){
            String datoAlmacenado = temp.dato;
            if(datoAlmacenado.equals(busqueda)){
                System.out.println("El nombre es: " + temp.dato);
            }
            temp = temp.siguiente;
        } 
    }
}