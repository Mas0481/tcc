/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import DAO.ClienteDAO;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import modelo.Cliente;

/**
 *
 * @author Marcio Almeida
 */
public class PedidoAreaSujaGUI extends javax.swing.JFrame {
       
        private Date data = new Date();
        private Cliente c;
    //instancia um novo objeto ClienteDAO para dar acesso aos metodos dos clientes
    ClienteDAO cliente = new ClienteDAO();

    //recupera os dados do cadastro para dentro do ArrayList cad
    ArrayList<Cliente> cad = cliente.list();

    
    


    public PedidoAreaSujaGUI() {
        initComponents();

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        // Adicione os itens do ArrayList ao modelo do ComboBox
        for (Cliente cads : cad) {
            model.addElement(cads.getNome());
        }

        // Defina o modelo atualizado no ComboBox
        CbCliente.setModel(model);
        
        jData.setDate(data);        
        
    }

    public void definePeso(String peso) {
        tfPeso.setText(peso);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tfPeso = new javax.swing.JTextField();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jPanel2 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        CbCliente = new javax.swing.JComboBox<>();
        jData = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(940, 660));
        setResizable(false);
        setSize(new java.awt.Dimension(940, 660));
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("INGRESSO DE PEDIDO");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 20, 890, 36);

        jLabel22.setText("CLIENTE");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(30, 90, 60, 16);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1999");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N Serviço", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(58, 34));
        jLabel1.setMinimumSize(new java.awt.Dimension(58, 34));
        jLabel1.setPreferredSize(new java.awt.Dimension(58, 34));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(750, 60, 160, 100);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("DATA COLETA");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(30, 150, 310, 16);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("DATA ENTREGA");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(490, 150, 320, 16);

        tfPeso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfPesoMouseClicked(evt);
            }
        });
        getContentPane().add(tfPeso);
        tfPeso.setBounds(270, 180, 190, 60);

        jCalendar2.setDecorationBackgroundVisible(false);
        jCalendar2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCalendar2.setWeekOfYearVisible(false);
        getContentPane().add(jCalendar2);
        jCalendar2.setBounds(490, 180, 420, 250);

        jComboBox2.setEditable(true);
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(295, 31));
        jPanel2.add(jComboBox2);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 300, 300, 300);

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSpinner1.setMinimumSize(new java.awt.Dimension(50, 31));
        jSpinner1.setName(""); // NOI18N
        jSpinner1.setPreferredSize(new java.awt.Dimension(70, 31));
        jPanel4.add(jSpinner1);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(320, 300, 80, 300);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setText("+");
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.setPreferredSize(new java.awt.Dimension(41, 31));
        jPanel1.add(jButton2);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(400, 300, 50, 300);

        jButton3.setText("CONFIRMA");
        getContentPane().add(jButton3);
        jButton3.setBounds(490, 540, 140, 60);

        jButton4.setText("CANCELA");
        getContentPane().add(jButton4);
        jButton4.setBounds(780, 540, 130, 60);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("OBSERVAÇÕES");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(500, 430, 230, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("PESO");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 150, 180, 16);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("ITENS (Opcional)"));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 270, 450, 340);

        jButton5.setText("LIMPA");
        getContentPane().add(jButton5);
        jButton5.setBounds(640, 540, 130, 60);

        CbCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item1" }));
        getContentPane().add(CbCliente);
        CbCliente.setBounds(90, 90, 640, 40);

        jData.setDateFormatString("dd/MM/yy");
        jData.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        getContentPane().add(jData);
        jData.setBounds(10, 180, 250, 60);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(490, 450, 420, 80);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/user.png"))); // NOI18N
        jLabel5.setText("MAS0481");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(790, 30, 100, 16);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfPesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPesoMouseClicked
        new VirtualKeyboard1(this).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesoMouseClicked

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
            java.util.logging.Logger.getLogger(PedidoAreaSujaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoAreaSujaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoAreaSujaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoAreaSujaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoAreaSujaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbCliente;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField tfPeso;
    // End of variables declaration//GEN-END:variables
}
