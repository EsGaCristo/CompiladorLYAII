/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package microC;

import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author cris
 */
public class FrameInterfaz_E extends javax.swing.JFrame {

    String[][] cuadrupla;

    //Estructura para guardar codigoObjeto
    ArrayList<String> oCode = new ArrayList<>();
    ArrayList<String> tripletas = new ArrayList<>();
    int temp;

    /**
     * Creates new form FrameInterfaz_NL
     */
    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileInputStream salida;

    public FrameInterfaz_E() {
        initComponents();
        reescalarImagen();
        // System.out.println(getClass().getpa);

    }

    public void reescalarImagen() {
        ImageIcon logo = new ImageIcon(getClass().getResource("/Images/escudo_itt_grande.png"));
        Icon icono = new ImageIcon(logo.getImage().getScaledInstance(ittepic_logo.getWidth(),
                ittepic_logo.getHeight(), Image.SCALE_DEFAULT));
        ittepic_logo.setIcon(icono);

        logo = new ImageIcon(getClass().getResource("/Images/tecnm.png"));
        icono = new ImageIcon(logo.getImage().getScaledInstance(tecnm_logo.getWidth(),
                tecnm_logo.getHeight(), Image.SCALE_DEFAULT));
        tecnm_logo.setIcon(icono);

        this.repaint();
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
        jLabel7 = new javax.swing.JLabel();
        ittepic_logo = new javax.swing.JLabel();
        tecnm_logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCuadruplos = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtObjeto = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtExpresion = new javax.swing.JTextArea();
        btnCompilar = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtTripletas = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        btnObjeto = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        btnDocumentacion = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setText("MicroCompilador Java - LyAII");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ittepic_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addComponent(tecnm_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ittepic_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(tecnm_logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(36, 36, 36))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtCuadruplos.setColumns(20);
        txtCuadruplos.setRows(5);
        jScrollPane1.setViewportView(txtCuadruplos);

        txtObjeto.setColumns(20);
        txtObjeto.setRows(5);
        jScrollPane5.setViewportView(txtObjeto);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Expresion");

        txtExpresion.setBackground(new java.awt.Color(255, 255, 204));
        txtExpresion.setColumns(20);
        txtExpresion.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        txtExpresion.setRows(5);
        txtExpresion.setText("a+b*c");
        jScrollPane6.setViewportView(txtExpresion);

        btnCompilar.setText("Compilar");
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel6)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        txtTripletas.setColumns(20);
        txtTripletas.setRows(5);
        jScrollPane8.setViewportView(txtTripletas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(560, 560, 560))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5))
                .addGap(192, 192, 192))
        );

        jPanel6.setBackground(new java.awt.Color(153, 255, 204));

        btnObjeto.setText("Codigo Objeto");
        btnObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjetoActionPerformed(evt);
            }
        });

        btnClean.setText("Clean");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnDocumentacion.setText("Documentacion");
        btnDocumentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentacionActionPerformed(evt);
            }
        });

        btnAbout.setText("Acerca de...");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDocumentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDocumentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ____________ METODOS inOrden, postOrden y PreOrden
    //12 septiembre 2022
    // Que es la notacion prefija o Notacion Polaca?
  /*  public void preOrden(Nodo n) {
        if (n != null) {
            txtPreOrden.append(n.getDato() + "\n");
            txtPolaca.append(n.getDato() + " ");
            preOrden(n.getDerecho());
            preOrden(n.getIzquierdo());

        }//if para confirmar que no sea nulo el arbol
    }// Funcion PreOrden 

    public void posOrden(Nodo n) {
        if (n != null) {
            posOrden(n.getDerecho());
            posOrden(n.getIzquierdo());
            txtPostOrden.append(n.getDato() + "\n");
            //txtPolaca.append(n.getDato() + " ");

        }//if para confirmar que no sea nulo el arbol
    }// Funcion PreOrden 

    public void inOrden(Nodo n) {
        if (n != null) {
            inOrden(n.getDerecho());
            txtInOrden.append(n.getDato() + "\n");
            inOrden(n.getIzquierdo());
            //txtPolaca.append(n.getDato() + " ");

        }//if para confirmar que no sea nulo el arbol
    }// Funcion inOrden*/

    public void intermedio(Nodo n) {//Funcion de codigo intermedio
        if (n != null) {
            intermedio(n.getIzquierdo());
            intermedio(n.getDerecho());

            if (n.getIzquierdo() == null && n.getDerecho() == null) {
                n.setLugar(n.getDato() + "");
                n.setCodigoIntermedio("");
            } else if (n.getDato().equals("+") || (n.getDato().equals("*"))) {
                temp++;
                n.setLugar("T" + temp);
                String codigoI = "", aux = " ";
                String codigoIntHash = "";//?
                Nodo izquierdo = n.getIzquierdo();
                Nodo derecho = n.getDerecho();

                //Obtener la asignacion de temporal
                codigoI = n.getLugar() + " = " + aux + izquierdo.getDato() + aux
                        + n.getDato() + aux + derecho.getDato() + "\n";
                n.setCodigoIntermedio(codigoI);
                n.setDato(n.getLugar());
                tripletas.add(n.getCodigoIntermedio());
                txtTripletas.append(n.getCodigoIntermedio());
            }
        }

    }//Funcion de codigo intermedio
    //__________________________________________________________________________

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        // TODO add your handling code here:

        String datos = "";
        //temp=0;

        Arbol arbol = new Arbol();
        datos = txtExpresion.getText();
        Nodo arbolExpresion = arbol.crear(datos);
        //Enviar los datos al arbol -expresion 

        //Imprimir Reglas semanticas
        reglas(arbol);

        //Enviar a las areas de texto-NOTACIONES
