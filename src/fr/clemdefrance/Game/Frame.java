package fr.clemdefrance.Game;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings({ "unused", "serial" })
public class Frame extends JFrame {

    public Frame() {
       
        setTitle("MineCube");
       
        setSize(800, 600);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setResizable(true);
       
        setLocationRelativeTo(null);
      
        setVisible(true);
    }
    
    public static void main(String[] args) {
    	Menu.main(new String[0]);;
    	TextureFound.main(new String[0]);
    	Folder.main(new String[0]);
    	log.main(new String[0]);
    	StretchImage.main(new String[0]);
    
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Frame frame = new Frame();
            }
        });
    }
}
