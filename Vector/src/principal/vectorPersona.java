package principal;

import javax.swing.JOptionPane;

public class vectorPersona {
    public static void main(String[] args) {
        Persona arrayP[] = new Persona[50];
        
        for(int i=0;i<5;i++){
            arrayP[i]=new Persona();
            arrayP[i].setId(i);
            arrayP[i].setNombres(JOptionPane.showInputDialog("Ingrese el nombre "+(i+1)));
            arrayP[i].setSalario(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario "+(i+1))));
        }
        for(int i=0;i<5;i++){
            System.out.println(arrayP[i].getId());
            System.out.println(arrayP[i].getNombres());
            System.out.println(arrayP[i].getSalario());
        }
    }

}
