package co.edu.pca;

import javax.swing.JOptionPane;

public class CuentaAhorros extends Cuenta implements MovimientosCuenta {
    
    double tasaInteres;

    public CuentaAhorros(double tasaInteres, double saldoCuenta) {
        super(saldoCuenta);
        this.tasaInteres = tasaInteres;
    }
    
    public double calcularInteres(){
        double op;
        op=this.tasaInteres*saldoCuenta;
        return op;
    }

    @Override
    public void depositar(double monto) {
        saldoCuenta=monto+saldoCuenta;
        JOptionPane.showMessageDialog(null, "Su saldo es de: "+saldoCuenta);
    }

    @Override
    public void retirar(double monto) {
        if(monto>saldoCuenta){
            JOptionPane.showMessageDialog(null, "El monto a retirar excedio el saldo de la cuenta");
        }else if(monto==0){
            JOptionPane.showMessageDialog(null, "No puede retirar 0");
        }else{
            saldoCuenta=saldoCuenta-monto;
            JOptionPane.showMessageDialog(null, "Su saldo es de: "+saldoCuenta);
        }
    }
    
}
