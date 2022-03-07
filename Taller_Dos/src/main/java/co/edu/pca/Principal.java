package co.edu.pca;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        double monto=0;
        int op = 0;
        CuentaAhorros cuenta = new CuentaAhorros(1.5,monto);
        CuentaCheque cuenta1 = new CuentaCheque(500,monto);
        while(op<=5){
            JOptionPane.showMessageDialog(null,"Seleccione la opcion que desee\n\n"+ ""+ 
                "1 - Depositar en cuenta de ahorros\n" +"2 - Retirar de cuenta de ahorros\n"+ 
                "3 - Interes a la fecha\n"+ "4 - Depositar en la cuenta de cheques\n"+ 
                "5 - Retirar de cuenta de cheques\n"+ "6 - Salir");
            op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la operacion"));
            switch (op){
                case 1: 
                    monto=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar"));
                    cuenta.depositar(monto);
                    break;
                case 2:
                    monto=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar"));
                    cuenta.retirar(monto);
                    break;
                case 3: 
                    JOptionPane.showMessageDialog(null, "Interes de: "+ cuenta.calcularInteres());
                    break;
                case 4:
                    monto=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar"));
                    cuenta1.depositar(monto);
                    break;
                case 5:
                    monto=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar"));
                    cuenta1.retirar(monto);
                    break;
            }
        }
    }
}
