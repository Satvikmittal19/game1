package com.example.gameui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JButton button11;
    JPanel panel;


    myFrame() {

        button2 = new JButton();
        button2.setBounds(400, 0, 100, 50);
        button2.addActionListener(this);
        button2.setBackground(Color.cyan);
        button2.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        button2.setText("UP");
        button2.setFocusable(false);
        button3 = new JButton();
        button3.setBounds(500, 0, 100, 50);
        button3.addActionListener(this);
        button3.setBackground(Color.cyan);
        button3.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        button3.setText("DOWN");
        button3.setFocusable(false);
        button4 = new JButton();
        button4.setBounds(600, 0, 100, 50);
        button4.addActionListener(this);
        button4.setBackground(Color.cyan);
        button4.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        button4.setText("RIGHT");
        button4.setFocusable(false);
        button5 = new JButton();
        button5.setBounds(700, 0, 100, 50);
        button5.addActionListener(this);
        button5.setBackground(Color.cyan);
        button5.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        button5.setText("LEFT");
        button5.setFocusable(false);
        button6 = new JButton();
        button6.setBounds(0, 0, 100, 50);
        button6.addActionListener(this);
        button6.setBackground(Color.cyan);
        button6.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        button6.setText("animal");
        button6.setFocusable(false);
        button7 = new JButton();
        button7.setBounds(0, 50, 100, 50);
        button7.addActionListener(this);
        button7.setBackground(Color.cyan);
        button7.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        button7.setText("football");
        button7.setFocusable(false);
        button8 = new JButton();
        button8.setBounds(0, 100, 100, 50);
        button8.setBackground(Color.cyan);
        button8.addActionListener(this);
        button8.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        button8.setText("PLANTS");
        button8.setFocusable(false);
        button9 = new JButton();
        button9.setBounds(0, 200, 100, 50);
        button9.addActionListener(this);
        button9.setBackground(Color.cyan);
        button9.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        button9.setText("EASY");
        button9.setFocusable(false);
        button10 = new JButton();
        button10.setBounds(0, 300, 100, 50);
        button10.addActionListener(this);
        button10.setBackground(Color.cyan);
        button10.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        button10.setText("MEDIUM");
        button10.setFocusable(false);
        button11 = new JButton();
        button11.setBounds(0, 400, 100, 50);
        button11.addActionListener(this);
        button11.setBackground(Color.cyan);
        button11.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        button11.setText("HARD");
        button11.setFocusable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        ImageIcon image =new ImageIcon("dv sir.jpg");
        this.setIconImage(image.getImage());
        this.setSize(500, 500);
        this.setBackground(Color.DARK_GRAY);
        this.setVisible(true);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.add(button10);
        this.add(button11);
        JPanel= new JPanel();
        panel.setBounds(50,0,500,100);
        panel.setBackground(Color.ORANGE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button9)
            System.out.println("EASY");
        if (e.getSource() == button10)
            System.out.println("MEDIUM");
        if (e.getSource() == button11)
            System.out.println("HARD");
    }
}
