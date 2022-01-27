package quiz.application;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GradientPaint;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QuizApplication extends JFrame implements ActionListener {

    JButton b1, b2;
    JTextField t1;
    private String username;

    QuizApplication() {
        setTitle("Quiz Time");
        setBounds(0, 0, 1280, 700);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l2 = new JLabel("BRILLIANZ");
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 50));
        l2.setForeground(Color.WHITE);
        l2.setBounds(808, 185, 312, 60);
        add(l2);

        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 24));
        l3.setForeground(Color.WHITE);
        l3.setBounds(870, 335, 180, 30);
        add(l3);


        t1 = new JTextField();
        t1.setBounds(810, 395, 300, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        t1.setOpaque(false);
        t1.setForeground(Color.WHITE);
        t1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
        t1.setHorizontalAlignment(JTextField.CENTER);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        add(t1);

        MouseListener ml = new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JButton c = (JButton) evt.getComponent();
                c.setContentAreaFilled(true);
                c.setBackground(new Color(3, 22, 142));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                JButton c = (JButton) evt.getComponent();
                c.setContentAreaFilled(false);
                c.setBackground(new Color(241, 241, 241));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButton c = (JButton) evt.getComponent();
                c.setContentAreaFilled(true);
                c.setBackground(new Color(89, 40, 149));
            }
        };

        b1 = new JButton("RULES");
        b1.setContentAreaFilled(false);
        b1.setBounds(810, 455, 130, 30);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        b1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.addMouseListener(ml);
        add(b1);


        b2 = new JButton("EXIT");
        b2.setContentAreaFilled(false);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.setBounds(980, 455, 130, 30);
        b2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        b2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        b2.addMouseListener(ml);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quiz/application/Icons/QUIZTIME.png"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(50, 0, 650, 650);
        add(l1);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("quiz/application/Icons/Grad.png"));
        JLabel l4 = new JLabel(i2);
        l4.setBounds(-2, 0, 1285, 700);
        add(l4);

        setUndecorated(true);
        setVisible(true);
    }

    QuizApplication(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new QuizApplication();

    }

}
