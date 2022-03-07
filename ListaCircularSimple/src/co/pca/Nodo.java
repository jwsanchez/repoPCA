package co.pca;

public class Nodo {
    private String info;
    private Nodo enlace;

    public Nodo(){
        this.info = "";
        this.enlace = null;
    }

    public Nodo(String info){
        this.info = info;
        this.enlace = null;
    }

    //Metodos Get de los atributos
    public String getInfo(){
        return info;
    }

    public Nodo getEnlace(){
        return enlace;
    } 

    //Metodos Set de los atributos

    public void setInfo(String info){
        this.info = info;
    }

    public void setEnlace(Nodo enlace){
        this.enlace = enlace;
    }
}

