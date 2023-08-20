 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tublu
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Text_Editor extends javax.swing.JFrame {
    File file;
    /**
     * Creates new form Text_Editor
     */
    public Text_Editor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Text_Box = new javax.swing.JTextArea();
        File_Oper = new javax.swing.JToolBar();
        New_File = new javax.swing.JButton();
        Open_File = new javax.swing.JButton();
        Save_File = new javax.swing.JButton();
        Clip_Oper = new javax.swing.JToolBar();
        Cut = new javax.swing.JButton();
        Copy = new javax.swing.JButton();
        Paste = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Editor");
        setBackground(new java.awt.Color(255, 132, 126));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Text Editor");
        setIconImage(new ImageIcon("C:\\Users\\91983\\Desktop\\My Programs\\Text Editor Icon.png").getImage());  // NOI18N

        Text_Box.setBackground(new java.awt.Color(248, 238, 238));
        Text_Box.setColumns(20);
        Text_Box.setLineWrap(true);
        Text_Box.setRows(5);
        Text_Box.setWrapStyleWord(true);
        Text_Box.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Textspace", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 0, 204))); // NOI18N
        jScrollPane1.setViewportView(Text_Box);

        File_Oper.setForeground(new java.awt.Color(104, 0, 0));
        File_Oper.setRollover(true);
        File_Oper.setToolTipText("Create a new file, open an existing file or save the opened file.");
        File_Oper.setName("File Operations"); // NOI18N

        New_File.setBackground(new java.awt.Color(153, 0, 0));
        New_File.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        New_File.setForeground(new java.awt.Color(0, 197, 213));
        New_File.setText("New...");
        New_File.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        New_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_FileActionPerformed(evt);
            }
        });
        File_Oper.add(New_File);

        Open_File.setBackground(new java.awt.Color(153, 0, 0));
        Open_File.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Open_File.setForeground(new java.awt.Color(0, 197, 213));
        Open_File.setText("Open...");
        Open_File.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Open_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open_FileActionPerformed(evt);
            }
        });
        File_Oper.add(Open_File);

        Save_File.setBackground(new java.awt.Color(153, 0, 0));
        Save_File.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Save_File.setForeground(new java.awt.Color(0, 197, 213));
        Save_File.setText("Save");
        Save_File.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Save_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_FileActionPerformed(evt);
            }
        });
        File_Oper.add(Save_File);

        Clip_Oper.setRollover(true);
        Clip_Oper.setToolTipText("Cut, copy or paste the text.");
        Clip_Oper.setName("Clipboard Operations."); // NOI18N

        Cut.setBackground(new java.awt.Color(255, 255, 0));
        Cut.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Cut.setForeground(new java.awt.Color(153, 1, 1));
        Cut.setText("Cut");
        Cut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cut.setFocusable(false);
        Cut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutActionPerformed(evt);
            }
        });
        Clip_Oper.add(Cut);

        Copy.setBackground(new java.awt.Color(255, 255, 0));
        Copy.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Copy.setForeground(new java.awt.Color(153, 1, 1));
        Copy.setText("Copy");
        Copy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Copy.setFocusable(false);
        Copy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Copy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });
        Clip_Oper.add(Copy);

        Paste.setBackground(new java.awt.Color(255, 255, 0));
        Paste.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Paste.setForeground(new java.awt.Color(153, 1, 1));
        Paste.setText("Paste");
        Paste.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Paste.setFocusable(false);
        Paste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Paste.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteActionPerformed(evt);
            }
        });
        Clip_Oper.add(Paste);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(File_Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Clip_Oper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 305, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(File_Oper, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clip_Oper, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Save_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_FileActionPerformed
        // TODO add your handling code here:
        try{
            BufferedWriter br=new BufferedWriter(new FileWriter(file));
            br.write(Text_Box.getText());
            br.close();
        }
        catch(IOException Err){
            JOptionPane.showMessageDialog(null,"Error in saving File!!!","Error",0);
        }
        file=null;
        Text_Box.setText("");
    }//GEN-LAST:event_Save_FileActionPerformed

    private void CutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutActionPerformed
        // TODO add your handling code here:
        Text_Box.cut();
    }//GEN-LAST:event_CutActionPerformed

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed
        // TODO add your handling code here:
        Text_Box.copy();
    }//GEN-LAST:event_CopyActionPerformed

    private void PasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteActionPerformed
        // TODO add your handling code here:
        Text_Box.paste();
    }//GEN-LAST:event_PasteActionPerformed

    private void New_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_FileActionPerformed
        // TODO add your handling code here:
        if(file!=null){
            int ans=JOptionPane.showConfirmDialog(null,"Do you want to save existing opened file?","Save File Confirmation",JOptionPane.YES_NO_OPTION);
            if(ans==JOptionPane.YES_OPTION)
                Save_File.doClick(); 
        }
        Text_Box.setText("");
        try{
            file=new File(JOptionPane.showInputDialog(null,"Enter full path of new File:","New File",-1));
        }
        catch(NullPointerException Err){
            JOptionPane.showMessageDialog(null,"Name of file not entered!!!");
        }
    }//GEN-LAST:event_New_FileActionPerformed

    private void Open_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open_FileActionPerformed
        // TODO add your handling code here:
        if(file!=null){
            int ans=JOptionPane.showConfirmDialog(null,"Do you want to save existing opened file?","Save File Confirmation",JOptionPane.YES_NO_OPTION);
            if(ans==JOptionPane.YES_OPTION)
                Save_File.doClick(); 
        }
                JFileChooser fchooser=new JFileChooser();
                fchooser.setVisible(true);
                int temp=fchooser.showOpenDialog(new Text_Editor());
                try{
                if(temp==fchooser.APPROVE_OPTION)
                file=fchooser.getSelectedFile();
            }
            catch(NullPointerException Err)   {}
                Text_Box.setText("");
            try{
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine())
                Text_Box.append(sc.nextLine()+'\n');
        }
        catch(IOException Err){
            JOptionPane.showMessageDialog(null,"Error opening file!!!","Error",0);
        }
        
    }
   //GEN-LAST:event_Open_FileActionPerformed

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
            java.util.logging.Logger.getLogger(Text_Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Text_Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Text_Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Text_Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Text_Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar Clip_Oper;
    private javax.swing.JButton Copy;
    private javax.swing.JButton Cut;
    private javax.swing.JToolBar File_Oper;
    private javax.swing.JButton New_File;
    private javax.swing.JButton Open_File;
    private javax.swing.JButton Paste;
    private javax.swing.JButton Save_File;
    private javax.swing.JTextArea Text_Box;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}