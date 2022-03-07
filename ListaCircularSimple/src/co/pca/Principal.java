package co.pca;

public class Principal {
    public static void main(String[] args) {
        ListaCircular estudiantes = new ListaCircular("estudiantes");
        estudiantes.anexarNodo("Camila ");
        System.out.println(estudiantes.imprimirLista());
        estudiantes.anexarNodoFinal("Jesus ");
        estudiantes.anexarNodoFinal("Carlos ");
        estudiantes.retirarNodo();
        estudiantes.anexarNodoFinal("Pedro ");
        System.out.println(estudiantes.imprimirLista());        
    }
}
