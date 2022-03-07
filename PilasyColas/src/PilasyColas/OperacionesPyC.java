package PilasyColas;

import java.util.ArrayList;

public class OperacionesPyC extends ArrayList<Object> {
     public void apilar(Object valor){
      
        if (valor!=null) {
            this.add(valor);
        } else {
           System.out.println(" Ingrese un valor distinto de nulo");
        }
    }
    
    
    public void desapilar(Object valor){
        if (size()>0) {
            this.remove(valor);
        }else{
            System.out.println(" la pila esta vacia");
        } 
    }
    
    
    public Object Tope(){
      Object t= null;
        if (this.size()>0) {
            t=this.get(this.size()-1);
       }
      return t;
    }
}
