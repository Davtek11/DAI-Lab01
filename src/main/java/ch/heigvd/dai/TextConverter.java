package ch.heigvd.dai;
import charmaps.*;

import java.io.IOException;

public class TextConverter {

    public static char[][] convertText(String s, int choice, char symbole) {

        s = s.toUpperCase();
        char[] chars = s.toCharArray();

        int height = 0;
        int width = 0;

        // Array for full Ascii Art
        char [][] tabArt = new char[height][width];

        try {
            // Choose correct Ascii Art
            Charmap ocm = switch (choice) {
                case 1 -> new OneCharMap(symbole);
                case 2 -> new SmallCharMap();
                case 3 -> new CharMap3D();
                default -> throw new IllegalArgumentException();
            };

            // Dimensions depend on chosen Ascii Art
            height = ocm.getHeight();
            width = ocm.getWidth();

            tabArt = new char[height][chars.length*(width+1)];

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < chars.length*(width+1); j++) {
                    tabArt[i][j] = ' ';
                }
            }
            // Array for current character
            char[][] tabTemp = new char[height][width];

            for (int i = 0; i < chars.length; i++) {
                // Get Ascii Art for current character and write it
                tabTemp = ocm.getCharMap().get(chars[i]);
                if(tabTemp == null) {
                    throw new IOException();
                }
                for (int j = 0; j < width; j++) { // Horizontal
                    for (int k = 0; k < height; k++) { // Vertical
                        tabArt[k][i*(width+1)+j] = tabTemp[k][j];
                    }
                }
            }

        }catch(IOException e) {
            System.out.println("Exception: Invalid character in input");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: choice of ascii art does not exist");
        }
        return tabArt;
    }
}
