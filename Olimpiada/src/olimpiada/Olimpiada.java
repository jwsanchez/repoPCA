
//----------------JAVA
package olimpiada;
import java.util.*;
import javax.swing.JOptionPane;

public class Olimpiada {

    public static void main(String[] args) {
        int num=500;
        while(num<=500){
            if(fnumber(num))
            System.out.println(num);
            num--;
        }

        
    }

    public static boolean fnumber(int n) {
            return true;
            n = cuadrado(n); 

    }

    public static int cuadrado(int n) {
        int c = 0;
        while (n > 0) {
            int d = n % 10;
            c += d * d;
            n = n / 10;
        }
        return c;
    }
}
