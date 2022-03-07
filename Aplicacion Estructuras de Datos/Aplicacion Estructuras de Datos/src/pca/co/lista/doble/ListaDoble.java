package pca.co.lista.doble;

import javax.swing.JOptionPane;

public class ListaDoble {

    private Nodo cabeza;
    private Nodo cola;

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    public void crearListaDoble(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.setProximo(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
            cola.setProximo(null);
        }
    }

    public boolean esVacia() {
        return (cabeza == null);
    }

    public void anexarNodoInicio() {
        if (!esVacia()) {
            int dato = 0;
            dato = cabeza.getInfo() - 1;
            Nodo nuevo = new Nodo(dato);
            cabeza.setAnterior(nuevo);
            nuevo.setProximo(cabeza);
            cabeza = nuevo;
            cabeza.setAnterior(null);
        }
    }

    public void anexarNodoFinal(int dato) {
        if (!esVacia()) {
            Nodo nuevo = new Nodo(dato);
            cola.setProximo(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
            cola.setProximo(null);
        }
    }

    public void buscarNodo(int dato) {
        Nodo p = cabeza;
        Nodo q = cola;
        while (dato != p.getInfo()) {
            p.getProximo();
            if (p.getInfo() == dato || q.getInfo() == dato) {
                JOptionPane.showMessageDialog(null, "Se encontró el valor " + dato + " en la lista");
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Valor no encontrado");
            }
        }
    }

    public boolean borrarNodoInicio() {
        if (esVacia()) {
            return false;
        }
        if (cabeza.getProximo() == null) {
            cabeza = null;
            cola = null;
            return false;
        } else {
            Nodo temp = cabeza;
            cabeza = cabeza.getProximo();
            cabeza.setAnterior(null);
            temp.setProximo(null);
            return true;
        }
    }

    public boolean borrarNodoFinal() {
        if (esVacia()) {
            return false;
        }
        if (cabeza.getProximo() == null) {
            cabeza = null;
            cola = null;
            return false;
        } else {
            Nodo temp = cola;
            cola = cola.getAnterior();
            cola.setProximo(null);
            temp.setAnterior(null);
            return true;
        }
    }

    public String listarDobleInicio() {
        String str = "";
        Nodo p = cabeza;
        while (p.getProximo() != null) {
            str += "<- [" + p.getInfo() + "] ->";
            p = p.getProximo();
        }
        str += p.getInfo() + "";
        return str;
    }

    public String listarDobleFinal() {
        String str = "";
        Nodo p = cola;
        while (p.getAnterior() != null) {
            str += "<- [" + p.getInfo() + "] ->";
            p = p.getAnterior();
        }
        str += p.getInfo() + "";
        return str;
    }

}
