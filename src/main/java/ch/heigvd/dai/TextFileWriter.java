package ch.heigvd.dai;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TextFileWriter {
    public void writeASCIIArt(String filename, String text, int choice, char symbole) {

        Writer writer;
        BufferedWriter bWriter = null;

        try {
            writer = new FileWriter(filename, StandardCharsets.UTF_8);
            bWriter = new BufferedWriter(writer);

            char[][] result = TextConverter.convertText(text, choice, symbole);

            for (char[] charTab : result) {
                for (char c : charTab) {
                    bWriter.write(c);
                }
                bWriter.newLine();
            }

        }catch(IOException e) {
            System.out.println("Exception: "+ e);
        }finally {
            if(bWriter != null) {
                try{
                    bWriter.flush();
                    bWriter.close();
                }catch(IOException e) {
                    System.out.println("Exception in close buffered writer: "+ e);
                }
            }
        }
    }
}
