
package ordenamiento;


public class Lista {
    protected Nodo inicio, fin;
   
    public Lista(){
        this.inicio = null;
        this.fin = null;
    }
   
    public void agregarAlInicio(String elemento){
        inicio = new Nodo(elemento,this.inicio);
        if(fin == null){
            fin = inicio;
        }
    }
   
    public void mostrarLista(){
        Nodo aux = inicio;
        while(aux != null){
            System.out.print("[" + aux.dato + "]->");
            aux=aux.siguiente;
        }
    }
   
}