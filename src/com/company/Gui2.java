package com.company;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui2 extends javax.swing.JFrame {
      private JLabel item1;

      public Gui2(){
          super("The title bar");  //ADDS THE TITLE
          setLayout(new FlowLayout());   //GIVING A DEFAULT LAYOOUT

        item1 = new JLabel("this is a sentencwe");
        item1.setToolTipText("this is goin to show up on hover");
         add(item1);
      }


}
