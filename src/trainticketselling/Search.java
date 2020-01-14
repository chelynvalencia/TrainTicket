package trainticketselling;

import trainticketselling.DataPT_KAC;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;
import java.util.*;

public class Search extends DataPT_KAC {
    JFrame ViewFrame;
    JPanel ViewPanel;
    int x;
    
    public Search(){
        SearchData();
    }
    
    @Override
    public void SearchData(){
        JLabel RouteCode, Departure, Destination, Date, SeatNumber, Name, Qty, TotalPrice, Cash, Change;
        JButton btn_close, btn_search;
        final JTextArea txt_routecode, txt_departure, txt_destination, txt_date, txt_seatnumber, txt_name, txt_qty, txt_totalprice, txt_cash, txt_change;
        JRadioButton Fe,Ma,M,S;
        ButtonGroup bt,bt2;
        ViewFrame = new JFrame();
        ViewPanel = new JPanel();     
        RouteCode = new JLabel("Route Code");
        Departure = new JLabel("Departure");
        Destination = new JLabel("Destination");
        Date = new JLabel("Date");
        SeatNumber = new JLabel("Seat Number");
        Name = new JLabel("Passenger Name");
        Qty = new JLabel("Qty");
        TotalPrice = new JLabel("Total Price");
        Cash = new JLabel("Cash");
        Change = new JLabel("Change");

        txt_routecode = new JTextArea(1,10);
        txt_departure = new JTextArea(1,20);
        txt_departure.setEditable(false);
        txt_destination = new JTextArea(1,20);
        txt_destination.setEditable(false);
        txt_date = new JTextArea(1,10);
        txt_date.setEditable(false);
        txt_seatnumber = new JTextArea(1,20);
        txt_seatnumber.setEditable(false);
        txt_name = new JTextArea(1,20);
        txt_name.setEditable(false);
        txt_qty = new JTextArea(1,20);
        txt_qty.setEditable(false);
        txt_totalprice = new JTextArea(1,20);
        txt_totalprice.setEditable(false);
        txt_cash = new JTextArea(1,20);
        txt_cash.setEditable(false);
        txt_change = new JTextArea(1,20);
        txt_change.setEditable(false);
  
        btn_close = new JButton("Close");
        btn_close.addActionListener(new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent a){
                ViewFrame.setVisible(false);}
        });
        btn_search = new JButton("Search");
        btn_search.addActionListener(new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent b){
                try {
                for (x=0;x<=n;x++){
                    if(nInt[x][0]== Integer.parseInt(txt_routecode.getText()) ){
                    txt_departure.setText(nString[x][0]);
                    txt_destination.setText(nString[x][1]);
                    txt_date.setText(nString[x][2]+" "+nString[x][3]+", 2019");
                    txt_seatnumber.setText(String.valueOf(nInt[x][1]));
                    txt_name.setText(nString[x][4]);
                    txt_qty.setText(String.valueOf(nInt[x][2]));
                    txt_totalprice.setText(String.valueOf(nInt[x][3]));
                    txt_cash.setText(String.valueOf(nInt[x][4]));
                    txt_change.setText(String.valueOf(nInt[x][5]));}
            }
        }              
        catch(Exception e){            
        }
        }});
    
        ViewFrame.setTitle("Search Data");
        ViewFrame.setVisible(true);
        ViewFrame.setSize(600,600);
        ViewFrame.add(ViewPanel);
    
        ViewFrame.setLayout(new GridBagLayout());
        GridBagConstraints xy = new GridBagConstraints();
    
        xy.gridx=0;
        xy.gridy=1;
        xy.fill=xy.HORIZONTAL;
        xy.weighty=0.1;
        ViewFrame.add(RouteCode,xy);
    
        xy.gridx=1;
        xy.gridy=1;
        ViewFrame.add(txt_routecode,xy);
    
        xy.gridx=1;
        xy.gridy=2;
        ViewFrame.add(btn_search,xy);
    
        xy.gridx=0;
        xy.gridy=3;
        ViewFrame.add(Departure,xy);
    
        xy.gridx=1;
        xy.gridy=3;
        ViewFrame.add(txt_departure,xy);
    
        xy.gridx=0;
        xy.gridy=4;
        ViewFrame.add(Destination,xy);
    
        xy.gridx=1;
        xy.gridy=4;
        ViewFrame.add(txt_destination,xy);
    
        xy.gridx=0;
        xy.gridy=5;
        ViewFrame.add(Date,xy);
    
        xy.gridx=1;
        xy.gridy=5;
        ViewFrame.add(txt_date,xy);
    
        xy.gridx=0;
        xy.gridy=6;
        ViewFrame.add(SeatNumber,xy);
    
        xy.gridx=1;
        xy.gridy=6;
        ViewFrame.add(txt_seatnumber,xy);
        
        xy.gridx=0;
        xy.gridy=7;
        ViewFrame.add(Name,xy);
    
        xy.gridx=1;
        xy.gridy=7;
        ViewFrame.add(txt_name,xy);
        
        xy.gridx=0;
        xy.gridy=8;
        ViewFrame.add(Qty,xy);
    
        xy.gridx=1;
        xy.gridy=8;
        ViewFrame.add(txt_qty,xy);
        
        xy.gridx=0;
        xy.gridy=9;
        ViewFrame.add(TotalPrice,xy);
    
        xy.gridx=1;
        xy.gridy=9;
        ViewFrame.add(txt_totalprice,xy);
        
        xy.gridx=0;
        xy.gridy=10;
        ViewFrame.add(Cash,xy);
    
        xy.gridx=1;
        xy.gridy=10;
        ViewFrame.add(txt_cash,xy);
        
        xy.gridx=0;
        xy.gridy=11;
        ViewFrame.add(Change,xy);
    
        xy.gridx=1;
        xy.gridy=11;
        ViewFrame.add(txt_change,xy);
   
        xy.gridx=1;
        xy.gridy=12;
        xy.anchor=xy.CENTER;
        ViewFrame.add(btn_close,xy);
    
}
    public static void main(String[] args) {
        // TODO code application logic here
       Search ts = new Search();
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
