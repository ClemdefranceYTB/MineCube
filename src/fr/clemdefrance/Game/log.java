package fr.clemdefrance.Game;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class log {

    public static void main(String[] args) {
        // Chemin du répertoire .minecube dans AppData/Roaming
        String appDataPath = System.getenv("APPDATA");
        String minecubePath = appDataPath + File.separator + ".minecube";

        // Chemin du répertoire log
        String logPath = minecubePath + File.separator + "log";

        // Crée le répertoire log s'il n'existe pas déjà
        File logDir = new File(logPath);
        if (!logDir.exists()) {
            logDir.mkdirs(); // Crée tous les répertoires parents nécessaires
            System.out.println("log folder created.");
        } else {
            System.out.println("log folder already exists.");
        }

        // Crée un fichier .txt avec comme nom la date et heure de la création du fichier
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String fileName = dateFormat.format(new Date()) + ".txt";
        String filePath = logPath + File.separator + fileName;

        try {
            // Crée le fichier et écrit les logs
            FileWriter writer = new FileWriter(filePath);
            writer.write("Logs for " + fileName + "\n");
            // Ajoutez ici vos logs
            writer.close();
            System.out.println("Log file created: " + fileName);
        } catch (IOException e) {
            System.err.println("Error creating log file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
