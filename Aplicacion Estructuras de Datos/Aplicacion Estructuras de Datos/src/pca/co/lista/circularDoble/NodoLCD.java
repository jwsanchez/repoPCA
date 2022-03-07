package pca.co.lista.circularDoble;

public class NodoLCD {

    int valor;
    NodoLCD siguiente;
    NodoLCD anterior;

    public NodoLCD(int valor) {
        this.valor = valor;
        siguiente = this;
        anterior = this;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoLCD getEnlSig() {
        return siguiente;
    }

    public void setEnlSig(NodoLCD siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLCD getEnlAnt() {
        return anterior;
    }

    public void setEnlAnt(NodoLCD anterior) {
        this.anterior = anterior;
    }
}
