/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormNho;

import BLL.ComboboxBLL;
import BLL.NhanVienBLL;
import BLL.QuyenBLL;
import Presentation.MainClass;
import Presentation.frmDangNhap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author HOANG
 */
public class FrmDangki extends javax.swing.JFrame {

    /**
     * Creates new form FrmDangki
     */
    public FrmDangki() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txttaikhoan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMatKHau = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnhanvien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rbdNam = new javax.swing.JRadioButton();
        rbdNu = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtchungminhnhandan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbbchucvu = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbbngay = new javax.swing.JComboBox<>();
        cbbthang = new javax.swing.JComboBox<>();
        cbbNam = new javax.swing.JComboBox<>();
        cbbNgay1 = new javax.swing.JComboBox<>();
        cbbthang1 = new javax.swing.JComboBox<>();
        cbbnam1 = new javax.swing.JComboBox<>();
        btntaotaikhoan = new javax.swing.JButton();
        btndangnhap = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cbbmaQuyen = new javax.swing.JComboBox<>();
        txtMota = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jLabel2.setText("Tên Tài Khoản:");

        jLabel3.setText("Mật Khẩu:");

        jLabel4.setText("Tên Nhân Viên:");

        jLabel5.setText("Địa chỉ:");

        jLabel6.setText("Số Điện Thoại:");

        jLabel7.setText("Giới Tính:");

        buttonGroup1.add(rbdNam);
        rbdNam.setText("Nam");

        buttonGroup1.add(rbdNu);
        rbdNu.setText("Nữ");

        jLabel8.setText("CMND:");

        jLabel9.setText("Chức Vụ:");

        cbbchucvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Ngày Sinh:");

        jLabel11.setText("Ngày Vào Làm:");

