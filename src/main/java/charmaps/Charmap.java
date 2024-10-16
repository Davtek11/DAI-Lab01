package charmaps;

import java.util.HashMap;

public class Charmap {
    HashMap<Character, char[][]> charMap = new HashMap<Character, char[][]>();
    int width;
    int height;

    public HashMap<Character, char[][]> getCharMap() {
        return charMap;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}
