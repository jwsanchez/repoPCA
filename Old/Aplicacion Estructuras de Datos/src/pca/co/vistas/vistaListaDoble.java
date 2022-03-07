package pca.co.vistas;

import javax.swing.JOptionPane;
import pca.co.lista.doble.ListaDoble;

public class vistaListaDoble {

    private ListaDoble lista;
    private int dato;

    public vistaListaDoble() {
        this.lista = new ListaDoble();
        this.dato = 0;
    }

    public void menuOpcion() {
        int seleccion;
        do {
            //imprimirMenu();
            String[] options = {"Crear Lista Doble", "Imprimir", "Buscar", "Salir"};
            seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            //seleccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opción"));
            switch (seleccion) {
                case 0:
                    crearListaDoble();
                    break;
                case 1:
                    listarInicio();
                    break;
                case 2:
                    buscarNodo();
                    break;
                default:
                    break;
            }

        } while (seleccion != 3);
    }
    
    public void crearListaDoble(){
        lista=new ListaDoble();
        dato = 1;
        while (dato != 0) {
            dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero, 0 para volver atrás"));
            if (dato != 0) {
                lista.crearListaDoble(dato);
                this.dato=dato;
            }
        }
    }
    
    public void listarInicio(){
        String laLista=lista.listarDobleInicio();
        JOptionPane.showMessageDialog(null, laLista);
    }
    
    public void buscarNodo(){
        int buscar=Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar"));
        lista.buscarNodo(buscar);
    }

}
