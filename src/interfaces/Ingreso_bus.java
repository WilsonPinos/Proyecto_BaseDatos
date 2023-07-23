/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import com.db4o.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import proyecto_basedatos.Agencia;
import proyecto_basedatos.Bus;
import proyecto_basedatos.Horario;
import proyecto_basedatos.Registro_contrato;
import proyecto_basedatos.Ruta;

/**
 *
 * @author Wilson Pinos
 */
public class Ingreso_bus extends javax.swing.JFrame {

    /**
     * Creates new form Ingreso_bus
     */
    public Ingreso_bus() {
        initComponents();
        
        ObjectContainer base = Db4o.openFile(proyecto_basedatos.BDdireccion);
        Agencia Bagencia = new Agencia(null, null, null, null, null);
        ObjectSet result= base.get(Bagencia);
        
        while (result.hasNext()){
            Agencia agen= (Agencia) result.next();
            cbagencia.addItem(agen.getNombre_agencia());
        }
        Ruta Bruta = new Ruta(null, null, 0);
        ObjectSet result1= base.get(Bruta);
        
        while (result1.hasNext()){
            Ruta rut= (Ruta) result1.next();
            cbruta.addItem(rut.getOrigen());
        }
        
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
        lblmatricula = new javax.swing.JLabel();
        lblnumerobus = new javax.swing.JLabel();
        lblcolor = new javax.swing.JLabel();
        lblcapacidad = new javax.swing.JLabel();
        lblagencia = new javax.swing.JLabel();
        lblruta = new javax.swing.JLabel();
        lblfechaobtencion = new javax.swing.JLabel();
        lblfechafin = new javax.swing.JLabel();
        lblopcional = new javax.swing.JLabel();
        txtmatricula = new javax.swing.JTextField();
        cbcolor = new javax.swing.JComboBox<>();
        cbagencia = new javax.swing.JComboBox<>();
        cbruta = new javax.swing.JComboBox<>();
        dcfechaobtencion = new com.toedter.calendar.JDateChooser();
        dcfechafin = new com.toedter.calendar.JDateChooser();
        btnsalir = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txthorasalida = new javax.swing.JTextField();
        txthoraingreso = new javax.swing.JTextField();
        txtnumbus = new javax.swing.JTextField();
        txtcapacidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("INGRESO DE BUS");

        lblmatricula.setText("Matricula:");

        lblnumerobus.setText("Numero del bus:");

        lblcolor.setText("Color:");

        lblcapacidad.setText("Capacidad:");

        lblagencia.setText("Agencia:");

        lblruta.setText("Ruta:");

        lblfechaobtencion.setText("Fecha de obtencion:");

        lblfechafin.setText("Fecha de fin de obtencion:");

        lblopcional.setText("(opcional)");

        cbcolor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Blanco", "Azul", "Amarillo", "Rojo", "Verde", "Naranja", "Gris", "Negro." }));

        cbagencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        cbruta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btnsalir.setText("SALIR");

        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Hora ingreso:");

        jLabel2.setText("Hora salida:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnsalir)
                        .addGap(53, 53, 53)
                        .addComponent(btnguardar)
                        .addGap(46, 46, 46)
                        .addComponent(btnbuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblagencia)
                            .addComponent(lblcapacidad)
                            .addComponent(lblcolor)
                            .addComponent(lblnumerobus)
                            .addComponent(lblmatricula)
                            .addComponent(lblruta)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmatricula)
                            .addComponent(cbcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbagencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbruta, 0, 136, Short.MAX_VALUE)
                            .addComponent(txthorasalida)
                            .addComponent(txthoraingreso)
                            .addComponent(txtnumbus)
                            .addComponent(txtcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblopcional)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfechafin)
                            .addComponent(lblfechaobtencion, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcfechaobtencion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcfechafin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmatricula)
                    .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnumerobus)
                    .addComponent(txtnumbus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcolor)
                    .addComponent(cbcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcapacidad)
                    .addComponent(txtcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblagencia)
                    .addComponent(cbagencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblruta)
                    .addComponent(cbruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txthorasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txthoraingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfechaobtencion)
                    .addComponent(dcfechaobtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblfechafin)
                        .addComponent(lblopcional))
                    .addComponent(dcfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalir)
                    .addComponent(btnguardar)
                    .addComponent(btnbuscar))
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
        if (txtmatricula.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Ingresa una matricula");
        } else {
            if (txtnumbus.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Ingresa un numero de bus");
            } else {
                if (cbcolor.getSelectedItem().toString().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ingresa un color");
                } else {
                    if (txtcapacidad.getText().isBlank()) {
                        JOptionPane.showMessageDialog(this, "Ingresa la capacidad");
                    } else {
                        if (cbagencia.getSelectedItem().toString().isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Selecciona una agencia");
                        } else {
                            if (cbruta.getSelectedItem().toString().isEmpty()) {
                                JOptionPane.showMessageDialog(this, "Selecciona una ruta");
                            } else {
                                if (txthorasalida.getText().isBlank()) {
                                    JOptionPane.showMessageDialog(this, "Ingresa la hora de salida");
                                } else {
                                    if (txthoraingreso.getText().toString().isBlank()) {
                                        JOptionPane.showMessageDialog(this, "Ingresa la hora de ingreso");
                                    } else {
                                        if (dcfechaobtencion.getDate().toString().isBlank()) {
                                            JOptionPane.showMessageDialog(this, "Ingresa la fecha de obtencion");
                                        } else {
                                            if (dcfechafin.getDate().toString().isBlank()) {
                                                JOptionPane.showMessageDialog(this, "Ingresa la fecha de fin de la obtencion");
                                            } else {                                                
                                                    ObjectContainer base = Db4o.openFile(proyecto_basedatos.BDdireccion);
                                                    CrearBus(base);
                                                    CerrarBD(base);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        
    }//GEN-LAST:event_btnbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso_bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso_bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso_bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso_bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso_bus().setVisible(true);
            }
        });
    }

    public void CrearBus(ObjectContainer base) {
        String auxnumbus = txtnumbus.getText();
        int nuB = Integer.valueOf(auxnumbus);
        String auxcapacidad = txtcapacidad.getText();
        int capB = Integer.valueOf(auxcapacidad);
        Bus Cbus = new Bus(nuB, capB, txtmatricula.getText(), cbcolor.getSelectedItem().toString());
        Bus Bbus = new Bus(0, 0, txtmatricula.getText(), null);
        ObjectSet resultado = base.get(Bbus);
        Registro_contrato Bregnum = new Registro_contrato(null, null, null, null, null);
        ObjectSet resultadonum = base.get(Bregnum);
        int auxidhorario = resultadonum.size()+1;
        int auxidcontrato = resultadonum.size()+1;
        String idhorario = String.valueOf(auxidhorario);
        String idcontrato = String.valueOf(auxidcontrato);
        
        Agencia Bagencia = new Agencia(null, cbagencia.getSelectedItem().toString(), null, null, null);
        
        ObjectSet resultado2 = base.get(Bagencia);
        Agencia agencia = (Agencia) resultado2.next();
        String idagencia = agencia.getId_agencia();
        Registro_contrato Creg = new Registro_contrato(idcontrato, txtmatricula.getText(), idagencia, dcfechaobtencion.getDate(), dcfechafin.getDate());
        Registro_contrato Breg = new Registro_contrato(idcontrato, null, null, null, null);
        ObjectSet resultado1 = base.get(Breg);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime horaing = LocalTime.parse(txthoraingreso.getText(), formatter);
        LocalTime horasal = LocalTime.parse(txthorasalida.getText(), formatter);
        Horario Chorario = new Horario(idhorario, horaing, horasal);
        Horario Bhorario = new Horario(idhorario, null, null);
        ObjectSet resultado3 = base.get(Bhorario);

        if (resultado.isEmpty()) {
            if (resultado1.isEmpty() && resultado3.isEmpty()) {
                base.set(Chorario);
                base.set(Creg);
                base.set(Cbus);
            } else {
                System.out.println("ERROR ya existe este ID");
            }

            txtmatricula.setText("");
            txtnumbus.setText("");
            cbcolor.setSelectedIndex(0);
            txtcapacidad.setText("");
            cbagencia.setSelectedIndex(0);
            cbruta.setSelectedIndex(0);
            txthorasalida.setText("");
            txthoraingreso.setText("");
            dcfechaobtencion.setDate(null);
            dcfechafin.setDate(null);
            JOptionPane.showMessageDialog(this, "Registro exitoso");
        } else {
            JOptionPane.showMessageDialog(this, "Ya existe un cajero con este ID");
        }
    }

    public void CrearRegistro(ObjectContainer base, String idcontrato) {
        Agencia Bagencia = new Agencia(null, cbagencia.getSelectedItem().toString(), null, null, null);
        ObjectSet resultado2 = base.get(Bagencia);
        Agencia agencia = (Agencia) resultado2.next();
        String idagencia = agencia.getId_agencia();
        Registro_contrato Creg = new Registro_contrato(idcontrato, txtmatricula.getText(), idagencia, dcfechaobtencion.getDate(), dcfechafin.getDate());
        Registro_contrato Breg = new Registro_contrato(idcontrato, null, null, null, null);
        ObjectSet resultado1 = base.get(Breg);
    }

    public void CrearHorario(ObjectContainer base, String idhorario) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime horaing = LocalTime.parse(txthoraingreso.getText(), formatter);
        LocalTime horasal = LocalTime.parse(txthorasalida.getText(), formatter);
        Horario Chorario = new Horario(idhorario, horaing, horasal);
        Horario Bhorario = new Horario(idhorario, null, null);
        ObjectSet resultado3 = base.get(Bhorario);
    }
    public static void CerrarBD(ObjectContainer base) {
        base.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbagencia;
    private javax.swing.JComboBox<String> cbcolor;
    private javax.swing.JComboBox<String> cbruta;
    private com.toedter.calendar.JDateChooser dcfechafin;
    private com.toedter.calendar.JDateChooser dcfechaobtencion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblagencia;
    private javax.swing.JLabel lblcapacidad;
    private javax.swing.JLabel lblcolor;
    private javax.swing.JLabel lblfechafin;
    private javax.swing.JLabel lblfechaobtencion;
    private javax.swing.JLabel lblmatricula;
    private javax.swing.JLabel lblnumerobus;
    private javax.swing.JLabel lblopcional;
    private javax.swing.JLabel lblruta;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTextField txtcapacidad;
    private javax.swing.JTextField txthoraingreso;
    private javax.swing.JTextField txthorasalida;
    private javax.swing.JTextField txtmatricula;
    private javax.swing.JTextField txtnumbus;
    // End of variables declaration//GEN-END:variables
}
