/*
 * Created by JFormDesigner on Fri Jul 25 17:39:27 CEST 2025
 */

package org.example.FrameHandler;

import org.example.ProgramHandler.MethodHandler;
import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author valte
 */
public class Frame extends JFrame  implements ActionListener {

    public Frame() {
        initComponents();
        addevent();
    }

    private void initComponents() {

        textField1 = new JTextField();
        PowerOf = new JButton();
        Reset = new JButton();
        Back = new JButton();
        Divison = new JButton();
        seven = new JButton();
        four = new JButton();
        one = new JButton();
        button8 = new JButton();
        eight = new JButton();
        five = new JButton();
        two = new JButton();
        zero = new JButton();
        nine = new JButton();
        six = new JButton();
        three = new JButton();
        decimal = new JButton();
        multi = new JButton();
        minus = new JButton();
        add = new JButton();
        equal = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- textField1 ----
        textField1.setEditable(false);
        textField1.setFont(textField1.getFont().deriveFont(textField1.getFont().getStyle() | Font.BOLD, textField1.getFont().getSize() + 20f));
        contentPane.add(textField1);
        textField1.setBounds(0, 5, 420, 110);

        //---- PowerOf ----
        PowerOf.setText("^");
        PowerOf.setBackground(new Color(0xff3300));
        PowerOf.setForeground(new Color(0xffcc99));
        PowerOf.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(PowerOf);
        PowerOf.setBounds(0, 115, 105, 75);

        //---- Reset ----
        Reset.setText("C");
        Reset.setBackground(new Color(0xff3300));
        Reset.setForeground(new Color(0xffcc99));
        Reset.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(Reset);
        Reset.setBounds(105, 115, 105, 75);

        //---- Back ----
        Back.setText("Back");
        Back.setBackground(new Color(0xff3300));
        Back.setForeground(new Color(0xffcc99));
        Back.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(Back);
        Back.setBounds(210, 115, 105, 75);

        //---- Divison ----
        Divison.setText("\u00f7");
        Divison.setBackground(new Color(0xff3300));
        Divison.setForeground(new Color(0xffcc99));
        Divison.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(Divison);
        Divison.setBounds(315, 115, 105, 75);

        //---- seven ----
        seven.setText("7");
        seven.setBackground(new Color(0xff3300));
        seven.setForeground(new Color(0xffcc99));
        seven.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(seven);
        seven.setBounds(0, 195, 105, 75);

        //---- four ----
        four.setText("4");
        four.setBackground(new Color(0xff3300));
        four.setForeground(new Color(0xffcc99));
        four.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(four);
        four.setBounds(0, 275, 105, 75);

        //---- one ----
        one.setText("1");
        one.setBackground(new Color(0xff3300));
        one.setForeground(new Color(0xffcc99));
        one.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(one);
        one.setBounds(0, 355, 105, 75);

        //---- button8 ----
        button8.setBackground(new Color(0xff3300));
        button8.setForeground(new Color(0xffcc99));
        button8.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        button8.setText("()");
        contentPane.add(button8);
        button8.setBounds(0, 435, 105, 75);

        //---- eight ----
        eight.setText("8");
        eight.setBackground(new Color(0xff3300));
        eight.setForeground(new Color(0xffcc99));
        eight.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(eight);
        eight.setBounds(105, 195, 105, 75);

        //---- five ----
        five.setText("5");
        five.setBackground(new Color(0xff3300));
        five.setForeground(new Color(0xffcc99));
        five.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(five);
        five.setBounds(105, 275, 105, 75);

        //---- two ----
        two.setText("2");
        two.setBackground(new Color(0xff3300));
        two.setForeground(new Color(0xffcc99));
        two.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(two);
        two.setBounds(105, 355, 105, 75);

        //---- zero ----
        zero.setText("0");
        zero.setBackground(new Color(0xff3300));
        zero.setForeground(new Color(0xffcc99));
        zero.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(zero);
        zero.setBounds(105, 435, 105, 75);

        //---- nine ----
        nine.setText("9");
        nine.setBackground(new Color(0xff3300));
        nine.setForeground(new Color(0xffcc99));
        nine.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(nine);
        nine.setBounds(210, 195, 105, 75);

        //---- six ----
        six.setText("6");
        six.setBackground(new Color(0xff3300));
        six.setForeground(new Color(0xffcc99));
        six.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(six);
        six.setBounds(210, 275, 105, 75);

        //---- three ----
        three.setText("3");
        three.setBackground(new Color(0xff3300));
        three.setForeground(new Color(0xffcc99));
        three.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(three);
        three.setBounds(210, 355, 105, 75);

        //---- decimal ----
        decimal.setText(".");
        decimal.setBackground(new Color(0xff3300));
        decimal.setForeground(new Color(0xffcc99));
        decimal.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(decimal);
        decimal.setBounds(210, 435, 105, 75);

        //---- multi ----
        multi.setText("X");
        multi.setBackground(new Color(0xff3300));
        multi.setForeground(new Color(0xffcc99));
        multi.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(multi);
        multi.setBounds(315, 195, 105, 75);

        //---- minus ----
        minus.setBackground(new Color(0xff3300));
        minus.setForeground(new Color(0xffcc99));
        minus.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        minus.setText("-");
        contentPane.add(minus);
        minus.setBounds(315, 275, 105, 75);

        //---- add ----
        add.setBackground(new Color(0xff3300));
        add.setForeground(new Color(0xffcc99));
        add.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        add.setText("+");
        contentPane.add(add);
        add.setBounds(315, 355, 105, 75);

        //---- equal ----
        equal.setText("=");
        equal.setBackground(new Color(0xff3300));
        equal.setForeground(new Color(0xffcc99));
        equal.setFont(new Font("Inter Semi Bold", Font.BOLD, 18));
        contentPane.add(equal);
        equal.setBounds(315, 435, 105, 75);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - ballekuk
    public JTextField textField1;
    public JButton PowerOf;
    public JButton Reset;
    public JButton Back;
    public JButton Divison;
    public JButton seven;
    public JButton four;
    public JButton one;
    public JButton button8;
    public JButton eight;
    public JButton five;
    public JButton two;
    public JButton zero;
    public JButton nine;
    public JButton six;
    public JButton three;
    public JButton decimal;
    public JButton multi;
    public JButton minus;
    public JButton add;
    public JButton equal;



public void addevent() {
        PowerOf.addActionListener(this);
        Reset.addActionListener(this);
        Back.addActionListener(this);
        Divison.addActionListener(this);
        seven.addActionListener(this);
        four.addActionListener(this);
        one.addActionListener(this);
        button8.addActionListener(this);
        eight.addActionListener(this);
        five.addActionListener(this);
        two.addActionListener(this);
        zero.addActionListener(this);
        nine.addActionListener(this);
        six.addActionListener(this);
        three.addActionListener(this);
        decimal.addActionListener(this);
        multi.addActionListener(this);
        minus.addActionListener(this);
        add.addActionListener(this);
        equal.addActionListener(this);

    }
    static  MethodHandler mh = new MethodHandler();
    Boolean f = true;

    public void actionPerformed(ActionEvent e) {

        JButton b = (JButton) e.getSource();
        String t = textField1.getText();
        //check for error message if there is one it clears the screen
        if  (t.toString().equals(mh.GetErrorMessage())) {
            textField1.setText("");

        }  else  {

        if (b == button8) {
            //easy way for the program to know if there already is a opening and if its closed
            if(f) {
                textField1.setText(t + "(");
                f = false;
            } else  {
                textField1.setText(t + ")");
                f = true;
            }
        }

        if (b == zero ) {
            textField1.setText(t + "0");
        }

        if(b == one) {
            textField1.setText(t + "1");
        }
        if(b == two) {
            textField1.setText(t + "2");
        }
        if(b == three) {
            textField1.setText(t + "3");
        }
        if(b == four) {
            textField1.setText(t + "4");
        }
        if(b == five) {
            textField1.setText(t + "5");
        }
        if(b == six) {
            textField1.setText(t + "6");
        }
        if(b == seven) {
            textField1.setText(t + "7");
        }
        if(b == eight) {
            textField1.setText(t + "8");
        }
        if(b == nine    ) {
            textField1.setText(t + "9");
        }
        if(b == decimal  &&  !mh.getifoperatorbefore(t) ) {
            textField1.setText(t + ".");
        }
            //stop the null point error because i check the one behind to stop dupes of operatos
            if(!t.isEmpty()) {

        if(b == minus  &&  !mh.getifoperatorbefore(t)) {
            textField1.setText(t + "-");
        }
        if(b == add  &&  !mh.getifoperatorbefore(t)) {
            textField1.setText(t + "+");
        }
        if(b == Divison  &&  !mh.getifoperatorbefore(t)) {
            textField1.setText(t + "/");
        }
        if(b == PowerOf  &&  !mh.getifoperatorbefore(t)) {
            textField1.setText(t + "^");
        }
        if(b == multi &&  !mh.getifoperatorbefore(t) ) {
            textField1.setText(t + "*");
        }

        if(b == equal ) {

            if(!t.isEmpty()) {
                //check if the input gave error if it does display error then wait 5 sec and clear the display
                textField1.setText(mh.Calculate(t));
            }



        }

        if(b == Reset) {
            textField1.setText("");
            f = true;
        }

        if(b == Back) {
            if(t!= null && !t.trim().isEmpty()) {
                //sets the open and close check to the right one
                if (t.charAt(t.length() - 1) == '(') f = true;  else  if(t.charAt(t.length() - 1) == ')') f =false;

                textField1.setText(t.substring(0, t.length() -1));
            }
        }

        }
            }

}
        }







    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:onm






