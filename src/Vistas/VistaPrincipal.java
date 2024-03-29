/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import controlador.*;
import javax.swing.JOptionPane;
import modelo.*;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author pc
 */
public class VistaPrincipal extends javax.swing.JFrame {
    ControladorUsuario ControladorUsuario;
    ControladorAsistencia ControladorAsistencia;
    private String Usuario ;
    
    public VistaPrincipal(String Usuario) {
        this.Usuario=Usuario;
        initComponents();
        ControladorUsuario= new ControladorUsuario();
        ControladorAsistencia= new ControladorAsistencia();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId_usuario = new javax.swing.JTextField();
        txtnombre_usuario = new javax.swing.JTextField();
        txtdependencia = new javax.swing.JTextField();
        cmbestamento_usuario = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        javax.swing.JButton botonGuardar = new javax.swing.JButton();
        javax.swing.JButton botonBuscar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        cmbgenero = new javax.swing.JComboBox<>();
        btnRegistroAsistencia = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaActual = new Date();
        String fechaFormateada = formatoFecha.format(fechaActual);
        txtFecha = new javax.swing.JTextField(fechaFormateada);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Estamento");

        jLabel4.setText("Dependencia");

        cmbestamento_usuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Estudiante", "Docente","Funcionario","Egresado" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        botonGuardar.setText("Agregar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel5.setText(Usuario);

        jLabel6.setText("Genero");

        jLabel7.setText("Estado");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        cmbgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        btnRegistroAsistencia.setText("Registro Ingreso");
        btnRegistroAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroAsistenciaActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombre_usuario)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbgenero, javax.swing.GroupLayout.Alignment.LEADING, 0, 133, Short.MAX_VALUE)
                                .addComponent(cmbEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtdependencia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbestamento_usuario, javax.swing.GroupLayout.Alignment.LEADING, 0, 165, Short.MAX_VALUE)
                                    .addComponent(txtId_usuario, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(botonBuscar)))
                        .addGap(29, 29, 29)
                        .addComponent(botonGuardar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnRegistroAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscar)
                            .addComponent(botonGuardar)
                            .addComponent(btnRegistroAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbestamento_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtdependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        String Id_usuario, nombre_usuario, estamento_usuario,dependencia,genero,Estado;
        
        Id_usuario=txtId_usuario.getText();
        nombre_usuario=txtnombre_usuario.getText();
        estamento_usuario= (String) cmbestamento_usuario.getSelectedItem();
        dependencia=txtdependencia.getText();
        genero= (String) cmbgenero.getSelectedItem();
        Estado= (String) cmbEstado.getSelectedItem();
        
        try{
            ControladorUsuario.insertarUsuario(Id_usuario, nombre_usuario, estamento_usuario, dependencia,genero,Estado);     
           jTextArea1.append("Usuario guardado exitosamente");
           //JOptionPane.showMessageDialog(null, "Programa guardado exitosamente");
           limpiarGUI();
          
        }
        catch(Exception e){
            //System.out.print ("Error al tratar de guardar un programa");
            jTextArea1.append("Error al tratar de guardar un Usuario");
        }
        
    }//GEN-LAST:event_botonGuardarActionPerformed

    
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        String Id_usuario;
        Id_usuario= txtId_usuario.getText();
        
        
      
        try{
             ModeloUsuario ModeloUsuario=ControladorUsuario.consultarUsuario(Id_usuario);
             txtnombre_usuario.setText(ModeloUsuario.getNombre_usuario());
             cmbestamento_usuario.setSelectedItem(ModeloUsuario.getEstamento_usuario());
             txtdependencia.setText(String.valueOf(ModeloUsuario.getDependencia()));
             cmbgenero.setSelectedItem(ModeloUsuario.getGenero());
             cmbEstado.setSelectedItem(ModeloUsuario.getEstado());
             
             
             
             jTextArea1.setText("");
             
             if(ModeloUsuario.getNombre_usuario().length()>1){
                  jTextArea1.append("Consulta Exitosa");
             }
             else{
                 jTextArea1.append("Registro no encontrado");

             }
            
        }
        catch(Exception e){
           System.out.println("Error al consultar la base de datos");
           jTextArea1.append("Registro no encontrado");
        }
       
        
         
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        ControladorUsuario.cerrarConexionBD();
        System.out.println ("Conexion Cerrada ....");
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void btnRegistroAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroAsistenciaActionPerformed
        // TODO add your handling code here:
        String Id_usuario_asistencia, fecha_asistencia;
        
        Id_usuario_asistencia=txtId_usuario.getText();
        fecha_asistencia=txtFecha.getText();
;
        
        try{
            ControladorAsistencia.insertarRegistroAsistencia(Id_usuario_asistencia, fecha_asistencia);     
           jTextArea1.append("Registro guardado exitosamente");
           //JOptionPane.showMessageDialog(null, "Programa guardado exitosamente");
           limpiarGUI();
          
        }
        catch(Exception e){
            //System.out.print ("Error al tratar de guardar un programa");
            jTextArea1.append("Error al tratar de guardar un Registro");
        }
    }//GEN-LAST:event_btnRegistroAsistenciaActionPerformed

    
    private void limpiarGUI(){
        txtId_usuario.setText("");
        txtdependencia.setText("");
        txtnombre_usuario.setText("");
        txtdependencia.setText("");
        
    }
    
    
    /**
     * @param args the command line arguments
     */
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton btnRegistroAsistencia;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox cmbestamento_usuario;
    private javax.swing.JComboBox<String> cmbgenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId_usuario;
    private javax.swing.JTextField txtdependencia;
    private javax.swing.JTextField txtnombre_usuario;
    // End of variables declaration//GEN-END:variables
}
