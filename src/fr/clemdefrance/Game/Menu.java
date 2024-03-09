package fr.clemdefrance.Game;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Menu extends JPanel {
	
	public static void main(String[] args) {
		
	}
	
    private Image background;
    private Image title;
    private Image play;

    public Menu() {
        // Charge les images
        background = new ImageIcon("background.png").getImage();
        title = new ImageIcon("title.png").getImage();
        play = new ImageIcon("play.png").getImage();

        // Définit la taille de la zone de dessin
        Dimension size = new Dimension(background.getWidth(null), background.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dessine l'arrière-plan
        g.drawImage(background, 0, 0, null);

        // Dessine le titre en haut au centre
        int titleX = (getWidth() - title.getWidth(null)) / 2;
        g.drawImage(title, titleX, 0, null);

        // Dessine le bouton "Play" au milieu de l'écran
        int playX = (getWidth() - play.getWidth(null)) / 2;
        int playY = (getHeight() - play.getHeight(null)) / 2;
        g.drawImage(play, playX, playY, null);
        
    }
}
