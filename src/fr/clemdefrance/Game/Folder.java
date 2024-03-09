package fr.clemdefrance.Game;

import java.io.File;

public class Folder {

    public static void main(String[] args) {
        // Chemin du répertoire .minecube dans AppData/Roaming
        String appDataPath = System.getenv("APPDATA");
        String minecubePath = appDataPath + File.separator + ".minecube";

        // Crée le répertoire .minecube s'il n'existe pas déjà
        File minecubeDir = new File(minecubePath);
        if (!minecubeDir.exists()) {
            minecubeDir.mkdirs(); // Crée tous les répertoires parents nécessaires
            System.out.println(".minecube folder created.");
        } else {
            System.out.println(".minecube folder already exists.");
        }
    }
}
