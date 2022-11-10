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
public class FrameInterfaz_IDK extends javax.swing.JFrame {

    String[][] cuadrupla;

    //Estructura para guardar codigoObjeto
    ArrayList<String> oCode = new ArrayList<>();
    ArrayList<String> tripletas = new ArrayList<>();
    
    String nPolaca;
    int temp;

    /**
     * Creates new form FrameInterfaz_NL
     */
    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileInputStream salida;

    public FrameInterfaz_IDK() {
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
        txtSemanticas = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPreOrden = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtInOrden = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPostOrden = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtExpresion = new javax.swing.JTextArea();
        btnCompilar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtPolaca = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 477, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(385, 385, 385)
                .addComponent(tecnm_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tecnm_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ittepic_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtSemanticas.setColumns(20);
        txtSemanticas.setRows(5);
        jScrollPane1.setViewportView(txtSemanticas);

        txtPreOrden.setColumns(20);
        txtPreOrden.setRows(5);
        jScrollPane2.setViewportView(txtPreOrden);

        txtInOrden.setColumns(20);
        txtInOrden.setRows(5);
        jScrollPane3.setViewportView(txtInOrden);

        txtPostOrden.setColumns(20);
        txtPostOrden.setRows(5);
        jScrollPane4.setViewportView(txtPostOrden);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

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
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Pre Orden");

        jLabel2.setText("In Orden ");

        jLabel3.setText("Post Orden");

        jLabel4.setText("Codigo 3 direcciones");

        jLabel5.setText("Reglas Semanticas");

        jButton2.setText("Generar Object Code");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addGap(361, 361, 361)
                .addComponent(jLabel5)
                .addGap(156, 156, 156)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel4))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 255, 204));

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel10.setText("Notacion Polaca");

        txtPolaca.setColumns(20);
        txtPolaca.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtPolaca.setRows(5);
        jScrollPane7.setViewportView(txtPolaca);

        jButton1.setText("Tripletas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Cuadruplos");

        jButton4.setText("Tabla de simbolos");

        jButton5.setText("Codigo IP");

        btnClean.setText("Clean");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnClean, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ____________ METODOS inOrden, postOrden y PreOrden
    //12 septiembre 2022
    // Que es la notacion prefija o Notacion Polaca?
    public void preOrden(Nodo n) {
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
    }// Funcion inOrden

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
                jTextArea5.append(n.getCodigoIntermedio());
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
        preOrden(arbolExpresion);
        posOrden(arbolExpresion);
        inOrden(arbolExpresion);
        intermedio(arbolExpresion);

        archivoTres();
    }//GEN-LAST:event_btnCompilarActionPerformed
    public void archivoTres() {

        try {
            String ruta = "/home/cris/Documentos/TEC/7moSemestre/Lenguajes_y-Automatas_II/Unidad1/MicroCompiler_5/src/Archivos/codigoTres.tx";
            String contenido = jTextArea5.getText();
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
        txtSemanticas.setText(contenido);
    }
    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        txtExpresion.setText("");
        txtExpresion.setFocusable(true);
        txtPreOrden.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FrameTripletas().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
                    System.out.println("LD R1," + R1);
                    System.out.println(inst + " R0,R0,R1");
                    break;
                case 2:
                    System.out.println("LD R1," + R1);
                    System.out.println(inst + " R0,R1,R0");
                    break;
                case 3:
                    System.out.println("LD R1," + R2);
                    System.out.println("LD R2," + R2);
                    System.out.println(inst + " R1,R1,R2");
                    break;
                    
                default:
                    System.out.println("LD R0," + R0);
                    System.out.println("LD R1," + R1);
                    System.out.println(inst + " R0,R0,R1");
                    caso =0;
            }
            
            // caso = true;
        }//Recorrer tripletas

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        objectCode(tripletas);

        /**
         * AQUI TODAVIA NO ARREGLO EL MANDAR A LLAMAR AL TERMINAL
         **/
        String file = new String("/home/cris/Documentos/TEC/7moSem…s_II/Unidad1/MicroCompiler_5/src/CodigoObjeto.txt");
        try {
            //definiendo la ruta en la propiedad file
            Runtime.getRuntime().exec("zsh");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameInterfaz_IDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInterfaz_IDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInterfaz_IDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInterfaz_IDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInterfaz_IDK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JLabel ittepic_logo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JLabel tecnm_logo;
    private javax.swing.JTextArea txtExpresion;
    private javax.swing.JTextArea txtInOrden;
    private javax.swing.JTextArea txtPolaca;
    private javax.swing.JTextArea txtPostOrden;
    private javax.swing.JTextArea txtPreOrden;
    private javax.swing.JTextArea txtSemanticas;
    // End of variables declaration//GEN-END:variables
}
