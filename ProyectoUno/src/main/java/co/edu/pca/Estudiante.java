package co.edu.pca;
import javax.swing.JOptionPane;
public class Estudiante extends Persona{
    private String programa;
    private double promedio;
    

    public Estudiante() {
    }

    public Estudiante(String programa, double promedio) {
        this.programa = programa;
        this.promedio = promedio;
    }

    public Estudiante(String programa, double promedio, int id, String nombre) {
        super(id, nombre);
        this.programa = programa;
        this.promedio = promedio;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     */
    @Override
    public String toString() {
       return "Id: "+id+" - Nombre: "+nombre+" - Programa" +programa+" - Promedio: "+promedio;
    }
    
    
}
