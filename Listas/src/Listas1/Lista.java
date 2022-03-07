package Listas1;

public class Lista {
    public Nodo primerNodo, ultimoNodo;
    public Lista(){
        this.primerNodo = this.ultimoNodo = null;
        
    }
    
    public boolean estaVacia(){
        return this.primerNodo==null;
    }
    
    public void insertarInicio(Object d){
        if(estaVacia()){
            this.primerNodo = this.ultimoNodo = new Nodo(d);
        }else{
            this.primerNodo = new Nodo(d,this.primerNodo);
        }
    }
    
    public Object eliminarInicio(){
        if(estaVacia()){
            System.out.println("Lista está vacia");
            return null;
        }
        Object elementoEliminado = this.primerNodo.dato;
        if(this.primerNodo == this.ultimoNodo){
            this.primerNodo = this.ultimoNodo = null;
        }else{
            this.primerNodo = this.primerNodo.siguienteNodo;
        }
        return elementoEliminado;
    }
    
    public void insertarFinal(Object d){
        if(estaVacia()){
            this.primerNodo = this.ultimoNodo = new Nodo(d);
        }else{
            this.ultimoNodo = this.ultimoNodo.siguienteNodo = new Nodo(d);
        }
    }
    
    public Object eliminarFinal(){
        if(estaVacia()){
            System.out.println("Lista está vacia");
            return null;
        }
        Object elementoEliminado = this.ultimoNodo.dato;
        if(this.primerNodo == this.ultimoNodo){
            this.primerNodo = this.ultimoNodo = null;
        }else{
            Nodo actual = this.primerNodo;
            while(actual.siguienteNodo != this.ultimoNodo){
                actual = actual.siguienteNodo;
            }
            actual.siguienteNodo = null;
            this.ultimoNodo = actual;
        }
        return elementoEliminado;
    }
    
    public void imprimir(){
        if(estaVacia()){
            System.out.println("La lista está vacia");
        }else{
           Nodo actual = this.primerNodo;
           while(actual != null){
               System.out.println(actual.dato.toString());
               actual = actual.siguienteNodo;
           }
        }
    }
}
