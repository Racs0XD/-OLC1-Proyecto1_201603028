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
import java.util.ArrayList;
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
    public static ArrayList<ERRORES> errorL = new ArrayList<ERRORES>();

    private void Analizador() {
        String ST = txt_entradas.getText();
        ANALIZADOR.parser pars;
        pars = new ANALIZADOR.parser(new ANALIZADOR.Lexico(new StringReader(ST)));
        try {
            pars.parse();
            txt_consola.setText("Analicis realizado satisfactoriamente,\n se generaron los respectivos reportes.");
            txt_consola.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Reportes rep = new Reportes();
            Symbol sym = pars.getSErr();
            String error = "Error de sintaxis en línea " + (sym.right + 1) + ", columna " + (sym.left + 1) + ".\n El carácter \"" + sym.value + "\" no pertence al lenguaje.";
            String va =  "El carácter \"" + sym.value + "\" no pertence al lenguaje.";
            int lin = sym.right + 1;
            int col = sym.left + 1;
            errorL.add(new ERRORES("Lexico",va,lin,col));
            rep.GenerarReporte(errorL);
            txt_consola.setText(error);
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
        btn_Analizar = new javax.swing.JButton();
        combo_Archivo = new javax.swing.JComboBox<>();
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

        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        statusLabel.setText("Linea: 1 Columna: 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combo_Archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Analizar))
                    .addComponent(statusLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_Archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Analizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusLabel)
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextArea txt_consola;
    private javax.swing.JTextArea txt_entradas;
    // End of variables declaration//GEN-END:variables
}
