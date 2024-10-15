package ch.heigvd.dai;

public class TextConverter {

    public static char[][] convertText(String s) {
        //on convertit tout en majuscule pour la facilité
        s.toUpperCase();
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        int height = 5; //a changer si besoin
        //height + 1 pour les espaces
        char[][] tabArt = new char[chars.length*(height+1)][height];
        //tableau temporaire pour chaque caractère
        char[][] tabTemp = new char[height][height];

        for (int i = 0; i < chars.length+1; i++) {
            //tabTemp = FONCTION
            for (int j = 0; j < height; j++) {
                for (int k = 0; k < height; k++) {

                    tabArt[i*(height+1)+j][k] = tabTemp[i][k];

                }
            }
        }

        return tabArt;
    }
}
