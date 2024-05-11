/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author EXCALIBUR
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class searchEngine extends javax.swing.JFrame {

    MyArrayList<String> bannedWords = new MyArrayList<>();
    BinarySearchTree bst;

    public searchEngine() {
        initComponents();
        bst = new BinarySearchTree();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchengine = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Text1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        Orders = new javax.swing.JComboBox<>();
        SelectFiles = new javax.swing.JButton();
        BannedWords = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        searchengine.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        searchengine.setText("SEARCH ENGİNE");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("What is the word to search?");

        Area1.setColumns(20);
        Area1.setRows(5);
        jScrollPane1.setViewportView(Area1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Frequency of the searched word in the files:");

        Search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Search.setText("SEARCH");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Orders.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Orders.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "post-order", "pre-order", "in-order" }));
        Orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdersActionPerformed(evt);
            }
        });

        SelectFiles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SelectFiles.setText("Select Files ");
        SelectFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectFilesActionPerformed(evt);
            }
        });

        BannedWords.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BannedWords.setText("Choose Banned Words");
        BannedWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BannedWordsActionPerformed(evt);
            }
        });

        Area2.setColumns(20);
        Area2.setRows(5);
        jScrollPane2.setViewportView(Area2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 479, Short.MAX_VALUE)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BannedWords))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(searchengine, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Orders, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(searchengine, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Orders, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BannedWords, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(SelectFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(176, 176, 176)
                .addComponent(jLabel2)
                .addGap(83, 83, 83))
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

    private void SelectFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectFilesActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser2 = new JFileChooser();
        fileChooser2.setMultiSelectionEnabled(true);

        int returnValue = fileChooser2.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = fileChooser2.getSelectedFiles();
            for (File selectedFile : selectedFiles) {
                try ( BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {

                        line = htmlTaggedWords(line);
                        String[] words = line.split("\\s+");
                        for (String word : words) {
                            word = word.replaceAll("[^a-zA-Z0-9]", "");

                            if (!word.isEmpty() && !bannedWords.contains(word.toLowerCase())) {
                                bst.insertInOrder(word.toLowerCase(), selectedFile.getName());
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_SelectFilesActionPerformed

    private String htmlTaggedWords(String line) {

        String pattern = "<[^>]+>";
        return line.replaceAll(pattern, "");
    }


    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed

        String wordSearch = Text1.getText().trim().toLowerCase();

        if (wordSearch.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a word to search.");
            return;
        }

        FileFrequencyNode result = searchWordInBST(bst.root, wordSearch);

        if (result == null) {
            JOptionPane.showMessageDialog(null, "The word \"" + wordSearch + "\" is not found.");
            return;
        }

        StringBuilder output = new StringBuilder();
        FileFrequencyNode current = result;
        while (current != null) {
            output.append("File: ").append(current.filename).append(", Frequency: ").append(current.frequency).append("\n");
            current = current.next;
        }
        Area1.setText(output.toString());
    }

    private FileFrequencyNode searchWordInBST(Node root, String word) {
        if (root == null) {
            return null;
        }

        int comparee = word.compareTo(root.data);

        if (comparee == 0) {

            return root.fileFrequencyHead;
        } else if (comparee < 0) {

            return searchWordInBST(root.left, word);
        } else {

            return searchWordInBST(root.right, word);
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void OrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersActionPerformed

        String selectedOption = (String) Orders.getSelectedItem();

        switch (selectedOption) {
            case "pre-order":
                Area2.setText("Pre-Order traversal:\n");
                bst.printPreOrder(bst.root, Area2);
                break;
            case "in-order":
                Area2.setText("In-Order traversal:\n");

                bst.printInOrder(bst.root, Area2);
                break;
            case "post-order":
                Area2.setText("Post-Order traversal:\n");

                bst.printPostOrder(bst.root, Area2);
                break;
            default:
                break;
        }

    }//GEN-LAST:event_OrdersActionPerformed

    private void BannedWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BannedWordsActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser1 = new JFileChooser();
        int returnValue = filechooser1.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = filechooser1.getSelectedFile();

            try ( BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    bannedWords.addAll(Arrays.asList(words));
                }
                JOptionPane.showMessageDialog(null, "Banned Words Loaded Successfully.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "An Error Occurred While Loading Banned Words: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BannedWordsActionPerformed

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
            java.util.logging.Logger.getLogger(searchEngine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchEngine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchEngine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchEngine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchEngine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JTextArea Area2;
    private javax.swing.JButton BannedWords;
    private javax.swing.JComboBox<String> Orders;
    private javax.swing.JButton Search;
    private javax.swing.JButton SelectFiles;
    private javax.swing.JTextField Text1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel searchengine;
    // End of variables declaration//GEN-END:variables
}
