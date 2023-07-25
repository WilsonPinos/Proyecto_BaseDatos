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
import java.util.Date;
import javax.swing.JOptionPane;
import proyecto_basedatos.Agencia;
import proyecto_basedatos.Bus;
import proyecto_basedatos.Cajero;
import proyecto_basedatos.Horario;
import proyecto_basedatos.Registro_contrato;
import proyecto_basedatos.Ruta;
import proyecto_basedatos.Turno_asignado;

/**
 *
 * @author Wilson Pinos
 */
public class Modificar_bus extends javax.swing.JFrame {

    /**
     * Creates new form Ingreso_bus
     */
    public Modificar_bus() {
        initComponents();
        ObjectContainer base = Db4o.openFile(proyecto_basedatos.BDdireccion);
        Agencia Bagencia = new Agencia(null, null, null, null, null);
        ObjectSet result = base.get(Bagencia);

        while (result.hasNext()) {
            Agencia agen = (Agencia) result.next();
            cbagencia.addItem(agen.getNombre_agencia());
        }
        Ruta Bruta = new Ruta(null, null, 0);
        ObjectSet result1 = base.get(Bruta);
        
        while (result1.hasNext()) {
            Ruta rut = (Ruta) result1.next();
            cbruta.addItem(rut.getOrigen());
        }
        
        Horario Bhorario = new Horario(null, null, null);
        ObjectSet result2 = base.get(Bhorario);

        while (result2.hasNext()) {
            Horario hor = (Horario) result2.next();
            cbhorario.addItem(hor.getId_turno());
        }

        CerrarBD(base);
    }
    public void recibirCodigo(String matricula, int num_bus, String color_bus, int cantidad_pas, String agencia, String ruta, String horario , Date fecha_obtencion, Date fecha_fin) {

        txtmatricula.setText(matricula);
        txtmatricula.setEnabled(false);
        txtnumbus.setText(String.valueOf(num_bus));
        cbcolor.setSelectedItem(color_bus);
        txtcapacidad.setText(String.valueOf(cantidad_pas));
        cbagencia.setSelectedItem(agencia);
        cbruta.setSelectedItem(ruta);
        cbhorario.setSelectedItem(horario);
        dcfechaobtencion.setDate(fecha_obtencion);
        dcfechafin.setDate(fecha_fin);

    }
    public void ModificarBus(ObjectContainer base) {
        String auxnumbus = txtnumbus.getText();
        int nuB = Integer.valueOf(auxnumbus);
        String auxcapacidad = txtcapacidad.getText();
        int capB = Integer.valueOf(auxcapacidad);
        Bus Cbus = new Bus(nuB, capB, txtmatricula.getText(), cbcolor.getSelectedItem().toString());
        Bus Bbus = new Bus(0, 0, txtmatricula.getText(), null);
        ObjectSet resultado = base.get(Bbus);
        
        //
        Bus Mbus = (Bus) resultado.next();
        Mbus.setMatricula(txtmatricula.getText());
        Mbus.setNum_bus(Integer.valueOf(txtnumbus.getText()));
        Mbus.setColor_bus(cbcolor.getSelectedItem().toString());
        Mbus.setCantidad_pas(Integer.valueOf(txtcapacidad.getText()));
        
        
        Registro_contrato Bregnum = new Registro_contrato(null, txtmatricula.getText(), null, null, null);
        ObjectSet resultadonum = base.get(Bregnum);
        Registro_contrato Idreg= (Registro_contrato) resultadonum.next();
        String idhorario = cbhorario.getSelectedItem().toString();
        
        Turno_asignado Btur = new Turno_asignado(null, null, txtmatricula.getText(), null);
        ObjectSet resulttur = base.get(Btur);
        Turno_asignado Bidtour = (Turno_asignado) resulttur.next();
        
        
        String idcontrato = Idreg.getId_contrato();
        System.out.println(Idreg.getId_contrato());
//        int auxidhorario = resultadonum.size();
//        int auxidcontrato = resultadonum.size();
//        String idhorario = String.valueOf(Idreg.get);
//        String idcontrato = String.valueOf(auxidcontrato);
        
        Agencia Bagencia = new Agencia(null, cbagencia.getSelectedItem().toString(), null, null, null);
        
        ObjectSet resultado2 = base.get(Bagencia);
        Agencia agencia = (Agencia) resultado2.next();
        String idagencia = agencia.getId_agencia();
        Registro_contrato Creg = new Registro_contrato(idcontrato, txtmatricula.getText(), idagencia, dcfechaobtencion.getDate(), dcfechafin.getDate());
        Registro_contrato Breg = new Registro_contrato(idcontrato, null, null, null, null);
        ObjectSet resultado1 = base.get(Breg);
        
        //
        Registro_contrato Mreg = (Registro_contrato) resultado1.next();
        Mreg.setFecha_contrato(dcfechaobtencion.getDate());
        Mreg.setFecha_exo_contra(dcfechafin.getDate());
        Mreg.setId_agencia(idagencia);
        
        Horario Bhor = new Horario(cbhorario.getSelectedItem().toString(), null, null);
        System.out.println(cbhorario.getSelectedItem().toString());
        ObjectSet resultidhor = base.get(Bhor);
        Horario idhor = (Horario) resultidhor.next();
        
        Date fecha_aginacion = new Date();
        Turno_asignado Cturno = new Turno_asignado(Bidtour.getId_turno_asignado(), cbhorario.getSelectedItem().toString(), txtmatricula.getText(), fecha_aginacion);
        
        Turno_asignado Bturno = new Turno_asignado(Bidtour.getId_turno_asignado(), null, null, null);
        System.out.println(idhor.getId_turno());
        System.out.println(cbhorario.getSelectedItem());
        ObjectSet resultado3 = base.get(Bturno);
        
        
        //
        
        Turno_asignado Mtur = (Turno_asignado) resultado3.next();
        
        System.out.println("----");
        Mtur.setId_turno(cbhorario.getSelectedItem().toString());
            while (resultado3.hasNext()){
                System.out.println(resultado3.next().toString());
            }
        System.out.println(Mtur.toString());
                base.set(Mbus);
                base.set(Mreg);
//                base.set(Mtur);
            JOptionPane.showMessageDialog(this, "Modificacion exitosa");
    }
//    public void ModificarBus(ObjectContainer base) {
//        
//        Bus Bbus = new Bus(0, 0, txtmatricula.getText(), null);
//        ObjectSet resultado = base.get(Bbus);
//        
//        Agencia Bagencia = new Agencia(null, cbagencia.getSelectedItem().toString(), null, null, null);
//        ObjectSet resultado1 = base.get(Bagencia);
//        
//        Ruta Bruta = new Ruta(codigo_ruta, origen, WIDTH);
//        ObjectSet resultado2 = base.get(Bruta);
//        
////        Date fecha_aginacion = new Date();
//        Turno_asignado Bturno = new Turno_asignado(idcontrato, null, null, null);
//        ObjectSet resultado3 = base.get(Bturno);
//        
//        
//        Bus Mbus = (Bus) resultado.next();
//        Agencia Magencia = (Agencia) resultado.next();
//        Ruta Mruta = (Ruta) resultado.next();
//        Turno_asignado Mturno = (Turno_asignado) resultado.next();
//        
//        Mbus.setMatricula(matricula);
//        Mbus.setNum_bus(SOMEBITS);
//        Mbus.setColor_bus(color_bus);
//        Mbus.setCantidad_pas(WIDTH);
//        Agencia agencia = (Agencia) resultado1.next();
//        String idagencia = agencia.getId_agencia();
//        Magencia.setId_agencia(idagencia);
//        
//                base.set(Cturno);
//                base.set(Creg);
//                base.set(Cbus);
//        }

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
        txtnumbus = new javax.swing.JTextField();
        txtcapacidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbhorario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("MODIFICAR BUS");

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

