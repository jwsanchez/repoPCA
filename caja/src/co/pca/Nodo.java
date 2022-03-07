package co.pca;

public class Nodo {
    private Object info;
    private Nodo enlace;
    
    public Nodo(){
        this.info = "";
        this.enlace = null;
    }

    public Nodo(Object info){
        this.info = info;
        this.enlace = null;
    }

    //Metodos Get de los atributos
    public Object getInfo(){
        return info;
    }

    public Nodo getEnlace(){
        return enlace;
    } 

    //Metodos Set de los atributos

    public void setInfo(Object info){
        this.info = info;
    }

    public void setEnlace(Nodo enlace){
        this.enlace = enlace;
    }
}
