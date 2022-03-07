package Listas1;

public class Nodo {
    public Object dato;
    public Nodo siguienteNodo;
    
    public Nodo(Object d, Nodo s){
        this.dato=d;
        this.siguienteNodo=s;
    }
    
    public Nodo(Object d){
        this(d,null);
    }
    
}
