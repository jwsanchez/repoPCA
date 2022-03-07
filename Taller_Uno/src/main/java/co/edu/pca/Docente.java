package co.edu.pca;

public abstract class Docente {
    private int id;
    private String nombre;
    private String programa;

    public Docente() {
    }

    public Docente(int id, String nombre, String programa) {
        this.id = id;
        this.nombre = nombre;
        this.programa = programa;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrograma() {
        return programa;
    }
    
    public abstract double calcularSalarioMensual();

}
