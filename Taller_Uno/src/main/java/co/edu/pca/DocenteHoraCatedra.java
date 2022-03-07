package co.edu.pca;

public class DocenteHoraCatedra extends Docente {
    
    private double horasSemanales;
    private double valorHora;

    public DocenteHoraCatedra() {
    }

    public DocenteHoraCatedra(double horasSemanales, double valorHora, int id, String nombre, String programa) {
        super(id, nombre, programa);
        this.horasSemanales = horasSemanales;
        this.valorHora = valorHora;
    }

    public double getHorasSemanales() {
        return horasSemanales;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double calcularSalarioMensual() {
        return (horasSemanales*4)*valorHora;
    }
    

}
