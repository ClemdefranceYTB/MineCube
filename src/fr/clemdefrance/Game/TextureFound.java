package fr.clemdefrance.Game;

import javax.swing.*;
import java.awt.*;

public class TextureFound {

    public static void main(String[] args) {
        try {
            // Charge les images depuis le package fr.clemdefrance.Game.ressource
            Image background = new ImageIcon(TextureFound.class.getResource("/fr/clemdefrance/Game/ressource/background.png")).getImage();
            Image title = new ImageIcon(TextureFound.class.getResource("/fr/clemdefrance/Game/ressource/title.png")).getImage();
            Image play = new ImageIcon(TextureFound.class.getResource("/fr/clemdefrance/Game/ressource/play.png")).getImage();

            // Affiche un message si les images sont chargées avec succès
            System.out.println("Textures found. Launching game...");
            
            // Vous pouvez ajouter ici la logique pour lancer le jeu une fois que les textures sont chargées
        } catch (Exception e) {
            // Affiche un message si une exception est levée lors du chargement des images
            System.err.println("Texture not found");
            e.printStackTrace();
            System.exit(1); // Quitte le jeu en cas d'erreur
        }
    }
}
