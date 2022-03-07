package co.edu.pca;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Docente d1 = new DocenteTerminoFijo("Administrativo",2000000,75000,72727272,"Israel Escobar","Ingenieria de Sistemas");
        Docente d2 = new DocenteTerminoFijo("Medio Tiempo",1450000,0,32323232,"Dolly Padilla","Ingenieria de Sistemas");
        Docente d3 = new DocenteTerminoFijo("Tiempo Completo",2550000,42500,9292929,"Dougglas Hurtado","Direccion de investigacion");
        Docente d4 = new DocenteHoraCatedra(12,35000,100100100,"Joel Maza","Tecnologia en Desarrollo");
        JOptionPane.showMessageDialog(null, "Programa Salario Docentes PCA"+"\n\n"+
                "Identificacion: "+  d2.getId()+"\n"+
                "Docente: "+d2.getNombre()+"\n"+
                "Programa o Departamento: "+d2.getPrograma()+"\n"+
                "Salario: "+d2.calcularSalarioMensual()+"\n"+"\n"+
                
                "Identificacion: "+  d3.getId()+"\n"+
                "Docente: "+d3.getNombre()+"\n"+
                "Programa o Departamento: "+d3.getPrograma()+"\n"+
                "Salario: "+d3.calcularSalarioMensual()+"\n"+"\n"+
                        
                "Identificacion: "+  d1.getId()+"\n"+
                "Docente: "+d1.getNombre()+"\n"+
                "Programa o Departamento: "+d1.getPrograma()+"\n"+
                "Salario: "+d1.calcularSalarioMensual()+"\n"+"\n"+
                        
                "Identificacion: "+  d4.getId()+"\n"+
                "Docente: "+d4.getNombre()+"\n"+
                "Programa o Departamento: "+d4.getPrograma()+"\n"+
                "Salario: "+d4.calcularSalarioMensual()+"\n"               
                );
    }
}
