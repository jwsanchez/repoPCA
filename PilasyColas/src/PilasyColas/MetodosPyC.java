package PilasyColas;

public class MetodosPyC {

    public static void main(String[] args) {
        OperacionesPyC pila = new OperacionesPyC();
        pila.apilar("Objeto 1 ");
        pila.apilar("Objeto 2");
        pila.apilar("Objeto 3");
        pila.apilar("Objeto 4");
        pila.apilar("Objeto 5");

        System.out.println("El tamaño de la pila es: " + pila.size());
        System.out.println("El tope de la pilas es: " + pila.Tope());
        pila.desapilar("Objeto 5");
        System.out.println("El tamaño de la pila es: " + pila.size());
        pila.desapilar("Objeto 4");
        System.out.println("El tope de la pilas es: " + pila.Tope());
        System.out.println("El tamaño de la pila es: " + pila.size());

    }

}
