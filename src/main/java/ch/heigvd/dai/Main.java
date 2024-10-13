package ch.heigvd.dai;

import java.io.File;
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
    private File inputFile;

    @CommandLine.Option(names = {"-o", "--output"},
            description = "Fichier texte de sortie",
            required = true)
    private File outputFile;

    @CommandLine.Option(names = {"-a", "--art"},
            description = "Choix de l'ASCII Art (1, 2 ou 3)",
            required = true)
    private int asciiArtChoice;


    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() {

        if (asciiArtChoice != 1) {
            return -1;
        }

        System.out.println("Fichier d'entree : " + inputFile.getAbsolutePath());
        System.out.println("Fichire de sortie : " + outputFile.getAbsolutePath());
        System.out.println("ASCII Art choisi : " + asciiArtChoice);

        //String textToConvert = read(inputFile);
        //convertText
        //Write

        return 0;
    }
}