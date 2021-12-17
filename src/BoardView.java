import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class BoardView{

    static JPanel panelNorth;
    static JPanel panelCenter;
    static JLabel labelMessage;
    static JButton[] buttons = new JButton[16];
    static String[] images = 
    {   
        /*
        fruit01.png, fruit02.png, fruit03.png, fruit04.png,
        fruit05.png, fruit06.png, fruit07.png, fruit08.png,
        fruit01.png, fruit02.png, fruit03.png, fruit04.png,
        fruit05.png, fruit06.png, fruit07.png, fruit08.png,   
        */
    };


    static class MyFrame extends JFrame {
        public MyFrame(String title) {
            super(title);
            this.setSize(400,500);
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            initUI(this); // Screen UI set.
            this.pack(); //Pack Empty Space.
        }
    }

        static void initUI(MyFrame myFrame) {
            panelNorth = new JPanel();
            panelNorth.setPreferredSize(new Dimension(400, 100));
            panelNorth.setBackground(Color.BLUE);
            labelMessage = new JLabel("Find Some Fruit!");
            labelMessage.setPreferredSize(new Dimension(400, 100));
            labelMessage.setForeground(Color.WHITE);
            //labelMessage.setFont(new Font("?", Font.BOLD, 20));
            labelMessage.setHorizontalAlignment(JLabel.CENTER);
            panelNorth.add(labelMessage);
            myFrame.add("North", panelNorth);


        }
    public static void main (String[] args) {
        new MyFrame("Bingo game");
    }
}

