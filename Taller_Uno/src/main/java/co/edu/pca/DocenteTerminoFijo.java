package co.edu.pca;

public class DocenteTerminoFijo extends Docente {
    
    private String tipo;
    private double sueldoMensual;
    private double descuento;

    public DocenteTerminoFijo() {
    }

    public DocenteTerminoFijo(String tipo, double sueldoMensual, double descuento, int id, String nombre, String programa) {
        super(id, nombre, programa);
        this.tipo = tipo;
        this.sueldoMensual = sueldoMensual;
        this.descuento = descuento;
    }

    public String getTipo() {
        return tipo;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public double getDescuento() {
        return descuento;
    }
    

    @Override
    public double calcularSalarioMensual() {
        descuento=descuento+(sueldoMensual*0.04*2);
        return sueldoMensual-descuento;
    }

}
