package pca.co.lista.circular;

public class NodoLC {

    int valor;
    NodoLC siguiente;

    public NodoLC(int valor) {
        this.valor = valor;
        siguiente = this;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoLC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLC siguiente) {
        this.siguiente = siguiente;
    }
}
