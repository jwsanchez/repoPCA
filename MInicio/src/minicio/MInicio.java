package minicio;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
public class MInicio {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int cclientes;
        cclientes = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de clientes"));
        Operacion OC = new Operacion();
        OC.crear(cclientes);
        OC.leer();

    }

}
