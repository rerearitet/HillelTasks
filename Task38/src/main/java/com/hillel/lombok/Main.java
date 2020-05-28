package com.hillel.lombok;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    private JButton button = new JButton("+");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Usage: + USD 100 10 / - USD 500 / ?");
    private JLabel label2 = new JLabel("Input: ");
    private ATM atm = new ATM(" ");

    public Main() {
        super("ATM");
        this.setBounds(50,100,250,110);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4,2,2,2));
        container.add(label);
        container.add(label2);
        container.add(input);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += atm.input(input.getText());

            JOptionPane.showMessageDialog(null,
                    message,
                    "Output",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
    }
}
