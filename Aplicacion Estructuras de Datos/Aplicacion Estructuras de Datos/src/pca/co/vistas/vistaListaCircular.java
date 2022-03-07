package pca.co.vistas;

import javax.swing.JOptionPane;
import pca.co.lista.circular.listaCircular;

public class vistaListaCircular {
    
    private int dato;
    private listaCircular lista;
    
    public vistaListaCircular(){
        this.dato=0;
        this.lista= new listaCircular();
    }
    
    public void menuOpcion(){
        int seleccion;
        do{
        String[] options = {"Crear Lista", "Imprimir", "Buscar", "Actualizar", "Eliminar",  "Salir"};
            seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            switch(seleccion){
                case 0:
                    crearListaCircular();
                    break;
                case 1:
                    imprimir();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    actualizar();
                    break;
                case 4:
                    eliminar();
                    break;
                default:
                    break;
            }
        }while(seleccion !=5);
    }
    
    public void crearListaCircular(){
        lista=new listaCircular();
        dato=1;
        while(dato!=0){
            dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero, 0 para volver atrás"));
            if(dato!=0){
                lista.Insertar(dato);
            }
        }
    }
    
    public void imprimir(){
        lista.Listar();
    }
    
    public void buscar(){
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a buscar"));
        lista.Buscar(dato);
    }
    
    public void actualizar(){
        int numero;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a remplazar"));
        lista.Actualizar(dato);
    }
    
    public void eliminar(){
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a eliminar"));
        lista.Eliminar(dato);
    }
}

