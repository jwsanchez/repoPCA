package pca.co.vistas;

import javax.swing.JOptionPane;
import pca.co.lista.simple.Nodo;
import pca.co.lista.simple.ListaSimple;

public class vistaListas {
    private ListaSimple lista;
    private int dato;
    private int datoInicio;
    private Nodo nodo = new Nodo();
    
    public vistaListas(){
        this.dato = 0;
        this.lista=new ListaSimple();
        this.nodo = new Nodo();
    }
    
    public void menuOpcion() {
        int seleccion;
        String[] options = {"Crear Lista", "Imprimir", "Buscar", "Salir"};
            seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        do{
            switch(seleccion){
                case 0: 
                    crearLista();
                    break;
                case 1: 
                    listar();
                    break;
                case 2: 
                    buscarNodo();
                    break;
                case 3: 
                    anexarNodoFinal();
                    break;
                case 4:
                    buscarNodo();
                    break;
                case 5:
                    borrarDatoInicio();
                    break;
                case 6:
                    borrarDatoFinal();
                    break;
                default: 
                    break;
                    
            }
        }while(seleccion!=7);
    }
    
    public void crearLista() {
        dato = 1;
        while (dato != 0) {
            datoInicio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero, 0 para volver atrás"));
            if (datoInicio != 0) {
                lista.anexarInicioLista(datoInicio);
            }
        }
    }
    
    /*public void crearLista(){
        dato = 1;
        while (dato != 0) {
            dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor anexar a la lista, 0 para volver atrás"));
            if(dato != 0){
                lista.anexarInicioLista(dato);
            }
            
        }
       // listar();
    }*/
    
    public void listar(){
        String laLista=lista.imprimirLista();
        JOptionPane.showMessageDialog(null, laLista);
    }
    
    public void anexarNodoInicio(){
        lista.anexarInicioLista(datoInicio);
        --datoInicio;
        //listar();
    }
    
    public void anexarNodoFinal(){
        dato++;
        lista.anexarFinalLista(dato);
        //listar();
    }
    
    public void buscarNodo(){
        int n=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a buscar"));
        if(lista.buscarNodo(n))
            JOptionPane.showMessageDialog(null, "Valor encontrado "+n);
        else
            JOptionPane.showMessageDialog(null, "Valor"+ n+" no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        //listar();
    }
    
    public void borrarDatoInicio(){
        if(lista.borrarNodoIncio())
            JOptionPane.showMessageDialog(null, "El nodo fue eliminado ");
        else
            JOptionPane.showMessageDialog(null, "El nodo no fue eliminado", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void borrarDatoFinal(){
        if(lista.borrarNodoFinal())
            JOptionPane.showMessageDialog(null, "El nodo fue eliminado ");
        else
            JOptionPane.showMessageDialog(null, "El nodo no fue eliminado", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    
    
    
    
    
    
}
