package trainticketselling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.lang.NullPointerException;

public class Form extends javax.swing.JFrame {
    int bussiness, economy, price, qty, totalprice, cash, change;
    int z, x;
    
    public Form() {
        initComponents();
        this.setLocationRelativeTo(null); //center form in the sreen
        System.out.println(DataPT_KAC.n);
        Data();
        Button();
    }
    
    public void Data() {
        destination.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent b){
            if(destination.getSelectedItem().equals("Choose Destination")) {
            buttonGroup1.clearSelection();
            txt_price.setText("");
            }
            else if(destination.getSelectedItem().equals("Banyuwangi")) {
            bussiness=540000;
            economy=440000;
            }
            else if(destination.getSelectedItem().equals("Surabaya")) {
            bussiness=450000;
            economy=230000;
            }
            else if(destination.getSelectedItem().equals("Yogyakarta")) {
            bussiness=430000;
            economy=200000;
            }
            else if(destination.getSelectedItem().equals("Solo")) {
            bussiness=400000;
            economy=260000;
            }
            else if(destination.getSelectedItem().equals("Boyolali")) {
            bussiness=360000;
            economy=240000;
            }
            else if(destination.getSelectedItem().equals("Semarang")) {
            bussiness=335000;
            economy=200000;
            }
            else if(destination.getSelectedItem().equals("Tegal")) {
            bussiness=30000;
            economy=190000;
            }
            else if(destination.getSelectedItem().equals("Brebes")) {
            bussiness=280000;
            economy=175000;
            }
            else if(destination.getSelectedItem().equals("Cirebon")) {
            bussiness=275000;
            economy=150000;
            }
            else if(destination.getSelectedItem().equals("Tasikmalaya")) {
            bussiness=250000;
            economy=145000;
            }
            else if(destination.getSelectedItem().equals("Bandung")) {
            bussiness=245000;
            economy=12000;
            }
            else if(destination.getSelectedItem().equals("Depok")) {
            bussiness=10000;
            economy=50000;
            }}
        });
        rb_bussiness.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent b){
                if(rb_bussiness.isSelected()){
                txt_price.setText(String.valueOf(bussiness));}}
        });
        rb_economy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent b){
                if(rb_economy.isSelected()){
                txt_price.setText(String.valueOf(economy));}}
        });
        txt_cash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent b){
                cash=Integer.parseInt(txt_cash.getText());
                change=Integer.parseInt(txt_totalprice.getText());
                totalprice=cash-change;
                txt_change.setText(String.valueOf(totalprice));}
        });
        txt_qty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent b){
                qty=Integer.parseInt(txt_qty.getText());
                price=Integer.parseInt(txt_price.getText());
                totalprice=cash*price;
                txt_totalprice.setText(String.valueOf(totalprice));}
        });
    }
    
    public void Button() {
        btn_submit.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent b){
               {for(z=0;z<=DataPT_KAC.n;z++){
                   if(DataPT_KAC.nInt[z][0] == Integer.parseInt(txt_routecode.getText())){
                       txt_routecode.setText("This route code has already existed");
                       x=1;
                   }
                   else {
                       DataPT_KAC.nString[DataPT_KAC.n][0] = (String) departure.getSelectedItem();
                       DataPT_KAC.nString[DataPT_KAC.n][1] = (String) destination.getSelectedItem();
                       DataPT_KAC.nString[DataPT_KAC.n][2] = (String) month.getSelectedItem();
                       DataPT_KAC.nString[DataPT_KAC.n][3] = (String) day.getSelectedItem();
                       DataPT_KAC.nInt[DataPT_KAC.n][1] = Integer.parseInt(txt_seatnumber.getText());
                       DataPT_KAC.nString[DataPT_KAC.n][4] = txt_name.getText();
                       DataPT_KAC.nInt[DataPT_KAC.n][2] = Integer.parseInt(txt_qty.getText());
                       DataPT_KAC.nInt[DataPT_KAC.n][3] = Integer.parseInt(txt_totalprice.getText());
                       DataPT_KAC.nInt[DataPT_KAC.n][4] = Integer.parseInt(txt_cash.getText());
                       DataPT_KAC.nInt[DataPT_KAC.n][5] = Integer.parseInt(txt_change.getText());
                   }
               }
               DataPT_KAC.nInt[DataPT_KAC.n][0] = Integer.parseInt(txt_routecode.getText());
               DataPT_KAC.n = DataPT_KAC.n + 1;
               new Receipt().setVisible(true);
               }} 
        });
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        btng_class = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        destination = new javax.swing.JComboBox<>();
        rb_bussiness = new javax.swing.JRadioButton();
        rb_economy = new javax.swing.JRadioButton();
        txt_price = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        departure = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_seatnumber = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_qty = new javax.swing.JTextField();
        txt_totalprice = new javax.swing.JTextField();
        txt_cash = new javax.swing.JTextField();
        txt_change = new javax.swing.JTextField();
        btn_reset = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_submit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txt_routecode = new javax.swing.JTextField();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), "PT. Kereta Api CCIT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Stencil", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("TRAIN TICKET FORM");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), "Train Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14), new java.awt.Color(255, 153, 153))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Destination");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Class Type");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Price");

        destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Banyuwangi", "Surabaya", "Yogyakarta", "Solo", "Boyolali", "Semarang", "Tegal", "Brebes", "Cirebon", "Tasikmalaya", "Bandung", "Depok" }));

        rb_bussiness.setBackground(new java.awt.Color(51, 51, 51));
        btng_class.add(rb_bussiness);
        rb_bussiness.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        rb_bussiness.setForeground(new java.awt.Color(204, 204, 204));
        rb_bussiness.setText("Bussiness");

        rb_economy.setBackground(new java.awt.Color(51, 51, 51));
        btng_class.add(rb_economy);
        rb_economy.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        rb_economy.setForeground(new java.awt.Color(204, 204, 204));
        rb_economy.setText("Economy");

        txt_price.setEditable(false);
        txt_price.setBackground(new java.awt.Color(108, 122, 137));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Departure");

        departure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Pasar Senen", "Gambir", "Jatinegara" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_price)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_economy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rb_bussiness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(7, 7, 7))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel2))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departure, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destination, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rb_bussiness))
                .addGap(4, 4, 4)
                .addComponent(rb_economy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Passenger Name");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Qty");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Seat Number");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Total Price");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Cash");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Change");

        txt_seatnumber.setBackground(new java.awt.Color(108, 122, 137));
        txt_seatnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_seatnumberKeyTyped(evt);
            }
        });

        txt_name.setBackground(new java.awt.Color(108, 122, 137));

        txt_qty.setBackground(new java.awt.Color(108, 122, 137));
        txt_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_qtyKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_qtyKeyReleased(evt);
            }
        });

        txt_totalprice.setEditable(false);
        txt_totalprice.setBackground(new java.awt.Color(108, 122, 137));

        txt_cash.setBackground(new java.awt.Color(108, 122, 137));
        txt_cash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cashKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cashKeyReleased(evt);
            }
        });

        txt_change.setEditable(false);
        txt_change.setBackground(new java.awt.Color(108, 122, 137));

        btn_reset.setBackground(new java.awt.Color(204, 204, 204));
        btn_reset.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(204, 204, 204));
        btn_back.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_submit.setBackground(new java.awt.Color(204, 204, 204));
        btn_submit.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        btn_submit.setText("Submit");

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), "Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14), new java.awt.Color(255, 153, 153))); // NOI18N

        day.setBackground(new java.awt.Color(204, 204, 204));
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        month.setBackground(new java.awt.Color(204, 204, 204));
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Route Code");

        txt_routecode.setBackground(new java.awt.Color(108, 122, 137));
        txt_routecode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_routecodeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_seatnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(txt_name)
                            .addComponent(txt_qty)
                            .addComponent(txt_totalprice)
                            .addComponent(txt_cash)
                            .addComponent(txt_change, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_routecode, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_routecode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_seatnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_totalprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_reset)
                            .addComponent(btn_back)
                            .addComponent(btn_submit))
                        .addGap(20, 20, 20))))
        );

        jPanel2.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtyKeyReleased
        int a, b, c;
        a=Integer.valueOf(txt_price.getText());
        b=Integer.valueOf(txt_qty.getText());
        c=a*b;
        txt_totalprice.setText(""+c);
    }//GEN-LAST:event_txt_qtyKeyReleased

    private void txt_cashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cashKeyReleased
        int a, b, c;
        a=Integer.valueOf(txt_cash.getText());
        b=Integer.valueOf(txt_totalprice.getText());
        c=a-b;
        txt_change.setText(""+c);
    }//GEN-LAST:event_txt_cashKeyReleased

    private void txt_routecodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_routecodeKeyTyped
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == '-') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_routecodeKeyTyped

    private void txt_seatnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_seatnumberKeyTyped
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_seatnumberKeyTyped

    private void txt_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtyKeyTyped
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_qtyKeyTyped

    private void txt_cashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cashKeyTyped
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_cashKeyTyped

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
               buttonGroup1.clearSelection();
               btng_class.clearSelection();
               txt_price.setText("");
               departure.setSelectedItem("Choose");
               destination.setSelectedItem("Choose");
               txt_routecode.setText("");
               day.setSelectedItem("Day");
               month.setSelectedItem("Month");
               txt_seatnumber.setText("");
               txt_name.setText("");
               txt_totalprice.setText("");
               txt_qty.setText("");
               txt_cash.setText("");
               txt_change.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        new Menu().setVisible(true);
               this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_submit;
    private javax.swing.ButtonGroup btng_class;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JComboBox<String> departure;
    private javax.swing.JComboBox<String> destination;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JRadioButton rb_bussiness;
    private javax.swing.JRadioButton rb_economy;
    private javax.swing.JTextField txt_cash;
    private javax.swing.JTextField txt_change;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JTextField txt_routecode;
    private javax.swing.JTextField txt_seatnumber;
    private javax.swing.JTextField txt_totalprice;
    // End of variables declaration//GEN-END:variables

    
    String Button(String Button) {
        return Button; //To change body of generated methods, choose Tools | Templates.
    }

    String departure(String departure) {
        return departure;
    }

    

    String destination(String destination) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return destination;
    }
    String txt_price(String txt_price) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return txt_price;
    }
    String txt_routecode(String txt_routecode) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return txt_routecode;
    }
    String txt_seatnumber(String txt_seatnumber) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return txt_seatnumber;
    }
    String txt_name(String txt_name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return txt_name;
    }
    String txt_qty(String txt_qty) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return txt_qty;
    }
    String txt_totalprice(String txt_totalprice) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return txt_totalprice;
    }
    String txt_cash(String txt_cash) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return txt_cash;
    }
    String txt_change(String txt_change) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return txt_change;
    }
    

    
}
