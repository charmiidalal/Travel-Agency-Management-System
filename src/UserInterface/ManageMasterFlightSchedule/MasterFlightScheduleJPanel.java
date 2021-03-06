/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageMasterFlightSchedule;

import Business.Flight;
import Business.FlightDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anusha
 */
public class MasterFlightScheduleJPanel extends javax.swing.JPanel {

    /* Create constructor and flight directory */
    private final JPanel cardLayoutJPanel;
    private final FlightDirectory flightDirectory;

    public MasterFlightScheduleJPanel(JPanel cardLayoutJPanel, FlightDirectory flightDirectory) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.cardLayoutJPanel = cardLayoutJPanel;
        this.flightDirectory = flightDirectory;
        populateTable();
        timeCB.setSelectedItem("Select Option");
    }

    /* Populate flight master schedule */
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) flightTbl.getModel();
        dtm.setRowCount(0);

        for (Flight flight : flightDirectory.getFlightDir()) {
            Object[] flightNo = new Object[dtm.getColumnCount()];
            flightNo[0] = flight.getFlightOwner();
            flightNo[1] = flight.getFlightNumber();
            flightNo[2] = flight.getFlightSource();
            flightNo[3] = flight.getFlightDestination();
            flightNo[4] = flight.getFlightDepTime();
            flightNo[5] = flight.getFlightArrTime();
            flightNo[6] = flight.getFlightDuration();
            flightNo[7] = flight.getFlightDate();
            flightNo[8] = flight.getFlightTimePhase();
            dtm.addRow(flightNo);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        flightTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        destTxt = new javax.swing.JTextField();
        sourceTxt = new javax.swing.JTextField();
        dateTxt = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        timeCB = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 204, 255));

        flightTbl.setBackground(new java.awt.Color(255, 204, 102));
        flightTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Airliner", "Flight Number", "Source", "Destination", "Departure Time", "Arrival Time", "Duration", "Date", "Time of Day"
            }
        ));
        jScrollPane1.setViewportView(flightTbl);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Master Flight Information");

        jLabel2.setText("Destination:");

        jLabel3.setText("Source:");

        jLabel4.setText("Preferred time of Day:");

        jLabel5.setText("Date (dd-mm-yyyy)");

        destTxt.setBackground(new java.awt.Color(255, 204, 102));
        destTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destTxtActionPerformed(evt);
            }
        });

        sourceTxt.setBackground(new java.awt.Color(255, 204, 102));

        dateTxt.setBackground(new java.awt.Color(255, 204, 102));

        btnSearch.setBackground(new java.awt.Color(255, 204, 102));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        timeCB.setBackground(new java.awt.Color(255, 204, 102));
        timeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option", "Morning", "Afternoon", "Evening", "Night" }));
        timeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(destTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(sourceTxt)
                                    .addComponent(dateTxt)
                                    .addComponent(timeCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sourceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(timeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void destTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destTxtActionPerformed
    /* While performing search check if every details is prvided */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        if ("".equals(destTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Please Enter Destination");
            return;
        }

        if ("".equals(sourceTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Please Enter Source");
            return;
        }

        if (timeCB.getSelectedItem().equals("Select Option")) {
            JOptionPane.showMessageDialog(null, "Please Enter Preferred time of the day");
            return;
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date date = formatter.parse(dateTxt.getText());
            dateTxt.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel5.setForeground(Color.BLACK);
        } catch (ParseException e) {
            dateTxt.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel5.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please Enter date in dd-MM-yyyy format");
            return;
        }
        ArrayList<Flight> flightDirFiltered = flightDirectory.searchMaster(destTxt.getText(), timeCB.getSelectedItem().toString(), sourceTxt.getText(), dateTxt.getText());
        System.out.println(flightDirFiltered);
        FlightFilterJPanel panel = new FlightFilterJPanel(cardLayoutJPanel, flightDirFiltered);
        cardLayoutJPanel.add("FlightFoundJPanel", panel);
        CardLayout layout = (CardLayout) cardLayoutJPanel.getLayout();
        layout.next(cardLayoutJPanel);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void timeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeCBActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_timeCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTextField destTxt;
    private javax.swing.JTable flightTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sourceTxt;
    private javax.swing.JComboBox<String> timeCB;
    // End of variables declaration//GEN-END:variables
}
