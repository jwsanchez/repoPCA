package pca.co.lista.circularDoble;

import javax.swing.JOptionPane;

public class ListaCircularDoble {

    NodoLCD inicio;
    NodoLCD fin;

    public ListaCircularDoble() {
        inicio = null;
        fin = null;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public ListaCircularDoble Insertar(int valor) {
        NodoLCD nuevo = new NodoLCD(valor);
        if (esVacia()) {
            inicio = nuevo;
            inicio.setEnlSig(inicio);
            nuevo.setEnlAnt(fin);
            fin = nuevo;
        } else {
            fin.setEnlSig(nuevo);
            nuevo.setEnlSig(inicio);
            nuevo.setEnlAnt(fin);
            fin = nuevo;
            inicio.setEnlAnt(fin);
        }
        return this;
    }

    public void Eliminar(int valor) {
        NodoLCD aux = new NodoLCD(0);
        NodoLCD aux2 = new NodoLCD(0);
        aux = inicio;
        aux2 = fin;
        do {
            if (aux.getValor() == valor) {
                if (aux == inicio) {
                    inicio = inicio.getEnlSig();
                    fin.setEnlSig(inicio);
                    inicio.setEnlAnt(fin);
                } else if (aux == fin) {
                    fin = aux2;
                    inicio.setEnlAnt(fin);
                    fin.setEnlSig(inicio);
                } else {
                    aux2.setEnlSig(aux.getEnlSig());
                    aux.setEnlSig(aux2);
                    aux.setEnlAnt(aux2);
                }
            }
            aux2 = aux;
            aux = aux.getEnlSig();
        } while (aux != inicio);
    }

    public void Listar() {
        NodoLCD aux = inicio;
        String stri = "";
        do {
            stri = stri + " <-(" + aux.getValor() + ")->";
            aux = aux.getEnlSig();
        } while (aux != inicio);
        JOptionPane.showMessageDialog(null,"La lista quedó así\n" + stri);
        stri = "";
    }

    public void Buscar(int valor) {
        NodoLCD aux = fin;
        boolean buscar = false;
        do {
            if (aux.getValor() == valor) {
                buscar = true;
            }
            aux = aux.getEnlAnt();
        } while (aux != fin);
        if (buscar) {
            JOptionPane.showMessageDialog(null,"Se encontró el valor "+valor);
        } else {
            JOptionPane.showMessageDialog(null,"No se encontró el valor, por favor verifique");
        }

    }

    public void Actualizar(int valor) {
        int valorNuevo;
        NodoLCD aux = inicio;
        boolean buscar = false;
        do {
            if (aux.getValor() == valor) {
                valorNuevo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un nuevo valor: "));
                aux.setValor(valorNuevo);
                buscar = true;
            }
            aux = aux.getEnlSig();
        } while (aux != inicio);
        if (buscar) {
            JOptionPane.showMessageDialog(null,"Se actualizó el valor "+valor);
        } else {
            JOptionPane.showMessageDialog(null,"No se encontró el valor");
        }
    }
}
