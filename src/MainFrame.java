import java.awt.Graphics;

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
        TextMessageOutput.setText("Dimensions must be more than 15\n and less than 600. Parameters\n must be within dimensions");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCanvasContainer = new javax.swing.JPanel();
        PanelCanvas = new javax.swing.JPanel();
        PanelControls = new javax.swing.JPanel();
        ButtonGenerate = new javax.swing.JButton();
        TextInputX = new javax.swing.JTextField();
        TextInputZ = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextMessageOutput = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextInputHillHeight = new javax.swing.JTextField();
        TextInputGrass = new javax.swing.JTextField();
        TextInputHillFreq = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextInputFlat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TextInputHillWidth = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(861, 592));
        setMinimumSize(new java.awt.Dimension(861, 592));
        setResizable(false);

        PanelCanvas.setBackground(new java.awt.Color(255, 255, 255));
        PanelCanvas.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout PanelCanvasLayout = new javax.swing.GroupLayout(PanelCanvas);
        PanelCanvas.setLayout(PanelCanvasLayout);
        PanelCanvasLayout.setHorizontalGroup(
            PanelCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        PanelCanvasLayout.setVerticalGroup(
            PanelCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelCanvasContainerLayout = new javax.swing.GroupLayout(PanelCanvasContainer);
        PanelCanvasContainer.setLayout(PanelCanvasContainerLayout);
        PanelCanvasContainerLayout.setHorizontalGroup(
            PanelCanvasContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCanvasContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCanvasContainerLayout.setVerticalGroup(
            PanelCanvasContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCanvasContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelControls.setMaximumSize(new java.awt.Dimension(408, 124));
        PanelControls.setMinimumSize(new java.awt.Dimension(408, 124));
        PanelControls.setRequestFocusEnabled(false);
        PanelControls.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonGenerate.setText("Generate");
        ButtonGenerate.setRequestFocusEnabled(false);
        ButtonGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGenerateActionPerformed(evt);
            }
        });
        PanelControls.add(ButtonGenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 568, 251, -1));

        TextInputX.setText("75");
        TextInputX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextInputXActionPerformed(evt);
            }
        });
        PanelControls.add(TextInputX, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 70, -1));

        TextInputZ.setText("75");
        PanelControls.add(TextInputZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 70, -1));

        jLabel1.setText("X Dimensions");
        PanelControls.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 124, -1, -1));

        jLabel2.setText("Z Dimensions");
        PanelControls.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 164, -1, -1));

        TextMessageOutput.setEditable(false);
        TextMessageOutput.setColumns(10);
        TextMessageOutput.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        TextMessageOutput.setRows(2);
        TextMessageOutput.setAutoscrolls(false);
        TextMessageOutput.setFocusable(false);
        TextMessageOutput.setRequestFocusEnabled(false);
        TextMessageOutput.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(TextMessageOutput);

        PanelControls.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 251, 80));

        jLabel3.setText("Grass Level");
        PanelControls.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 254, -1, -1));

        jLabel4.setText("Hill Frequency (0-100)");
        PanelControls.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 394, -1, -1));

        jLabel5.setText("Hill Width (0-40)");
        PanelControls.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 474, -1, -1));

        TextInputHillHeight.setText("0.75");
        TextInputHillHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextInputHillHeightActionPerformed(evt);
            }
        });
        PanelControls.add(TextInputHillHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 430, 70, -1));

        TextInputGrass.setText("35");
        PanelControls.add(TextInputGrass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 70, -1));

        TextInputHillFreq.setText("93");
        PanelControls.add(TextInputHillFreq, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 70, -1));

        jLabel6.setText("Terrain Flatness (0-1)");
        PanelControls.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 294, -1, -1));

        TextInputFlat.setText("0.85");
        TextInputFlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextInputFlatActionPerformed(evt);
            }
        });
        PanelControls.add(TextInputFlat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 70, -1));

        jLabel7.setText("Hill Height (0-1)");
        PanelControls.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 434, -1, -1));

        TextInputHillWidth.setText("23");
        PanelControls.add(TextInputHillWidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 470, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCanvasContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCanvasContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGenerateActionPerformed
        try {
            // grab all the inputs
            int inputX = Integer.parseInt(TextInputX.getText());
            int inputZ = Integer.parseInt(TextInputZ.getText());

            int grassParam = Integer.parseInt(TextInputGrass.getText());
            double flatParam = Double.parseDouble(TextInputFlat.getText());

            int hillFreqParam = Integer.parseInt(TextInputHillFreq.getText());
            double hillHeightParam = Double.parseDouble(TextInputHillHeight.getText());
            int hillWidthParam = Integer.parseInt(TextInputHillWidth.getText());
            
            if (TerrainGenerator.parameterCheck(inputX, inputZ, grassParam, flatParam, hillFreqParam, hillHeightParam, hillWidthParam)) { // check if inputs are within parameters
                // generate the terrain
                TerrainGenerator.generateTerrain(inputX, inputZ, grassParam, flatParam, hillFreqParam, hillHeightParam, hillWidthParam);
                
                // draw terrain
                int panelHeight = PanelCanvas.getHeight();
                int panelWidth = PanelCanvas.getWidth();
                Graphics g = PanelCanvas.getGraphics();
                Drawer.drawTerrain(g, panelHeight, panelWidth, TerrainGenerator.blocksArray(), inputX, inputZ);
                
                TextMessageOutput.setText("Terrain Drawn!");
            } else {
                TextMessageOutput.setText("Something wrong with inputs!");
            }
        } catch (Exception e) {
            System.out.println(e);
            TextMessageOutput.setText("Something wrong with inputs!\n" + "(" + e + ")");
        }
    }//GEN-LAST:event_ButtonGenerateActionPerformed

    private void TextInputFlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextInputFlatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextInputFlatActionPerformed

    private void TextInputHillHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextInputHillHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextInputHillHeightActionPerformed

    private void TextInputXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextInputXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextInputXActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGenerate;
    private javax.swing.JPanel PanelCanvas;
    private javax.swing.JPanel PanelCanvasContainer;
    private javax.swing.JPanel PanelControls;
    private javax.swing.JTextField TextInputFlat;
    private javax.swing.JTextField TextInputGrass;
    private javax.swing.JTextField TextInputHillFreq;
    private javax.swing.JTextField TextInputHillHeight;
    private javax.swing.JTextField TextInputHillWidth;
    private javax.swing.JTextField TextInputX;
    private javax.swing.JTextField TextInputZ;
    private javax.swing.JTextArea TextMessageOutput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
