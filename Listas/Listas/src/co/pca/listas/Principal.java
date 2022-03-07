package co.pca.listas;
public class Principal {
    
    public static void main(String args[])
    {
        ListaEnlazada listaE = new ListaEnlazada();

        System.out.println(listaE);
        System.out.println(listaE.getTamanio());

        listaE.agregarAlFinal(20);

        System.out.println(listaE);
        System.out.println(listaE.getTamanio());

        listaE.agregarAlFinal(30);        

        System.out.println(listaE);
        System.out.println(listaE.getTamanio());
        
        listaE.eliminarInicio();
        System.out.println(listaE);
        System.out.println(listaE.getTamanio());   
        
    }
    
}
