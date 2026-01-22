package Screen_1;

import Main_System.MainFrame;
import Screen_2.Screen_2_page_1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Page_1 extends javax.swing.JPanel {

    private MainFrame frame;

    public Page_1(MainFrame frame){
        this.frame = frame;
        panel();
    }

    public void panel(){
        this.setLayout(null);
        this.setPreferredSize(new Dimension( 500, 300));
        this.setOpaque(true);
        this.setBackground(Color.BLUE);
        

        JLabel text = new JLabel();
        text.setText("Screen 1 _page 1");
        text.setFont(new Font("Arial", Font.PLAIN, 32));
        text.setForeground(Color.white);
        text.setBounds(150, 30, 500, 50);

        JButton nextScreen = new JButton();
        nextScreen.setText("Next Screen");
        nextScreen.setBounds(200, 80, 150, 50);
        

        nextScreen.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e){
            System.out.println("Switching to Screen 2 page 1");
            frame.setContentPane(new Screen_2_page_1(frame));
            frame.revalidate();
        }
        });

        this.add(nextScreen);
        this.add(text);
    }
    
}
