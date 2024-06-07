import java.io.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Button {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Creating instance of JFrame
        JFrame frame = new JFrame();
 
        // Creating instance of JButton
        JButton button = new JButton();
        JButton button2 = new JButton();
 
        // x axis, y axis, width, height
        button.setBounds(150, 200, 220, 50);
        button2.setBounds(100, 100, 220, 50);
 
        // adding button in JFrame
        frame.add(button);
        frame.add(button2);
 
        // 400 width and 500 height
        frame.setSize(500, 600);
 
        // using no layout managers
        frame.setLayout(null);
 
        // making the frame visible
        frame.setVisible(true);
       //makes Button 
        button.addActionListener(new ActionListener() {
        @Override 
            public void actionPerformed(ActionEvent e) {
            System.out.print("1");
            }
        });
        
        button2.addActionListener(new ActionListener() {
        @Override 
            public void actionPerformed(ActionEvent e) {
            System.out.print("2");
            }
        });
    }
}