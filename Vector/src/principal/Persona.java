package principal;

public class Persona {

    private String nombres;
    private int id;
    private double salario;
    
    //Getters
    public String getNombres(){
        return nombres;
    }
    
    public int getId(){
        return id;
    }
    
    public double getSalario(){
        return salario;
    }
    
    //Setters
    
    public void setNombres(String nombre){
        this.nombres = nombre;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setSalario(double salario){
        this.salario=salario;
    }  

}


