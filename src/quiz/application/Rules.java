package quiz.application;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    JButton b1, b2;
    String username;

    Rules(String username) {
        this.username = username;
        setTitle("Rules");
        setBounds(0, 0, 1280, 720);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l1 = new JLabel("Welcome  " + username + "  to  BRILLIANZE");
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        l1.setForeground(Color.WHITE);
        l1.setBounds(35, 75, 1200, 60);
        l1.setHorizontalAlignment(JLabel.CENTER);
        add(l1);

        JLabel l3 = new JLabel("RULES :");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        l3.setForeground(Color.WHITE);
        l3.setBounds(50, 175, 470, 30);
        add(l3);

        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 16));
        l2.setForeground(Color.WHITE);
        l2.setBounds(30, 55, 1250, 680);
        l2.setText(
                "<html>"
                + "1).  BRILLIANZ  is  a  quiz  game  about  computer  science. " + "<br><br>"
                + "2).  There  will  be  only  1  round. " + "<br><br>"
                + "3).  The  quiz  will  consist  of  10  questions." + "<br><br>"
                + "4).  Each  question  will  carry  10  marks." + "<br><br>"
                + "5).  There  will  be  no  negative  marking  for  wrong  answer." + "<br><br>"
                + "6).  A  player  will  be given  20  seconds  for  each  question.After 20 seconds, the current question will automatically move to the next question." + "<br><br>"
                + "7).  If  you  can answer it before 20 seconds then you can go to next question using  \"NEXT\"  button given there. You can also leave the question with the same button without answering the question." + "<br><br>"
                + "8).  There will be a special feature called  \"50 - 50  Lifeline\" which can  be used once in a game, it will disappear 2 wrong answers to the question in which you are willing to take the lifeline." + "<br><br>"
                + "9).  The \"SUBMIT\" button will be disabled at all times and will only be enabled when you reach the last question. After the timeout in the last question, your quiz will be automatically submitted." + "<br><br>"
                + "10). After submitting the quiz the next page will be shown to you which will be the score board. Your score will be given according to the number of questions you have attempted correctly. " + "<br><br>"
                + "<html>"
        );
        add(l2);

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

        b1 = new JButton("BACK");
        b1.setContentAreaFilled(false);
        b1.setBounds(445, 592, 130, 30);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        b1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 16));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.addMouseListener(ml);
        add(b1);

        b2 = new JButton("START");
        b2.setContentAreaFilled(false);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.setBounds(690, 592, 130, 30);
        b2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        b2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        b2.addMouseListener(ml);
        add(b2);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("quiz/application/Icons/Grad.png"));
        JLabel l4 = new JLabel(i2);
        l4.setBounds(0, 0, 1280, 720);
        add(l4);
        
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.setVisible(false);
            new QuizApplication().setVisible(true);
        } else if (ae.getSource() == b2) {
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Rules("");

    }
}
