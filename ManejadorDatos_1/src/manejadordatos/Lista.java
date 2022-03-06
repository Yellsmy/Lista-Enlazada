
package manejadordatos;


public class Lista {
    protected Nodo inicio, fin;
    public Lista(){
        inicio = null;
        fin = null;       
    }
    
    public void agregar(int dato){
        inicio = new Nodo(dato, inicio);  //El puntero apuntara al nuevo elemento que se agrega y agregará un nuevo espacio vacío/null
        if(fin==null){
            fin = inicio; //El puntero se posicionará en el último dato ingresado
        }       
    }
    
    public void imprimirDato(){
        Nodo temp = inicio;
        while(temp!= null){
            System.out.println("[" + temp.dato + "]");
            temp = temp.siguiente;
        }
        
    }
    
    public void buscar(int busqueda){
        boolean acceso = false;
        Nodo temp = inicio;
        while(temp!= null){
            int datoAlmacenado = temp.dato;
            if(datoAlmacenado == busqueda){
                System.out.println("El número buscado es: " + temp.dato);
                acceso = true;
                break;
            }
            temp = temp.siguiente;
        }
        if (!acceso){
            System.out.println("Lo sentimos, el dato que deseas encontrar no existe en nuestra base de datos");
            System.out.println(":'(");
        }     
    }
    
    public boolean vacia(){
        if(this.inicio == null){
            return true;
        }
        return false;
    }
    
    
    public void agregarFinal(int dato){
        if(!vacia()){
            this.fin.siguiente = new Nodo(dato);
            this.fin = this.fin.siguiente;
        }
        else{
            this.inicio = this.fin = new Nodo(dato);
        }
    }
    
    public int eliminarAlInicio(){
        int dato = this.inicio.dato;
        if(this.inicio == this.fin){
            this.inicio = this.fin = null;
        }
        else{
            this.inicio= this.inicio.siguiente;
        }
        return dato;
    }
    
    public int eliminarAlFinal(){
        int dato = this.inicio.dato;
        if(this.inicio == this.fin){
            this.inicio = this.fin= null;
        }
        else{
            Nodo temp = inicio;
            while(temp.siguiente!=fin){
                temp = temp.siguiente;
            }
            fin = temp;
            fin.siguiente = null;
        }
        return dato;
    }
    
    public void eliminarDato(int busqueda){
        if(!vacia()){          
            boolean acceso = false;
            Nodo temp = this.inicio.siguiente;    //Puntero temporal que apunte al siguiente nodo de inicio
            Nodo anterior = this.inicio;          //Nuevo puntero que apunte al primer nodo
            
            while(temp!= null){                        //Mientras el puntero en su posición siguiente no sea null entonces que ejecute el código adentro
                if(temp.dato == busqueda){                  //Cuando encuentre el dato que se desea eliminar: 
                    anterior.siguiente=temp.siguiente;           //que anterior en su posición siguiente sea igual a temporal en su posición siguiente y se enlace con el número siguinte
                    System.out.println("El dato eliminado es: " + temp.dato);    //al número que se quiere eliminar
                    acceso = true;                   
                    break;  
                }
                else if (busqueda == this.inicio.dato){      //Si el dato que se quiere eliminar es el primero de la lista, que el puntero inicio sea el siguiente nodo     
                    System.out.println("El dato eliminado es: " + inicio.dato);
                    this.inicio = this.inicio.siguiente;                   
                    acceso = true;
                    break;
                }
                else if(busqueda == temp.dato && temp == fin){     //Si el dato que se eliminará es el último de la lista entonces que el puntero fin apunte a una posición anterior.
                    System.out.println("El dato eliminado es: " + temp.dato);
                    fin = anterior;                   
                    acceso = true;
                    break;
                }                
                temp = temp.siguiente;
                anterior = anterior.siguiente;
            }
            if( busqueda == this.inicio.dato && busqueda == this.fin.dato && this.inicio == this.fin){ // Si el dato que se quiere eliminar coincide con el único dato de la lista,
                this.inicio = this.fin= null;                                //que inicio y fin sea null para eliminar el único dato de la lista
                System.out.println("El dato eliminado es: " + busqueda);
                acceso = true;
            }
            if (!acceso){
                System.out.println("Lo sentimos, el dato que deseas eliminar no existe en nuestra base de datos");
                System.out.println(":'(");
            } 
        }
    }
}
