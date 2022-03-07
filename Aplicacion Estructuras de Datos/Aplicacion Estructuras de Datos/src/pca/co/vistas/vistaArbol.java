package pca.co.vistas;

import javax.swing.JOptionPane;
import pca.co.arbol.Arbol;
import pca.co.arbol.Nodo;

public class vistaArbol {

    private int dato;
    private Nodo nodo;
    private Arbol arbol;

    public vistaArbol() {
        this.dato = 0;
        this.arbol = new Arbol(dato);
        this.nodo = new Nodo();
    }

    public void menuOpcion() {
        int seleccion;
        nodo = arbol.obtenerRaiz();
        do {
            //imprimirMenu();
            String[] options = {"Crear Arbol", "Imprimir", "Buscar", "Salir"};
            seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            //seleccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opción"));
            switch (seleccion) {
                case 0:
                    crearArbol();
                    break;
                case 1:
                    arbol.imprimirPreOrden(nodo);
                    break;
                case 2:
                    buscarDato();
                    break;
                default:
                    break;
            }

        } while (seleccion != 3);
    }

    public void crearArbol() {
        dato = 1;
        while (dato != 0) {
            dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero, 0 para volver atrás"));
            if (dato != 0) {
                arbol.anexarNodo(dato);
            }
        }
    }

    public void buscarDato() {
        //dato = 1;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar"));
        arbol.buscarElemento(dato, nodo);
    }

}
