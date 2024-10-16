package ch.heigvd.dai;

import java.util.HashMap;


public class OneCharMap {
    HashMap<Character, char[][]> oneCharMap = new HashMap<Character, char[][]>();

    public OneCharMap() {
        this('#');
    }
    public OneCharMap(char c1) {
        oneCharMap.put('A', new char[][]    {{' ', ' ', c1, ' ', ' '},
                                            {' ', c1, ' ', c1, ' '},
                                            {c1, c1, c1, c1, c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1}});

        oneCharMap.put('B', new char[][]    {{c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, ' '}});

        oneCharMap.put('C', new char[][]    {{' ', c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {' ', c1, c1, c1, ' '}});

        oneCharMap.put('D', new char[][]    {{c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, ' '}});

        oneCharMap.put('E', new char[][]    {{c1, c1, c1, c1, c1},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, c1, c1, c1, c1}});

        oneCharMap.put('F', new char[][]    {{c1, c1, c1, c1, c1},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, ' ', ' ', ' ', ' '}});

        oneCharMap.put('G', new char[][]    {{' ', c1, c1, c1, c1},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, ' ', c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {' ', c1, c1, c1, ' '}});

        oneCharMap.put('H', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1}});

        oneCharMap.put('I', new char[][]    {{' ', c1, c1, c1, ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', c1, c1, c1, ' '}});

        oneCharMap.put('J', new char[][]    {{' ' , c1, c1, c1, ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {c1, ' ', c1, ' ', ' '},
                                            {' ', c1, ' ', ' ', ' '}});

        oneCharMap.put('K', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', c1, ' '},
                                            {c1, c1, c1, ' ', ' '},
                                            {c1, ' ', ' ', c1, ' '},
                                            {c1, ' ', ' ', ' ', c1}});

        oneCharMap.put('L', new char[][]    {{c1, ' ', ' ', ' ', ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, c1, c1, c1, c1}});

        oneCharMap.put('M', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {c1, c1, ' ', c1, c1},
                                            {c1, ' ', c1, ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1}});

        oneCharMap.put('N', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {c1, c1, ' ', ' ', c1},
                                            {c1, ' ', c1, ' ', c1},
                                            {c1, ' ', ' ', c1, c1},
                                            {c1, ' ', ' ', ' ', c1}});

        oneCharMap.put('O', new char[][]    {{' ', c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {' ', c1, c1, c1, ' '}});

        oneCharMap.put('P', new char[][]    {{c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, ' ', ' ', ' ', ' '}});

        oneCharMap.put('Q', new char[][]    {{' ', c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', c1, ' ', c1},
                                            {c1, ' ', ' ', c1, c1},
                                            {' ', c1, c1, c1, c1}});

        oneCharMap.put('R', new char[][]    {{c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1}});

        oneCharMap.put('S', new char[][]    {{' ', c1, c1, c1, c1},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {' ', c1, c1, c1, ' '},
                                            {' ', ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, ' '}});

        oneCharMap.put('T', new char[][]    {{c1, c1, c1, c1, c1},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '}});

        oneCharMap.put('U', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {' ', c1, c1, c1, ' '}});

        oneCharMap.put('V', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {' ', c1, ' ', c1, ' '},
                                            {' ', ' ', c1, ' ', ' '}});

        oneCharMap.put('W', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', c1, ' ', c1},
                                            {' ', c1, ' ', c1, ' '}});

        oneCharMap.put('X', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {' ', c1, ' ', c1, ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', c1, ' ', c1, ' '},
                                            {c1, ' ', ' ', ' ', c1}});

        oneCharMap.put('Y', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {' ', c1, ' ', c1, ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '}});

        oneCharMap.put('Z', new char[][]    {{c1, c1, c1, c1, c1},
                                            {' ', ' ', ' ', ' ', c1},
                                            {' ', c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, c1, c1, c1, c1}});
        oneCharMap.put(' ', new char[][]    {{' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '}});
    }
}