        cbbthang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbthangItemStateChanged(evt);
            }
        });

        btntaotaikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phan quyen.png"))); // NOI18N
        btntaotaikhoan.setText("Tạo Tài Khoản");
        btntaotaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntaotaikhoanActionPerformed(evt);
            }
        });

        btndangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/xuat.png"))); // NOI18N
        btndangnhap.setText("Đăng Nhập");
        btndangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhapActionPerformed(evt);
            }
        });

        jLabel12.setText("Mã Quyền:");

        cbbmaQuyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(txtMota, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtchungminhnhandan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnhanvien, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttaikhoan, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbdNam, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(rbdNu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbbchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtMatKHau)
                                                    .addComponent(txtdiachi)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbbNgay1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbbthang1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbbnam1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap())))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbmaQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbbngay, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbbthang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 20, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(btntaotaikhoan)
                .addGap(50, 50, 50)
                .addComponent(btndangnhap)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtMatKHau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(rbdNam)
                    .addComponent(rbdNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtchungminhnhandan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cbbchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(cbbngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbthang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNgay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbthang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbnam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbbmaQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntaotaikhoan)
                    .addComponent(btndangnhap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMota, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phan quyen.png"))); // NOI18N
        jLabel1.setText("Đăng Kí Tài Khoản");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(259, 259, 259))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public static int quyen = 0;
    public static String ten = "";
    private void btntaotaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntaotaikhoanActionPerformed
        // TODO add your handling code here:
        String TenNhanVien, TenDangNhap, Password, DiaChi, SDT,ChucVu,CMND,Ngaysinh,NgayVaoLam,Quyen = "",Mota;
        int MaQuyen,GioiTinh;
        TenNhanVien = txtnhanvien.getText();
        DiaChi = txtdiachi.getText();
        SDT =txtSDT.getText();
        if(rbdNam.isSelected()){
            GioiTinh = 1;
        }else{
            GioiTinh = 0;
        }
        CMND = txtchungminhnhandan.getText();
        ChucVu = ComboboxBLL.getSelectedItemID(cbbchucvu);
        String ngay, thang, nam;
        ngay = cbbngay.getSelectedItem().toString();
        thang = cbbthang.getSelectedItem().toString();
        nam = cbbNam.getSelectedItem().toString();
        Ngaysinh = nam + "-" + thang + "-" + ngay;
       String ngayLam, thangVaoLam, namVaoLam;
        ngayLam = cbbNgay1.getSelectedItem().toString();
        thangVaoLam = cbbthang1.getSelectedItem().toString();
        namVaoLam = cbbnam1.getSelectedItem().toString();
        NgayVaoLam = namVaoLam + "-" + thangVaoLam + "-" + ngayLam;
        TenDangNhap = txttaikhoan.getText();
        Password = txtMatKHau.getText();
        Mota = txtMota.getText();
        MaQuyen = Integer.parseInt(ComboboxBLL.getSelectedItemID(cbbmaQuyen));
         String cautruyvan = "select *from Quyen ";
        ResultSet rs = MainClass.Connection.ExcuteQueryGetTable(cautruyvan);
        try {
            while (rs.next()) {
                if (rs.getString("TenQuyen").equals("New")) {
                    Quyen = rs.getString("MaQuyen");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
          boolean kt = true;

        if (TenDangNhap.equals("")) {
            MainClass.ThongBao("Tên đăng nhập phải từ 6-10 ký tự", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (Password.length() < 1 || Password.length() > 50) {
                MainClass.ThongBao("Mật khẩu phải nhập nhiều hơn 1 ký tự và ít hơn 50 ký tự", "Lỗi đăng ký", 2);
            } else if (!KiemTraChuaChuVaSo(Password)) {
                MainClass.ThongBao("Mật khẩu phải bao gồm chữ IN HOA, chữ thường và số", "Thông báo", 2);
            } else {

                String cautruyvan2 = "select * from NhanVien where TenNhanVien= '" + TenNhanVien + "'";
                ResultSet rs2 = MainClass.Connection.ExcuteQueryGetTable(cautruyvan2);
                try {
                    rs2.next();
                    if (rs.getString("TenNhanVien").equals(TenNhanVien)) {
                        kt = false;
                        MainClass.ThongBao("tài khoản  của nhân viên có Tên: " + TenNhanVien + " đã  có trong sql yêu cầu tạo tk với tên đăng nhập khác!", "Thông báo", 2);
                    }

                } catch (SQLException ex) {
                    System.out.println("không có trong sql !có thể tạo thêm");
                    kt = true;
                }
                if (kt == true) {
                 String ctv = "insert into NhanVien(TenNhanVien,DiaChi,SoDienThoai,GioiTinh,CMND,ChucVu,NgaySinh,NgayVaoLam,UserName,Password,MaQuyen,MoTa)" 
     +"values(N'"+TenNhanVien+"',N'"+DiaChi+"','"+SDT+"','"+GioiTinh+"','"+CMND+"',N'"+ChucVu+"',"
                + "'"+Ngaysinh+"','"+NgayVaoLam+"',N'"+TenDangNhap+"',N'"+Password+"','"+MaQuyen+"',N'"+Mota+"')";
        System.out.println(cautruyvan);
            MainClass.Connection.ExcuteQueryUpdate(ctv);
            System.out.println("Đã Thêm Thành Công");
        } else {
            MainClass.ThongBao("Không thể Thêm tài Khoản", "lỗi", 2);
                }
            }
        
    }//GEN-LAST:event_btntaotaikhoanActionPerformed

    private void cbbthangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbthangItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbthangItemStateChanged

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
              for (int i = 1; i < 32; i++) {
            cbbngay.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbthang.addItem(String.valueOf(i));
        }
        for (int i = year; i > 1950; i--) {
            cbbNam.addItem(String.valueOf(i));
        }
              for (int i = 1; i < 32; i++) {
            cbbNgay1.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbthang1.addItem(String.valueOf(i));
        }
        for (int i = year; i > 1950; i--) {
            cbbnam1.addItem(String.valueOf(i));
        }
        
         ResultSet rs = QuyenBLL.LayTatCaQuyen();
       ComboboxBLL.LoadDuLieuCombobox(rs, cbbchucvu, "TenQuyen", "MaQuyen");
     
       ResultSet rs1 = QuyenBLL.LayTatCaQuyen();
       ComboboxBLL.LoadDuLieuCombobox(rs1, cbbmaQuyen, "TenQuyen", "MaQuyen");
    }//GEN-LAST:event_formWindowOpened

    private void btndangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhapActionPerformed
        // TODO add your handling code here:
        Presentation.frmDangNhap frm = new frmDangNhap();
        frm.show();this.dispose();
    }//GEN-LAST:event_btndangnhapActionPerformed
     Calendar cal = Calendar.getInstance();
    int day = cal.get(Calendar.DAY_OF_MONTH);
    int month = cal.get(Calendar.MONTH) + 1;
    int year = cal.get(Calendar.YEAR);

    Date dt = cal.getTime(); private boolean KiemTraChuaChuVaSo(String chuoi) {
        boolean ketqua = false;
        Pattern p = Pattern.compile("[a-zA-Z][0-9]");
        Matcher m = p.matcher(chuoi);
        if (!(chuoi == chuoi.toLowerCase())) {
            ketqua = m.find();
        }
        return ketqua;
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmDangki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDangki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDangki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDangki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDangki().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndangnhap;
    private javax.swing.JButton btntaotaikhoan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbNam;
    private javax.swing.JComboBox<String> cbbNgay1;
    private javax.swing.JComboBox<String> cbbchucvu;
    private javax.swing.JComboBox<String> cbbmaQuyen;
    private javax.swing.JComboBox<String> cbbnam1;
    private javax.swing.JComboBox<String> cbbngay;
    private javax.swing.JComboBox<String> cbbthang;
    private javax.swing.JComboBox<String> cbbthang1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbdNam;
    private javax.swing.JRadioButton rbdNu;
    private javax.swing.JTextField txtMatKHau;
    private javax.swing.JTextField txtMota;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtchungminhnhandan;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtnhanvien;
    private javax.swing.JTextField txttaikhoan;
    // End of variables declaration//GEN-END:variables
}