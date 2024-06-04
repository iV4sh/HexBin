package Vista;

import Negocio.Hex_bin;

public class HexadecimalBinario extends javax.swing.JFrame {

    public HexadecimalBinario() {
        initComponents();
        //CENTRAR PANTALLA
        this.setLocationRelativeTo(this);
        //CAMBIAR LOS COLORES A LOS BOTONES AL MOMENTO DE PARSAR POR ENCIMA DE LOS MISMOS
        CambiosColorBoton.configurarCambiosColor(jLcalcularIEEE, jPcalcular);
        CambiosColorBoton.configurarCambiosColor(jLguardar, jPguardar);
        CambiosColorBoton.configurarCambiosColor(jLborrarHistorial, jPborrarHistorial);
        AlternarComponentes.configurarAlternar(jRBformato, jLsigno, jLexponente, jLmantiza, jTFsigno,jTFexponente, jTFmantiza, jTFtransformarNormal);
        //SE OCULTAN ELEMENTOS
        jLsigno.setVisible(false);
        jLexponente.setVisible(false);
        jLmantiza.setVisible(false);
        jTFsigno.setVisible(false);
        jTFexponente.setVisible(false);
        jTFmantiza.setVisible(false);
        jLcalcularIEEE.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLregresar = new javax.swing.JLabel();
        jLhome = new javax.swing.JLabel();
        jLsalir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFnumeroHexa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRBformato = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTFmantiza = new javax.swing.JTextField();
        jTFsigno = new javax.swing.JTextField();
        jTFexponente = new javax.swing.JTextField();
        jLmantiza = new javax.swing.JLabel();
        jLsigno = new javax.swing.JLabel();
        jLexponente = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jThistorialHaB = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jPborrarHistorial = new javax.swing.JPanel();
        jLborrarHistorial = new javax.swing.JLabel();
        jTFtransformarNormal = new javax.swing.JTextField();
        jPguardar = new javax.swing.JPanel();
        jLguardar = new javax.swing.JLabel();
        jPcalcular = new javax.swing.JPanel();
        jLcalcularIEEE = new javax.swing.JLabel();
        jLcalcularNormal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(55, 55, 55));

        jLregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jLregresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLregresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLregresarMouseClicked(evt);
            }
        });

        jLhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        jLhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLhomeMouseClicked(evt);
            }
        });

        jLsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salie.png"))); // NOI18N
        jLsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLsalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLhome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLregresar))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(jLregresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLhome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLsalir)
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 140, 500));

        jPanel3.setBackground(new java.awt.Color(192, 178, 131));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONVERSOR DE HEXADECIMAL A BINARIO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 860, 50));

        jTFnumeroHexa.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jTFnumeroHexa.setBorder(null);
        jPanel1.add(jTFnumeroHexa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 520, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel2.setText("Resultado de la transformación:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jRBformato.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jRBformato.setText("Formato IEEE-754 32bits");
        jRBformato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBformatoActionPerformed(evt);
            }
        });
        jPanel1.add(jRBformato, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel3.setText("Historial:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        jTFmantiza.setEditable(false);
        jTFmantiza.setBackground(new java.awt.Color(255, 255, 255));
        jTFmantiza.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jTFmantiza.setBorder(null);
        jPanel1.add(jTFmantiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 300, 40));

        jTFsigno.setEditable(false);
        jTFsigno.setBackground(new java.awt.Color(255, 255, 255));
        jTFsigno.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jTFsigno.setBorder(null);
        jPanel1.add(jTFsigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 50, 40));

        jTFexponente.setEditable(false);
        jTFexponente.setBackground(new java.awt.Color(255, 255, 255));
        jTFexponente.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jTFexponente.setBorder(null);
        jPanel1.add(jTFexponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 150, 40));

        jLmantiza.setFont(new java.awt.Font("Segoe UI Semilight", 2, 12)); // NOI18N
        jLmantiza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLmantiza.setText("Mantiza");
        jPanel1.add(jLmantiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 300, -1));

        jLsigno.setFont(new java.awt.Font("Segoe UI Semilight", 2, 12)); // NOI18N
        jLsigno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLsigno.setText("Signo");
        jPanel1.add(jLsigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 50, -1));

        jLexponente.setFont(new java.awt.Font("Segoe UI Semilight", 2, 12)); // NOI18N
        jLexponente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLexponente.setText("Exponente");
        jPanel1.add(jLexponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 150, -1));

        jThistorialHaB.setEditable(false);
        jThistorialHaB.setColumns(20);
        jThistorialHaB.setRows(5);
        jScrollPane2.setViewportView(jThistorialHaB);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 130, 270, 290));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel7.setText("Ingrese el numero hexadecimal:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jPborrarHistorial.setBackground(new java.awt.Color(220, 208, 192));

        jLborrarHistorial.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLborrarHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLborrarHistorial.setText("BORRAR HISTORIAL");
        jLborrarHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPborrarHistorialLayout = new javax.swing.GroupLayout(jPborrarHistorial);
        jPborrarHistorial.setLayout(jPborrarHistorialLayout);
        jPborrarHistorialLayout.setHorizontalGroup(
            jPborrarHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPborrarHistorialLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLborrarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPborrarHistorialLayout.setVerticalGroup(
            jPborrarHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPborrarHistorialLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLborrarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPborrarHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 200, 40));

        jTFtransformarNormal.setEditable(false);
        jTFtransformarNormal.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jTFtransformarNormal.setBorder(null);
        jPanel1.add(jTFtransformarNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 520, 40));

        jPguardar.setBackground(new java.awt.Color(220, 208, 192));

        jLguardar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLguardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLguardar.setText("GUARDAR");
        jLguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLguardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPguardarLayout = new javax.swing.GroupLayout(jPguardar);
        jPguardar.setLayout(jPguardarLayout);
        jPguardarLayout.setHorizontalGroup(
            jPguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPguardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPguardarLayout.setVerticalGroup(
            jPguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPguardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 250, 40));

        jPcalcular.setBackground(new java.awt.Color(220, 208, 192));

        jLcalcularIEEE.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLcalcularIEEE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLcalcularIEEE.setText("CALCULAR");
        jLcalcularIEEE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLcalcularIEEE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLcalcularIEEEMouseClicked(evt);
            }
        });

        jLcalcularNormal.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLcalcularNormal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLcalcularNormal.setText("CALCULAR");
        jLcalcularNormal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLcalcularNormal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLcalcularNormalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPcalcularLayout = new javax.swing.GroupLayout(jPcalcular);
        jPcalcular.setLayout(jPcalcularLayout);
        jPcalcularLayout.setHorizontalGroup(
            jPcalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcalcularLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLcalcularIEEE, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLcalcularNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPcalcularLayout.setVerticalGroup(
            jPcalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcalcularLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPcalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcalcularIEEE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcalcularNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBformatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBformatoActionPerformed
       
        //BORRAR DATOS DE LOS JTFIELD
        jTFnumeroHexa.setText("");
        jTFtransformarNormal.setText("");
        jTFsigno.setText("");
        jTFexponente.setText("");
        jTFmantiza.setText("");
        
        //SE OCULTAN/MOSTRAR ELEMENTOS
        jLcalcularNormal.setVisible(false);
        jLcalcularIEEE.setVisible(true);
        
    }//GEN-LAST:event_jRBformatoActionPerformed

    private void jLregresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLregresarMouseClicked
    
       //SE MUEVE A OTROS JFRAMES
       MenuConversores menucon = new MenuConversores();
       menucon.setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_jLregresarMouseClicked

    private void jLhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLhomeMouseClicked
        
       //SE MUEVE A OTROS JFRAMES
       MenuPrincipal menuprin = new MenuPrincipal();
       menuprin.setVisible(true);
       this.setVisible(false);
        
    }//GEN-LAST:event_jLhomeMouseClicked

    private void jLsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLsalirMouseClicked

        //SALE DEL SISTEMA
        System.exit(0);
        
    }//GEN-LAST:event_jLsalirMouseClicked

    private void jLcalcularIEEEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLcalcularIEEEMouseClicked
            
        //CONVIERTE A FORMATO IEEE 754-32bits
        String numeroHexa = jTFnumeroHexa.getText();
        Hex_bin hexBin = new Hex_bin(numeroHexa);
        hexBin.verificar();
        String numeroBinario = hexBin.bin();
        String signo = numeroBinario.substring(0, 1);
        String exponente = numeroBinario.substring(1, 9);
        String mantisa = numeroBinario.substring(9);
        jTFsigno.setText(signo);
        jTFexponente.setText(exponente);
        jTFmantiza.setText(mantisa);
        
    }//GEN-LAST:event_jLcalcularIEEEMouseClicked

    private void jLcalcularNormalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLcalcularNormalMouseClicked
        
        //CONVIERTE A FORMATO NORMAL
        
        
    }//GEN-LAST:event_jLcalcularNormalMouseClicked

    private void jLguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLguardarMouseClicked
        
        String texto = jTFtransformarNormal.getText(); 
        jThistorialHaB.append(texto + "\n"); 

        String texto1 = jTFsigno.getText();
        String texto2= jTFexponente.getText(); 
        String texto3 = jTFmantiza.getText(); 
        jThistorialHaB.append(texto1 + texto2 + texto3 + "\n"); 

    }//GEN-LAST:event_jLguardarMouseClicked

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
            java.util.logging.Logger.getLogger(HexadecimalBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HexadecimalBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HexadecimalBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HexadecimalBinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HexadecimalBinario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLborrarHistorial;
    private javax.swing.JLabel jLcalcularIEEE;
    private javax.swing.JLabel jLcalcularNormal;
    private javax.swing.JLabel jLexponente;
    private javax.swing.JLabel jLguardar;
    private javax.swing.JLabel jLhome;
    private javax.swing.JLabel jLmantiza;
    private javax.swing.JLabel jLregresar;
    private javax.swing.JLabel jLsalir;
    private javax.swing.JLabel jLsigno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPborrarHistorial;
    private javax.swing.JPanel jPcalcular;
    private javax.swing.JPanel jPguardar;
    private javax.swing.JRadioButton jRBformato;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFexponente;
    private javax.swing.JTextField jTFmantiza;
    private javax.swing.JTextField jTFnumeroHexa;
    private javax.swing.JTextField jTFsigno;
    private javax.swing.JTextField jTFtransformarNormal;
    private javax.swing.JTextArea jThistorialHaB;
    // End of variables declaration//GEN-END:variables
}
