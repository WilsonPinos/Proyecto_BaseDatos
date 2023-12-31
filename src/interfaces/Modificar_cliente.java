/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import static interfaces.Ingreso_cliente.CerrarBD;
import java.util.Date;
import javax.swing.JOptionPane;
import proyecto_basedatos.Cliente;

/**
 *
 * @author Wilson Pinos
 */
public class Modificar_cliente extends javax.swing.JFrame {

    /**
     * Creates new form Ingreso_bus
     */
    public Modificar_cliente() {
        initComponents();
        dcfechafin.setMaxSelectableDate(new Date());
    }

    public void recibirCodigo(String id_cliente, String Cedula, String nombre, String apellido, String celular, String correo, int edad, Date nacimiento) {
        txtidcliente.setText(id_cliente);
        txtcedula.setText(Cedula);
        txtnombre.setText(nombre);
        txtapellido.setText(apellido);
        txtcelular.setText(celular);
        txtcorreo.setText(correo);
        String auxedad = String.valueOf(edad);
        txtedad.setText(auxedad);
        dcfechafin.setDate(nacimiento);

    }

    public void ModificarCliente(ObjectContainer base) {

        Cliente client = new Cliente(txtidcliente.getText(), null, null, null, null, null, 0, null);
        ObjectSet resultado = base.get(client);
        Cliente cliente1 = (Cliente) resultado.next();
        cliente1.setNombre_cli(txtnombre.getText());
        cliente1.setApellido_cli(txtapellido.getText());
        cliente1.setCorreo_cli(txtcorreo.getText());
        cliente1.setTelefono_cli(txtcelular.getText());
        String auxedad = txtedad.getText();
        int edad = Integer.valueOf(auxedad);
        cliente1.setEdad_cli(edad);
        cliente1.setFecha_nacimiento(dcfechafin.getDate());
        base.set(cliente1);

        JOptionPane.showMessageDialog(this, "Modificacion exitosa");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        lblidcliente = new javax.swing.JLabel();
        lblcedula = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        lblcelular = new javax.swing.JLabel();
        lbledad = new javax.swing.JLabel();
        lblfechanac = new javax.swing.JLabel();
        txtidcliente = new javax.swing.JTextField();
        dcfechafin = new com.toedter.calendar.JDateChooser();
        btnsalir = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("MODIFICAR DE CLIENTE");

        lblidcliente.setText("Id:");

        lblcedula.setText("Cedula:");

        lblnombre.setText("Nombre:");

        lblapellido.setText("Apellido:");

        lblcorreo.setText("Correo:");

        lblcelular.setText("Celular:");

        lbledad.setText("Edad:");

        lblfechanac.setText("Fecha de nacimiento:");

        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfechanac)
                    .addComponent(lbledad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcelular, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblapellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcedula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblidcliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtidcliente)
                    .addComponent(dcfechafin, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(txtcedula)
                    .addComponent(txtnombre)
                    .addComponent(txtapellido)
                    .addComponent(txtcorreo)
                    .addComponent(txtcelular)
                    .addComponent(txtedad))
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsalir)
                .addGap(57, 57, 57)
                .addComponent(btnguardar)
                .addGap(164, 164, 164))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidcliente)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcedula)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblapellido)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcorreo)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcelular)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbledad)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfechanac)
                    .addComponent(dcfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalir)
                    .addComponent(btnguardar))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        Date fechaSeleccionada = dcfechafin.getDate();
        if (txtidcliente.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Ingresa el codigo del cliente");
        } else {
            if (txtcedula.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Ingresa la cedula del cliente");
            } else if (txtnombre.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Ingresa el nombre del cliente");
            } else if (txtapellido.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Ingresa el apellido del cliente");
            } else if (txtedad.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Ingresa la edad  del cliente");
            } else if (txtcorreo.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Ingresa el correo del cliente");
            } else if (txtcelular.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Ingresa el celular del cliente");
            } else if (fechaSeleccionada == null) {
                JOptionPane.showMessageDialog(this, "Ingresa la fecha de nacimiento del cliente");
            } else {
                ObjectContainer base = Db4o.openFile(proyecto_basedatos.BDdireccion);
                ModificarCliente(base);
                CerrarBD(base);
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalirActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnsalir;
    private com.toedter.calendar.JDateChooser dcfechafin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JLabel lblcelular;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbledad;
    private javax.swing.JLabel lblfechanac;
    private javax.swing.JLabel lblidcliente;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
