

package org.example.FrameHandler;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import org.example.ProgramHandler.MethodHandler;

public class Frame extends JFrame implements ActionListener {
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
    static MethodHandler mh = new MethodHandler();
    Boolean f = true;

    public Frame() {
        this.initComponents();
        this.addevent();
    }

    private void initComponents() {
        this.textField1 = new JTextField();
        this.PowerOf = new JButton();
        this.Reset = new JButton();
        this.Back = new JButton();
        this.Divison = new JButton();
        this.seven = new JButton();
        this.four = new JButton();
        this.one = new JButton();
        this.button8 = new JButton();
        this.eight = new JButton();
        this.five = new JButton();
        this.two = new JButton();
        this.zero = new JButton();
        this.nine = new JButton();
        this.six = new JButton();
        this.three = new JButton();
        this.decimal = new JButton();
        this.multi = new JButton();
        this.minus = new JButton();
        this.add = new JButton();
        this.equal = new JButton();
        Container contentPane = this.getContentPane();
        contentPane.setLayout((LayoutManager)null);
        this.textField1.setEditable(false);
        this.textField1.setFont(this.textField1.getFont().deriveFont(this.textField1.getFont().getStyle() | 1, (float)this.textField1.getFont().getSize() + 20.0F));
        contentPane.add(this.textField1);
        this.textField1.setBounds(0, 5, 420, 110);
        this.PowerOf.setText("^");
        this.PowerOf.setBackground(new Color(16724736));
        this.PowerOf.setForeground(new Color(16764057));
        this.PowerOf.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.PowerOf);
        this.PowerOf.setBounds(0, 115, 105, 75);
        this.Reset.setText("C");
        this.Reset.setBackground(new Color(16724736));
        this.Reset.setForeground(new Color(16764057));
        this.Reset.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.Reset);
        this.Reset.setBounds(105, 115, 105, 75);
        this.Back.setText("Back");
        this.Back.setBackground(new Color(16724736));
        this.Back.setForeground(new Color(16764057));
        this.Back.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.Back);
        this.Back.setBounds(210, 115, 105, 75);
        this.Divison.setText("÷");
        this.Divison.setBackground(new Color(16724736));
        this.Divison.setForeground(new Color(16764057));
        this.Divison.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.Divison);
        this.Divison.setBounds(315, 115, 105, 75);
        this.seven.setText("7");
        this.seven.setBackground(new Color(16724736));
        this.seven.setForeground(new Color(16764057));
        this.seven.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.seven);
        this.seven.setBounds(0, 195, 105, 75);
        this.four.setText("4");
        this.four.setBackground(new Color(16724736));
        this.four.setForeground(new Color(16764057));
        this.four.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.four);
        this.four.setBounds(0, 275, 105, 75);
        this.one.setText("1");
        this.one.setBackground(new Color(16724736));
        this.one.setForeground(new Color(16764057));
        this.one.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.one);
        this.one.setBounds(0, 355, 105, 75);
        this.button8.setBackground(new Color(16724736));
        this.button8.setForeground(new Color(16764057));
        this.button8.setFont(new Font("Inter Semi Bold", 1, 18));
        this.button8.setText("()");
        contentPane.add(this.button8);
        this.button8.setBounds(0, 435, 105, 75);
        this.eight.setText("8");
        this.eight.setBackground(new Color(16724736));
        this.eight.setForeground(new Color(16764057));
        this.eight.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.eight);
        this.eight.setBounds(105, 195, 105, 75);
        this.five.setText("5");
        this.five.setBackground(new Color(16724736));
        this.five.setForeground(new Color(16764057));
        this.five.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.five);
        this.five.setBounds(105, 275, 105, 75);
        this.two.setText("2");
        this.two.setBackground(new Color(16724736));
        this.two.setForeground(new Color(16764057));
        this.two.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.two);
        this.two.setBounds(105, 355, 105, 75);
        this.zero.setText("0");
        this.zero.setBackground(new Color(16724736));
        this.zero.setForeground(new Color(16764057));
        this.zero.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.zero);
        this.zero.setBounds(105, 435, 105, 75);
        this.nine.setText("9");
        this.nine.setBackground(new Color(16724736));
        this.nine.setForeground(new Color(16764057));
        this.nine.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.nine);
        this.nine.setBounds(210, 195, 105, 75);
        this.six.setText("6");
        this.six.setBackground(new Color(16724736));
        this.six.setForeground(new Color(16764057));
        this.six.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.six);
        this.six.setBounds(210, 275, 105, 75);
        this.three.setText("3");
        this.three.setBackground(new Color(16724736));
        this.three.setForeground(new Color(16764057));
        this.three.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.three);
        this.three.setBounds(210, 355, 105, 75);
        this.decimal.setText(".");
        this.decimal.setBackground(new Color(16724736));
        this.decimal.setForeground(new Color(16764057));
        this.decimal.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.decimal);
        this.decimal.setBounds(210, 435, 105, 75);
        this.multi.setText("X");
        this.multi.setBackground(new Color(16724736));
        this.multi.setForeground(new Color(16764057));
        this.multi.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.multi);
        this.multi.setBounds(315, 195, 105, 75);
        this.minus.setBackground(new Color(16724736));
        this.minus.setForeground(new Color(16764057));
        this.minus.setFont(new Font("Inter Semi Bold", 1, 18));
        this.minus.setText("-");
        contentPane.add(this.minus);
        this.minus.setBounds(315, 275, 105, 75);
        this.add.setBackground(new Color(16724736));
        this.add.setForeground(new Color(16764057));
        this.add.setFont(new Font("Inter Semi Bold", 1, 18));
        this.add.setText("+");
        contentPane.add(this.add);
        this.add.setBounds(315, 355, 105, 75);
        this.equal.setText("=");
        this.equal.setBackground(new Color(16724736));
        this.equal.setForeground(new Color(16764057));
        this.equal.setFont(new Font("Inter Semi Bold", 1, 18));
        contentPane.add(this.equal);
        this.equal.setBounds(315, 435, 105, 75);
        Dimension preferredSize = new Dimension();

        for(int i = 0; i < contentPane.getComponentCount(); ++i) {
            Rectangle bounds = contentPane.getComponent(i).getBounds();
            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
        }

        Insets insets = contentPane.getInsets();
        preferredSize.width += insets.right;
        preferredSize.height += insets.bottom;
        contentPane.setMinimumSize(preferredSize);
        contentPane.setPreferredSize(preferredSize);
        this.pack();
        this.setLocationRelativeTo(this.getOwner());
    }

    public void addevent() {
        this.PowerOf.addActionListener(this);
        this.Reset.addActionListener(this);
        this.Back.addActionListener(this);
        this.Divison.addActionListener(this);
        this.seven.addActionListener(this);
        this.four.addActionListener(this);
        this.one.addActionListener(this);
        this.button8.addActionListener(this);
        this.eight.addActionListener(this);
        this.five.addActionListener(this);
        this.two.addActionListener(this);
        this.zero.addActionListener(this);
        this.nine.addActionListener(this);
        this.six.addActionListener(this);
        this.three.addActionListener(this);
        this.decimal.addActionListener(this);
        this.multi.addActionListener(this);
        this.minus.addActionListener(this);
        this.add.addActionListener(this);
        this.equal.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        String t = this.textField1.getText();
        if (t.toString().equals(mh.GetErrorMessage())) {
            this.textField1.setText("");
        } else {
            if (b == this.button8) {
                if (this.f) {
                    this.textField1.setText(t + "(");
                    this.f = false;
                } else {
                    this.textField1.setText(t + ")");
                    this.f = true;
                }
            }

            if (b == this.zero) {
                this.textField1.setText(t + "0");
            }

            if (b == this.one) {
                this.textField1.setText(t + "1");
            }

            if (b == this.two) {
                this.textField1.setText(t + "2");
            }

            if (b == this.three) {
                this.textField1.setText(t + "3");
            }

            if (b == this.four) {
                this.textField1.setText(t + "4");
            }

            if (b == this.five) {
                this.textField1.setText(t + "5");
            }

            if (b == this.six) {
                this.textField1.setText(t + "6");
            }

            if (b == this.seven) {
                this.textField1.setText(t + "7");
            }

            if (b == this.eight) {
                this.textField1.setText(t + "8");
            }

            if (b == this.nine) {
                this.textField1.setText(t + "9");
            }

            if (b == this.decimal && !mh.getifoperatorbefore(t)) {
                this.textField1.setText(t + ".");
            }

            if (!t.isEmpty()) {
                if (b == this.minus && !mh.getifoperatorbefore(t)) {
                    this.textField1.setText(t + "-");
                }

                if (b == this.add && !mh.getifoperatorbefore(t)) {
                    this.textField1.setText(t + "+");
                }

                if (b == this.Divison && !mh.getifoperatorbefore(t)) {
                    this.textField1.setText(t + "/");
                }

                if (b == this.PowerOf && !mh.getifoperatorbefore(t)) {
                    this.textField1.setText(t + "^");
                }

                if (b == this.multi && !mh.getifoperatorbefore(t)) {
                    this.textField1.setText(t + "*");
                }

                if (b == this.equal && !t.isEmpty()) {
                    this.textField1.setText(mh.Calculate(t));
                }

                if (b == this.Reset) {
                    this.textField1.setText("");
                    this.f = true;
                }

                if (b == this.Back && t != null && !t.trim().isEmpty()) {
                    if (t.charAt(t.length() - 1) == '(') {
                        this.f = true;
                    } else if (t.charAt(t.length() - 1) == ')') {
                        this.f = false;
                    }

                    this.textField1.setText(t.substring(0, t.length() - 1));
                }
            }
        }

    }
}
