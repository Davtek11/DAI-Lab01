package ch.heigvd.dai;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import ch.heigvd.dai.TextConverter;

public class TextFileWriter {
    public void writeASCIIArt(String filename, String text) throws IOException {
        Writer writer = new FileWriter(filename, StandardCharsets.UTF_8);
        BufferedWriter bwriter = new BufferedWriter(writer);

        TextConverter textConverter = new TextConverter();
        // TODO convert each char of string, add char to file, etc


        writer.flush();
        writer.close();
    }
}
