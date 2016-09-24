package info.sarihh.unimodeling.gui;

import info.sarihh.unimodeling.utility.ExtensionFileFilter;
import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;
import info.sarihh.unimodeling.midgraph.MGraph;
import info.sarihh.unimodeling.utility.DrawElement;
import java.awt.event.ItemEvent;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ToolTipManager;

/**
 * This class creates the main GUI of the application.
 * Author: Sari Haj Hussein
 */
public class UniModelingGUI extends javax.swing.JFrame {

    /**
     * Creates new form UniModelingGUI
     */
    public UniModelingGUI() {
        oiSpaceModeingFrame = new OISpaceModelingFrame(this);
        rfidDeploymentModelingFrame = new RFIDDeploymentModelingFrame(this);
        customizedPropertiesFrame = new CustomizedPropertiesFrame(this);
        openedImages = new ArrayList<>();
        openedImageIndex = -1;
        graphmlFilter = new ExtensionFileFilter("graphml", "Graphml files");
        imageFileFilter = new ExtensionFileFilter(new String[]{"BMP", "JPG", "JPEG", "GIF", "PNG", "WBMP"}, "Image files");
        currentDirectory = new File(System.getProperty("user.home"));
        rfidServerFrame = new RFIDServerFrame(this);
        rfidReaderSimulatorFrame = new RFIDReaderSimulatorFrame(this);
        offlineCondenserFrame = new OfflineCondenserFrame(this);
        probabilisticTranslatorFrame = new ProbabilisticTranslatorFrame(this);
        informationGapsInferenceFrame = new InformationGapsInferenceFrame(this);
        dynamicBPEstimateFrame = new DynamicBPEstimateFrame(this);
        aboutBox = new AboutBox(this);
        aboutBox.setLocationRelativeTo(this);
        guideBox = new UserGuideBox(this);
        guideBox.setLocationRelativeTo(this);
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

        fileChooser = new javax.swing.JFileChooser();
        openGraphPanel = new javax.swing.JPanel();
        graphdbLabel = new javax.swing.JLabel();
        graphmlLabel = new javax.swing.JLabel();
        graphdbTextField = new javax.swing.JTextField();
        graphdbBrowseButton = new javax.swing.JButton();
        graphmlTextField = new javax.swing.JTextField();
        graphmlBrowseButton = new javax.swing.JButton();
        spaceplanButtonGroup = new javax.swing.ButtonGroup();
        designerButtonGroup = new javax.swing.ButtonGroup();
        tabbedPane = new javax.swing.JTabbedPane();
        menuBar = new javax.swing.JMenuBar();
        modelingMenu = new javax.swing.JMenu();
        openOISpacePlanMenuItem = new javax.swing.JMenuItem();
        openGraphDbMenuItem = new javax.swing.JMenuItem();
        openRfidGraphMenuItem = new javax.swing.JMenuItem();
        loadProjectMenuItem = new javax.swing.JMenuItem();
        saveProjectMenuItem = new javax.swing.JMenuItem();
        separator = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        spaceplanMenu = new javax.swing.JMenu();
        fullRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        dimmedRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        offRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        designerMenu = new javax.swing.JMenu();
        fulldRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        dimmeddRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        offdRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        translationMenu = new javax.swing.JMenu();
        offlineCondensingMenu = new javax.swing.JMenuItem();
        onlineCondensingMenu = new javax.swing.JMenu();
        rfidServertMenuItem = new javax.swing.JMenuItem();
        rfidReaderSimulatorMenuItem = new javax.swing.JMenuItem();
        probabilisticTranslatorMenu = new javax.swing.JMenuItem();
        informationGapsInferenceTranslatorMenu = new javax.swing.JMenuItem();
        reasoningMenu = new javax.swing.JMenu();
        dynamicBPEstimateMenu = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        fileChooser.setCurrentDirectory(new java.io.File("."));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("info/sarihh/unimodeling/gui/UniModelingGUI"); // NOI18N
        graphdbLabel.setText(bundle.getString("UniModelingGUI.graphdbLabel.text")); // NOI18N

        graphmlLabel.setText(bundle.getString("UniModelingGUI.graphmlLabel.text")); // NOI18N

        graphdbTextField.setColumns(20);

        graphdbBrowseButton.setText(bundle.getString("UniModelingGUI.graphdbBrowseButton.text")); // NOI18N
        graphdbBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphdbBrowseButtonActionPerformed(evt);
            }
        });

        graphmlTextField.setColumns(20);

        graphmlBrowseButton.setText(bundle.getString("UniModelingGUI.graphmlBrowseButton.text")); // NOI18N
        graphmlBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphmlBrowseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout openGraphPanelLayout = new javax.swing.GroupLayout(openGraphPanel);
        openGraphPanel.setLayout(openGraphPanelLayout);
        openGraphPanelLayout.setHorizontalGroup(
            openGraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(openGraphPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(openGraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(graphdbLabel)
                    .addComponent(graphmlLabel))
                .addGap(18, 18, 18)
                .addGroup(openGraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(openGraphPanelLayout.createSequentialGroup()
                        .addComponent(graphmlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(graphmlBrowseButton))
                    .addGroup(openGraphPanelLayout.createSequentialGroup()
                        .addComponent(graphdbTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(graphdbBrowseButton))))
        );
        openGraphPanelLayout.setVerticalGroup(
            openGraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(openGraphPanelLayout.createSequentialGroup()
                .addGroup(openGraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graphdbTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graphdbBrowseButton)
                    .addComponent(graphdbLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(openGraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graphmlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graphmlBrowseButton)
                    .addComponent(graphmlLabel))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(bundle.getString("UniModelingGUI.title")); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPaneStateChanged(evt);
            }
        });

        modelingMenu.setText(bundle.getString("UniModelingGUI.modelingMenu.text")); // NOI18N

        openOISpacePlanMenuItem.setText(bundle.getString("UniModelingGUI.openOISpacePlanMenuItem.text")); // NOI18N
        openOISpacePlanMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openOISpacePlanMenuItemActionPerformed(evt);
            }
        });
        modelingMenu.add(openOISpacePlanMenuItem);

        openGraphDbMenuItem.setText(bundle.getString("UniModelingGUI.openGraphDbMenuItem.text")); // NOI18N
        openGraphDbMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openGraphDbMenuItemActionPerformed(evt);
            }
        });
        modelingMenu.add(openGraphDbMenuItem);

        openRfidGraphMenuItem.setText(bundle.getString("UniModelingGUI.openRfidGraphMenuItem.text")); // NOI18N
        modelingMenu.add(openRfidGraphMenuItem);

        loadProjectMenuItem.setText(bundle.getString("UniModelingGUI.loadProjectMenuItem.text")); // NOI18N
        loadProjectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadProjectMenuItemActionPerformed(evt);
            }
        });
        modelingMenu.add(loadProjectMenuItem);

        saveProjectMenuItem.setText(bundle.getString("UniModelingGUI.saveProjectMenuItem.text")); // NOI18N
        saveProjectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProjectMenuItemActionPerformed(evt);
            }
        });
        modelingMenu.add(saveProjectMenuItem);
        modelingMenu.add(separator);

        exitMenuItem.setText(bundle.getString("UniModelingGUI.exitMenuItem.text")); // NOI18N
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        modelingMenu.add(exitMenuItem);

        menuBar.add(modelingMenu);

        viewMenu.setText(bundle.getString("UniModelingGUI.viewMenu.text")); // NOI18N

        spaceplanMenu.setText(bundle.getString("UniModelingGUI.spaceplanMenu.text")); // NOI18N

        spaceplanButtonGroup.add(fullRadioButtonMenuItem);
        fullRadioButtonMenuItem.setSelected(true);
        fullRadioButtonMenuItem.setText(bundle.getString("UniModelingGUI.fullRadioButtonMenuItem.text")); // NOI18N
        fullRadioButtonMenuItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fullRadioButtonMenuItemItemStateChanged(evt);
            }
        });
        spaceplanMenu.add(fullRadioButtonMenuItem);

        spaceplanButtonGroup.add(dimmedRadioButtonMenuItem);
        dimmedRadioButtonMenuItem.setText(bundle.getString("UniModelingGUI.dimmedRadioButtonMenuItem.text")); // NOI18N
        dimmedRadioButtonMenuItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dimmedRadioButtonMenuItemItemStateChanged(evt);
            }
        });
        spaceplanMenu.add(dimmedRadioButtonMenuItem);

        spaceplanButtonGroup.add(offRadioButtonMenuItem);
        offRadioButtonMenuItem.setText(bundle.getString("UniModelingGUI.offRadioButtonMenuItem.text")); // NOI18N
        offRadioButtonMenuItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                offRadioButtonMenuItemItemStateChanged(evt);
            }
        });
        spaceplanMenu.add(offRadioButtonMenuItem);

        viewMenu.add(spaceplanMenu);

        designerMenu.setText(bundle.getString("UniModelingGUI.designerMenu.text")); // NOI18N

        designerButtonGroup.add(fulldRadioButtonMenuItem);
        fulldRadioButtonMenuItem.setSelected(true);
        fulldRadioButtonMenuItem.setText(bundle.getString("UniModelingGUI.fulldRadioButtonMenuItem.text")); // NOI18N
        fulldRadioButtonMenuItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fulldRadioButtonMenuItemItemStateChanged(evt);
            }
        });
        designerMenu.add(fulldRadioButtonMenuItem);

        designerButtonGroup.add(dimmeddRadioButtonMenuItem);
        dimmeddRadioButtonMenuItem.setText(bundle.getString("UniModelingGUI.dimmeddRadioButtonMenuItem.text")); // NOI18N
        dimmeddRadioButtonMenuItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dimmeddRadioButtonMenuItemItemStateChanged(evt);
            }
        });
        designerMenu.add(dimmeddRadioButtonMenuItem);

        designerButtonGroup.add(offdRadioButtonMenuItem);
        offdRadioButtonMenuItem.setText(bundle.getString("UniModelingGUI.offdRadioButtonMenuItem.text")); // NOI18N
        offdRadioButtonMenuItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                offdRadioButtonMenuItemItemStateChanged(evt);
            }
        });
        designerMenu.add(offdRadioButtonMenuItem);

        viewMenu.add(designerMenu);

        menuBar.add(viewMenu);

        translationMenu.setText(bundle.getString("UniModelingGUI.translationMenu.text")); // NOI18N

        offlineCondensingMenu.setText(bundle.getString("UniModelingGUI.offlineCondensingMenu.text")); // NOI18N
        offlineCondensingMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offlineCondensingMenuActionPerformed(evt);
            }
        });
        translationMenu.add(offlineCondensingMenu);

        onlineCondensingMenu.setText(bundle.getString("UniModelingGUI.onlineCondensingMenu.text")); // NOI18N

        rfidServertMenuItem.setText(bundle.getString("UniModelingGUI.rfidServertMenuItem.text")); // NOI18N
        rfidServertMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfidServertMenuItemActionPerformed(evt);
            }
        });
        onlineCondensingMenu.add(rfidServertMenuItem);

        rfidReaderSimulatorMenuItem.setText(bundle.getString("UniModelingGUI.rfidReaderSimulatorMenuItem.text")); // NOI18N
        rfidReaderSimulatorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfidReaderSimulatorMenuItemActionPerformed(evt);
            }
        });
        onlineCondensingMenu.add(rfidReaderSimulatorMenuItem);

        translationMenu.add(onlineCondensingMenu);

        probabilisticTranslatorMenu.setText(bundle.getString("UniModelingGUI.probabilisticTranslatorMenu.text")); // NOI18N
        probabilisticTranslatorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                probabilisticTranslatorMenuActionPerformed(evt);
            }
        });
        translationMenu.add(probabilisticTranslatorMenu);

        informationGapsInferenceTranslatorMenu.setText(bundle.getString("UniModelingGUI.informationGapsInferenceTranslatorMenu.text")); // NOI18N
        informationGapsInferenceTranslatorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationGapsInferenceTranslatorMenuActionPerformed(evt);
            }
        });
        translationMenu.add(informationGapsInferenceTranslatorMenu);

        menuBar.add(translationMenu);

        reasoningMenu.setText(bundle.getString("UniModelingGUI.reasoningMenu.text")); // NOI18N

        dynamicBPEstimateMenu.setText(bundle.getString("UniModelingGUI.dynamicBPEstimateMenu.text")); // NOI18N
        dynamicBPEstimateMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dynamicBPEstimateMenuActionPerformed(evt);
            }
        });
        reasoningMenu.add(dynamicBPEstimateMenu);

        menuBar.add(reasoningMenu);

        helpMenu.setText(bundle.getString("UniModelingGUI.helpMenu.text")); // NOI18N

        contentMenuItem.setText(bundle.getString("UniModelingGUI.contentMenuItem.text")); // NOI18N
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setText(bundle.getString("UniModelingGUI.aboutMenuItem.text")); // NOI18N
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-850)/2, (screenSize.height-650)/2, 850, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        exit();
    }//GEN-LAST:event_exitMenuItemActionPerformed

