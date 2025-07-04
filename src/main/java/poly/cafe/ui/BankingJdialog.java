/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package poly.cafe.ui;

import java.awt.Frame;
import poly.cafe.util.QRHelper;
import poly.cafe.util.XDialog;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.JDialog;
import poly.cafe.dao.BillDAO;
import poly.cafe.dao.impl.BillDAOImpl;
import poly.cafe.entity.Bill;

/**
 *
 * @author Phu Pham
 */
public class BankingJdialog extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BankingJdialog.class.getName());
    
    // Fields to store bill information
    private Bill currentBill;
    private BillDAO billDAO;
private JDialog parentDialog; // chính là PaymentJDialog
    /**
     * Creates new form BankingJdialog
     */
    public BankingJdialog(Frame owner, JDialog parentDialog) {
        super(owner, true);
        this.parentDialog = parentDialog;
        initComponents();
        init();
    }
        private void closeBothDialogs() {
        if (parentDialog != null) {
            parentDialog.dispose(); // đóng dialog trước
        }
        this.dispose(); // đóng chính mình
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBillId = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        txtBankInfo = new javax.swing.JTextField();
        qrCodeLabel = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnConfirmPayment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thanh toán chuyển khoản");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin thanh toán"));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel1.setText("THANH TOÁN CHUYỂN KHOẢN");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel2.setText("Mã phiếu:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel3.setText("Số tiền:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel4.setText("Thông tin ngân hàng:");

        txtBillId.setEnabled(false);

        txtAmount.setEnabled(false);

        txtBankInfo.setEnabled(false);
        txtBankInfo.setText("Ngân hàng: Vietcombank | STK: 1234567890 | Chủ TK: PolyCafe");

        qrCodeLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        qrCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qrCodeLabel.setText("QR Code sẽ hiển thị ở đây");

        btnClose.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        btnClose.setText("Đóng");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnConfirmPayment.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        btnConfirmPayment.setText("Xác nhận đã thanh toán");
        btnConfirmPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmPaymentActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel5.setText("Quét mã QR để thanh toán:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBillId, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtBankInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(qrCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnConfirmPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBillId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBankInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(qrCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnConfirmPayment))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnConfirmPaymentActionPerformed(java.awt.event.ActionEvent evt) {
        if (XDialog.confirm("Bạn muốn xác nhận đã thanh toán phiếu bán hàng?")) {
            try {
                if (currentBill != null) {
                    closeBothDialogs();
                    currentBill.setStatus(1); // Set status to Completed
                    currentBill.setCheckout(new Date());
                    billDAO.update(currentBill);
                    JOptionPane.showMessageDialog(this, "Xác nhận thanh toán thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin phiếu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                logger.log(java.util.logging.Level.SEVERE, "Lỗi khi xác nhận thanh toán", e);
                JOptionPane.showMessageDialog(this, "Lỗi khi xác nhận thanh toán: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BankingJdialog dialog = new BankingJdialog(new javax.swing.JFrame(), null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnConfirmPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel qrCodeLabel;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBankInfo;
    private javax.swing.JTextField txtBillId;
    // End of variables declaration//GEN-END:variables

    /**
     * Nhận dữ liệu từ BillJDialog và hiển thị thông tin thanh toán
     * @param billId Mã phiếu
     * @param amount Số tiền cần thanh toán
     */
public void setPaymentInfo(String billId, double amount) {
    System.out.println("Debug - Bill ID: " + billId);
    System.out.println("Debug - Amount: " + amount);

    txtBillId.setText(billId);
    txtAmount.setText(String.format("%.0f VNĐ", amount));

    // Tạo dữ liệu QR đúng định dạng VietQR/ZaloPay
    String qrData = "00020101021238540010A00000072701240006970436011093954732230208QRIBFTTA53037045405"
            + amount
            + "5802VN62140810"
            + "MD" + billId +"POLY"
            + "80320112com.vng.zalo0212ZAPAYMENTHUB6304898C";

    System.out.println("QR Data:\n" + qrData);

    // Gọi helper để hiển thị QR
    QRHelper.setQRCodeToLabel(qrCodeLabel, qrData);
}

    
    private void init() {
        // Khởi tạo BillDAO
        billDAO = new BillDAOImpl();
    }
    
    /**
     * Set bill information for payment confirmation
     * @param bill Bill object to be updated
     */
    public void setBill(Bill bill) {
        this.currentBill = bill;
    }
}
