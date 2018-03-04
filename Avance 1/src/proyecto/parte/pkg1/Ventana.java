/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.parte.pkg1;

import java.awt.TextArea;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.text.Element;
import javax.swing.text.Utilities;

/**
 *
 * @author Daniel
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        btnRun.setOpaque(false);
        btnRun.setContentAreaFilled(false);
        btnRun.setBorderPainted(false);
        btnRun.setToolTipText("Compilar");
        
        btnLoad.setOpaque(false);
        btnLoad.setContentAreaFilled(false);
        btnLoad.setBorderPainted(false);
        btnLoad.setToolTipText("Cargar Archivo");
        
        btnAST.setOpaque(false);
        btnAST.setContentAreaFilled(false);
        btnAST.setBorderPainted(false);
        btnAST.setToolTipText("Generar AST");
        
        
        
    }

    
    public static int getLineAtCaret(JTextArea component)
	{
		int caretPosition = component.getCaretPosition();
		Element root = component.getDocument().getDefaultRootElement();

		return root.getElementIndex( caretPosition ) + 1;
	}

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtConsola = new javax.swing.JTextArea();
        btnRun = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        btnAST = new javax.swing.JButton();
        btnInterpretarInstrucciones = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextArea();
        lblLineas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador Sintáctico");

        txtConsola.setEditable(false);
        txtConsola.setColumns(20);
        txtConsola.setRows(5);
        jScrollPane2.setViewportView(txtConsola);

        btnRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/parte/pkg1/Start.png"))); // NOI18N
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        jLabel1.setText("Consola:");

        btnLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/parte/pkg1/folder.png"))); // NOI18N
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnAST.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/parte/pkg1/tree.png"))); // NOI18N
        btnAST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASTActionPerformed(evt);
            }
        });

        btnInterpretarInstrucciones.setText("Interpretar Instrucciones");

        txtCodigo.setColumns(20);
        txtCodigo.setRows(5);
        jScrollPane1.setViewportView(txtCodigo);

        lblLineas.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnInterpretarInstrucciones)
                        .addGap(63, 63, 63)
                        .addComponent(lblLineas)
                        .addContainerGap(370, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAST, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAST, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInterpretarInstrucciones)
                    .addComponent(lblLineas))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        txtConsola.append("Running...");
        txtConsola.append("\nCompilación Exitosa!");
    }//GEN-LAST:event_btnRunActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        JFileChooser cargar = new JFileChooser();
        cargar.showOpenDialog(null);
        File archivo = cargar.getSelectedFile();
        String nombreArchivo = archivo.getName();
        String path = archivo.getAbsolutePath();
        txtConsola.append("\nSe ha abierto el archivo "+nombreArchivo+" desde "+path);
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnASTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASTActionPerformed
        txtConsola.append("\nCargando AST...");
        AST ast = new AST(this, rootPaneCheckingEnabled);
        ast.setVisible(true);
    }//GEN-LAST:event_btnASTActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAST;
    private javax.swing.JButton btnInterpretarInstrucciones;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnRun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JLabel lblLineas;
    private static javax.swing.JTextArea txtCodigo;
    private javax.swing.JTextArea txtConsola;
    // End of variables declaration//GEN-END:variables
}