private void openOISpacePlanMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openOISpacePlanMenuItemActionPerformed
    fileChooser.setDialogTitle("Open OI Space plan");
    fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    fileChooser.removeChoosableFileFilter(graphmlFilter);
    fileChooser.setFileFilter(imageFileFilter);
    int returnValue = fileChooser.showOpenDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File planFile = fileChooser.getSelectedFile();
        String filename = planFile.getName().replaceAll("\\.", "_");
        String oDbPath = System.getProperty("user.home") + File.separator + ".UniModeling" + File.separator + filename;
        DrawPanel drawPanel = new DrawPanel(this, planFile, oDbPath);
        openedImages.add(drawPanel);
        openedImageIndex = openedImages.indexOf(drawPanel);
        tabbedPane.addTab(planFile.getName(), drawPanel);
        tabbedPane.setSelectedComponent(drawPanel);
    }
}//GEN-LAST:event_openOISpacePlanMenuItemActionPerformed

    private void graphdbBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphdbBrowseButtonActionPerformed
        fileChooser.setDialogTitle("Open Orient Graph Database");
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.removeChoosableFileFilter(graphmlFilter);
        fileChooser.removeChoosableFileFilter(imageFileFilter);
        fileChooser.setFileFilter(fileChooser.getAcceptAllFileFilter());
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            graphdbTextField.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_graphdbBrowseButtonActionPerformed

    private void graphmlBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphmlBrowseButtonActionPerformed
        fileChooser.setDialogTitle("Open Graphml file");
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.removeChoosableFileFilter(imageFileFilter);
        fileChooser.addChoosableFileFilter(graphmlFilter);
        fileChooser.setFileFilter(graphmlFilter);
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File f = fileChooser.getSelectedFile();
            if (f.exists()) {
                returnValue = JOptionPane.showConfirmDialog(getContentPane(),
                        "Overwrite existing file?",
                        "Unimodeling",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (returnValue == JOptionPane.YES_OPTION) {
                    graphmlTextField.setText(f.getAbsolutePath());
                }
            } else {
                graphmlTextField.setText(f.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_graphmlBrowseButtonActionPerformed

    private void openGraphDbMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openGraphDbMenuItemActionPerformed
        int returnValue = JOptionPane.showConfirmDialog(this, openGraphPanel,
                "Open Graph files",
                JOptionPane.OK_CANCEL_OPTION);
        if (returnValue == JOptionPane.OK_OPTION) {
            try {
                OrientGraph oiSpaceGraph = new OrientGraph("local:" + graphdbTextField.getText());
                graphmlPath = graphmlTextField.getText();
            } catch (NullPointerException nx) {
            }
        }
    }//GEN-LAST:event_openGraphDbMenuItemActionPerformed

    private void tabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedPaneStateChanged
        openedImageIndex = openedImages.indexOf(tabbedPane.getSelectedComponent());
    }//GEN-LAST:event_tabbedPaneStateChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        exit();
    }//GEN-LAST:event_formWindowClosed

    private void fullRadioButtonMenuItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fullRadioButtonMenuItemItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            openedImages.get(openedImageIndex).dimPlan(false);
            openedImages.get(openedImageIndex).hidePlan(false);
        }
    }//GEN-LAST:event_fullRadioButtonMenuItemItemStateChanged

    private void dimmedRadioButtonMenuItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dimmedRadioButtonMenuItemItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            openedImages.get(openedImageIndex).hidePlan(false);
            openedImages.get(openedImageIndex).dimPlan(true);
        }
    }//GEN-LAST:event_dimmedRadioButtonMenuItemItemStateChanged

    private void offRadioButtonMenuItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_offRadioButtonMenuItemItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            openedImages.get(openedImageIndex).hidePlan(true);
        }
    }//GEN-LAST:event_offRadioButtonMenuItemItemStateChanged

    private void fulldRadioButtonMenuItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fulldRadioButtonMenuItemItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            openedImages.get(openedImageIndex).dimGraphics(false);
            openedImages.get(openedImageIndex).hideGraphics(false);
        }
    }//GEN-LAST:event_fulldRadioButtonMenuItemItemStateChanged

    private void dimmeddRadioButtonMenuItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dimmeddRadioButtonMenuItemItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            openedImages.get(openedImageIndex).hideGraphics(false);
            openedImages.get(openedImageIndex).dimGraphics(true);
        }
    }//GEN-LAST:event_dimmeddRadioButtonMenuItemItemStateChanged

    private void offdRadioButtonMenuItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_offdRadioButtonMenuItemItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            openedImages.get(openedImageIndex).hideGraphics(true);
        }
    }//GEN-LAST:event_offdRadioButtonMenuItemItemStateChanged

    private void saveProjectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProjectMenuItemActionPerformed
        fileChooser.setDialogTitle("Save Project");
        fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
        fileChooser.setApproveButtonText("Save");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.removeChoosableFileFilter(graphmlFilter);
        fileChooser.removeChoosableFileFilter(imageFileFilter);
        fileChooser.setFileFilter(fileChooser.getAcceptAllFileFilter());
        fileChooser.setCurrentDirectory(currentDirectory);
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                //DrawElements
                File saveFile = fileChooser.getSelectedFile();
                FileOutputStream modelerOutput = new FileOutputStream(saveFile.getAbsolutePath()
                        + File.separator + "modeler.xml");
                XMLEncoder encoder1 = new XMLEncoder(modelerOutput);
                encoder1.writeObject(openedImages.get(openedImageIndex).saveElements());
                encoder1.close();
                //MidGraph
                FileOutputStream midGraphOutput = new FileOutputStream(saveFile.getAbsolutePath()
                        + File.separator + "midgraph.xml");
                XMLEncoder encoder = new XMLEncoder(midGraphOutput);
                encoder.writeObject(openedImages.get(openedImageIndex).saveMidGraph());
                encoder.close();
                //GraphDB & GraphML
                openedImages.get(openedImageIndex).saveMidGraph().convertToGraph(
                        "local:" + saveFile.getAbsolutePath() + File.separator + "graph",
                        saveFile.getAbsolutePath() + File.separator + "graph.graphml");
                openedImages.get(openedImageIndex).saveMidGraph().convertToRfidGraph(
                        "local:" + saveFile.getAbsolutePath() + File.separator + "rfid",
                        saveFile.getAbsolutePath() + File.separator + "rfid.graphml");
                //Image
                ImageIO.write(openedImages.get(openedImageIndex).getPlanImage(),
                        "PNG", new File(saveFile.getAbsolutePath() + File.separator
                        + "spaceplan.png"));
            } catch (IOException ie) {
                ie.printStackTrace();
            }

        }
    }//GEN-LAST:event_saveProjectMenuItemActionPerformed

    private void loadProjectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadProjectMenuItemActionPerformed
        fileChooser.setDialogTitle("Load Project");
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.removeChoosableFileFilter(graphmlFilter);
        fileChooser.removeChoosableFileFilter(imageFileFilter);
        fileChooser.setFileFilter(fileChooser.getAcceptAllFileFilter());
        fileChooser.setCurrentDirectory(currentDirectory);
        fileChooser.setApproveButtonText("Load");
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                //GrahpDB & image
                File loadFile = fileChooser.getSelectedFile();
                DrawPanel drawPanel = new DrawPanel(this,
                        new File(loadFile.getAbsolutePath() + File.separator + "spaceplan.png"),
                        loadFile.getAbsolutePath());
                openedImages.add(drawPanel);
                openedImageIndex = openedImages.indexOf(drawPanel);
                tabbedPane.addTab(loadFile.getName(), drawPanel);
                tabbedPane.setSelectedComponent(drawPanel);
                //DrawElements
                FileInputStream modelerInput = new FileInputStream(
                        loadFile.getAbsolutePath() + File.separator + "modeler.xml");
                try (XMLDecoder decoder = new XMLDecoder(modelerInput)) {
                    openedImages.get(openedImageIndex).loadElements(
                            (List<DrawElement>) decoder.readObject());
                    decoder.close();
                }
                //MidGraph
                FileInputStream graphInput = new FileInputStream(
                        loadFile.getAbsolutePath() + File.separator + "midgraph.xml");
                try (XMLDecoder decoder = new XMLDecoder(graphInput)) {
                    openedImages.get(openedImageIndex).loadMidGraph(
                            (MGraph) decoder.readObject());
                    decoder.close();
                }
            } catch (IOException ie) {
                ie.printStackTrace();
            }
        }
    }//GEN-LAST:event_loadProjectMenuItemActionPerformed

