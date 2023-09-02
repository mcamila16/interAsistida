
import javax.swing.JOptionPane;

public class Perritos extends javax.swing.JFrame {

    public Perritos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tamaño = new javax.swing.JTextField();
        costoT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        perros = new javax.swing.JLabel();
        nPerros = new javax.swing.JTextField();
        horas = new javax.swing.JLabel();
        nHoras = new javax.swing.JTextField();
        tamañoP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoActionPerformed(evt);
            }
        });

        costoT.setBackground(new java.awt.Color(0, 153, 153));
        costoT.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        costoT.setText("Calcular");
        costoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoTActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Downloads\\dog.jpg")); // NOI18N

        titulo.setBackground(new java.awt.Color(204, 204, 255));
        titulo.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(153, 153, 255));
        titulo.setText("PASEADORES DE PERROS");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("1: Grande, 2: Mediano, 3: Pequeño");

        perros.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        perros.setForeground(new java.awt.Color(0, 102, 51));
        perros.setText("Perros:");

        nPerros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nPerrosActionPerformed(evt);
            }
        });

        horas.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        horas.setForeground(new java.awt.Color(0, 102, 51));
        horas.setText("Horas:");

        nHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nHorasActionPerformed(evt);
            }
        });

        tamañoP.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tamañoP.setForeground(new java.awt.Color(0, 102, 51));
        tamañoP.setText("Tamaño:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tamañoP)
                                .addGap(31, 31, 31)
                                .addComponent(tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(costoT)
                                .addGap(114, 114, 114)))
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(titulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(horas)
                                    .addComponent(perros)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nPerros, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(perros, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nHoras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(horas)
                            .addComponent(nPerros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tamañoP))
                        .addGap(27, 27, 27)
                        .addComponent(costoT))
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nPerrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nPerrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nPerrosActionPerformed

    private void nHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nHorasActionPerformed

    private void tamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamañoActionPerformed

    private void costoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoTActionPerformed
        int horas, perros, tamañoP;
        float costo=0, costoT=0;
      
        horas=Integer.parseInt(nHoras.getText());
        perros=Integer.parseInt(nPerros.getText());
   
        for (int i = 1; i <= perros; i++) {
            tamañoP=Integer.parseInt(tamaño.getText());
           if (tamañoP==1) {
             costo=horas*10000;
           } if (tamañoP==2) {
                costo=horas*5000;
            } if (tamañoP==3) {
                costo=horas*3000;
            }
            costoT+=costo;
        }
        
        if (perros>1) {
            costoT=(float)(costoT-(costoT*0.1));
        }
        
        JOptionPane.showMessageDialog(null, costoT);
        
    }//GEN-LAST:event_costoTActionPerformed

    
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
            java.util.logging.Logger.getLogger(Perritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perritos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton costoT;
    private javax.swing.JLabel horas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nHoras;
    private javax.swing.JTextField nPerros;
    private javax.swing.JLabel perros;
    private javax.swing.JTextField tamaño;
    private javax.swing.JLabel tamañoP;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
