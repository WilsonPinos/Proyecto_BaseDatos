/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import com.db4o.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import proyecto_basedatos.Agencia;
import proyecto_basedatos.Bus;
import proyecto_basedatos.Horario;
import proyecto_basedatos.Registro_contrato;
import proyecto_basedatos.Ruta;

/**
 *
 * @author Wilson Pinos
 */
public class Consulta_bus extends javax.swing.JFrame {

    /**
     * Creates new form Consulta_bus
     */
    private Modificar_bus modificar;

    private String matricula = "";
    private String color_bus = "";
    private int cantidad_pas;
    private int num_bus;
    private String agencia = "";
    private String ruta = "";
    private LocalTime hora_salida = null;
    private LocalTime hora_regreso = null;
    private Date fecha_obtencion = null;
    private Date fecha_fin = null;

    public Consulta_bus() {
        initComponents();

        BuscarBus();
        tblbus.addMouseListener(new MouseAdapter() {
            DefaultTableModel model = new DefaultTableModel();

            
public void mouseClicked(MouseEvent e) {
    int i = tblbus.getSelectedRow();
    matricula = tblbus.getValueAt(i, 0).toString();
    color_bus = tblbus.getValueAt(i, 1).toString();
    String auxcantidad = tblbus.getValueAt(i, 3).toString();
    cantidad_pas = Integer.valueOf(auxcantidad);
    String auxnumbus = tblbus.getValueAt(i, 2).toString();
    num_bus = Integer.valueOf(auxnumbus);
    agencia = tblbus.getValueAt(i, 4).toString();
    ruta = tblbus.getValueAt(i, 5).toString();

    // Obtener hora de salida
    String auxhorasalida = tblbus.getValueAt(i, 6).toString();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    hora_salida = LocalTime.parse(auxhorasalida, formatter);

    // Obtener hora de regreso
    String auxhoraingreso = tblbus.getValueAt(i, 7).toString();
    hora_regreso = LocalTime.parse(auxhoraingreso, formatter);

    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

    // Obtener fecha de obtencion
    String auxfecha_obt = tblbus.getValueAt(i, 8).toString();
    try {
        fecha_obtencion = formatoFecha.parse(auxfecha_obt);
    } catch (ParseException e11) {
        System.out.println("Error al convertir el String a Date: ");
    }

    // Obtener fecha de fin
    String auxfecha_fin = tblbus.getValueAt(i, 9).toString();
    try {
        fecha_fin = formatoFecha.parse(auxfecha_fin);
    } catch (ParseException e22) {
        System.out.println("Error al convertir el String a Date: ");
    }
}

        });

    }

    public void BuscarBus() {

        ObjectContainer base = Db4o.openFile(proyecto_basedatos.BDdireccion);
        Bus Bbus = new Bus(0, 0, null, null);
        ObjectSet resultado = base.get(Bbus);
        Registro_contrato Breg = new Registro_contrato(null, null, null, null, null);
        ObjectSet resultado1 = base.get(Breg);
        Horario Bhorario = new Horario(null, null, null);
        ObjectSet resultado2 = base.get(Bhorario);
        Agencia Bagencia = new Agencia (null,null,null,null,null);
        ObjectSet resultado3 = base.get(Bagencia);
        Ruta Bruta = new Ruta(null, null, 0);
        ObjectSet resultado4 = base.get(Bruta);
        
        String matriz[][] = new String[resultado.size()][12];
        

        int i = 0;
        Agencia tablabus3 = (Agencia) resultado3.next();
            Ruta tablabus4 = (Ruta) resultado4.next();
        while (resultado.hasNext()) {
            Bus tablabus = (Bus) resultado.next();
            Registro_contrato tablabus1 = (Registro_contrato) resultado1.next();
            Horario tablabus2 = (Horario) resultado2.next();
            

            matriz[i][0] = tablabus.getMatricula();
            matriz[i][1] = tablabus.getColor_bus();
            int axnumbus = tablabus.getNum_bus();
            matriz[i][2] = String.valueOf(axnumbus);
            int auxcantidad = tablabus.getCantidad_pas();
            matriz[i][3] = String.valueOf(auxcantidad);
            
            
            matriz[i][4] = tablabus3.getNombre_agencia();
            matriz[i][5] = tablabus4.getOrigen();
            
            
            matriz[i][6] = tablabus1.getId_contrato();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date auxfecha_cont = tablabus1.getFecha_contrato();
            matriz[i][7] = dateFormat.format(auxfecha_cont);
            Date auxfecha_exo = tablabus1.getFecha_exo_contra();
            matriz[i][8] = dateFormat.format(auxfecha_exo);
            matriz[i][9] = tablabus2.getId_turno();
            String formato = "HH:mm:ss";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
            LocalTime auxfecha_ing = tablabus2.getFecha_ingreso();
            matriz[i][10] = auxfecha_ing.format(formatter);
            LocalTime auxfecha_salida = tablabus2.getFecha_salida();
            matriz[i][11] = auxfecha_salida.format(formatter);

            i++;

        }
        tblbus.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Matricula", "Color", "Numero", "Capacidad", "Agencia" , "Ruta" , "ID contrato", "Fecha de contrato", "Fecha fin de contrato", "ID horario", "Hora ingreso", "Hora salida"}));
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
        tblbus = new javax.swing.JTable();
        btnbuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        btnregresar = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("CONSULTA DE BUS");

        tblbus.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblbus);

        btnbuscar.setText("BUSCAR");

        btnregresar.setText("REGRESAR");

        btnborrar.setText("BORRAR");

        btnmodificar.setText("MODIFICAR");

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
                new Consulta_bus().setVisible(true);
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
    private javax.swing.JTable tblbus;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
