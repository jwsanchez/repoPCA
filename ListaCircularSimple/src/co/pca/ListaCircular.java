package co.pca;

import co.pca.listas.Nodo;

public class ListaCircular {
    Nodo primerNodo;
    String nombre;

    //Metodo Contructor
    public ListaCircular(){
        nombre="nuevo";
        primerNodo=null;
    }
    //Creando lista
    public ListaCircular(String s){
        nombre=s;
        primerNodo=null;
    }

    public boolean VaciaLista(){
        return primerNodo==null;
    }

    public String imprimirLista(){
        String lista="";
        if(VaciaLista()){
            lista=""+"Lista "+nombre+" vacia";
        }else{
            lista+="La lista "+nombre+" contiene:";
            Nodo actual=primerNodo.getEnlace();
            lista+=""+primerNodo.getInfo();
            while(actual!=primerNodo){
                lista+=""+actual.getInfo();
                actual=actual.getEnlace();
            }
        }
        return lista;
    }

    public void anexarNodo(String elementoIn){
        if(VaciaLista()){
            Nodo nuevo = new Nodo(elementoIn);
            primerNodo=nuevo;
            primerNodo.setEnlace(primerNodo);
        }else{
            Nodo nuevo= new Nodo (elementoIn);
            nuevo.setEnlace(primerNodo.getEnlace());
            primerNodo.setEnlace(nuevo);
            primerNodo=nuevo;
        }
    }

    public void anexarNodoFinal(String elementoIn){
        if(VaciaLista()){
            primerNodo=new Nodo(elementoIn);
            primerNodo.setEnlace(primerNodo);
        }else{
            Nodo aux=primerNodo;
            while(aux.getEnlace()!=primerNodo){
                aux=aux.getEnlace();
            }
            Nodo temporal=new Nodo(elementoIn);
            aux.setEnlace(temporal);
            temporal.setEnlace(primerNodo);
        }
    }

    public boolean retirarNodo(){
        boolean borrar=false;
        if(VaciaLista()){
            System.out.println("No hay ningun elemento");
        }else if(primerNodo.getEnlace()==primerNodo){
            primerNodo=null;
        }else{
            Nodo aux=primerNodo;
            while(aux.getEnlace()!=primerNodo){
                aux=aux.getEnlace();
            }
            primerNodo=primerNodo.getEnlace();
            aux.setEnlace(primerNodo);
            borrar=true;
        }
        return borrar;
    }
}
