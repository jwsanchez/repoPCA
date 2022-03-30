package co.edu.pca;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Estudiante Estudiantes[] = new Estudiante[3];
        int op = 0;
        int i=0,x=1, y=1;
        //String imp="";
        while (op <= 4) {
             op=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione la opcion que desee\n\n" + ""
                    + "1 - Ingresar un estudiante \n" + "2 - Promedio mas bajo\n"
                    + "3 - Promedio mas alto\n" + "4 - Listado de estudiantes\n"
                    + "5 - Salir"));
            switch (op) {
                case 1:
                    if(i<Estudiantes.length){
                        System.out.println(i);
                        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de identificacion"));
                        String nombre = JOptionPane.showInputDialog(null, "Nombre del estudiante");
                        String programa = JOptionPane.showInputDialog(null, "Programa al cual pertenece");
                        double promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Promedio Academico"));
                        while(i<Estudiantes.length){
                            Estudiantes[i] = new Estudiante(programa, promedio, id, nombre);
                            System.out.println("Entre"+i);
                            break;
                        }
                        i++;
                    }else{
                        System.out.println("Supero el limite de estudiantes");
                    }
                    
                    break;
                case 2:
                    double promedioG=999;
                    double prom[] = new double [Estudiantes.length];
                    for(int p=0;p<Estudiantes.length;p++){
                        prom[p]=Estudiantes[p].getPromedio();
                        if(prom[p]<promedioG){
                            promedioG=prom[p];
                            x=p;   
                        } 
                    }
                    JOptionPane.showMessageDialog(null, "El promedio menor es: "+Estudiantes[x].toString());
                    break;
                case 3:
                    double promedioS=0;
                    double promS[] = new double [Estudiantes.length];
                    for(int p=0;p<Estudiantes.length;p++){
                        promS[p]=Estudiantes[p].getPromedio();
                        if(promS[p]>promedioS){
                            promedioS=promS[p];
                            y=p;   
                        } 
                    }
                    JOptionPane.showMessageDialog(null, "El promedio menor es: "+Estudiantes[y].toString());
                    break;
                case 4:
                    /*for (i = 0; i <= Estudiantes.length; i++) {
                        //imp += Estudiantes[i].toString()+"\n";
                    }*/
                    JOptionPane.showMessageDialog(null, "Listado de estudiantes: \n\n"+
                            Estudiantes[0].toString()+"\n"+
                            Estudiantes[1].toString()+"\n"+
                            Estudiantes[2].toString()+"\n");
                    break;
            }
        }
    }

}
