package co.edu.pca;

import javax.swing.JOptionPane;

public class CuentaCheque extends Cuenta implements MovimientosCuenta {
    double cuota;

    public CuentaCheque(double cuota, double saldoCuenta) {
        super(saldoCuenta);
        this.cuota = cuota;
    }

    @Override
    public void depositar(double monto) {
        saldoCuenta=saldoCuenta+monto-cuota;
        JOptionPane.showMessageDialog(null, "Su saldo es de: "+saldoCuenta);
    }

    @Override
    public void retirar(double monto) {
        if(monto>saldoCuenta){
            JOptionPane.showMessageDialog(null, "El monto a retirar excedio el saldo de la cuenta");
        }else if(monto==0){
            JOptionPane.showMessageDialog(null, "No puede retirar 0");
        }else{
            saldoCuenta=saldoCuenta-monto-cuota;
            JOptionPane.showMessageDialog(null, "Su saldo es de: "+saldoCuenta);
        }
    }  
}
