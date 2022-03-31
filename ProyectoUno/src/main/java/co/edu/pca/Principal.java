package co.edu.pca;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Estudiante Estudiantes[] = new Estudiante[3];
        String[] optiones = {"Sistemas", "Contabilidad", "Negocios Internacionales"};
        int op = 0;
        int i = 0, x = 1, y = 1;
        String cadena = "";
        while (op <= 4) {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la opcion que desee\n\n" + ""
                    + "1 - Ingresar un estudiante \n" + "2 - Promedio mas bajo\n"
                    + "3 - Promedio mas alto\n" + "4 - Listado de estudiantes\n"
                    + "5 - Salir"));
            switch (op) {
                case 1:
                    if (i < Estudiantes.length) {
                        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de identificacion"));
                        String nombre = JOptionPane.showInputDialog(null, "Nombre del estudiante");
                        String programa = (String) JOptionPane.showInputDialog(null, "Programa al cual pertenece?", "Seleccione una opcion",
                                JOptionPane.QUESTION_MESSAGE, null, optiones, optiones[0]);
                        double promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Promedio Academico"));
                        while (i < Estudiantes.length) {
                            Estudiantes[i] = new Estudiante(programa, promedio, id, nombre);
                            break;
                        }
                        i++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Supero el limite de estudiantes");
                    }

                    break;
                case 2:
                    if (Estudiantes[Estudiantes.length - 1] == null) {
                        JOptionPane.showMessageDialog(null, "No hay estudiantes suficientes registrados");
                    } else {
                        double promedioG = 999;
                        double prom[] = new double[Estudiantes.length];
                        for (int p = 0; p < Estudiantes.length; p++) {
                            prom[p] = Estudiantes[p].getPromedio();
                            if (prom[p] < promedioG) {
                                promedioG = prom[p];
                                x = p;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "El promedio menor es: \n" + Estudiantes[x].toString());
                    }
                    break;

                case 3:
                    if (Estudiantes[Estudiantes.length - 1] == null) {
                        JOptionPane.showMessageDialog(null, "No hay estudiantes suficientes registrados");
                    } else {
                        double promedioS = 0;
                        double promS[] = new double[Estudiantes.length];
                        for (int p = 0; p < Estudiantes.length; p++) {
                            promS[p] = Estudiantes[p].getPromedio();
                            if (promS[p] > promedioS) {
                                promedioS = promS[p];
                                y = p;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "El promedio menor es: \n" + Estudiantes[y].toString());
                    }
                    break;
                case 4:
                    if (Estudiantes[Estudiantes.length - 1] == null) {
                        JOptionPane.showMessageDialog(null, "No hay estudiantes suficientes registrados");
                    } else {
                        for (int o = 0; o < Estudiantes.length; o++) {
                            cadena += Estudiantes[o].toString()+"\n";
                        }
                        JOptionPane.showMessageDialog(null, "Listado de estudiantes: \n" + cadena + " \n");
                    }
                    break;
            }
        }
    }
}
