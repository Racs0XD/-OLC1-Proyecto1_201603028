/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package py1_201603028;

import java.awt.Color;
import java.io.*;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java_cup.runtime.*;
import py1_201603028.*;
import ANALIZADOR.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author oscar
 */
public class IG_Principal extends javax.swing.JFrame {

    /**
     * Creates new form IG_Principal
     */
    public IG_Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
//===================================================================================================================================================== 
//====================================================   Funciones Utilizadas en IG   =================================================================
//=====================================================================================================================================================   

    private File ubicacionArchivo; // Variable miembro para almacenar la ubicación del archivo

// Función que permite abrir un archivo y mostrar su contenido en un componente de texto
    private void Abrir_Archivo() {
        JFileChooser chooser = new JFileChooser(); // Crear un JFileChooser para seleccionar el archivo
        chooser.showOpenDialog(null); // Mostrar el diálogo para seleccionar archivo
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath()); // Obtener el archivo seleccionado
        ubicacionArchivo = archivo; // Asignar la ubicación seleccionada a la variable miembro
        try {
            // Leer el contenido del archivo y convertirlo en una cadena
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txt_entradas.setText(ST); // Mostrar el contenido en un componente de texto
        } catch (IOException ex) {
            Logger.getLogger(Operaciones_Ig.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

// Función que permite guardar un archivo en su misma ubicación con formato .ocl
    private void guardarArchivo() {
        JFileChooser chooser = new JFileChooser(); // Crear un JFileChooser para seleccionar la ubicación y nombre del archivo
        chooser.setSelectedFile(new File(ubicacionArchivo.getAbsolutePath())); // Establecer la extensión .ocl por defecto y la ubicación predeterminada
        int returnVal = chooser.showSaveDialog(null); // Mostrar el diálogo para guardar archivo
        if (returnVal == JFileChooser.APPROVE_OPTION) { // Si se seleccionó la opción de guardar
            File archivo = chooser.getSelectedFile(); // Obtener la ubicación y nombre del archivo
            try {
// Escribir el contenido del componente de texto en el archivo
                BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
                writer.write(txt_entradas.getText());
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(Operaciones_Ig.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

// Función que permite guardar un archivo con un nombre y ubicación deseada con formato .ocl
    private void guardarArchivoComo() {
        JFileChooser chooser = new JFileChooser(); // Crear un JFileChooser para seleccionar la ubicación y nombre del archivo
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".ocl", "ocl"); // Establecer el filtro para la extensión .ocl
        chooser.setFileFilter(filter); // Aplicar el filtro al JFileChooser
        int returnVal = chooser.showSaveDialog(null); // Mostrar el diálogo para guardar archivo
        if (returnVal == JFileChooser.APPROVE_OPTION) { // Si se seleccionó la opción de guardar
            File archivo = chooser.getSelectedFile(); // Obtener la ubicación y nombre del archivo
            if (!archivo.getName().endsWith(".ocl")) { // Si el nombre del archivo no tiene la extensión .ocl
                archivo = new File(archivo.getAbsolutePath() + ".ocl"); // Agregar la extensión .ocl al nombre del archivo
            }
            try {
                // Escribir el contenido del componente de texto en el archivo
                BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
                writer.write(txt_entradas.getText());
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(Operaciones_Ig.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void Analizador() {
        String ST = txt_entradas.getText();
        ANALIZADOR.parser pars;
        pars = new ANALIZADOR.parser(new ANALIZADOR.Lexico(new StringReader(ST)));

        try {
            pars.parse();
            txt_consola.setText(ST);
            txt_consola.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = pars.getSErr();
            if (sym != null) {
                String error = "Error de sintaxis en línea " + (sym.right + 1) + ", columna " + (sym.left + 1) + ". Se esperaba " + sym.parse_state + " en lugar de \"" + sym.value + "\".";
                txt_consola.setText(error);
            } else {
                txt_consola.setText("Error de sintaxis: " + ex.getMessage());
            }
            txt_consola.setForeground(Color.RED);
        }


    }

//===================================================================================================================================================== 
//==========================================================   Métodos de la IG   =====================================================================
//===================================================================================================================================================== 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt_entradas = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_consola = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Analizar = new javax.swing.JButton();
        combo_Archivo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        panel_TArbol = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_TArbol1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel_TArbol2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panel_TArbol3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        statusLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        txt_entradas.setColumns(20);
        txt_entradas.setRows(5);
        txt_entradas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_entradasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_entradasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_entradasKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txt_entradas);

        txt_consola.setEditable(false);
        txt_consola.setColumns(20);
        txt_consola.setRows(5);
        jScrollPane2.setViewportView(txt_consola);

        jLabel1.setText("Consola");

        jLabel2.setText("Archivo");

        btn_Analizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Analizar.setText("Analizar Entrada");
        btn_Analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnalizarActionPerformed(evt);
            }
        });

        combo_Archivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Archivo", "Nuevo Archivo", "Abrir Archivo", "Guardar Archivo", "Guardar Archivo Como" }));
        combo_Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_ArchivoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel_TArbol.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tabal de Siguientes");

        javax.swing.GroupLayout panel_TArbolLayout = new javax.swing.GroupLayout(panel_TArbol);
        panel_TArbol.setLayout(panel_TArbolLayout);
        panel_TArbolLayout.setHorizontalGroup(
            panel_TArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TArbolLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(15, 15, 15))
        );
        panel_TArbolLayout.setVerticalGroup(
            panel_TArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        panel_TArbol1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Árboles");

        javax.swing.GroupLayout panel_TArbol1Layout = new javax.swing.GroupLayout(panel_TArbol1);
        panel_TArbol1.setLayout(panel_TArbol1Layout);
        panel_TArbol1Layout.setHorizontalGroup(
            panel_TArbol1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TArbol1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(49, 49, 49))
        );
        panel_TArbol1Layout.setVerticalGroup(
            panel_TArbol1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        panel_TArbol2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tabla de Transiciones");

        javax.swing.GroupLayout panel_TArbol2Layout = new javax.swing.GroupLayout(panel_TArbol2);
        panel_TArbol2.setLayout(panel_TArbol2Layout);
        panel_TArbol2Layout.setHorizontalGroup(
            panel_TArbol2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TArbol2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_TArbol2Layout.setVerticalGroup(
            panel_TArbol2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        panel_TArbol3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Tabla de Transiciones");

        javax.swing.GroupLayout panel_TArbol3Layout = new javax.swing.GroupLayout(panel_TArbol3);
        panel_TArbol3.setLayout(panel_TArbol3Layout);
        panel_TArbol3Layout.setHorizontalGroup(
            panel_TArbol3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TArbol3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_TArbol3Layout.setVerticalGroup(
            panel_TArbol3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_TArbol3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_TArbol2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_TArbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_TArbol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_TArbol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(panel_TArbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(panel_TArbol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(panel_TArbol3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ver Imágenes", "Árboles", "Siguientes", "Transiciones", "Autómatas" }));

        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        statusLabel.setText("Linea: 1 Columna: 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(statusLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combo_Archivo, 0, 0, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Analizar)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_Archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Analizar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnalizarActionPerformed
        Analizador();
    }//GEN-LAST:event_btn_AnalizarActionPerformed

    private void combo_ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_ArchivoActionPerformed
        String selectedItem = combo_Archivo.getSelectedItem().toString();

        if (selectedItem.equals("Nuevo Archivo")) {
            txt_entradas.setText(null);
            txt_consola.setText(null);

        } else if (selectedItem.equals("Abrir Archivo")) {
            Abrir_Archivo();
            txt_consola.setText(null);
        } else if (selectedItem.equals("Guardar Archivo")) {
            guardarArchivo();
        } else if (selectedItem.equals("Guardar Archivo Como")) {
            guardarArchivoComo();
        }
    }//GEN-LAST:event_combo_ArchivoActionPerformed

    private void txt_entradasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_entradasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_entradasKeyPressed

    private void txt_entradasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_entradasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_entradasKeyTyped

    private void txt_entradasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_entradasKeyReleased
        // TODO add your handling code here:

        int caretPosition = txt_entradas.getCaretPosition();
        int lineNumber = 1;
        int columnNumber = 1;

        try {
            lineNumber = txt_entradas.getLineOfOffset(caretPosition) + 1;
            columnNumber = caretPosition - txt_entradas.getLineStartOffset(lineNumber - 1) + 1;
        } catch (Exception ex) {
        }

        statusLabel.setText("Linea: " + lineNumber + ", Columna: " + columnNumber);

    }//GEN-LAST:event_txt_entradasKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Operaciones_Ig.generarCompilador();
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
            java.util.logging.Logger.getLogger(IG_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IG_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IG_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IG_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IG_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Analizar;
    private javax.swing.JComboBox<String> combo_Archivo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel_TArbol;
    private javax.swing.JPanel panel_TArbol1;
    private javax.swing.JPanel panel_TArbol2;
    private javax.swing.JPanel panel_TArbol3;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextArea txt_consola;
    private javax.swing.JTextArea txt_entradas;
    // End of variables declaration//GEN-END:variables
}