private void offlineCondensingMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offlineCondensingMenuActionPerformed
    tabbedPane.addTab(offlineCondenserFrame.getTitle(), offlineCondenserFrame);
    tabbedPane.setSelectedComponent(offlineCondenserFrame);
}//GEN-LAST:event_offlineCondensingMenuActionPerformed

private void rfidServertMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfidServertMenuItemActionPerformed
    tabbedPane.addTab(rfidServerFrame.getTitle(), rfidServerFrame);
    tabbedPane.setSelectedComponent(rfidServerFrame);
}//GEN-LAST:event_rfidServertMenuItemActionPerformed

private void rfidReaderSimulatorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfidReaderSimulatorMenuItemActionPerformed
    tabbedPane.addTab(rfidReaderSimulatorFrame.getTitle(), rfidReaderSimulatorFrame);
    tabbedPane.setSelectedComponent(rfidReaderSimulatorFrame);
}//GEN-LAST:event_rfidReaderSimulatorMenuItemActionPerformed

private void probabilisticTranslatorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probabilisticTranslatorMenuActionPerformed
    tabbedPane.addTab(probabilisticTranslatorFrame.getTitle(), probabilisticTranslatorFrame);
    tabbedPane.setSelectedComponent(probabilisticTranslatorFrame);
}//GEN-LAST:event_probabilisticTranslatorMenuActionPerformed

private void informationGapsInferenceTranslatorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationGapsInferenceTranslatorMenuActionPerformed
    tabbedPane.addTab(informationGapsInferenceFrame.getTitle(), informationGapsInferenceFrame);
    tabbedPane.setSelectedComponent(informationGapsInferenceFrame);
}//GEN-LAST:event_informationGapsInferenceTranslatorMenuActionPerformed

private void dynamicBPEstimateMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dynamicBPEstimateMenuActionPerformed
    tabbedPane.addTab(dynamicBPEstimateFrame.getTitle(), dynamicBPEstimateFrame);
    tabbedPane.setSelectedComponent(dynamicBPEstimateFrame);
}//GEN-LAST:event_dynamicBPEstimateMenuActionPerformed

private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
    aboutBox.setVisible(true);
}//GEN-LAST:event_aboutMenuItemActionPerformed

private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
    guideBox.setVisible(true);
}//GEN-LAST:event_contentMenuItemActionPerformed

    /** This method returns that OISpaceModelingFrame instance. */
    protected OISpaceModelingFrame getOISpaceModelingFrame() {
        return oiSpaceModeingFrame;
    }

    /** This method returns that RFIDDeploymentModelingFrame instance. */
    protected RFIDDeploymentModelingFrame getRFIDDeploymentModelingFrame() {
        return rfidDeploymentModelingFrame;
    }

    /**
     * Exit method. Closes last used database then exits the program.
     */
    private void exit() {
        System.exit(0);
    }

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
            javax.swing.UIManager.setLookAndFeel(new Plastic3DLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(UniModelingGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        ToolTipManager.sharedInstance().setDismissDelay(8000);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(
                new Runnable() {

                    @Override
                    public void run() {
                        new UniModelingGUI().setVisible(true);
                    }
                });
    }
    private OISpaceModelingFrame oiSpaceModeingFrame = null;
    private RFIDDeploymentModelingFrame rfidDeploymentModelingFrame = null;
    private CustomizedPropertiesFrame customizedPropertiesFrame = null;
    private RFIDServerFrame rfidServerFrame = null;
    private RFIDReaderSimulatorFrame rfidReaderSimulatorFrame = null;
    private OfflineCondenserFrame offlineCondenserFrame = null;
    private ProbabilisticTranslatorFrame probabilisticTranslatorFrame = null;
    private InformationGapsInferenceFrame informationGapsInferenceFrame = null;
    private DynamicBPEstimateFrame dynamicBPEstimateFrame = null;
    private AboutBox aboutBox = null;
    private UserGuideBox guideBox = null;
    private ArrayList<DrawPanel> openedImages;
    private ExtensionFileFilter graphmlFilter;
    private ExtensionFileFilter imageFileFilter;
    private String graphmlPath;
    private File currentDirectory;
    private int openedImageIndex;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.ButtonGroup designerButtonGroup;
    private javax.swing.JMenu designerMenu;
    private javax.swing.JRadioButtonMenuItem dimmedRadioButtonMenuItem;
    private javax.swing.JRadioButtonMenuItem dimmeddRadioButtonMenuItem;
    private javax.swing.JMenuItem dynamicBPEstimateMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JRadioButtonMenuItem fullRadioButtonMenuItem;
    private javax.swing.JRadioButtonMenuItem fulldRadioButtonMenuItem;
    private javax.swing.JButton graphdbBrowseButton;
    private javax.swing.JLabel graphdbLabel;
    private javax.swing.JTextField graphdbTextField;
    private javax.swing.JButton graphmlBrowseButton;
    private javax.swing.JLabel graphmlLabel;
    private javax.swing.JTextField graphmlTextField;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem informationGapsInferenceTranslatorMenu;
    private javax.swing.JMenuItem loadProjectMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu modelingMenu;
    private javax.swing.JRadioButtonMenuItem offRadioButtonMenuItem;
    private javax.swing.JRadioButtonMenuItem offdRadioButtonMenuItem;
    private javax.swing.JMenuItem offlineCondensingMenu;
    private javax.swing.JMenu onlineCondensingMenu;
    private javax.swing.JMenuItem openGraphDbMenuItem;
    private javax.swing.JPanel openGraphPanel;
    private javax.swing.JMenuItem openOISpacePlanMenuItem;
    private javax.swing.JMenuItem openRfidGraphMenuItem;
    private javax.swing.JMenuItem probabilisticTranslatorMenu;
    private javax.swing.JMenu reasoningMenu;
    private javax.swing.JMenuItem rfidReaderSimulatorMenuItem;
    private javax.swing.JMenuItem rfidServertMenuItem;
    private javax.swing.JMenuItem saveProjectMenuItem;
    private javax.swing.JPopupMenu.Separator separator;
    private javax.swing.ButtonGroup spaceplanButtonGroup;
    private javax.swing.JMenu spaceplanMenu;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JMenu translationMenu;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables
}