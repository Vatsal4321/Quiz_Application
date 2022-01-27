package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {

    JButton next, lifeline, submit;
    public String time;
    public static int timer = 20;
    public static int count = 0;
    public static int ans_given = 0;
    public static int score = 0;
    String q[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];
    String username;
    JLabel question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;

    Quiz(String username) {
        this.username = username;

        setTitle("Quiz");
        setBounds(0, 0, 1280, 700);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        question = new JLabel("");
        question.setBounds(220, 358, 450, 105);
        question.setFont(new Font("Baskerville Old Face", Font.PLAIN, 24));
        question.setForeground(Color.WHITE);
        add(question);

        q[0][0] = "<html>"
                + "Q1).  Which is used to find and fix" + "<br>"
                + "bugs in the Java programs.?" + "<br>"
                + "<html>";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "<html>"
                + "Q2). What is the return type of the" + "<br>"
                + "hashCode() method in the Object" + "<br>"
                + "class?" + "<br>"
                + "<html>";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "<html>"
                + "Q3). Which package contains the " + "<br>"
                + "Random class?" + "<br>"
                + "<html>";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "<html>"
                + "Q4). An interface with no fields" + "<br>"
                + "or methods is known as?" + "<br>"
                + "<html>";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "<html>"
                + "Q5). In which memory a String is ," + "<br>"
                + "stored when we create a string using" + "<br>"
                + " new operator?" + "<br>"
                + "<html>";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "<html>"
                + "Q6). Which of the following is" + "<br>"
                + "a marker interface?" + "<br>"
                + "<html>";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "<html>"
                + "Q7). Which keyword is used for" + "<br>"
                + "accessing the features of a package?" + "<br>"
                + "<html>";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "Q8). In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "<html>"
                + "Q9). Which of the following is" + "<br>"
                + "a mutable class in java?" + "<br>"
                + "<html>";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "<html>"
                + "Q10). Which of the following option" + "<br>"
                + "leads to the portability and" + "<br>"
                + "security of Java?" + "<br>"
                + "<html>";
        q[9][1] = "<html>"
                + "Bytecode is executed" + "<br>"
                + "by JVM"
                + "<html>";
        q[9][2] = "<html>"
                + "The applet makes the Java" + "<br>"
                + "code secure and portable"
                + "<html>";
        q[9][3] = "Use of exception handling";
        q[9][4] = "<html>"
                + "Dynamic binding" + "<br>"
                + "between objects"
                + "<html>";

        qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "Remote interface";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang.StringBuilder";
        qa[9][1] = "Bytecode is executed by JVM";

        opt1 = new JRadioButton("");
        opt1.setBounds(136, 521, 255, 35);
        opt1.setContentAreaFilled(false);
        opt1.setBorder(BorderFactory.createEmptyBorder());
        opt1.setForeground(Color.WHITE);
        opt1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 19));
        add(opt1);

        opt2 = new JRadioButton("");
        opt2.setBounds(419, 521, 255, 35);
        opt2.setContentAreaFilled(false);
        opt2.setBorder(BorderFactory.createEmptyBorder());
        opt2.setForeground(Color.WHITE);
        opt2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 19));
        add(opt2);

        opt3 = new JRadioButton("");
        opt3.setBounds(136, 611, 255, 35);
        opt3.setContentAreaFilled(false);
        opt3.setBorder(BorderFactory.createEmptyBorder());
        opt3.setForeground(Color.WHITE);
        opt3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 19));
        add(opt3);

        opt4 = new JRadioButton("");
        opt4.setBounds(419, 611, 255, 35);
        opt4.setContentAreaFilled(false);
        opt4.setBorder(BorderFactory.createEmptyBorder());
        opt4.setForeground(Color.WHITE);
        opt4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 19));
        add(opt4);

        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);

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

        next = new JButton("Next");
        next.setBounds(1028, 445, 130, 30);
        next.setContentAreaFilled(false);
        next.setBorder(BorderFactory.createEmptyBorder());
        next.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
        next.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.addMouseListener(ml);
        add(next);

        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1028, 505, 130, 30);
        lifeline.setContentAreaFilled(false);
        lifeline.setBorder(BorderFactory.createEmptyBorder());
        lifeline.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
        lifeline.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        lifeline.addMouseListener(ml);
        add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(1028, 565, 130, 30);
        submit.setContentAreaFilled(false);
        submit.setEnabled(false);
        submit.setBorder(BorderFactory.createEmptyBorder());
        submit.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
        submit.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.addMouseListener(ml);
        add(submit);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quiz/application/Icons/quiz2.png"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1280, 700);
        add(l1);
        
        setUndecorated(true);
        setVisible(true);

        start(0);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given = 1;
            if (options.getSelection() == null) {
                pa[count][0] = "";
            } else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (options.getSelection() == null) {
                pa[count][0] = "";
            } else {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            for (int i = 0; i < pa.length; i++) {
                if (pa[i][0].equals(qa[i][1])) {
                    score += 10;
                } 
//                else {
//                    score += 0;
//                }
            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);
        } else if (ae.getSource() == lifeline) {
            if (count == 1 || count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        String time = "Time Left -   " + timer + " Sec";
        g.setColor(Color.RED);
        g.setFont(new Font("Baskerville Old Face", Font.BOLD, 22));

        if (timer > 0) {
            g.drawString(time, 1011, 390);
        } else {
            g.drawString("TIMES UP!!", 1035, 390);
        }

        timer--;

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 20;
        } else if (timer < 0) {
            timer = 20;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) {
                if (options.getSelection() == null) {
                    pa[count][0] = "";
                } else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                for (int i = 0; i < pa.length; i++) {
                    if (pa[i][0].equals(qa[i][1])) {
                        score += 10;
                    }
//                          else{
//                        score += 0;
//                    }
                }
                this.setVisible(false);
                new Score(username, score).setVisible(true);
            } else {
                if (options.getSelection() == null) {
                    pa[count][0] = "";
                } else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }

    public void start(int count) {
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();
    }

    public static void main(String[] args) {
        new Quiz("");
    }

}
