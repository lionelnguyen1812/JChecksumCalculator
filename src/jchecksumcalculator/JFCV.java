package jchecksumcalculator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.xml.bind.DatatypeConverter;

public class JFCV extends javax.swing.JFrame {

    public JFCV() {
        initComponents();
        JComponent c;
        listAlgorythmCbbModel cbbModel = new listAlgorythmCbbModel();
        cbbChecksumtype.setModel(cbbModel);

        filechooser.setCurrentDirectory(new File("C:\\Users\\chad\\Desktop"));
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filechooser = new javax.swing.JFileChooser();
        pnlSttBar = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        sprBot = new javax.swing.JSeparator();
        sprTop = new javax.swing.JSeparator();
        lblFilenameLabel = new javax.swing.JLabel();
        btnOpen = new javax.swing.JButton();
        lblFilename = new javax.swing.JLabel();
        lblFileSize = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        sprMid = new javax.swing.JSeparator();
        lblChecksum = new javax.swing.JLabel();
        txtCompare = new javax.swing.JTextField();
        cbbChecksumtype = new javax.swing.JComboBox();
        btnCalculate = new javax.swing.JButton();
        lblCompare = new javax.swing.JLabel();
        lblChecksumType = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlSttBar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblStatus.setText("Status: IDLE");
        pnlSttBar.add(lblStatus);

        getContentPane().add(pnlSttBar, java.awt.BorderLayout.PAGE_END);

        sprBot.setForeground(new java.awt.Color(204, 204, 204));

        lblFilenameLabel.setText("Filename");

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jchecksumcalculator/open.png"))); // NOI18N
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        lblFilename.setText("(no file selected)");

        lblFileSize.setText("    ");

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jchecksumcalculator/save.png"))); // NOI18N

        lblChecksum.setText("Checksum");

        cbbChecksumtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MD5", "SHA-1" }));

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblCompare.setText("Compare with");

        lblChecksumType.setText("Checksum type");

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sprBot)
            .addComponent(sprTop)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sprMid)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCompare)
                            .addComponent(lblChecksumType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCompare, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(cbbChecksumtype, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFilenameLabel)
                            .addComponent(lblChecksum))
                        .addGap(62, 62, 62)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResult)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFilename)
                                    .addComponent(lblFileSize))
                                .addGap(0, 211, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addComponent(sprTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFilenameLabel)
                            .addComponent(lblFilename))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFileSize))
                    .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChecksum)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprMid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCompare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCompare))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbChecksumtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate)
                    .addComponent(lblChecksumType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sprBot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnlMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        calculate();
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        openFile();
    }//GEN-LAST:event_btnOpenActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JFCV.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCV().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cbbChecksumtype;
    private javax.swing.JFileChooser filechooser;
    private javax.swing.JLabel lblChecksum;
    private javax.swing.JLabel lblChecksumType;
    private javax.swing.JLabel lblCompare;
    private javax.swing.JLabel lblFileSize;
    private javax.swing.JLabel lblFilename;
    private javax.swing.JLabel lblFilenameLabel;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlSttBar;
    private javax.swing.JSeparator sprBot;
    private javax.swing.JSeparator sprMid;
    private javax.swing.JSeparator sprTop;
    private javax.swing.JTextField txtCompare;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
    File file = null;

    private void openFile() {
        int returnVal = filechooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            this.file = filechooser.getSelectedFile();

            String fileName = file.getName();
            String fileSize = "";
            long size = file.length();
            int sizeLevel = 0;
            while (size > 1024 && sizeLevel <= 3) {
                sizeLevel++;
                size /= 1024;
            }
            switch (sizeLevel) {
                case 0:
                    fileSize = String.valueOf(size) + " bytes";
                    break;
                case 1:
                    fileSize = String.valueOf(size) + " KB";
                    break;
                case 2:
                    fileSize = String.valueOf(size) + " MB";
                    break;
                case 3:
                    fileSize = String.valueOf(size) + " GB";
                    break;
            }

            this.lblFilename.setText(fileName);
            this.lblFileSize.setText(fileSize);
            this.lblStatus.setText("Ready to calculate");
        }
    }

    private void calculate() {
        String sum = "";
        try {
            sum = DatatypeConverter.printHexBinary(createChecksum());
            
            
            txtResult.setText(sum);
        } catch (NoSuchAlgorithmException ex) {
            lblStatus.setText("Choose an algorythm");
        } catch (FileNotFoundException ex) {
            lblStatus.setText("File not found");
        } catch (IOException ex) {
            lblStatus.setText("Can not read choosed file");
        }
        
    }

    private byte[] createChecksum() throws NoSuchAlgorithmException, FileNotFoundException, IOException{
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        byte[] buf = new byte[1024];
        MessageDigest hasher = MessageDigest.getInstance((String) cbbChecksumtype.getSelectedItem());
        int read;

        while ((read = in.read(buf)) != -1) {
            if (read > 0) {
                hasher.update(buf, 0, read);
            }
        }

        in.close();
        return hasher.digest();
    }

    class listAlgorythmCbbModel<String> extends AbstractListModel<String> implements ComboBoxModel<String> {

        List<String> list;
        String selected = (String) "";

        public listAlgorythmCbbModel() {
            this.list = new ArrayList<>();
            list.add((String) "MD5");
            list.add((String) "MD2");
            list.add((String) "SHA1");
            list.add((String) "SHA-256");
            list.add((String) "SHA-384");
            list.add((String) "SHA-512");
        }

        @Override
        public int getSize() {
            return this.list.size();
        }

        @Override
        public String getElementAt(int index) {
            return this.list.get(index);
        }

        @Override
        public void setSelectedItem(Object anItem) {
            if ((selected != null && !selected.equals(anItem))
                    || selected == null && anItem != null) {
                selected = (String) anItem;
                fireContentsChanged(this, -1, -1);
            }
        }

        @Override
        public Object getSelectedItem() {
            return selected;
        }
    }
}
