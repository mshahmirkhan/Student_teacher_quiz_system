/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsttest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shahmirkhan
 */
public class AskQuestions3 extends javax.swing.JFrame {
String AnswerSelected="";
String[] questionData = new String[7];
String[] CatagoriesArrayData = new String[7];
int StartStop=1;
int totalMarks;

    public AskQuestions3(String CatagoriesArray[], int totalMarks) throws InterruptedException {
        initComponents();
        System.out.println("asked question");
        this.totalMarks=totalMarks;
        
        CatagoriesArrayData=CatagoriesArray;
        String catagorieName="";
        int id=0;
        
        String[] DataGet = new String[7];
//       
//             
             DAO DAOObj = new DAO();
             DataGet=DAOObj.questionfetch(CatagoriesArray[0],3);
             
             for(int i=0;i<DataGet.length;i++){
                 questionData[i]=DataGet[i];
                 System.out.println(questionData[i]);
             }
             
             QuestionLable.setText(questionData[0]);
             L1.setText(questionData[1]);
             L2.setText(questionData[2]);
             L3.setText(questionData[3]);
             L4.setText(questionData[4]);
             
          
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        done = new javax.swing.JButton();
        L1 = new javax.swing.JRadioButton();
        L2 = new javax.swing.JRadioButton();
        L3 = new javax.swing.JRadioButton();
        L4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        QuestionLable = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Question 3");

        jLabel2.setText("You have to select one option out of four");

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Remember question is ask related to the catagories ");

        done.setBackground(new java.awt.Color(204, 204, 255));
        done.setText("DONE");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        buttonGroup1.add(L1);
        L1.setForeground(new java.awt.Color(255, 255, 255));
        L1.setText("jRadioButton1");
        L1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(L2);
        L2.setForeground(new java.awt.Color(255, 255, 255));
        L2.setText("jRadioButton2");
        L2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(L3);
        L3.setForeground(new java.awt.Color(255, 255, 255));
        L3.setText("jRadioButton3");
        L3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(L4);
        L4.setForeground(new java.awt.Color(255, 255, 255));
        L4.setText("jRadioButton4");
        L4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Question : ");

        QuestionLable.setForeground(new java.awt.Color(255, 255, 255));
        QuestionLable.setText("Here question will appere ?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(QuestionLable, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L2)
                            .addComponent(L1)
                            .addComponent(L3)
                            .addComponent(L4))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(133, 133, 133))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(QuestionLable))
                .addGap(9, 9, 9)
                .addComponent(L1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
    try {
        // TODO add your handling code here:
        
        
        
        
        //DONE button
        
        
        
        if(AnswerSelected.equals(questionData[6])){
            
            System.out.println("answer is right");
            System.out.println("rank is "+ questionData[5]);
            
            
            if(questionData[5].equals("5")){
                totalMarks=totalMarks+5;
                System.out.println("5 marks added");
            }else if(questionData[5].equals("4")){
                totalMarks=totalMarks+4;
                System.out.println("4 marks added");
            }else if(questionData[5].equals("3")){
                totalMarks=totalMarks+3;
                System.out.println("3 marks added");
            }else if(questionData[5].equals("2")){
                totalMarks=totalMarks+2;
                System.out.println("2 marks added");
            }else if(questionData[5].equals("1")){
                totalMarks=totalMarks+1;
                System.out.println("1 marks added");
            }
            
            
            
            
        }else{
            totalMarks=totalMarks+0;
            System.out.println("booooo");
        }
        
        
        System.out.println("So total marks is " + totalMarks);
        
        
        
        
        dispose();
        AskQuestions4 obj= new AskQuestions4(CatagoriesArrayData,totalMarks);
        obj.setVisible(true);
    } catch (InterruptedException ex) {
        Logger.getLogger(AskQuestions3.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        
        
        
        
        
        

    }//GEN-LAST:event_doneActionPerformed

    private void L1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L1ActionPerformed
        // TODO add your handling code here:
        AnswerSelected=questionData[1];
//        System.out.println(l);
    }//GEN-LAST:event_L1ActionPerformed

    private void L3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L3ActionPerformed
        // TODO add your handling code here:
        AnswerSelected=questionData[2];
//        System.out.println(l);
    }//GEN-LAST:event_L3ActionPerformed

    private void L2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L2ActionPerformed
        // TODO add your handling code here:
        AnswerSelected=questionData[3];
//        System.out.println(l);
    }//GEN-LAST:event_L2ActionPerformed

    private void L4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L4ActionPerformed
        // TODO add your handling code here:
        AnswerSelected=questionData[4];
//        System.out.println(l);
    }//GEN-LAST:event_L4ActionPerformed

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
            java.util.logging.Logger.getLogger(AskQuestions3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AskQuestions3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AskQuestions3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AskQuestions3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
//                new AskQuestions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton L1;
    private javax.swing.JRadioButton L2;
    private javax.swing.JRadioButton L3;
    private javax.swing.JRadioButton L4;
    private javax.swing.JLabel QuestionLable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton done;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
