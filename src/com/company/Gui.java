package com.company;

import javax.swing.JOptionPane;

public class Gui {
    public static void main(String [] args){
        String fn = JOptionPane.showInputDialog("Enter the first number");
        String ln = JOptionPane.showInputDialog("Enter the second number");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(ln);

        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "the answer is: " +sum, "the title is", JOptionPane.PLAIN_MESSAGE);
    }
}
