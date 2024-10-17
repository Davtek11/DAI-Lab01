package ch.heigvd.dai;

import java.io.*;
import picocli.CommandLine;

import java.util.Arrays;
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
            description = "Input text file",
            required = true)
    private String inputFileName;

    @CommandLine.Option(names = {"-o", "--output"},
            description = "Output text file",
            required = true)
    private String outputFileName;

    @CommandLine.Option(names = {"-a", "--art"},
            description = "Choice of ASCII Art (1, 2 ou 3)",
            required = true)
    private int asciiArtChoice;

    @CommandLine.Option(names = {"-s", "--symbole"},
            description = "Chosen symbol for Ascii Art 1",
            defaultValue = "#")
    private String symboleString;


    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() {

        if (!Arrays.asList(1, 2, 3).contains(asciiArtChoice)) {
            System.out.println("Invalid ascii art choice.");
            return -1;
        }

        System.out.println("Input file : " + inputFileName);
        System.out.println("Output file : " + outputFileName);
        System.out.println("Chosen ASCII Art : " + asciiArtChoice);
        if(asciiArtChoice == 1) {
            if (symboleString.equals("#")) {
                System.out.println("Default symbol : " + symboleString);
            }
            else {
                System.out.print("Chosen symbol : " + symboleString);
            }
        }
        char symbole = symboleString.charAt(0);
        int choice = asciiArtChoice;

        // Read text in file
        TextFileReader textFileReader = new TextFileReader();
        String textToConvert = textFileReader.read(inputFileName);

        // Write result in file
        TextFileWriter textFileWriter = new TextFileWriter();
        textFileWriter.writeASCIIArt(outputFileName, textToConvert, choice, symbole);
        return 0;
    }
}