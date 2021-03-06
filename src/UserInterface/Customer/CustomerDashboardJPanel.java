/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Customer;
import Business.Flight;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anusha
 */
public class CustomerDashboardJPanel extends javax.swing.JPanel {

    /* Creates constructor of customer dashboard */
    private final List<Customer> customerList;
    private final JPanel cardLayoutJPanel;
    public CustomerDashboardJPanel(JPanel cardLayoutJPanel, List<Customer> customerList) {
         initComponents();
         this.customerList = customerList;
         this.cardLayoutJPanel = cardLayoutJPanel;
         populateTable();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /*Populates all customers */
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)customersTbl.getModel();
        dtm.setRowCount(0);
        
        for(Customer c : customerList){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]= c.getCstFirstName();
            row[1]= c.getCstLastName();
            row[2]= c.getCstAge();
            row[3] = c.getCstPhoneNum();
            dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customersTbl = new javax.swing.JTable();
        btnViewBookingDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Customers");

        customersTbl.setBackground(new java.awt.Color(255, 204, 102));
        customersTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Age", "Phone"
            }
        ));
        jScrollPane1.setViewportView(customersTbl);

        btnViewBookingDetails.setBackground(new java.awt.Color(255, 204, 102));
        btnViewBookingDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewBookingDetails.setText("View Booking Details");
        btnViewBookingDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        btnViewBookingDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewBookingDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBookingDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnViewBookingDetails)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(396, 396, 396)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(127, 127, 127)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnViewBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );
    }// </editor-fold>//GEN-END:initComponents
    /* Onclick of view details show booking records */
    private void btnViewBookingDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBookingDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = customersTbl.getSelectedRow();
        if(selectedRow > -1){
           Flight bookedFlight = customerList.get(selectedRow).getCstFlight();
           BookingDashboardJPanel panel = new BookingDashboardJPanel(cardLayoutJPanel, bookedFlight, customerList.get(selectedRow).getCstSeat());
           cardLayoutJPanel.add("FlightFoundDetailJPanel",panel);
           CardLayout layout = (CardLayout) cardLayoutJPanel.getLayout();
           layout.next(cardLayoutJPanel);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
    }//GEN-LAST:event_btnViewBookingDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewBookingDetails;
    private javax.swing.JTable customersTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
