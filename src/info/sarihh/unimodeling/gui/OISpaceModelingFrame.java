package info.sarihh.unimodeling.gui;

import info.sarihh.unimodeling.utility.ExtensionFileFilter;
import javax.swing.SwingUtilities;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ResourceBundle;
import java.awt.Desktop;
import java.util.Arrays;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static info.sarihh.unimodeling.utility.GraphModeling.*;

/**
 * This class creates the internal frame for the modeling of OI-spaces.
 * Author: Sari Haj Hussein
 */
public class OISpaceModelingFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form OISpaceModelingFrame
     */
    public OISpaceModelingFrame(UniModelingGUI uniModelingGUI) {
        this.unModeingGUI = uniModelingGUI;
        graphmlFilter = new ExtensionFileFilter("GraphML",
                java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/OISpaceModelingFrame").getString("GRAPHML FILES"));
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
        oiGraphDatabaseLabel = new javax.swing.JLabel();
        oiGraphDatabaseTextField = new javax.swing.JTextField();
        oiGraphDatabaseButton = new javax.swing.JButton();
        oiGraphmlLabel = new javax.swing.JLabel();
        oiGraphmlTextField = new javax.swing.JTextField();
        oiGraphmlButton = new javax.swing.JButton();
        w_l_Label = new javax.swing.JLabel();
        w_l_TextField = new javax.swing.JTextField();
        add_w_l_Button = new javax.swing.JButton();
        w_l_ScrollPane = new javax.swing.JScrollPane();
        w_l_List = new javax.swing.JList();
        remove_w_l_Button = new javax.swing.JButton();
        remove_all_w_l_Button = new javax.swing.JButton();
        w_m_Label = new javax.swing.JLabel();
        w_m_TextField = new javax.swing.JTextField();
        add_w_m_Button = new javax.swing.JButton();
        w_m_ScrollPane = new javax.swing.JScrollPane();
        w_m_List = new javax.swing.JList();
        remove_w_m_Button = new javax.swing.JButton();
        remove_all_w_m_Button = new javax.swing.JButton();
        c_Label = new javax.swing.JLabel();
        c_TextField = new javax.swing.JTextField();
        add_c_Button = new javax.swing.JButton();
        c_ScrollPane = new javax.swing.JScrollPane();
        c_List = new javax.swing.JList();
        remove_c_Button = new javax.swing.JButton();
        remove_all_c_Button = new javax.swing.JButton();
        buttonPanel = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        buttonFiller1 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        clearButton = new javax.swing.JButton();
        buttonFiller2 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        printButton = new javax.swing.JButton();
        buttonFiller3 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        visualizeButton = new javax.swing.JButton();

        fileChooser.setCurrentDirectory(new java.io.File("."));

        printGraphDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/OISpaceModelingFrame"); // NOI18N
        printGraphDialog.setTitle(bundle.getString("OISpaceModelingFrame.printGraphDialog.title")); // NOI18N
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
        setTitle(bundle.getString("OISpaceModelingFrame.title")); // NOI18N

        containerPanel.setLayout(new java.awt.GridBagLayout());

        oiGraphDatabaseLabel.setText(bundle.getString("OISpaceModelingFrame.oiGraphDatabaseLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(oiGraphDatabaseLabel, gridBagConstraints);

        oiGraphDatabaseTextField.setText("oispaceDB"); // NOI18N
        oiGraphDatabaseTextField.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(oiGraphDatabaseTextField, gridBagConstraints);

        oiGraphDatabaseButton.setText("..."); // NOI18N
        oiGraphDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oiGraphDatabaseButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(oiGraphDatabaseButton, gridBagConstraints);

        oiGraphmlLabel.setText(bundle.getString("OISpaceModelingFrame.oiGraphmlLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(oiGraphmlLabel, gridBagConstraints);

        oiGraphmlTextField.setText("oispaceGraph.graphml"); // NOI18N
        oiGraphmlTextField.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(oiGraphmlTextField, gridBagConstraints);

        oiGraphmlButton.setText("..."); // NOI18N
        oiGraphmlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oiGraphmlButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(oiGraphmlButton, gridBagConstraints);

        w_l_Label.setText("W_l:"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(w_l_Label, gridBagConstraints);

        w_l_TextField.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(w_l_TextField, gridBagConstraints);

        add_w_l_Button.setText("+"); // NOI18N
        add_w_l_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_w_l_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(add_w_l_Button, gridBagConstraints);

        DefaultListModel w_l_List_model = new DefaultListModel();
        String[] W_l_array = {"CD", "CC", "MC", "SMC", "TTS", "CH", "RB", "OB", "OC",
            "CGS", "GS1", "GS2", "GS3", "GS4", "BL1", "BL2", "BL3", "AP1", "AP2", "AP3"};
        for (String l : W_l_array) {
            w_l_List_model.addElement(l);
        }
        w_l_List.setModel(w_l_List_model);
        w_l_List.setVisibleRowCount(4);
        w_l_ScrollPane.setViewportView(w_l_List);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(w_l_ScrollPane, gridBagConstraints);

        remove_w_l_Button.setText("-"); // NOI18N
        remove_w_l_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_w_l_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(remove_w_l_Button, gridBagConstraints);

        remove_all_w_l_Button.setText("x"); // NOI18N
        remove_all_w_l_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_all_w_l_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(remove_all_w_l_Button, gridBagConstraints);

        w_m_Label.setText("W_m:"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(w_m_Label, gridBagConstraints);

        w_m_TextField.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(w_m_TextField, gridBagConstraints);

        add_w_m_Button.setText("+"); // NOI18N
        add_w_m_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_w_m_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(add_w_m_Button, gridBagConstraints);

        DefaultListModel w_m_List_model = new DefaultListModel();
        String[] W_m_array = {"(CD,CC)", "(CC,MC)", "(RB,MC)", "(MC,SMC)", "(SMC,TTS)",
            "(TTS,TTS)", "(TTS,CH)", "(OB,OC)", "(CH,CGS)", "(OC,CGS)", "(CGS,GS1)",
            "(GS1,CGS)", "(CGS,GS2)", "(GS2,CGS)", "(CGS,GS3)", "(GS3,CGS)", "(CGS,GS4)",
            "(GS4,CGS)", "(GS1,GS2)", "(GS2,GS1)", "(GS2,GS3)", "(GS3,GS2)", "(GS3,GS4)",
            "(GS4,GS3)", "(GS1,BL1)", "(GS2,BL2)", "(GS3,BL3)", "(BL1,AP1)", "(BL2,AP2)",
            "(BL3,AP3)"};
        for (String m : W_m_array) {
            w_m_List_model.addElement(m);
        }
        w_m_List.setModel(w_m_List_model);
        w_m_List.setVisibleRowCount(4);
        w_m_ScrollPane.setViewportView(w_m_List);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(w_m_ScrollPane, gridBagConstraints);

        remove_w_m_Button.setText("-"); // NOI18N
        remove_w_m_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_w_m_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(remove_w_m_Button, gridBagConstraints);

        remove_all_w_m_Button.setText("x"); // NOI18N
        remove_all_w_m_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_all_w_m_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(remove_all_w_m_Button, gridBagConstraints);

        c_Label.setText("c: W_m -> P(W_c)"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(c_Label, gridBagConstraints);

        c_TextField.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(c_TextField, gridBagConstraints);

        add_c_Button.setText("+"); // NOI18N
        add_c_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_c_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(add_c_Button, gridBagConstraints);

        DefaultListModel c_List_model = new DefaultListModel();
        String[] c_array = {"{CD|CC}", "{CC|MC}", "{RB|MC}", "{MC|SMC}", "{SMC|TTS}",
            "{TTS|TTS}", "{TTS|CH}", "{OB|OC}", "{(CH|CGS)1,(CH|CGS)2}", "{(OC|CGS)1,(OC|CGS)2}",
            "{CGS|GS1}", "{CGS|GS1}", "{CGS|GS2}", "{CGS|GS2}", "{CGS|GS3}", "{CGS|GS3}",
            "{CGS|GS4}", "{CGS|GS4}", "{GS1|GS2}", "{GS1|GS2}", "{GS2|GS3}", "{GS2|GS3}",
            "{GS3|GS4}", "{GS3|GS4}", "{GS1|BL1}", "{GS2|BL2}", "{GS3|BL3}", "{BL1|AP1}",
            "{BL2|AP2}", "{BL3|AP3}"};
        for (String c : c_array) {
            c_List_model.addElement(c);
        }
        c_List.setModel(c_List_model);
        c_List.setVisibleRowCount(4);
        c_ScrollPane.setViewportView(c_List);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(c_ScrollPane, gridBagConstraints);

        remove_c_Button.setText("-"); // NOI18N
        remove_c_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_c_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(remove_c_Button, gridBagConstraints);

        remove_all_c_Button.setText("x"); // NOI18N
        remove_all_c_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_all_c_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(remove_all_c_Button, gridBagConstraints);

        createButton.setText(bundle.getString("OISpaceModelingFrame.createButton.text")); // NOI18N
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(createButton);
        buttonPanel.add(buttonFiller1);

        clearButton.setText(bundle.getString("OISpaceModelingFrame.clearButton.text")); // NOI18N
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(clearButton);
        buttonPanel.add(buttonFiller2);

        printButton.setText(bundle.getString("OISpaceModelingFrame.printButton.text")); // NOI18N
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(printButton);
        buttonPanel.add(buttonFiller3);

        visualizeButton.setText(bundle.getString("OISpaceModelingFrame.visualizeButton.text")); // NOI18N
        visualizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizeButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(visualizeButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        containerPanel.add(buttonPanel, gridBagConstraints);

        containerScrollPane.setViewportView(containerPanel);

        getContentPane().add(containerScrollPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oiGraphDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oiGraphDatabaseButtonActionPerformed
        fileChooser.setDialogTitle(java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/OISpaceModelingFrame").getString("SAVE OI-SPACE GRAPH DATABASE"));
        fileChooser.setApproveButtonText(java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/OISpaceModelingFrame").getString("SAVE"));
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.removeChoosableFileFilter(graphmlFilter);
        fileChooser.setFileFilter(fileChooser.getAcceptAllFileFilter());
        int returnValue = fileChooser.showSaveDialog(OISpaceModelingFrame.this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File f = fileChooser.getSelectedFile();
            oiGraphDatabaseTextField.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_oiGraphDatabaseButtonActionPerformed

    private void oiGraphmlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oiGraphmlButtonActionPerformed
        fileChooser.setDialogTitle(java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/OISpaceModelingFrame").getString("SAVE OI-SPACE GRAPHML FILE"));
        fileChooser.setApproveButtonText(java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/OISpaceModelingFrame").getString("SAVE"));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.addChoosableFileFilter(graphmlFilter);
        fileChooser.setFileFilter(graphmlFilter);
        int returnValue = fileChooser.showSaveDialog(OISpaceModelingFrame.this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File f = fileChooser.getSelectedFile();
            if (f.exists()) {
                returnValue = JOptionPane.showConfirmDialog(OISpaceModelingFrame.this,
                        ResourceBundle.getBundle("info/sarihh/unimodeling/gui/OISpaceModelingFrame").getString("OVERWRITE EXISTING FILE?"),
                        ResourceBundle.getBundle("info/sarihh/unimodeling/gui/OISpaceModelingFrame").getString("UNIMODELING"),
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (returnValue == JOptionPane.YES_OPTION) {
                    oiGraphmlTextField.setText(f.getAbsolutePath());
                }
            } else {
                oiGraphmlTextField.setText(f.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_oiGraphmlButtonActionPerformed

private void add_w_l_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_w_l_ButtonActionPerformed
    includeInList(w_l_TextField, w_l_List);
}//GEN-LAST:event_add_w_l_ButtonActionPerformed

private void remove_w_l_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_w_l_ButtonActionPerformed
    excludeFromList(w_l_List);
}//GEN-LAST:event_remove_w_l_ButtonActionPerformed

private void remove_all_w_l_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_all_w_l_ButtonActionPerformed
    clearList(w_l_List);
}//GEN-LAST:event_remove_all_w_l_ButtonActionPerformed

private void add_w_m_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_w_m_ButtonActionPerformed
    includeInList(w_m_TextField, w_m_List);
}//GEN-LAST:event_add_w_m_ButtonActionPerformed

private void remove_w_m_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_w_m_ButtonActionPerformed
    excludeFromList(w_m_List);
}//GEN-LAST:event_remove_w_m_ButtonActionPerformed

private void remove_all_w_m_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_all_w_m_ButtonActionPerformed
    clearList(w_m_List);
}//GEN-LAST:event_remove_all_w_m_ButtonActionPerformed

private void add_c_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_c_ButtonActionPerformed
    includeInList(c_TextField, c_List);
}//GEN-LAST:event_add_c_ButtonActionPerformed

private void remove_c_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_c_ButtonActionPerformed
    excludeFromList(c_List);
}//GEN-LAST:event_remove_c_ButtonActionPerformed

private void remove_all_c_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_all_c_ButtonActionPerformed
    clearList(c_List);
}//GEN-LAST:event_remove_all_c_ButtonActionPerformed

private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
    SwingUtilities.invokeLater(new Runnable() {

        public void run() {
            String[] W_l_array = getListItems(w_l_List);
            String[] W_m_array = getListItems(w_m_List);
            String[] c_array = getListItems(c_List);
            String oiDBPath = oiGraphDatabaseTextField.getText();
            String oiGraphmlFilePath = oiGraphmlTextField.getText();
            OrientGraph oispaceGraph = createOrientGraph(oiDBPath);
            createOISpaceGraph(oispaceGraph, W_l_array, W_m_array, c_array);
            saveGraphMLFile(oispaceGraph, oiGraphmlFilePath);
            shutdownGraph(oispaceGraph);
        }
    });
}//GEN-LAST:event_createButtonActionPerformed

private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
    SwingUtilities.invokeLater(new Runnable() {

        public void run() {
            String oiDBPath = oiGraphDatabaseTextField.getText();
            OrientGraph oispaceGraph = createOrientGraph(oiDBPath);
            String printOut = new String(printGraph(oispaceGraph));
            printTextArea.setText(printOut);
            printTextArea.setCaretPosition(0);
            printGraphDialog.setLocationRelativeTo(OISpaceModelingFrame.this);
            printGraphDialog.setVisible(true);
            shutdownGraph(oispaceGraph);
        }
    });
}//GEN-LAST:event_printButtonActionPerformed

private void visualizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizeButtonActionPerformed
    SwingUtilities.invokeLater(new Runnable() {

        public void run() {
            String oiGraphmlFilePath = oiGraphmlTextField.getText();
            try {
                desktop.open(new File(oiGraphmlFilePath));
            } catch (IOException ioe) {
                Logger.getLogger(OISpaceModelingFrame.class.getName()).log(Level.SEVERE, null, ioe);
                JOptionPane.showMessageDialog(OISpaceModelingFrame.this,
                        ResourceBundle.getBundle("info/sarihh/unimodeling/gui/OISpaceModelingFrame").getString("EITHER GEPHI IS NOT INSTALLED OT IT IS NOT ASSOCIATED WITH GRAPHML FILES!"),
                        ResourceBundle.getBundle("info/sarihh/unimodeling/gui/OISpaceModelingFrame").getString("UNIMODELING"),
                        JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException iae) {
                Logger.getLogger(OISpaceModelingFrame.class.getName()).log(Level.SEVERE, null, iae);
                JOptionPane.showMessageDialog(OISpaceModelingFrame.this,
                        ResourceBundle.getBundle("info/sarihh/unimodeling/gui/OISpaceModelingFrame").getString("THE FILE : ") + oiGraphmlFilePath + java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/OISpaceModelingFrame").getString(" DOESN'T EXIST!"),
                        ResourceBundle.getBundle("info/sarihh/unimodeling/gui/OISpaceModelingFrame").getString("UNIMODELING"),
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    });
}//GEN-LAST:event_visualizeButtonActionPerformed

private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
    SwingUtilities.invokeLater(new Runnable() {

        public void run() {
            String oiDBPath = oiGraphDatabaseTextField.getText();
            String oiGraphmlFilePath = oiGraphmlTextField.getText();
            OrientGraph oispaceGraph = createOrientGraph(oiDBPath);
            clearGraph(oispaceGraph);
            saveGraphMLFile(oispaceGraph, oiGraphmlFilePath);
            shutdownGraph(oispaceGraph);
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

    /** This method retrieves the items in the w_l_List. */
    protected String[] get_W_l_array() {
        return getListItems(w_l_List);
    }

    /** This method retrieves the items in the w_m_List. */
    protected String[] get_W_m_array() {
        return getListItems(w_m_List);
    }

    /** This method retrieves the items in the c_List. */
    protected String[] get_c_array() {
        return getListItems(c_List);
    }

    /** This method retrieves the path to the OI-space graph database. */
    protected String getOIDBPath() {
        return oiGraphDatabaseTextField.getText();
    }

    /** This method retrieves the path to the OI-space GraphML file. */
    protected String getOIGraphmlFilePath() {
        return oiGraphmlTextField.getText();
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
    private javax.swing.JButton add_c_Button;
    private javax.swing.JButton add_w_l_Button;
    private javax.swing.JButton add_w_m_Button;
    private javax.swing.Box.Filler buttonFiller1;
    private javax.swing.Box.Filler buttonFiller2;
    private javax.swing.Box.Filler buttonFiller3;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel c_Label;
    private javax.swing.JList c_List;
    private javax.swing.JScrollPane c_ScrollPane;
    private javax.swing.JTextField c_TextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JScrollPane containerScrollPane;
    private javax.swing.JButton createButton;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton oiGraphDatabaseButton;
    private javax.swing.JLabel oiGraphDatabaseLabel;
    private javax.swing.JTextField oiGraphDatabaseTextField;
    private javax.swing.JButton oiGraphmlButton;
    private javax.swing.JLabel oiGraphmlLabel;
    private javax.swing.JTextField oiGraphmlTextField;
    private javax.swing.JButton printButton;
    private javax.swing.JDialog printGraphDialog;
    private javax.swing.JScrollPane printScrollPane;
    private javax.swing.JTextArea printTextArea;
    private javax.swing.JButton remove_all_c_Button;
    private javax.swing.JButton remove_all_w_l_Button;
    private javax.swing.JButton remove_all_w_m_Button;
    private javax.swing.JButton remove_c_Button;
    private javax.swing.JButton remove_w_l_Button;
    private javax.swing.JButton remove_w_m_Button;
    private javax.swing.JButton visualizeButton;
    private javax.swing.JLabel w_l_Label;
    private javax.swing.JList w_l_List;
    private javax.swing.JScrollPane w_l_ScrollPane;
    private javax.swing.JTextField w_l_TextField;
    private javax.swing.JLabel w_m_Label;
    private javax.swing.JList w_m_List;
    private javax.swing.JScrollPane w_m_ScrollPane;
    private javax.swing.JTextField w_m_TextField;
    // End of variables declaration//GEN-END:variables
}
