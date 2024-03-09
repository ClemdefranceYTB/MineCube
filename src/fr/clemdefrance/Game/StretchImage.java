package fr.clemdefrance.Game;

	import java.awt.Image;
	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.io.IOException;
	import javax.imageio.ImageIO;

	public class StretchImage {
	    public static void main(String[] args) {
	        try {
	            // Charger l'image originale
	            File inputFile = new File("image16x16.png");
	            BufferedImage originalImage = ImageIO.read(inputFile);

	            // Redimensionner l'image pour remplir tout l'écran
	            int screenWidth = 800;
	            int screenHeight = 800;
	            Image stretchedImage = originalImage.getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);

	            // Créer une image redimensionnée BufferedImage
	            BufferedImage bufferedStretchedImage = new BufferedImage(screenWidth, screenHeight, BufferedImage.TYPE_INT_ARGB);
	            bufferedStretchedImage.getGraphics().drawImage(stretchedImage, 0, 0, null);

	            // Enregistrer l'image redimensionnée dans un nouveau fichier
	            File outputFile = new File("stretched_image.png");
	            ImageIO.write(bufferedStretchedImage, "png", outputFile);

	            System.out.println("Image stretched successfully.");

	        } catch (IOException e) {
	            System.out.println("Error stretching image: " + e.getMessage());
	        }
	    }
	}
