package Login_screen;

import Main_System.MainFrame;
import Screen_1.Page_1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Login extends javax.swing.JPanel {

    private MainFrame frame;

    public Login(MainFrame frame){
        this.frame = frame;
        panel();
    }

    public void panel(){
        this.setLayout(null);
        this.setPreferredSize(new Dimension( 500, 300));
        this.setOpaque(true);
        this.setBackground(Color.BLACK);
        

        JLabel text = new JLabel();
        text.setText("Login Screen");
        text.setFont(new Font("Arial", Font.PLAIN, 32));
        text.setForeground(Color.white);
        text.setBounds(150, 30, 500, 50);
// button ====================================================================
        JButton nextScreen = new JButton();
        nextScreen.setText("Next Screen");
        nextScreen.setBounds(200, 80, 150, 50);
        
        nextScreen.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            System.out.println("Switching to Screen 1 page 1");
            frame.setContentPane(new Page_1(frame));
            frame.revalidate();
        }
        });



        
        this.add(nextScreen);
        this.add(text);


        
    }
    
}
