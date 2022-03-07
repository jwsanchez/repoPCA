package co.pca;

public class Lista {

    Nodo primerNodo;
    Object nombre;

    //Metodo Contructor
    public Lista() {
        nombre = null;
        primerNodo = null;
    }
    //Creando lista

    public Lista(Object s) {
        nombre = s;
        primerNodo = null;
    }

    public boolean VaciaLista() {
        return primerNodo == null;
    }

    public Object imprimirLista() {
        Object lista = "";
        if (VaciaLista()) {
            lista = "" + "Lista " + nombre + " vacia";
        } else {
            lista += "La lista " + nombre + " contiene:";
            Nodo actual = primerNodo.getEnlace();
            lista += "" + primerNodo.getInfo();
            while (actual != primerNodo) {
                lista += "" + actual.getInfo();
                actual = actual.getEnlace();
            }
        }
        return lista;
    }

    public void anexarNodoFinal(Object elementoIn) {
        if (VaciaLista()) {
            primerNodo = new Nodo(elementoIn);
            primerNodo.setEnlace(primerNodo);
        } else {
            Nodo aux = primerNodo;
            while (aux.getEnlace() != primerNodo) {
                aux = aux.getEnlace();
            }
            Nodo temporal = new Nodo(elementoIn);
            aux.setEnlace(temporal);
            temporal.setEnlace(primerNodo);
        }
    }

    public boolean retirarNodo() {
        boolean borrar = false;
        if (VaciaLista()) {
            System.out.println("No hay ningun elemento");
        } else if (primerNodo.getEnlace() == primerNodo) {
            primerNodo = null;
        } else {
            Nodo aux = primerNodo;
            while (aux.getEnlace() != primerNodo) {
                aux = aux.getEnlace();
            }
            primerNodo = primerNodo.getEnlace();
            aux.setEnlace(primerNodo);
            borrar = true;
        }
        return borrar;
    }
}

