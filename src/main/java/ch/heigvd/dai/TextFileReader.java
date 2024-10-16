package ch.heigvd.dai;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class TextFileReader {

    public String read(String filename) {
        String result = new String();
        Reader reader = null;
        BufferedReader breader = null;

        try {
            reader = new java.io.FileReader(filename, StandardCharsets.UTF_8);
            breader = new BufferedReader(reader);

            char character;
            while ((character = (char) breader.read()) != '\n') {
                result = result + character;
            }
        }
        catch (IOException ex) {
            System.err.println("Exception: " + ex);
        }
        finally {
            if (breader != null) {
                try {
                    breader.close();
                    reader.close();
                } catch (IOException ex) {
                    System.err.println("Error closing file : " + filename);
                }
            }
        }
        return result;
    }
}
