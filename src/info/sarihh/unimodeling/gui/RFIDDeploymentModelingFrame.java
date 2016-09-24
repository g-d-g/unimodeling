package info.sarihh.unimodeling.gui;

import info.sarihh.unimodeling.utility.ExtensionFileFilter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ResourceBundle;
import java.awt.Desktop;
import java.io.IOException;
import java.util.Arrays;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;
import java.io.File;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import static info.sarihh.unimodeling.utility.GraphModeling.*;

/**
 * This class creates the internal frame for the modeling of RFID readers deployment.
 * Author: Sari Haj Hussein
 */
public class RFIDDeploymentModelingFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form RFIDDeploymentModelingFrame
     */
    public RFIDDeploymentModelingFrame(UniModelingGUI uniModelingGUI) {
        this.unModeingGUI = uniModelingGUI;
        graphmlFilter = new ExtensionFileFilter("GraphML",
                java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/RFIDDeploymentModelingFrame").getString("GRAPHML FILES"));
        initComponents();
        printGraphDialog.pack();
        // disable the visualize button
        disableVisualize();
        // check whether the Desktop API is supported on this host
        if (Desktop.isDesktopSupported()) {
            desktop = Desktop.getDesktop();
            // now enable the visualize button if it is supported
            enableSupportedAction();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        fileChooser = new javax.swing.JFileChooser();
        printGraphDialog = new javax.swing.JDialog();
        printScrollPane = new javax.swing.JScrollPane();
        printTextArea = new javax.swing.JTextArea();
        containerScrollPane = new javax.swing.JScrollPane();
        containerPanel = new javax.swing.JPanel();
        rfidGraphDatabaseLabel = new javax.swing.JLabel();
        rfidGraphDatabaseTextField = new javax.swing.JTextField();
        rfidGraphDatabaseButton = new javax.swing.JButton();
        rfidGraphmlLabel = new javax.swing.JLabel();
        rfidGraphmlTextField = new javax.swing.JTextField();
        rfidGraphmlButton = new javax.swing.JButton();
        w_c_Label = new javax.swing.JLabel();
        w_c_TextField = new javax.swing.JTextField();
        add_w_c_Button = new javax.swing.JButton();
        w_c_ScrollPane = new javax.swing.JScrollPane();
        w_c_List = new javax.swing.JList();
        remove_w_c_Button = new javax.swing.JButton();
        remove_all_w_c_Button = new javax.swing.JButton();
        w_r_Label = new javax.swing.JLabel();
        w_r_TextField = new javax.swing.JTextField();
        add_w_r_Button = new javax.swing.JButton();
        w_r_ScrollPane = new javax.swing.JScrollPane();
        w_r_List = new javax.swing.JList();
        remove_w_r_Button = new javax.swing.JButton();
        remove_all_w_r_Button = new javax.swing.JButton();
        buttonPanel = new javax.swing.JPanel();
        transformButton = new javax.swing.JButton();
        buttonFiller1 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        clearButton = new javax.swing.JButton();
        buttonFiller2 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        printButton = new javax.swing.JButton();
        buttonFiller3 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        visualizeButton = new javax.swing.JButton();

        fileChooser.setCurrentDirectory(new java.io.File("."));

        printGraphDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/RFIDDeploymentModelingFrame"); // NOI18N
        printGraphDialog.setTitle(bundle.getString("RFIDDeploymentModelingFrame.printGraphDialog.title")); // NOI18N
        printGraphDialog.setModal(true);
        printGraphDialog.setResizable(false);

        printScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        printTextArea.setColumns(40);
        printTextArea.setEditable(false);
        printTextArea.setLineWrap(true);
        printTextArea.setRows(20);
        printTextArea.setWrapStyleWord(true);
        printScrollPane.setViewportView(printTextArea);

        printGraphDialog.getContentPane().add(printScrollPane, java.awt.BorderLayout.CENTER);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(bundle.getString("RFIDDeploymentModelingFrame.title")); // NOI18N

        containerPanel.setLayout(new java.awt.GridBagLayout());

        rfidGraphDatabaseLabel.setText(bundle.getString("RFIDDeploymentModelingFrame.rfidGraphDatabaseLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(rfidGraphDatabaseLabel, gridBagConstraints);

        rfidGraphDatabaseTextField.setText("rfidDB"); // NOI18N
        rfidGraphDatabaseTextField.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(rfidGraphDatabaseTextField, gridBagConstraints);

        rfidGraphDatabaseButton.setText("..."); // NOI18N
        rfidGraphDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfidGraphDatabaseButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(rfidGraphDatabaseButton, gridBagConstraints);

        rfidGraphmlLabel.setText(bundle.getString("RFIDDeploymentModelingFrame.rfidGraphmlLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(rfidGraphmlLabel, gridBagConstraints);

        rfidGraphmlTextField.setText("rfidGraph.graphml"); // NOI18N
        rfidGraphmlTextField.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(rfidGraphmlTextField, gridBagConstraints);

        rfidGraphmlButton.setText("..."); // NOI18N
        rfidGraphmlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfidGraphmlButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(rfidGraphmlButton, gridBagConstraints);

        w_c_Label.setText("W_c:"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(w_c_Label, gridBagConstraints);

        w_c_TextField.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(w_c_TextField, gridBagConstraints);

        add_w_c_Button.setText("+"); // NOI18N
        add_w_c_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_w_c_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(add_w_c_Button, gridBagConstraints);

        DefaultListModel w_c_List_model = new DefaultListModel();
        String[] W_c_array = {"CD|CC", "CC|MC", "RB|MC", "MC|SMC",
            "SMC|TTS", "TTS|TTS", "TTS|CH", "OB|OC", "(CH|CGS)1", "(CH|CGS)2", "(OC|CGS)1",
            "(OC|CGS)2", "CGS|GS1", "CGS|GS1", "CGS|GS2", "CGS|GS2", "CGS|GS3", "CGS|GS3",
            "CGS|GS4", "CGS|GS4", "GS1|GS2", "GS1|GS2", "GS2|GS3", "GS2|GS3", "GS3|GS4",
            "GS3|GS4", "GS1|BL1", "GS2|BL2", "GS3|BL3", "BL1|AP1", "BL2|AP2", "BL3|AP3"};
        for (String c : W_c_array) {
            w_c_List_model.addElement(c);
        }
        w_c_List.setModel(w_c_List_model);
        w_c_List.setVisibleRowCount(4);
        w_c_ScrollPane.setViewportView(w_c_List);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(w_c_ScrollPane, gridBagConstraints);

        remove_w_c_Button.setText("-"); // NOI18N
        remove_w_c_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_w_c_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(remove_w_c_Button, gridBagConstraints);

        remove_all_w_c_Button.setText("x"); // NOI18N
        remove_all_w_c_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_all_w_c_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(remove_all_w_c_Button, gridBagConstraints);

        w_r_Label.setText("W_r:"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(w_r_Label, gridBagConstraints);

        w_r_TextField.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(w_r_TextField, gridBagConstraints);

        add_w_r_Button.setText("+"); // NOI18N
        add_w_r_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_w_r_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(add_w_r_Button, gridBagConstraints);

        DefaultListModel w_r_List_model = new DefaultListModel();
        String[] w_r_array = {"r1", "r2", "r3", "r4", "r5", "r6", "r7", "r8"};
        for (String r : w_r_array) {
            w_r_List_model.addElement(r);
        }
        w_r_List.setModel(w_r_List_model);
        w_r_List.setVisibleRowCount(4);
        w_r_ScrollPane.setViewportView(w_r_List);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(w_r_ScrollPane, gridBagConstraints);

        remove_w_r_Button.setText("-"); // NOI18N
        remove_w_r_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_w_r_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(remove_w_r_Button, gridBagConstraints);

        remove_all_w_r_Button.setText("x"); // NOI18N
        remove_all_w_r_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_all_w_r_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(remove_all_w_r_Button, gridBagConstraints);

        transformButton.setText(bundle.getString("RFIDDeploymentModelingFrame.transformButton.text")); // NOI18N
        transformButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transformButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(transformButton);
        buttonPanel.add(buttonFiller1);

        clearButton.setText(bundle.getString("RFIDDeploymentModelingFrame.clearButton.text")); // NOI18N
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(clearButton);
        buttonPanel.add(buttonFiller2);

        printButton.setText(bundle.getString("RFIDDeploymentModelingFrame.printButton.text")); // NOI18N
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(printButton);
        buttonPanel.add(buttonFiller3);

        visualizeButton.setText(bundle.getString("RFIDDeploymentModelingFrame.visualizeButton.text")); // NOI18N
        visualizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizeButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(visualizeButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(buttonPanel, gridBagConstraints);

        containerScrollPane.setViewportView(containerPanel);

        getContentPane().add(containerScrollPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void add_w_c_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_w_c_ButtonActionPerformed
    includeInList(w_c_TextField, w_c_List);
}//GEN-LAST:event_add_w_c_ButtonActionPerformed

private void remove_w_c_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_w_c_ButtonActionPerformed
    excludeFromList(w_c_List);
}//GEN-LAST:event_remove_w_c_ButtonActionPerformed

private void remove_all_w_c_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_all_w_c_ButtonActionPerformed
    clearList(w_c_List);
}//GEN-LAST:event_remove_all_w_c_ButtonActionPerformed

private void add_w_r_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_w_r_ButtonActionPerformed
    includeInList(w_r_TextField, w_r_List);
}//GEN-LAST:event_add_w_r_ButtonActionPerformed

private void remove_w_r_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_w_r_ButtonActionPerformed
    excludeFromList(w_r_List);
}//GEN-LAST:event_remove_w_r_ButtonActionPerformed

private void remove_all_w_r_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_all_w_r_ButtonActionPerformed
    clearList(w_r_List);
}//GEN-LAST:event_remove_all_w_r_ButtonActionPerformed

private void transformButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transformButtonActionPerformed
    SwingUtilities.invokeLater(new Runnable() {

        public void run() {
            String[] W_c_array = getListItems(w_c_List);
            String[] W_r_array = getListItems(w_r_List);
            String[] W_l_array = unModeingGUI.getOISpaceModelingFrame().get_W_l_array();
            String[] W_m_array = unModeingGUI.getOISpaceModelingFrame().get_W_m_array();
            String[] c_array = unModeingGUI.getOISpaceModelingFrame().get_c_array();
            String rfidDBPath = rfidGraphDatabaseTextField.getText();
            String rfidGraphmlFilePath = rfidGraphmlTextField.getText();
            OrientGraph rfidGraph = createOrientGraph(rfidDBPath);
            transformOIspace2RFID(rfidGraph, W_c_array, W_r_array, W_l_array, W_m_array, c_array);
            saveGraphMLFile(rfidGraph, rfidGraphmlFilePath);
            shutdownGraph(rfidGraph);
        }
    });
}//GEN-LAST:event_transformButtonActionPerformed

private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
    SwingUtilities.invokeLater(new Runnable() {

        public void run() {
            String rfidDBPath = rfidGraphDatabaseTextField.getText();
            OrientGraph rfidGraph = createOrientGraph(rfidDBPath);
            String printOut = new String(printGraph(rfidGraph));
            printTextArea.setText(printOut);
            printTextArea.setCaretPosition(0);
            printGraphDialog.setLocationRelativeTo(RFIDDeploymentModelingFrame.this);
            printGraphDialog.setVisible(true);
            shutdownGraph(rfidGraph);
        }
    });
}//GEN-LAST:event_printButtonActionPerformed

private void visualizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizeButtonActionPerformed
    SwingUtilities.invokeLater(new Runnable() {

        public void run() {
            String rfidGraphmlFilePath = rfidGraphmlTextField.getText();
            try {
                desktop.open(new File(rfidGraphmlFilePath));
            } catch (IOException ioe) {
                Logger.getLogger(RFIDDeploymentModelingFrame.class.getName()).log(Level.SEVERE, null, ioe);
                JOptionPane.showMessageDialog(RFIDDeploymentModelingFrame.this,
                        ResourceBundle.getBundle("info/sarihh/unimodeling/gui/RFIDDeploymentModelingFrame").getString("EITHER GEPHI IS NOT INSTALLED OT IT IS NOT ASSOCIATED WITH GRAPHML FILES!"),
                        ResourceBundle.getBundle("info/sarihh/unimodeling/gui/RFIDDeploymentModelingFrame").getString("UNIMODELING"),
                        JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException iae) {
                Logger.getLogger(RFIDDeploymentModelingFrame.class.getName()).log(Level.SEVERE, null, iae);
                JOptionPane.showMessageDialog(RFIDDeploymentModelingFrame.this,
                        ResourceBundle.getBundle("info/sarihh/unimodeling/gui/RFIDDeploymentModelingFrame").getString("THE FILE : ") + rfidGraphmlFilePath + java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/RFIDDeploymentModelingFrame").getString(" DOESN'T EXIST!"),
                        ResourceBundle.getBundle("info/sarihh/unimodeling/gui/RFIDDeploymentModelingFrame").getString("UNIMODELING"),
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    });
}//GEN-LAST:event_visualizeButtonActionPerformed

private void rfidGraphDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfidGraphDatabaseButtonActionPerformed
    fileChooser.setDialogTitle(java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/RFIDDeploymentModelingFrame").getString("SAVE RFID READERS DEPLOYMENT GRAPH DATABASE"));
    fileChooser.setApproveButtonText(java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/RFIDDeploymentModelingFrame").getString("SAVE"));
    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    fileChooser.removeChoosableFileFilter(graphmlFilter);
    fileChooser.setFileFilter(fileChooser.getAcceptAllFileFilter());
    int returnValue = fileChooser.showSaveDialog(RFIDDeploymentModelingFrame.this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File f = fileChooser.getSelectedFile();
        rfidGraphDatabaseTextField.setText(fileChooser.getSelectedFile().getAbsolutePath());
    }
}//GEN-LAST:event_rfidGraphDatabaseButtonActionPerformed

private void rfidGraphmlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfidGraphmlButtonActionPerformed
    fileChooser.setDialogTitle(java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/RFIDDeploymentModelingFrame").getString("SAVE RFID READERS DEPLOYMENT GRAPHML FILE"));
    fileChooser.setApproveButtonText(java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/RFIDDeploymentModelingFrame").getString("SAVE"));
    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    fileChooser.addChoosableFileFilter(graphmlFilter);
    fileChooser.setFileFilter(graphmlFilter);
    int returnValue = fileChooser.showSaveDialog(RFIDDeploymentModelingFrame.this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File f = fileChooser.getSelectedFile();
        if (f.exists()) {
            returnValue = JOptionPane.showConfirmDialog(RFIDDeploymentModelingFrame.this,
                    ResourceBundle.getBundle("info/sarihh/unimodeling/gui/RFIDDeploymentModelingFrame").getString("OVERWRITE EXISTING FILE?"),
                    ResourceBundle.getBundle("info/sarihh/unimodeling/gui/RFIDDeploymentModelingFrame").getString("UNIMODELING"),
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (returnValue == JOptionPane.YES_OPTION) {
                rfidGraphmlTextField.setText(f.getAbsolutePath());
            }
        } else {
            rfidGraphmlTextField.setText(f.getAbsolutePath());
        }
    }
}//GEN-LAST:event_rfidGraphmlButtonActionPerformed

private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
    SwingUtilities.invokeLater(new Runnable() {

        public void run() {
            String rfidDBPath = rfidGraphDatabaseTextField.getText();
            String rfidGraphmlFilePath = rfidGraphmlTextField.getText();
            OrientGraph rfidGraph = createOrientGraph(rfidDBPath);
            clearGraph(rfidGraph);
            saveGraphMLFile(rfidGraph, rfidGraphmlFilePath);
            shutdownGraph(rfidGraph);
        }
    });
}//GEN-LAST:event_clearButtonActionPerformed

    /** This method includes the text from the specified text field in the
     * specified list, provided that it does not already exist. */
    private void includeInList(JTextField textField, JList list) {
        String text = textField.getText();
        DefaultListModel model = (DefaultListModel) list.getModel();
        if (!model.contains(text)) {
            model.addElement(text);
        }
    }

    /** This method excludes the selected items in the specified list. */
    private void excludeFromList(JList list) {
        DefaultListModel model = (DefaultListModel) list.getModel();
        List<Object> selectedValues = list.getSelectedValuesList();
        for (Object value : selectedValues) {
            model.removeElement(value);
        }
    }

    /** This method clears all items in the specified list. */
    private void clearList(JList list) {
        DefaultListModel model = (DefaultListModel) list.getModel();
        model.clear();
    }

    /** This method retrieves the items in the specified list in a string array. */
    private String[] getListItems(JList list) {
        DefaultListModel list_model = (DefaultListModel) list.getModel();
        Object[] objectArray = list_model.toArray();
        String[] stringArray = Arrays.copyOf(objectArray, objectArray.length, String[].class);
        return stringArray;
    }

    /** This method retrieves the path to the RFID graph database. */
    protected String getRFIDDBPath() {
        return rfidGraphDatabaseTextField.getText();
    }

    /** This method retrieves the path to the RFID GraphML file. */
    protected String getRFIDGraphmlFilePath() {
        return rfidGraphmlTextField.getText();
    }

    /** This method disables the visualize button until we know whether the
     * functionality is supported. */
    private void disableVisualize() {
        visualizeButton.setEnabled(false);
    }

    /** This method enables the visualize button if it is supported on this host. */
    private void enableSupportedAction() {
        if (desktop.isSupported(Desktop.Action.OPEN)) {
            visualizeButton.setEnabled(true);
        }
    }
    private UniModelingGUI unModeingGUI = null;
    private ExtensionFileFilter graphmlFilter = null;
    private Desktop desktop = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_w_c_Button;
    private javax.swing.JButton add_w_r_Button;
    private javax.swing.Box.Filler buttonFiller1;
    private javax.swing.Box.Filler buttonFiller2;
    private javax.swing.Box.Filler buttonFiller3;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JScrollPane containerScrollPane;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton printButton;
    private javax.swing.JDialog printGraphDialog;
    private javax.swing.JScrollPane printScrollPane;
    private javax.swing.JTextArea printTextArea;
    private javax.swing.JButton remove_all_w_c_Button;
    private javax.swing.JButton remove_all_w_r_Button;
    private javax.swing.JButton remove_w_c_Button;
    private javax.swing.JButton remove_w_r_Button;
    private javax.swing.JButton rfidGraphDatabaseButton;
    private javax.swing.JLabel rfidGraphDatabaseLabel;
    private javax.swing.JTextField rfidGraphDatabaseTextField;
    private javax.swing.JButton rfidGraphmlButton;
    private javax.swing.JLabel rfidGraphmlLabel;
    private javax.swing.JTextField rfidGraphmlTextField;
    private javax.swing.JButton transformButton;
    private javax.swing.JButton visualizeButton;
    private javax.swing.JLabel w_c_Label;
    private javax.swing.JList w_c_List;
    private javax.swing.JScrollPane w_c_ScrollPane;
    private javax.swing.JTextField w_c_TextField;
    private javax.swing.JLabel w_r_Label;
    private javax.swing.JList w_r_List;
    private javax.swing.JScrollPane w_r_ScrollPane;
    private javax.swing.JTextField w_r_TextField;
    // End of variables declaration//GEN-END:variables
}