        jLabel3.setText("Horario:");

        cbhorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnsalir)
                        .addGap(53, 53, 53)
                        .addComponent(btnguardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblopcional)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfechafin)
                            .addComponent(lblfechaobtencion, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcfechaobtencion, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(dcfechafin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblagencia)
                            .addComponent(lblcapacidad)
                            .addComponent(lblcolor)
                            .addComponent(lblnumerobus)
                            .addComponent(lblmatricula)
                            .addComponent(lblruta)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmatricula)
                            .addComponent(cbcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbagencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbruta, 0, 136, Short.MAX_VALUE)
                            .addComponent(txtnumbus)
                            .addComponent(txtcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbhorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(jLabel3)
                    .addComponent(cbhorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfechaobtencion)
                    .addComponent(dcfechaobtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblfechafin)
                        .addComponent(lblopcional))
                    .addComponent(dcfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
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
        ObjectContainer base = Db4o.openFile(proyecto_basedatos.BDdireccion);
        ModificarBus(base);
        CerrarBD(base);
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        Consulta_bus cons = new Consulta_bus();
        cons.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(Modificar_bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_bus().setVisible(true);
            }
        });
    }

    public static void CerrarBD(ObjectContainer base) {
        base.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbagencia;
    private javax.swing.JComboBox<String> cbcolor;
    private javax.swing.JComboBox<String> cbhorario;
    private javax.swing.JComboBox<String> cbruta;
    private com.toedter.calendar.JDateChooser dcfechafin;
    private com.toedter.calendar.JDateChooser dcfechaobtencion;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JTextField txtmatricula;
    private javax.swing.JTextField txtnumbus;
    // End of variables declaration//GEN-END:variables

    
}
