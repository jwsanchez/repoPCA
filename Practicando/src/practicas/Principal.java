package practicas;
import java.util.Arrays;
public class Principal {
    public static void main(String[] args) {
        int a2[] = {5, 21, 13, 17, 7};
        int a1[] = {4, 16, 11, 18, 6};
        Principal vo=new Principal();
        for (int j = 5 - 1; j >= 0; j--) {
                vo.insertar(a2[j]);
                vo.insertar(a1[j]);
        }
        vo.imprimir();
    }
    class Nodo {
        int info;
        Nodo sig;
    }
    Nodo primero;
    public Principal() {
        primero=null;
    }
    void insertar(int x)
    {
        Nodo n = new Nodo ();
        n.info = x;
        if (primero==null) {
            primero=n;
        } else {
            if (x>primero.info) {
                n.sig=primero;
                primero=n;
            } else {
                Nodo reco=primero;
                Nodo atras=primero;
                while (x<=reco.info && reco.sig!=null) {
                    atras=reco;
                    reco=reco.sig;
                }
                if (x<=reco.info) {
                    reco.sig=n;
                } else {
                    n.sig=reco;
                    atras.sig=n;
                }
            }
        }
    }
    public void imprimir () {
        Nodo reco = primero;
        while (reco != null) {
            System.out.print (reco.info + ",");
            reco = reco.sig;
        }
        System.out.println();
    }
}
