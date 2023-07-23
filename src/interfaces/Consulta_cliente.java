/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto_basedatos.Cliente;

/**
 *
 * @author Wilson Pinos
 */
public class Consulta_cliente extends javax.swing.JFrame {

    private String idcliente = "";
    private String cedula = "";
    private String nombre = "";
    private String apellido = "";
    private String telefono= " ";
    private int edad=0;
    private String correo = "";
    private Date nacimiento=null;

    private Modificar_cliente modificar;

    public Consulta_cliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        BuscarCliente();
        tblcliente.addMouseListener(new MouseAdapter() {
            DefaultTableModel model = new DefaultTableModel();

            public void mouseClicked(MouseEvent e) {
                int i = tblcliente.getSelectedRow();
                idcliente = tblcliente.getValueAt(i, 0).toString();
                cedula = tblcliente.getValueAt(i, 1).toString();
                nombre = tblcliente.getValueAt(i, 2).toString();
                apellido = tblcliente.getValueAt(i, 3).toString();
                cedula = tblcliente.getValueAt(i, 4).toString();
                correo = tblcliente.getValueAt(i, 5).toString();
                String auxedad = tblcliente.getValueAt(i, 6).toString();
                edad = Integer.valueOf(auxedad);

                String naci = tblcliente.getValueAt(i, 7).toString();
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd MM yyyy");
                try {
                    nacimiento = formatoFecha.parse(naci);
                } catch (ParseException e1) {
                    System.out.println("Error");
                }

            }

        });

    }

    public void setModificar_cliente(Modificar_cliente modificar) {
        this.modificar = modificar;
    }

    public void BuscarCliente() {
//String Id_cliente, String cedula_cli, String nombre_cli, String apellido_cli, String telefono_cli, String correo_cli, int edad_cli, Date fecha_nacimiento) {

        ObjectContainer base = Db4o.openFile(proyecto_basedatos.BDdireccion);
        Cliente cli = new Cliente(null, null, null, null, null, null, 0, null);
        ObjectSet resultado = base.get(cli);
        String matriz[][] = new String[resultado.size()][8];
        int i = 0;
        while (resultado.hasNext()) {
            Cliente cliente1 = (Cliente) resultado.next();
            matriz[i][0] = cliente1.getId_cliente();
            matriz[i][1] = cliente1.getCedula_cli();
            matriz[i][2] = cliente1.getNombre_cli();
            matriz[i][3] = cliente1.getApellido_cli();
            matriz[i][4] = cliente1.getCorreo_cli();
            matriz[i][5] = cliente1.getTelefono_cli();
            int auxedad = cliente1.getEdad_cli();
            String edad = Integer.toString(auxedad);
            matriz[i][6] = edad;

            Date auxnacim = cliente1.getFecha_nacimiento();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String nacim = formatoFecha.format(auxnacim);
            matriz[i][7] = nacim;

            i++;

        }
        tblcliente.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"ID", "Cedula", "Nombre", "Apellido", "Correo", "Celular", "Edad", "Fecha de nacimiento"}));
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

        jPanel1 = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcliente = new javax.swing.JTable();
        btnbuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        btnregresar = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("CONSULTA DE CLIENTE");

        tblcliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblcliente);

        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnregresar.setText("REGRESAR");

        btnborrar.setText("BORRAR");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(btnbuscar)
                                .addGap(18, 18, 18)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(btnregresar)
                                .addGap(51, 51, 51)
                                .addComponent(btnborrar)
                                .addGap(37, 37, 37)
                                .addComponent(btnmodificar)))
                        .addGap(0, 213, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregresar)
                    .addComponent(btnborrar)
                    .addComponent(btnmodificar))
                .addContainerGap(70, Short.MAX_VALUE))
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

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        ObjectContainer base = Db4o.openFile(proyecto_basedatos.BDdireccion);
        Cliente clie = new Cliente(null, null, null, null, null, null, 0, null);
        ObjectSet resultado = base.get(clie);
        String matriz[][] = new String[resultado.size()][8];
        int i = 0;
        while (resultado.hasNext()) {
            Cliente clientes = (Cliente) resultado.next();
            if (clientes.getCedula_cli().toLowerCase().contains(txtbuscar.getText().toLowerCase())) {
                matriz[i][0] = clientes.getId_cliente();
                matriz[i][1] = clientes.getCedula_cli();
                matriz[i][2] = clientes.getNombre_cli();
                matriz[i][3] = clientes.getApellido_cli();
                matriz[i][4] = clientes.getCorreo_cli();
                matriz[i][5] = clientes.getTelefono_cli();
                int auxedad = clientes.getEdad_cli();
                String edad = Integer.toString(auxedad);
                matriz[i][6] = edad;

                Date auxnacim = clientes.getFecha_nacimiento();
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                String nacim = formatoFecha.format(auxnacim);
                matriz[i][7] = nacim;
                i++;
            }
        }
        tblcliente.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"ID", "Cedula", "Nombre", "Apellido", "Correo", "Celular", "Nivel de estudio", "Turno", "Edad", "Fecha de nacimiento", "Fecha de contratacion"}));
        CerrarBD(base);
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        ObjectContainer base = Db4o.openFile(proyecto_basedatos.BDdireccion);
        Cliente client = new Cliente(idcliente, null, null, null, null, null, 0, null);
        ObjectSet resultado = base.get(client);
        while (resultado.hasNext()) {
            Cliente cliente1 = (Cliente) resultado.next();
            if (JOptionPane.showConfirmDialog(rootPane, "¿Deseas continuar?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                if (idcliente.equals(cliente1.getId_cliente())) {
                    base.delete(cliente1);

                }
            }
        }
        CerrarBD(base);
        BuscarCliente();

    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        if (!idcliente.isBlank()) {
            dispose();
            Modificar_cliente modi = new Modificar_cliente();
            modi.recibirCodigo(idcliente, cedula, nombre, apellido, correo, telefono, edad, nacimiento); // Envía el valor 
            modi.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Para modificar, primero selecciona un registro");
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

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
            java.util.logging.Logger.getLogger(Consulta_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_cliente().setVisible(true);
            }
        });
    }

    public static void CerrarBD(ObjectContainer base) {
        base.close();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTable tblcliente;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
