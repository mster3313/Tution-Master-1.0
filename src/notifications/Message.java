/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package notifications;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nadun
 */
public class Message extends javax.swing.JFrame {

    /**
     * Creates new form Message
     */
    private static Message instance=new Message();
    private HashSet<Message> runningMessageSet=new HashSet<Message>();
    public Message() {
        initComponents();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int width=(int) dimension.getWidth();
        int height=(int) dimension.getHeight();
        this.setLocation((width/2)-187,(height/2)-54);
    }
    
    public static Message getInstance(){
        return instance;
    }
    
        
     public void showInterface(String line1Message,String line2Message){
         Message m=new Message();
         runningMessageSet.add(m);
         m.setVisible(true);
         
        m.line1Label.setText(line1Message);
        m.line2Label.setText(line2Message);
        playFontColor(m);
     }   
     
     public void disposeMessage(){
        for (Message w : runningMessageSet) {
            w.dispose();
        }
        runningMessageSet.clear();
      }
    
        
    
    
     private void playFontColor(final Message m){
         
        new Thread(){
            public void run(){
                
                for (int i = 30; i < 205; i++) {
                    m.line1Label.setForeground(new Color(i, i, i));
                    m.line2Label.setForeground(new Color(i, i, i));
                    try {
                        sleep(15);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SavedStatusNotice.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    sleep(1400);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SavedStatusNotice.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                for (int i =205 ; i >29; i--) {
                    m.line1Label.setForeground(new Color(i, i, i));
                    m.line2Label.setForeground(new Color(i, i, i));
                    try {
                        sleep(6);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SavedStatusNotice.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                 m.setVisible(false);
                 m.dispose();
                 
            }
            
        }.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        line1Label = new javax.swing.JLabel();
        line2Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(30, 30, 30));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        line1Label.setFont(new java.awt.Font("NewsGoth BT", 0, 30)); // NOI18N
        line1Label.setForeground(new java.awt.Color(30, 30, 30));
        line1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line1Label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(line1Label);

        line2Label.setFont(new java.awt.Font("NewsGoth BT", 0, 30)); // NOI18N
        line2Label.setForeground(new java.awt.Color(30, 30, 30));
        line2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        line2Label.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(line2Label);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Message().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel line1Label;
    private javax.swing.JLabel line2Label;
    // End of variables declaration//GEN-END:variables
}
