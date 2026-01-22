package Main_System;


import Login_screen.Login;
import javax.swing.JFrame;

public class MainFrame extends javax.swing.JFrame{

    public MainFrame(){
        setTitle("Switch frame");
        setContentPane(new Login(this)); ///============================
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
    }

    

}