package pca.co;

//import pca.co.vistas.vistaArbol;

import javax.swing.JOptionPane;
import pca.co.vistas.vistaArbol;
import pca.co.vistas.vistaListaDoble;
import pca.co.vistas.vistaListas;


public class Principal {
    public static void main(String[] args) {
        //Acá irá solo la ejecución de las funciones.
        
        
        
        
        
        menu();
    }
    
    public static void menu(){
        int opcion;
        String[] options = {"Arbol", "Lista Simple", "Lista Doble"};
            opcion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        switch (opcion){
            case 0:
                vistaArbol arbol = new vistaArbol();
                arbol.menuOpcion();
            case 1: 
                vistaListas lista = new vistaListas();
                lista.menuOpcion();
            case 2:
                vistaListaDoble listaDoble = new vistaListaDoble();
                listaDoble.menuOpcion();
        }
    }
}
