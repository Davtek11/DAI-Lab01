package ch.heigvd.dai;

import java.io.*;
import picocli.CommandLine;
import java.util.concurrent.Callable;

@CommandLine.Command(
        name = "txtToASCIIArt",
        description = "Convert a text from a input.txt file into an ASCII art in the output.txt file",
        version = "1.0",
        mixinStandardHelpOptions = true
)

public class Main implements Callable<Integer> {

    @CommandLine.Option(
            names = {"-i", "--input"},
            description = "Fichier texte d'entrée",
            required = true)
    private String inputFileName;

    @CommandLine.Option(names = {"-o", "--output"},
            description = "Fichier texte de sortie",
            required = true)
    private String outputFileName;

    @CommandLine.Option(names = {"-a", "--art"},
            description = "Choix de l'ASCII Art (1 ou 2)",
            required = true)
    private int asciiArtChoice;

    @CommandLine.Option(names = {"-s", "--symbole"},
            description = "Symbole voulu pour l'ASCII art numero 1",
            defaultValue = "#")
    private String symboleString;


    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() {

        if (asciiArtChoice != 1 && asciiArtChoice != 2) {
            return -1;
        }

        System.out.println("Fichier d'entree : " + inputFileName);
        System.out.println("Fichier de sortie : " + outputFileName);
        System.out.println("ASCII Art choisi : " + asciiArtChoice);
        if (symboleString.equals("#")) {
            System.out.println("Symbole par défaut : " + symboleString);
        }
        else {
            System.out.print("Symbole choisi : " + symboleString);
        }
        char symbole = symboleString.charAt(0);
        int choice = asciiArtChoice;

        //lis le fichier
        TextFileReader textFileReader = new TextFileReader();
        String textToConvert = textFileReader.read(inputFileName);

        //Ecrit dans le fichier
        TextFileWriter textFileWriter = new TextFileWriter();
        textFileWriter.writeASCIIArt(outputFileName, textToConvert, choice, symbole);
        return 0;
    }
}