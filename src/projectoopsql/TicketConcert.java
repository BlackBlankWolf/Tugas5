/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectoopsql;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author HP VICTUS
 */
public class TicketConcert extends javax.swing.JFrame {

    /**
     * Creates new form FormTicket
     */
    
    // variabel untuk untuk meletakkan data yang akan di panggil di program ticketJkt48.java
    String jt= null;
    String pbn;
    String nama,nomerIdentitas,jenisTiket,jumlahTiket,hargaTotal,caraPembayaran;
    
    // method untuk menyatukan semua komponen dan akan di tamplikan di main method
    public TicketConcert() {
        // kode memanggil tampilan/layouting
        initComponents();
        setLocationRelativeTo(null);
        // kode untuk mengganti icon java menjadi gambar yang input
        setIconImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // kode untuk layouting program
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        beliButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        nik = new javax.swing.JTextField();
        hargaTiket = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        vvip = new javax.swing.JRadioButton();
        vip = new javax.swing.JRadioButton();
        gold = new javax.swing.JRadioButton();
        silver = new javax.swing.JRadioButton();
        jumlah = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        bayarDT = new javax.swing.JRadioButton();
        transfer = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM PEMESANANAN TIKET KONSER");

        beliButton.setText("BELI");
        beliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliButtonActionPerformed(evt);
            }
        });

        batalButton.setText("BATAL");
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMOR IDENTITAS");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("JENIS TIKET");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("HARGA");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("JUMLAH ");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TOTAL");

        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        buttonGroup1.add(vvip);
        vvip.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vvip.setForeground(new java.awt.Color(255, 255, 255));
        vvip.setText("VVIP");
        vvip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vvipActionPerformed(evt);
            }
        });

        buttonGroup1.add(vip);
        vip.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vip.setForeground(new java.awt.Color(255, 255, 255));
        vip.setText("VIP");
        vip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vipActionPerformed(evt);
            }
        });

        buttonGroup1.add(gold);
        gold.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        gold.setForeground(new java.awt.Color(255, 255, 255));
        gold.setText("Gold");
        gold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goldActionPerformed(evt);
            }
        });

        buttonGroup1.add(silver);
        silver.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        silver.setForeground(new java.awt.Color(255, 255, 255));
        silver.setText("Silver");
        silver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silverActionPerformed(evt);
            }
        });

        jumlah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PEMBAYARAN");

        buttonGroup2.add(bayarDT);
        bayarDT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bayarDT.setForeground(new java.awt.Color(255, 255, 255));
        bayarDT.setText("Bayar Di Tempat");
        bayarDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarDTActionPerformed(evt);
            }
        });

        buttonGroup2.add(transfer);
        transfer.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        transfer.setForeground(new java.awt.Color(255, 255, 255));
        transfer.setText("Transfer");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("JKT48 11th Anniversary Concert");
        jLabel9.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(139, 139, 139)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(inputNama, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                        .addComponent(nik)
                        .addComponent(hargaTiket)
                        .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(total))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(vvip, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vip, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gold, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(silver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bayarDT, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(beliButton)
                .addGap(78, 78, 78)
                .addComponent(batalButton))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vvip)
                        .addComponent(vip)
                        .addComponent(gold)
                        .addComponent(silver)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bayarDT)
                    .addComponent(transfer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beliButton)
                    .addComponent(batalButton))
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // kode untuk apa bila button beli di klik akan mengambil dan menyimpan data ke variabel yang dideklarasikan 
    private void beliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliButtonActionPerformed
        // TODO add your handling code here:
        nama = inputNama.getText();
        nomerIdentitas = nik.getText();
        jenisTiket = jt;
        jumlahTiket = jumlah.getSelectedItem().toString();
        hargaTotal = total.getText();
        caraPembayaran = pbn;
        
        try {
            if (nama.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Isi Nama");
            }else if (nomerIdentitas.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Isi Nomor identitas");
            }else if (jenisTiket.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Pilih Jenis Tiket");
            }else if (jumlahTiket.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "pilih jumlah Tiket");
            }else if (caraPembayaran.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Pilih Cara Pembayaran");
            }
            // kode untuk memanggil file TicketJKT48.java
            if(!nama.isEmpty() && !nomerIdentitas.isEmpty() &&!jenisTiket.isEmpty()&&!jumlahTiket.isEmpty()&&!caraPembayaran.isEmpty()){
                TicketJKT48 tiket = new TicketJKT48(nama,nomerIdentitas,jenisTiket,jumlahTiket,hargaTotal,caraPembayaran);
                tiket.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "EROR ");
        }
        
        

    }//GEN-LAST:event_beliButtonActionPerformed

    // kode apabila tombol batal di klik akan menampilkan joptionpane berbentuk dialog 
    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        // TODO add your handling code here:
        int batal = 0;
        JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Membatalkan Pesanan? ","KELUAR",JOptionPane.YES_NO_OPTION);
        if (batal == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_batalButtonActionPerformed

    
    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed
       // kode untuk jika vvip di pilih akan mengambil nilai String vvip dan mengatur harga nya manjadi 2.400.000 
    private void vvipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vvipActionPerformed
        // TODO add your handling code here:
        if(vvip.isSelected()){
            // mengambil nilai String vvip
            jt = vvip.getText();
            
            //mengatur harga nya manjadi 2.400.000 
            hargaTiket.setText("2400000");
        }
    }//GEN-LAST:event_vvipActionPerformed
    // kode untuk jika vip di pilih akan mengambil nilai String vip dan mengatur harga nya manjadi 1.600.000 
    private void vipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vipActionPerformed
        // TODO add your handling code here:
        if(vip.isSelected()){
            jt = vip.getText();
            hargaTiket.setText("1600000");
        }
    }//GEN-LAST:event_vipActionPerformed
    // kode untuk jika gold di pilih akan mengambil nilai String gold dan mengatur harga nya manjadi 1.200.000 
    private void goldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goldActionPerformed
        // TODO add your handling code here:
        if(gold.isSelected()){
            jt = gold.getText();
            hargaTiket.setText("1200000");
        }
    }//GEN-LAST:event_goldActionPerformed
    // kode untuk jika Silver di pilih akan mengambil nilai String silver dan mengatur harga nya manjadi 800.000 
    private void silverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silverActionPerformed
        // TODO add your handling code here:
        if(silver.isSelected()){
            jt = silver.getText();
            hargaTiket.setText("800000");
        }
    }//GEN-LAST:event_silverActionPerformed
    // kode untuk menghitung total harga dengan bentuk integer dengan pilihan dari jumlah 
    //dan akan dikalikan dengan harga sesuai jenis tiket yang dipilih (harga tiket dirubah dahulu menjadi integer)
    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
        int harga;
        int totalHarga = 0;
        if(jumlah.getSelectedItem().equals("1")){
            total.setText("Rp. " + hargaTiket.getText());
        } else if(jumlah.getSelectedItem().equals("2")){
            harga = Integer.parseInt(hargaTiket.getText());
            totalHarga = harga * 2;
            total.setText("Rp. " + Integer.toString(totalHarga));
        } else if(jumlah.getSelectedItem().equals("3")){
            harga = Integer.parseInt(hargaTiket.getText());
            totalHarga = harga * 3;
            total.setText("Rp. " + Integer.toString(totalHarga));
        }else if(jumlah.getSelectedItem().equals("4")){
            harga = Integer.parseInt(hargaTiket.getText());
            totalHarga = harga * 4;
            total.setText("Rp. " + Integer.toString(totalHarga));
        }
    }//GEN-LAST:event_jumlahActionPerformed
    // kode untuk mengatur total harga menjadi bentuk string
    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
        int totalHarga = 0;
        total.setText(Integer.toString(totalHarga));
    }//GEN-LAST:event_totalActionPerformed
    // kode untuk menyimpan data pembayaran tunai ke variabel pbn 
    private void bayarDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarDTActionPerformed
        // TODO add your handling code here:
        if(bayarDT.isSelected()){
            pbn = bayarDT.getText();
        }
    }//GEN-LAST:event_bayarDTActionPerformed
    // kode untuk menyimpan data pembayaran transfer ke variabel pbn 
    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        // TODO add your handling code here:
        if(transfer.isSelected()){
            pbn = transfer.getText();
        }
    }//GEN-LAST:event_transferActionPerformed


    
    /**
     * @param args the command line arguments
     */
    // kode main method
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
            java.util.logging.Logger.getLogger(TicketConcert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketConcert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketConcert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketConcert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                
                new TicketConcert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalButton;
    private javax.swing.JRadioButton bayarDT;
    private javax.swing.JButton beliButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton gold;
    private javax.swing.JTextField hargaTiket;
    private javax.swing.JTextField inputNama;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jumlah;
    private javax.swing.JTextField nik;
    private javax.swing.JRadioButton silver;
    private javax.swing.JTextField total;
    private javax.swing.JRadioButton transfer;
    private javax.swing.JRadioButton vip;
    private javax.swing.JRadioButton vvip;
    // End of variables declaration//GEN-END:variables

    // kode untuk mengganti icon java menjadi icon yang dipilih programmer
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP VICTUS\\OneDrive\\Documents\\NetBeansProjects\\TicketConcert\\src\\main\\java\\com\\mycompany\\ticketconcert\\IconJkt48.png"));
    }
}
