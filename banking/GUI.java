package banking;

import javax.swing.*;
import java.awt.*;


public class GUI {
    public GUI(){
        //okno
        JFrame frame1 = new JFrame("APLIKACJA BANKOWA");
        JPanel panel1 = new JPanel();
        frame1.setSize(280, 250);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.add(panel1);
        JLabel label1 = new JLabel("APLIKACJA BANKOWA");
        panel1.add(label1);

        //przyciski
        JButton button1 = new JButton("Logowanie");
        JButton button2 = new JButton("Stan konta");
        JButton button3 = new JButton("Wpłać");
        JButton button4 = new JButton("Wypłać");
        button1.setPreferredSize(new Dimension(150,40));
        button2.setPreferredSize(new Dimension(150,40));
        button3.setPreferredSize(new Dimension(150,40));
        button4.setPreferredSize(new Dimension(150,40));
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);

        frame1.setVisible(true);
    }



}
