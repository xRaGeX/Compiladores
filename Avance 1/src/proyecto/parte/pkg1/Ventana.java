/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.parte.pkg1;

import generated.Parser2;
import generated.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.awt.*;
import java.io.*;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.Element;


/**
 *
 * @author Daniel
 */
public class Ventana extends javax.swing.JFrame {

    private JTextPane textPane = new JTextPane();

    File archivo;
    ParseTree tree;
    Parser2 parser;
    java.util.concurrent.Future<JFrame> treeGUI;
    public Ventana() {
        initComponents();
        
        archivo= new File("test.txt");
        
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
        //txtCodigo.setMinimumSize(new Dimension(200, 200));
        
        //JScrollPane scroll = new JScrollPane(txtCodigo);
        TextLineNumber tln = new TextLineNumber(txtCodigo);
        scroll.setRowHeaderView(tln);

        MessageConsole mc = new MessageConsole(txtConsola);
        mc.redirectOut();
        mc.redirectErr(Color.RED, null);

<<<<<<< HEAD

        getLineColInformation();
        
=======
        getLineColInformation();
>>>>>>> 415cad885d6bf83d0bed2e0b8d22cbf7b7f5a93d

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
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextPane();
        scroll = new javax.swing.JScrollPane(txtCodigo);
        lblLine = new javax.swing.JLabel();

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

        txtCodigo.setText("let age = 1;\nlet name = \"Monkey\";\nlet result = 10 * (20 / 2);\n\nlet myArray = [1, 2, 3, 4, 5];\n\nlet thorsten = {\"name\": \"Thorsten\", \"age\": 28};\n\nmyArray[0] // => 1\nthorsten[\"name\"] // => \"Thorsten\"\n\nlet add = fn(a, b) { return a + b; };\n\nlet fibonacci = fn(x) {\nif (x == 0) {\n0\n} else {\nif (x == 1) {\n1\n} else {\nfibonacci(x - 1) + fibonacci(x - 2);\n}\n}\n};\n");
        jScrollPane3.setViewportView(txtCodigo);

        scroll.setAutoscrolls(true);

        lblLine.setText("Line: 0 - Column: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAST, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnInterpretarInstrucciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLine)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAST, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInterpretarInstrucciones)
                    .addComponent(lblLine))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        txtConsola.setText("Running...\n");

        try
        {
            FileWriter pw = new FileWriter ("test.txt");
            txtCodigo.write(pw);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Scanner scanner = null;
        parser = null;
        ANTLRInputStream input=null;
        CommonTokenStream tokens = null;
        try {
            input = new ANTLRInputStream(new FileReader("test.txt"));//archivo.getAbsolutePath()));
            scanner = new Scanner(input);
            tokens = new CommonTokenStream(scanner);
            parser = new Parser2(tokens);
        }
        catch(Exception e){txtConsola.append("No hay archivo");}

        List<Token> lista = (List<Token>) scanner.getAllTokens();
        /*
        for (Token t : lista)

            System.out.println(t.getType() + ":" + t.getText() + "\n");
        scanner.reset();
        */
        try{
            tree = parser.program();
            System.out.println("Compilacion Exitosa!");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnRunActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        JFileChooser cargar = new JFileChooser();
        int result = cargar.showSaveDialog(this);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            System.out.println("ACEPTÓ!");
            cargar.showOpenDialog(null);
            archivo = cargar.getSelectedFile();
            try
            {
                String nombreArchivo = archivo.getName();
                String path = archivo.getAbsolutePath();
                txtConsola.setText("\nSe ha abierto el archivo "+nombreArchivo+" desde "+path);
                FileReader reader = new FileReader( archivo.getAbsolutePath() );
                BufferedReader br = new BufferedReader(reader);
                txtCodigo.read( br, null );
                br.close();
                txtCodigo.requestFocus();
            }
            catch(Exception e2) { System.out.println(e2.getMessage()); }
<<<<<<< HEAD

=======
>>>>>>> 415cad885d6bf83d0bed2e0b8d22cbf7b7f5a93d
        }
        else if(result == JFileChooser.CANCEL_OPTION)
            System.out.println("Canceló!");

    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnASTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASTActionPerformed
        System.out.println("\nCargando AST...");
        //AST ast = new AST(this, rootPaneCheckingEnabled);
        //ast.setVisible(true);
        try{
            treeGUI = org.antlr.v4.gui.Trees.inspect(tree,parser);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnASTActionPerformed



    /*
    * Permite obtener la fila y columna del cursor actual.
    * Esta información fue obtenida de la siguiente página:
    * https://stackoverflow.com/questions/5139995/java-column-number-and-line-number-of-cursors-current-position?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
    * El dia: 21/03/2018 - agradecimientos a Jigar Joshi por publicar la solución en stackoverflow
    * */
    private void getLineColInformation(){
        this.textPane = this.txtCodigo;
        textPane.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                int pos = textPane.getCaretPosition();
                Element map = textPane.getDocument().getDefaultRootElement();
                int row = map.getElementIndex(pos);

                Element lineElem = map.getElement(row);
                int col = pos - lineElem.getStartOffset();

                row+=1;

                updateStatus(row,col);
            }
        });
    }

    private void updateStatus(int line,int col){
        this.lblLine.setText("Line: "+line + "-  Column: "+col);
    }

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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblLine;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextPane txtCodigo;
    private javax.swing.JTextArea txtConsola;
    // End of variables declaration//GEN-END:variables
}
