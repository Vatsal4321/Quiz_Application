package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Score extends JFrame implements ActionListener {

    JButton b1, b2;
    String username;

    Score(String username, int score) {
        this.username = username;
        setTitle("Score");
        setBounds(0, 0, 1280, 700);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l3 = new JLabel("Thank  You " + username + " for  Playing  BRILLIANZE");
        l3.setBounds(35, 345, 1200, 60);
        l3.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
        l3.setForeground(Color.WHITE);
        l3.setHorizontalAlignment(JLabel.CENTER);
        add(l3);

        JLabel l4 = new JLabel("Your  Score  is  " + score);
        l4.setBounds(35, 445, 1200, 60);
        l4.setFont(new Font("Jokerman", Font.BOLD, 30));
        l4.setForeground(Color.YELLOW);
        l4.setHorizontalAlignment(JLabel.CENTER);
        add(l4);

        MouseListener ml = new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JButton c = (JButton) evt.getComponent();
                c.setContentAreaFilled(true);
                c.setBackground(new Color(73, 54, 195));
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

        b1 = new JButton("PLAY AGAIN");
        b1.setContentAreaFilled(false);
        b1.setBounds(445, 572, 130, 30);
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
        b2.setBounds(690, 572, 130, 30);
        b2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        b2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        b2.addMouseListener(ml);
        add(b2);

        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("quiz/application/Icons/celeb.png"));
        JLabel l5 = new JLabel(i3);
        l5.setBounds(350, 445, 150, 75);
        add(l5);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("quiz/application/Icons/celeb.png"));
        JLabel l6 = new JLabel(i4);
        l6.setBounds(780, 445, 150, 75);
        add(l6);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quiz/application/Icons/score.png"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(35, 65, 1200, 185);
        add(l1);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("quiz/application/Icons/Grad.png"));
        JLabel l2 = new JLabel(i2);
        l2.setBounds(0, 0, 1280, 700);
        add(l2);

        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.setVisible(false);
            new QuizApplication().setVisible(true);

        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Score("", 0);
    }

}
