package pca.co.arbol;

import javax.swing.JOptionPane;

public class Arbol {
    private Nodo raiz;
    private Nodo p;
    private Nodo q;
    
    public Arbol(int info){
        this.raiz=new Nodo();
        this.p=new Nodo();
        this.q=new Nodo();
        this.raiz.setNodoIzq(null);
        this.raiz.setNodoDer(null);
        this.raiz.setInfo(info);
        this.p=raiz;
    }
    
    public Nodo obtenerRaiz(){
        return raiz;
    }
    
    public void anexarNodo(int n){
        if(raiz.getInfo()==0){
            raiz.setInfo(n);
        }else{
            p=raiz;
            q=p;
            while(q!=null&&p.getInfo()!=n){
                p=q;
                if(n<p.getInfo()){
                    q=q.getNodoIzq();
                }else{
                    q=q.getNodoDer();
                }
                if(p.getInfo()==n){
                    JOptionPane.showMessageDialog(null, "DATO REPETIDO", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if(n<p.getInfo()){
                insertarIzquierda(p,n);
            }else{
                insertarDerecha(p,n);
            }
        }
    }
    
    public void insertarIzquierda(Nodo r,int n){
        Nodo nuevo = new Nodo();
        nuevo.setInfo(n);
        nuevo.setNodoIzq(null);
        nuevo.setNodoDer(null);
        r.setNodoIzq(nuevo);
    }
    
    public void insertarDerecha(Nodo r,int n){
        Nodo nuevo = new Nodo();
        nuevo.setInfo(n);
        nuevo.setNodoIzq(null);
        nuevo.setNodoDer(null);
        r.setNodoDer(nuevo);
    }
    
    public void buscarElemento(int numero, Nodo r){
        String str = "";
        if(r == null){
            JOptionPane.showMessageDialog(null, "Valor encontrado "+numero,"Buscar Elemento",JOptionPane.INFORMATION_MESSAGE);
            return; 
        }
        if(r.getInfo()==numero){
            JOptionPane.showMessageDialog(null, "Se encontró el valor "+numero +" en el Arbol");
            return;
        }else{
            if(numero>r.getInfo())
                buscarElemento(numero, r.getNodoDer());
            else
                buscarElemento(numero, r.getNodoIzq());
        }
    }
    
    public void imprimir(Nodo p){
        if(p!=null){
            imprimir(p.getNodoIzq());
            JOptionPane.showMessageDialog(null, ""+p.getInfo());
            imprimir(p.getNodoDer());
        }
    }
    
    public void imprimirPreOrden(Nodo p){
        if(p!=null){
            JOptionPane.showMessageDialog(null, ""+p.getInfo());
            imprimirPreOrden(p.getNodoIzq());
            imprimirPreOrden(p.getNodoDer());
        }
    }
    
}
