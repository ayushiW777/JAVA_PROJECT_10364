import java.util.Scanner;
import java.awt.Button;
import java.io.*;
import java.lang.classfile.Label;
import java.net.*;
import javax.swing.*;


class WeatherData {
    private double temperature;
    private double humidity; 

    WeatherData(double temperature, double humidity){
        this.temperature=temperature;
        this.humidity=humidity;
    }

    static String checkAlert(double temperature, double humidity){
        if(temperature>40 && humidity>80 ){
            return "High Temperature Alert and High Humidity Alert";
        }
        else if(temperature<10 && humidity>80){
            return "Low Temperature Alert and High Humidity Alert";
        }
        else if(humidity>80){
            return "High Humidity Alert";
        }
        else if(temperature>40){
            return "High Temperature Alert" ;
        }
        else if(temperature<10){
            return "Low Temperature Alert";
        }
        else{
            return "Weather is Normal";
        }
     
       

    }

    

    


    String displayOutput(){

        return "Weather Report : \n" +
        "Temperature : " + temperature + "\u2103 \n" +
        "Humidity : "+humidity+"% \n" +
        "Alert : \n" + checkAlert(temperature, humidity) ;
    }
}




public class WeatherApp{
    public static void main(String[] args) {
 

    
    JFrame frame=new JFrame();
    JButton b=new JButton("CLICK HERE TO START");
    b.setBounds(300,300,300,300);
    frame.add(b);
    frame.setSize(1000,4000);
    frame.setLayout(null);
    frame.setVisible(true);

    JLabel label=new JLabel("Enter Temperature :");
    JTextField tInput= new JTextField("Temperature");
    label.setBounds(50, 100,   100,40);
    tInput.setBounds(100,150,200,40);
    tInput.setVisible(false);
    label.setVisible(false);
    frame.add(tInput);
    frame.add(label);

    JLabel label2=new JLabel("Enter Humidity :");
    JTextField hInput= new JTextField("Humidity");
    label2.setBounds(50, 200,100,  40);
    hInput.setBounds(100,250,200,   40);
    hInput.setVisible(false);
    label2.setVisible(false);
    frame.add(hInput);
    frame.add(label2);

    
    JLabel label3=new JLabel("Click for analysis !");
    JButton but=new JButton("Analysis!");
    but.setBounds(200, 300, 100, 50);
    but.setVisible(false);
    label3.setVisible(false);
    frame.add(but);
    frame.add(label3);

    
    JTextArea label4=new JTextArea();
    label4.setBounds(100,400,400,100);
    frame.add(label4);
    label4.setEditable(false);
    label4.setVisible(false);

    JLabel label5=new JLabel();
    label5.setBounds(100,470,400,30);
    
    frame.add(label5);

    

    b.addActionListener(e -> {
        tInput.setVisible(true);
        b.setVisible(false);
        label.setVisible(true);
        label2.setVisible(true);
        hInput.setVisible(true);
        but.setVisible(true);
        label3.setVisible(true);
        label4.setVisible(true);
    });

    tInput.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent e){
            tInput.setText("");
            
        }
    
    });
    hInput.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent e){
            hInput.setText("");
            
        }
    
    });

    but.addActionListener(e -> {
        double hum=Double.parseDouble(hInput.getText());
        double temp=Double.parseDouble(tInput.getText());
        WeatherData wd=new WeatherData(temp, hum);  
        label4.setText(wd.displayOutput());
        
    });
       

    
   
    

    }

}
