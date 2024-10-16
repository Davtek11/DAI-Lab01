package ch.heigvd.dai;

import java.io.*;
import picocli.CommandLine;
import java.util.concurrent.Callable;
import ch.heigvd.dai.*;

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
            description = "Symbole voulu pour l'ASCII art",
            required = false)
    private char symbole;


    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() {

        if (asciiArtChoice != 1) {
            return -1;
        }

        System.out.println("Fichier d'entree : " + inputFileName);
        System.out.println("Fichire de sortie : " + outputFileName);
        System.out.println("ASCII Art choisi : " + asciiArtChoice);

        //lis le fichier
        TextFileReader textFileReader = new TextFileReader();
        String textToConvert = textFileReader.read(inputFileName);

        //Ecrit dans le fichier
        TextFileWriter textFileWriter = new TextFileWriter();
        textFileWriter.writeASCIIArt(outputFileName, textToConvert);
        return 0;
    }
}