//        preOrden(arbolExpresion);
//        posOrden(arbolExpresion);
//        inOrden(arbolExpresion);
        intermedio(arbolExpresion);

        //archivoTres();
        objectCode(tripletas);
    }//GEN-LAST:event_btnCompilarActionPerformed
    public void archivoTres() {

        try {
            String ruta = "";
            String contenido = txtObjeto.getText();
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reglas(Arbol a) {
        String contenido = "";
        int c = 1;
        Iterator<String> it = a.reglasEjecutadas.iterator();
        while (it.hasNext()) {
            contenido += "P" + c + " " + it.next() + ")\n";
            c++;
        }
        //Censuramos para que no imprima las reglas
        
        //txtCuadruplos.setText(contenido);
    }
    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        txtExpresion.setText("");
        tripletas.clear();
        oCode.clear();
        txtCuadruplos.setText("");
        txtTripletas.setText("");
        txtObjeto.setText("");
        txtExpresion.setFocusable(true);
        txtExpresion.isFocusable();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjetoActionPerformed
        
    }//GEN-LAST:event_btnObjetoActionPerformed

    private void btnDocumentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDocumentacionActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAboutActionPerformed

    private void objectCode(ArrayList<String> tripletas) {
        String inst, R0, R1, R2, R3, op;
        int caso = 0;
        inst = R1 = R0 = R2 = R3 = op = "";
        int index = 0;
        //oCode

        for (String tripleta : tripletas) {

            tripleta = tripleta.replaceAll("T[1-9] =  ", "").replaceAll("\\n", "");

            // Definimos que operacion es
            if (tripleta.contains("*")) {
                inst = "MUL";
                op = "*";
            }
            if (tripleta.contains("/")) {
                inst = "DIV";
                op = "/";
            }
            if (tripleta.contains("-")) {
                inst = "SUB";
                op = "-";
            } else if (tripleta.contains("+")) {
                inst = "ADD";
                op = "+";
            }
            // Definimos que operacion es
            
            //Condicionales para ver el orden de la operacion
            if (R0.isEmpty() && R1.isEmpty()) {
                R0 = (tripleta.substring(0, tripleta.indexOf(op))).replaceAll(" ", "");
                R1 = (tripleta.substring(tripleta.indexOf(op) + 1)).replaceAll(" ", "");

            } else if ((tripleta.substring(0, tripleta.indexOf(op))).contains("T")) {//temporal izquierdo
                R1 = (tripleta.substring(tripleta.indexOf(op) + 1)).replaceAll(" ", "");
                caso =1 ;
            } else if ((tripleta.substring(tripleta.indexOf(op) + 1)).contains("T")) {//temporal derecho
                R1 = (tripleta.substring(0, tripleta.indexOf(op))).replaceAll(" ", "");
                caso =2;
            } else if (!R0.isEmpty()) {//Caso en que los dos son temporales
                R1 = (tripleta.substring(0, tripleta.indexOf(op))).replaceAll(" ", "");
                R2 = (tripleta.substring(tripleta.indexOf(op) + 1)).replaceAll(" ", "");
                caso = 3;
            }

            //Condicionales para ver el orden de la operacion
            switch (caso) {
                case 1:
                    txtObjeto.append("LD R1," + R1 +"\n");
                    txtObjeto.append(inst + " R0,R0,R1"+"\n");
                    break;
                case 2:
                    txtObjeto.append("LD R1," + R1 +"\n");
                    txtObjeto.append(inst + " R0,R1,R0" +"\n");
                    
                    
                    break;
                case 3:
                    txtObjeto.append("LD R1," + R1 +"\n");
                    txtObjeto.append("LD R2," + R2 +"\n");
                    txtObjeto.append(inst + " R1,R1,R2" +"\n");
                    
                    
                    break;
                    
                default:
                    txtObjeto.append("LD R0," + R0 +"\n");
                    txtObjeto.append("LD R1," + R1 +"\n");
                    txtObjeto.append(inst + " R0,R0,R1" +"\n");
                    
                    
                    caso =0;
            }
            
            // caso = true;
        }//Recorrer tripletas

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
            java.util.logging.Logger.getLogger(FrameInterfaz_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInterfaz_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInterfaz_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInterfaz_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInterfaz_E().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnDocumentacion;
    private javax.swing.JButton btnObjeto;
    private javax.swing.JLabel ittepic_logo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel tecnm_logo;
    private javax.swing.JTextArea txtCuadruplos;
    private javax.swing.JTextArea txtExpresion;
    private javax.swing.JTextArea txtObjeto;
    private javax.swing.JTextArea txtTripletas;
    // End of variables declaration//GEN-END:variables
}