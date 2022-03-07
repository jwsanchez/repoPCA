package pca.co.arbol;

public class Nodo {
    private int info;
    private Nodo nodoIzq;
    private Nodo nodoDer;
    
    public Nodo(){
        this.info=0;
        this.nodoIzq=null;
        this.nodoDer=null;
    }
    
    public Nodo(int x){
        this.info=x;
        this.nodoIzq=null;
        this.nodoDer=null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public void setNodoIzq(Nodo nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    public Nodo getNodoDer() {
        return nodoDer;
    }

    public void setNodoDer(Nodo nodoDer) {
        this.nodoDer = nodoDer;
    }
    
    
}
