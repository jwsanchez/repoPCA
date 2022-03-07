package pca.co.lista.circular;

import javax.swing.JOptionPane;

public class listaCircular {

    NodoLC fin;

    public listaCircular() {
        fin = null;
    }

    public boolean esVacia() {
        return fin == null;
    }

    public listaCircular Insertar(int valor) {
        NodoLC nuevo = new NodoLC(valor);
        if (!esVacia()) {
            nuevo.setSiguiente(fin.getSiguiente());
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        return this;
    }

    public listaCircular InsertarAlInicio(int valor) {
        NodoLC nuevo = new NodoLC(valor);
        if (!esVacia()) {
            nuevo.setSiguiente(fin.getSiguiente());
            fin.setSiguiente(nuevo);
        } else {
            fin = nuevo;
        }
        return this;
    }

    public void Eliminar(int valor) {
        NodoLC temp;
        boolean buscar = false;
        temp = fin;
        while (temp.getSiguiente() != fin && !buscar) {
            buscar = (temp.getSiguiente().getValor() == valor);
            if (!buscar) {
                temp = temp.getSiguiente();
            }
        }
        buscar = (temp.getSiguiente().getValor() == valor);
        if (buscar) {
            NodoLC aux = temp.getSiguiente();
            if (fin == fin.getSiguiente()) {
                fin = null;
            } else {
                if (aux == fin) {
                    fin = temp;
                }
                temp.setSiguiente(aux.getSiguiente());
            }
            aux = null;
        } else {
            JOptionPane.showMessageDialog(null, "Valor digitado no valido o no existe");
        }
    }

    public void Listar() {
        NodoLC aux = fin.getSiguiente();
        String stri = "";
        do {
            stri = stri + "[" + aux.getValor() + "]->";
            aux = aux.getSiguiente();
        } while (aux != fin.getSiguiente());
        JOptionPane.showConfirmDialog(null, stri);
    }

    public void Buscar(int valor) {
        NodoLC aux;
        boolean buscar = false;
        aux = fin;
        while (aux.getSiguiente() != fin && !buscar) {
            buscar = (aux.getSiguiente().getValor() == valor);
            if (!buscar) {
                aux = aux.getSiguiente();
            }
        }
        if (buscar) {
            JOptionPane.showMessageDialog(null, "El valor ingresado está en la lista "+valor);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el valor");
        }

    }
    

    public void Actualizar(int valor) {
        int valorNuevo;
        NodoLC aux;
        boolean buscar = false;
        aux = fin;
        while (aux.getSiguiente() != fin && !buscar) {
            buscar = (aux.getValor() == valor);
            if (buscar) {
                valorNuevo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un nuevo valor: "));
                aux.setValor(valorNuevo);
                buscar = true;
            } else {
                aux = aux.getSiguiente();
            }
        }

    }

}
