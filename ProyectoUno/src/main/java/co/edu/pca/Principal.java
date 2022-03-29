package co.edu.pca;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Estudiante Estudiantes[]=new Estudiante[2];
        for(int i=1;i<=Estudiantes.length;i++){
            int id=Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de identificacion"));
            String nombre=JOptionPane.showInputDialog(null, "Nombre del estudiante");
            String programa=JOptionPane.showInputDialog(null, "Programa al cual pertenece");
            double promedio=Double.parseDouble(JOptionPane.showInputDialog(null, "Promedio Academico"));
            Estudiantes[i]= new Estudiante(programa,promedio,id,nombre);
        }
        
    }
   
}
