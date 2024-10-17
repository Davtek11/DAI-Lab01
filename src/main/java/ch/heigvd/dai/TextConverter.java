package ch.heigvd.dai;
import charmaps.*;

import java.io.IOException;

public class TextConverter {

    public static char[][] convertText(String s, int choice, char symbole) {

        //on convertit tout en majuscule pour la facilité
        s = s.toUpperCase();
        char[] chars = s.toCharArray();
        int height = 0;
        int width = 0;
        char [][] tabArt = new char[height][width];

        try {

            Charmap ocm = switch (choice) {
                case 1 -> new OneCharMap(symbole);
                case 2 -> new SmallCharMap();
                case 3 -> new CharMap3D();
                default -> throw new IllegalArgumentException();
            };

            height = ocm.getHeight();
            width = ocm.getWidth();

            tabArt = new char[height][chars.length*(width+1)];

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < chars.length*(width+1); j++) {
                    tabArt[i][j] = ' ';
                }
            }
            //tableau temporaire pour chaque caractère
            char[][] tabTemp = new char[height][width];

            for (int i = 0; i < chars.length; i++) {
                tabTemp = ocm.getCharMap().get(chars[i]);
                if(tabTemp == null) {
                    throw new IOException();
                }
                for (int j = 0; j < width; j++) { //horizontale, +1 pour les espaces
                    for (int k = 0; k < height; k++) { //verticale
                        tabArt[k][i*(width+1)+j] = tabTemp[k][j];
                    }
                }
            }
            for (int i = 0; i < tabArt.length; i++) {
                for (int j = 0; j < tabArt[i].length; j++) {
                    System.out.print(tabArt[i][j]);
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
