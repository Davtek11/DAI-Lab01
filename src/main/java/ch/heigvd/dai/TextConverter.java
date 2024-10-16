package ch.heigvd.dai;

import java.io.IOException;

public class TextConverter {

    public static char[][] convertText(String s, char symbole) {

        //on convertit tout en majuscule pour la facilité
        s = s.toUpperCase();
        char[] chars = s.toCharArray();
        OneCharMap ocm = new OneCharMap(symbole);

        int height = 5; //a changer si besoin
        //height + 1 pour les espaces
        char [][] tabArt = new char[height][chars.length*(height+1)];

        try{
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < chars.length*(height+1); j++) {
                    tabArt[i][j] = ' ';
                }
            }
            //tableau temporaire pour chaque caractère
            char[][] tabTemp = new char[height][height];

            for (int i = 0; i < chars.length; i++) {
                tabTemp = ocm.oneCharMap.get(chars[i]);
                if(tabTemp == null) {
                    throw new IOException();
                }
                for (int j = 0; j < height; j++) { //horizontale, +1 pour les espaces
                    for (int k = 0; k < height; k++) { //verticale

                        tabArt[k][i*(height+1)+j] = tabTemp[k][j];

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
        }
        return tabArt;
    }
}
