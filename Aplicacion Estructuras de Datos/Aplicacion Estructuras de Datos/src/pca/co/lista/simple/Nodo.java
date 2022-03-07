package pca.co.lista.simple;

public class Nodo {
    private int info;
    private Nodo enlace;
    
    //Metodos constructores
    public Nodo(){
        this.info = 0;
        this.enlace = null;
    }
    
    public Nodo(int info){
        this.info = info;
        this.enlace = null;
    }
    // Metodos getters y setters
    public int getInfo(){
        return info;
    } 
    
    public void setInfo(int info){
        this.info = info;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    } 
}
