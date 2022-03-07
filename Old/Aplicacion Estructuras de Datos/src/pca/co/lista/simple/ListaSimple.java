package pca.co.lista.simple;

public class ListaSimple {
    private Nodo primero;
    private Nodo ultimo;
    
    public ListaSimple(){
        this.primero = null;
        this.ultimo = null;
    }
    
    public void anexarInicioLista(int dato){
        Nodo nuevo = new Nodo(dato);
        if(primero==null){
            primero=nuevo;
            ultimo=nuevo;
        }else{
            ultimo.setEnlace(primero);
            primero=nuevo;
        }
    }
    
    public void anexarFinalLista(int dato){
        Nodo nuevo = new Nodo(dato);
        if(primero==null){
            primero=nuevo;
            ultimo=nuevo;
        }else{
            ultimo.setEnlace(nuevo);
            ultimo=nuevo;
            ultimo.setEnlace(null);
        }
    }
    
    //Lista vacia
    
    public boolean esVacia(){
        return (primero==null);
    }
    
    public boolean buscarNodo(int dato){
        boolean encontro=false;
        Nodo p = primero;
        while(p.getEnlace()!=null&&encontro==false){
            if(p.getInfo()==dato)
                encontro=true;
            p=p.getEnlace();
        }
        return encontro;
    }
    
    public boolean borrarNodoIncio(){
        if(esVacia())
            return false;
        if(primero.getEnlace()==null){
            primero=null;
            ultimo=null;
            return false;
        }else{
            Nodo temp=primero;
            primero=primero.getEnlace();
            temp.setEnlace(null);
            return true;
        }
    }
    
    public boolean borrarNodoFinal(){
        if(esVacia())
            return false;
        if(primero.getEnlace()==null){
            primero=null;
            ultimo=null;
            return false;
        }else{
            Nodo temp=primero;
            Nodo temp2=primero;
            while(temp.getEnlace()!=null){
                temp2=temp;
                temp=temp.getEnlace();
            }
            ultimo=temp2;
            ultimo.setEnlace(null);
            return true;
        }
    }
    
    public String imprimirLista(){
        String str="";
        Nodo p=primero;
        while(p.getEnlace()!=null){
            str += p.getInfo()+"";
            p=p.getEnlace();
        }
        return str;
    }
    
}
