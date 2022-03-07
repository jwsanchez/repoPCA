package co.edu.pca;

import javax.swing.JOptionPane;

public abstract class Cuenta {
    double saldoCuenta;

    public Cuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
        if(this.saldoCuenta<0.0){
            JOptionPane.showMessageDialog(null,"Saldo invalido");
            this.saldoCuenta=0.0;
        }
    } 
}
