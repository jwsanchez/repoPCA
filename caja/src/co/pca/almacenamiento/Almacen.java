package co.pca.almacenamiento;

import co.pca.objetos.Productos;
import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private Productos [] productos;
    private List<Productos> stock;
    private List<Productos> ventas;
    
    public Almacen(){
        productos = new Productos[4];
        Productos papa = new Productos("Papa");
        Productos arroz = new Productos("Arroz");
        Productos carne = new Productos("Carne");
        productos[0]=papa;
        productos[1]=arroz;
        productos[2]=carne;
        stock = new ArrayList<>();
        ventas = new ArrayList<>();
    } 
    
    public Productos getIndice(int i){
        if(i<0 || i>3 ){
            System.out.println("Indice incorrecto");
        return null;
        }
    return productos[i];
    }
    
    public Productos[] getAll(){
        return productos;
    }
    
    public void comprar(Productos producto){
        Productos otroP;
        switch(productos.getClass().getSimpleName()){
            case "Papa":
                otroP = productos[0];
                break;
            case "Arroz":
                otroP = productos[1];
                break;
            case "Carne":
                otroP = productos[2];
                break;
                
            default: 
                return;
        }
        otroP.setCantidad(otroP.getCantidad()+producto.getCantidad());
        otroP.setPrecio(producto.getPrecio());
        stock.add(producto);
    }
    
    public void vender(Productos producto){
        Productos otroP;
        switch(productos.getClass().getSimpleName()){
            case "Papa":
                otroP = productos[0];
                break;
            case "Arroz":
                otroP = productos[1];
                break;
            case "Carne":
                otroP = productos[2];
                break;
                
            default: 
                return;
        }
        otroP.setCantidad(otroP.getCantidad()-producto.getCantidad());
        stock.add(producto);
    }
    
    public List<Productos> getStock(){
        return stock;
    }
    
    public List<Productos> getVentas(){
        return ventas;
    }
    
    public Productos clone() throws CloneNotSupportedException {
        return (Productos) super.clone();
    }

    @Override
    public String toString() {
        return "Almacen{" + "productos=" + productos + '}';
    }
    
}
