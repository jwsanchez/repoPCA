package co.pca.listas;
public class Nodo {
    // Variable para almacenar el valor del nodo.
    private int valor;
    // Variable para enlazar un nodo al nodo siguiente.
    private Nodo siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    /**
     * 
     * @return el valor que contiene el nodo
     */
    public int getValor() {
        return valor;
    }

    /**
     * 
     * @param valor: Almacena la información en el nodo.
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

   /**
    * 
    * @return Devuelve el apuntador al siguiente nodo.
    */     
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * 
     * @param siguiente Establece el apuntador al siguiente nodo
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }   
}