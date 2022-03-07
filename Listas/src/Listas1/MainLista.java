package Listas1;

public class MainLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        String prueba = "Mundo";
        String cadena = "Hola";
        
        lista.insertarInicio(prueba);
        lista.insertarInicio(cadena);
        lista.insertarFinal(cadena);
        lista.imprimir();
        System.out.println("/////////////////////");
        lista.eliminarFinal();
        lista.imprimir();
        System.out.println("/////////////////////");
        lista.eliminarInicio();
        lista.imprimir();
    }
}
