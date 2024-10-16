package charmaps;

public class SmallCharMap extends Charmap {
    public SmallCharMap(){
        this.width = 4;
        this.height = 3;
        charMap.put('A', new char[][] {{' ', ' ', ' ', ' '},
                                    {' ', '/', '\\', ' '},
                                    {'/', '-', '-', '\\'}});
        charMap.put('B', new char[][] {{' ', '_', ' ', ' '},
                                    {'|', '_', ')', ' '},
                                    {'|', '_', ')', ' '}});
        charMap.put('C', new char[][] {{' ', ' ', '_', ' '},
                                    {' ', '/', ' ', ' '},
                                    {' ', '\\', '_', ' '}});
        charMap.put('D', new char[][] {{' ', '_', ' ', ' '},
                                    {'|', ' ', '\\',' '},
                                    {'|', '_', '/', ' '}});
        charMap.put('E', new char[][] {{' ', ' ', '_', ' '},
                                    {' ', '|', '_', ' '},
                                    {' ', '|', '_', ' '}});
        charMap.put('F', new char[][] {{' ', ' ', '_', ' '},
                                    {' ', '|', '_', ' '},
                                    {' ', '|', ' ', ' '}});
        charMap.put('G', new char[][] {{' ', '_', '_', ' '},
                                    {'/', '_', '_', ' '},
                                    {'\\', '_', '|', ' '}});
        charMap.put('H', new char[][] {{' ', ' ', ' ', ' '},
                                    {'|', '_', '|', ' '},
                                    {'|', ' ', '|', ' '}});
        charMap.put('I', new char[][] {{'_', '_', '_', ' '},
                                    {' ', '|', ' ', ' '},
                                    {'_', '|', '_', ' '}});
        charMap.put('J', new char[][] {{' ', ' ', '|', ' '},
                                    {' ', ' ', '|', ' '},
                                    {'\\', '_', ' ', ' '}});
        charMap.put('K', new char[][] {{' ', ' ', ' ', ' '},
                                    {'|', '/', ' ', ' '},
                                    {'|', '\\', ' ', ' '}});
        charMap.put('L', new char[][] {{' ', ' ', ' ', ' '},
                                    {'|', ' ', ' ', ' '},
                                    {'|', '_', ' ', ' '}});
        charMap.put('M', new char[][] {{' ', ' ', ' ', ' '},
                                    {'|', '\\', '/', '|'},
                                    {'|', ' ', ' ', '|'}});
        charMap.put('N', new char[][] {{' ', ' ', ' ', ' '},
                                    {'|', '\\', ' ', '|'},
                                    {'|', ' ', '\\', '|'}});
        charMap.put('O', new char[][] {{' ', '_', ' ', ' '},
                                    {'/', ' ', '\\', ' '},
                                    {'\\', '_', '/', ' '}});
        charMap.put('P', new char[][] {{' ', '_', ' ', ' '},
                                    {'|', '_', ')', ' '},
                                    {'|', ' ', ' ', ' '}});
        charMap.put('Q', new char[][] {{' ', '_', ' ', ' '},
                                    {'/', ' ', '\\', ' '},
                                    {'\\', '_', 'x', ' '}});
        charMap.put('R', new char[][] {{' ', '_', ' ', ' '},
                                    {'|', '_', ')', ' '},
                                    {'|', '\\', ' ', ' '}});
        charMap.put('S', new char[][] {{' ', '_', ' ', ' '},
                                    {'(', '_', ' ', ' '},
                                    {' ', '_', ')', ' '}});
        charMap.put('T', new char[][] {{'_', '_', '_', ' '},
                                    {' ', '|', ' ', ' '},
                                    {' ', '|', ' ', ' '}});
        charMap.put('U', new char[][] {{' ', ' ', ' ', ' '},
                                    {'|', ' ', '|', ' '},
                                    {'|', '_', '|', ' '}});
        charMap.put('V', new char[][] {{' ', ' ', ' ', ' '},
                                    {'\\', ' ', ' ', '/'},
                                    {' ', '\\', '/', ' '}});
        charMap.put('W', new char[][] {{' ', ' ', ' ', ' '},
                                    {'\\', ' ', ' ', '/'},
                                    {' ', 'V', 'V', ' '}});
        charMap.put('X', new char[][] {{' ', ' ', ' ', ' '},
                                    {' ', '\\', '/', ' '},
                                    {' ', '/', '\\', ' '}});
        charMap.put('Y', new char[][] {{' ', ' ', ' ', ' '},
                                    {'\\', '_', '/', ' '},
                                    {' ', '|', ' ', ' '}});
        charMap.put('Z', new char[][] {{' ', '_', ' ', ' '},
                                    {' ', ' ', '/', ' '},
                                    {' ', '/', '_', ' '}});
        charMap.put(' ', new char[][] {{' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' '}});
        charMap.put('.', new char[][] {{' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' '},
                                    {' ', 'o', ' ', ' '}});
        charMap.put(',', new char[][] {{' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' '},
                                    {' ', '/', ' ', ' '}});
        charMap.put('-', new char[][] {{' ', ' ', ' ', ' '},
                                    {' ', '_', '_', ' '},
                                    {' ', ' ', ' ', ' '}});
        charMap.put('_', new char[][] {{' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' '},
                                    {'_', '_', '_', '_'}});
        charMap.put('+', new char[][] {{' ', ' ', ' ', ' '},
                                    {'-', '|', '-', ' '},
                                    {' ', ' ', ' ', ' '}});
        charMap.put('=', new char[][] {{' ', ' ', ' ', ' '},
                                    {' ', '_', '_', ' '},
                                    {' ', '-', '-', ' '}});
        charMap.put('\'', new char[][] {{' ', '/', ' ', ' '},
                                    {' ', ' ', ' ', ' '},
                                    {' ', ' ', ' ', ' '}});
        charMap.put(':', new char[][] {{' ', 'o', ' ', ' '},
                                    {' ', ' ', ' ', ' '},
                                    {' ', 'o', ' ', ' '}});
        charMap.put('!', new char[][] {{' ', '|', ' ', ' '},
                                    {' ', ' ', ' ', ' '},
                                    {' ', 'o', ' ', ' '}});
        charMap.put('1', new char[][] {{' ', ' ', ' ', ' '},
                                    {' ', '/', '|', ' '},
                                    {' ', ' ', '|', ' '}});
        charMap.put('2', new char[][] {{' ', '_', ' ', ' '},
                                    {' ', '_', '|', ' '},
                                    {' ', '|', '_', ' '}});
        charMap.put('3', new char[][] {{' ', '_', ' ', ' '},
                                    {' ', '_', '|', ' '},
                                    {' ', '_', '|', ' '}});
        charMap.put('4', new char[][] {{'|', ' ', ' ', ' '},
                                    {'|', '_', '|', '_'},
                                    {' ', ' ', '|', ' '}});
        charMap.put('5', new char[][] {{' ', '_', ' ', ' '},
                                    {'|', '_', ' ', ' '},
                                    {' ', '_', '|', ' '}});
        charMap.put('6', new char[][] {{' ', '_', ' ', ' '},
                                    {'|', '_', ' ', ' '},
                                    {'|', '_', '|', ' '}});
        charMap.put('7', new char[][] {{' ', '_', ' ', ' '},
                                    {' ', ' ', '/', ' '},
                                    {' ', '/', ' ', ' '}});
        charMap.put('8', new char[][] {{' ', '_', ' ', ' '},
                                    {'|', '_', '|', ' '},
                                    {'|', '_', '|', ' '}});
        charMap.put('9', new char[][] {{' ', '_', ' ', ' '},
                                    {'|', '_', '|', ' '},
                                    {' ', ' ', '|', ' '}});
        charMap.put('0', new char[][] {{' ', '_', ' ', ' '},
                                    {'/', ' ', '\\', ' '},
                                    {'\\', '_', '/', ' '}});
    }
}
