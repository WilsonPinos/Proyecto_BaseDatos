package interfaces;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto_basedatos.Agencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mauri
 */
public class Consulta_agencias extends javax.swing.JPanel {

    /**
     * Creates new form Consulta_agencias
     */
    private String codigo = "";
    private String nombre = "";
    private String ubicacion = "";
    private String telefono = "";
    private String correo = "";
    private Modificar_Agencia modificar;

    public Consulta_agencias() {
        initComponents();
        //    this.setLocationRelativeTo(null);

        BuscarAgencia();
        jTable1.addMouseListener(new MouseAdapter() {
            DefaultTableModel model = new DefaultTableModel();

            public void mouseClicked(MouseEvent e) {
                int i = jTable1.getSelectedRow();
                codigo = jTable1.getValueAt(i, 0).toString();
                nombre = jTable1.getValueAt(i, 1).toString();
                telefono = jTable1.getValueAt(i, 2).toString();
                ubicacion = jTable1.getValueAt(i, 3).toString();

                correo = jTable1.getValueAt(i, 4).toString();
            }

        });
    }

    public void setModificar_Agencia(Modificar_Agencia modificar) {
        this.modificar = modificar;
    }

    public void BuscarAgencia() {

        ObjectContainer base = Db4o.openFile(proyecto_basedatos.BDdireccion);
        Agencia agen = new Agencia(null, null, null, null, null);
        ObjectSet resultado = base.get(agen);
        //Escuela tablaescuela = (Escuela) resultado.next();
        String matriz[][] = new String[resultado.size()][5];
        int i = 0;
        while (resultado.hasNext()) {
            Agencia agencia1 = (Agencia) resultado.next();
            matriz[i][0] = agencia1.getId_agencia();
            matriz[i][1] = agencia1.getNombre_agencia();
            matriz[i][2] = agencia1.getTelefono();
            matriz[i][3] = agencia1.getUbicacion();
            matriz[i][4] = agencia1.getCorreo();
            i++;

        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Codigo", "Nombre", "Telefono", "Ubicacion", "Correo"}));
        CerrarBD(base);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBuscar1 = new javax.swing.JButton();
        btnBuscar2 = new javax.swing.JButton();
        btnBuscar3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "-------------------------------------COSULTA ----------------------------------------------", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("---------------------------------------------------------------------------------------------------");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnBuscar1.setText("REGRESAR");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        btnBuscar2.setText("BORRAR");
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });

        btnBuscar3.setText("MODIFICAR");
        btnBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("---------------------------------------------------------------------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnBuscar)
                        .addGap(32, 32, 32)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnBuscar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar2)
                .addGap(129, 129, 129)
                .addComponent(btnBuscar3)
                .addGap(88, 88, 88))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar2)
                    .addComponent(btnBuscar1)
                    .addComponent(btnBuscar3))
                .addGap(51, 51, 51))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(397, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ObjectContainer base = Db4o.openFile(proyecto_basedatos.BDdireccion);
        Agencia ag = new Agencia(null, null, null, null, null);
        ObjectSet resultado = base.get(ag);
        //Escuela tablaescuela = (Escuela) resultado.next();
        String matriz[][] = new String[resultado.size()][5];
        int i = 0;
        while (resultado.hasNext()) {
            Agencia miagencia = (Agencia) resultado.next();
            if (miagencia.getNombre_agencia().toLowerCase().contains(txtbuscar.getText().toLowerCase())) {
                matriz[i][0] = miagencia.getId_agencia();
                matriz[i][1] = miagencia.getNombre_agencia();
                matriz[i][2] = miagencia.getTelefono();
                matriz[i][3] = miagencia.getUbicacion();
                matriz[i][4] = miagencia.getCorreo();
                i++;
            }
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Codigo", "Nombre", "Telefono", "Ubicacion", "Correo"}));
        CerrarBD(base);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        ObjectContainer base = Db4o.openFile(proyecto_basedatos.BDdireccion);
        Agencia ag = new Agencia(codigo, null, null, null, null);
        ObjectSet resultado = base.get(ag);
        while (resultado.hasNext()) {
            Agencia agencia1 = (Agencia) resultado.next();
            if (JOptionPane.showConfirmDialog(this, "¿Deseas continuar?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                if (codigo.equals(agencia1.getId_agencia())) {
                    base.delete(agencia1);

                }
            }
        }
        CerrarBD(base);
        BuscarAgencia();


    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void btnBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar3ActionPerformed
        if (!codigo.isBlank()) {

            Modificar_Agencia modi = new Modificar_Agencia();
            modi.recibirCodigo(codigo); // Envía el valor de "codigo" a Modificar_Escuelas
            modi.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Para modificar, primero selecciona un registro");
        }
    }//GEN-LAST:event_btnBuscar3ActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    public static void CerrarBD(ObjectContainer base) {
        base.close();
    }

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
            java.util.logging.Logger.getLogger(Consulta_bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_agencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnBuscar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
