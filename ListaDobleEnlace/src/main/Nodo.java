package main;
public class Nodo {
    public int info;
    public Nodo anterior;
    public Nodo proximo;
    
    public Nodo(){
        this.info=0;
        this.anterior=null;
        this.proximo=null;
    }
    
    public Nodo(int info){
        this.info=0;
        this.anterior=null;
        this.proximo=null;
    }
    
    public int getinfo(){
        return info;
    }
    
    public void setinfo(int info){
        this.info=info;
    }
    
    public Nodo getAnterior(){
        return anterior;
    }
}
