/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Creacion
Eliminacion
Listado
Busqueda
Actualizacion

 */


import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import pca.co.vistas.vistaArbol;
import pca.co.vistas.vistaListas;


public class Prin extends javax.swing.JFrame {
    vistaArbol arbol = new vistaArbol();
    vistaListas lista = new vistaListas();

    /**
     * Creates new form Prin
     */
    public Prin() {
        initComponents();
        
        //Centra la ventana
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(width / 2, height / 2);
        setLocationRelativeTo(null);
        setVisible(true);
        //Elimina Maximizar
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        arboles = new javax.swing.JMenu();
        crearArbol = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        imprimirArbol = new javax.swing.JMenuItem();
        buscarArbol = new javax.swing.JMenuItem();
        actualizarArbol = new javax.swing.JMenuItem();
        listas = new javax.swing.JMenu();
        crearLista = new javax.swing.JMenuItem();
        eliminarLista = new javax.swing.JMenuItem();
        imprimirLista = new javax.swing.JMenuItem();
        buscarLista = new javax.swing.JMenuItem();
        actualizarLista = new javax.swing.JMenuItem();
        listasdobles = new javax.swing.JMenu();
        crearListaDoble = new javax.swing.JMenuItem();
        ingresarLD = new javax.swing.JMenuItem();
        buscarLD = new javax.swing.JMenuItem();
        imprimirLD = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 997, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        arboles.setText("Arboles");
        arboles.setBorderPainted(false);
        arboles.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        arboles.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                arbolesComponentAdded(evt);
            }
        });

        crearArbol.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        crearArbol.setText("Crear Arbol");
        crearArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearArbolActionPerformed(evt);
            }
        });
        arboles.add(crearArbol);

        jMenuItem1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuItem1.setText("Eliminar");
        arboles.add(jMenuItem1);

        imprimirArbol.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        imprimirArbol.setText("Imprimir");
        imprimirArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirArbolActionPerformed(evt);
            }
        });
        arboles.add(imprimirArbol);

        buscarArbol.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buscarArbol.setText("Buscar");
        buscarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarArbolActionPerformed(evt);
            }
        });
        arboles.add(buscarArbol);

        actualizarArbol.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        actualizarArbol.setText("Actualizar");
        arboles.add(actualizarArbol);

        jMenuBar1.add(arboles);

        listas.setText("Listas Simples");
        listas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        crearLista.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        crearLista.setText("Crear ");
        crearLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearListaActionPerformed(evt);
            }
        });
        listas.add(crearLista);

        eliminarLista.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        eliminarLista.setText("Eliminacion");
        eliminarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarListaActionPerformed(evt);
            }
        });
        listas.add(eliminarLista);

        imprimirLista.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        imprimirLista.setText("Imprimir");
        imprimirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirListaActionPerformed(evt);
            }
        });
        listas.add(imprimirLista);

        buscarLista.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buscarLista.setText("Buscar");
        buscarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarListaActionPerformed(evt);
            }
        });
        listas.add(buscarLista);

        actualizarLista.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        actualizarLista.setText("Actualizar");
        listas.add(actualizarLista);

        jMenuBar1.add(listas);

        listasdobles.setText("Listas Dobles");
        listasdobles.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        crearListaDoble.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        crearListaDoble.setText("Crear");
        crearListaDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearListaDobleActionPerformed(evt);
            }
        });
        listasdobles.add(crearListaDoble);

        ingresarLD.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ingresarLD.setText("Ingresar");
        listasdobles.add(ingresarLD);

        buscarLD.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buscarLD.setText("Buscar");
        listasdobles.add(buscarLD);

        imprimirLD.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        imprimirLD.setText("Imprimir");
        listasdobles.add(imprimirLD);

        jMenuBar1.add(listasdobles);

        jMenu1.setText("Lista Circular");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arbolesComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_arbolesComponentAdded
        // TODO add your handling code here:
     
    }//GEN-LAST:event_arbolesComponentAdded

    private void crearArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearArbolActionPerformed
        // TODO add your handling code here:
        arbol.menuOpcion(0);
    }//GEN-LAST:event_crearArbolActionPerformed

    private void buscarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarArbolActionPerformed
        // TODO add your handling code here:
        arbol.menuOpcion(2);
    }//GEN-LAST:event_buscarArbolActionPerformed

    private void imprimirArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirArbolActionPerformed
        // TODO add your handling code here:
        arbol.menuOpcion(1);
    }//GEN-LAST:event_imprimirArbolActionPerformed

    private void buscarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarListaActionPerformed
        // TODO add your handling code here:
        lista.menuOpcion(5);
    }//GEN-LAST:event_buscarListaActionPerformed

    private void crearListaDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearListaDobleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearListaDobleActionPerformed

    private void crearListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearListaActionPerformed
        // TODO add your handling code here:
        lista.menuOpcion(1);
    }//GEN-LAST:event_crearListaActionPerformed

    private void eliminarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarListaActionPerformed
        // TODO add your handling code here:
        lista.menuOpcion(6);
    }//GEN-LAST:event_eliminarListaActionPerformed

    private void imprimirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirListaActionPerformed
        // TODO add your handling code here:
        lista.menuOpcion(2);
    }//GEN-LAST:event_imprimirListaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizarArbol;
    private javax.swing.JMenuItem actualizarLista;
    private javax.swing.JMenu arboles;
    private javax.swing.JMenuItem buscarArbol;
    private javax.swing.JMenuItem buscarLD;
    private javax.swing.JMenuItem buscarLista;
    private javax.swing.JMenuItem crearArbol;
    private javax.swing.JMenuItem crearLista;
    private javax.swing.JMenuItem crearListaDoble;
    private javax.swing.JMenuItem eliminarLista;
    private javax.swing.JMenuItem imprimirArbol;
    private javax.swing.JMenuItem imprimirLD;
    private javax.swing.JMenuItem imprimirLista;
    private javax.swing.JMenuItem ingresarLD;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu listas;
    private javax.swing.JMenu listasdobles;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
