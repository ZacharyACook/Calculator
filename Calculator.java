import java.io.*;
import javax.swing.*;
import java.awt.event.ActionListener;
public class Calculator {  
  
   public static void main(String[] args) {
   CalculatorEngine Engine = new CalculatorEngine();
   JFrame frame = new JFrame();
   StringBuilder sBuilder = new StringBuilder();
//TBox 
   JTextField tBox = new JTextField(" ");
   tBox.setEditable(false);
      frame.setSize(500, 600);
      frame.setLayout(null);
      frame.setVisible(true);
   //Buttons
   JButton one = new JButton("1");
   JButton two = new JButton("2");
   JButton three = new JButton("3");
   JButton four = new JButton("4");
   JButton five = new JButton("5");
   JButton six = new JButton("6");
   JButton seven = new JButton("7");
   JButton eight = new JButton("8");
   JButton nine = new JButton("9");
   JButton zero = new JButton("0");
   JButton plus = new JButton("+");
   JButton minus = new JButton("-");
   JButton divide = new JButton("%");
   JButton multiply = new JButton("*");
   JButton equals = new JButton("=");
   //add to frame
   tBox.setBounds(0,0,500,100);
   frame.add(tBox);
   //size and positions
   one.setBounds(125,350,50,50);
      frame.add(one);
   two.setBounds(175,350,50,50);
      frame.add(two);
   three.setBounds(225,350,50,50);
      frame.add(three);
   four.setBounds(125,300,50,50);
      frame.add(four);
   five.setBounds(175,300,50,50);
      frame.add(five);
   six.setBounds(225,300,50,50);
      frame.add(six);
   seven.setBounds(125,250,50,50);
      frame.add(seven);
   eight.setBounds(175,250,50,50);
      frame.add(eight);
   nine.setBounds(225,250,50,50);
      frame.add(nine);
   zero.setBounds(125,400,150,75);
      frame.add(zero);
   plus.setBounds(275,200,50,50);
      frame.add(plus);
   minus.setBounds(275,250,50,50);
      frame.add(minus);  
   divide.setBounds(275,300,50,50);
      frame.add(divide);
   multiply.setBounds(275,350,50,50);
      frame.add(multiply);   
   equals.setBounds(275,400,50,75);
      frame.add(equals);       
   
   //make Buttons
   //numbers      
   one.setActionCommand("1");
   two.setActionCommand("2");
   three.setActionCommand("3");
   four.setActionCommand("4");
   five.setActionCommand("5");
   six.setActionCommand("6");
   seven.setActionCommand("7");
   eight.setActionCommand("8");
   nine.setActionCommand("9");
   zero.setActionCommand("0");
   //maths
   plus.setActionCommand("+");
   minus.setActionCommand("-");
   divide.setActionCommand("%");
   multiply.setActionCommand("*");
   equals.setActionCommand("=");
   
   ActionListener actionListener = e -> {
   String command = e.getActionCommand();
   String sNumber = Engine.Calculate(command);
   tBox.setText(sNumber.toString());   
   };
   
   //numbers      
   one.addActionListener(actionListener);
   two.addActionListener(actionListener);
   three.addActionListener(actionListener);
   four.addActionListener(actionListener);
   five.addActionListener(actionListener);
   six.addActionListener(actionListener);
   seven.addActionListener(actionListener);
   eight.addActionListener(actionListener);
   nine.addActionListener(actionListener);
   zero.addActionListener(actionListener);
   //math
   plus.addActionListener(actionListener);
   minus.addActionListener(actionListener);
   divide.addActionListener(actionListener);
   multiply.addActionListener(actionListener);
   equals.addActionListener(actionListener);
 }

}