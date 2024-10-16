package charmaps;

public class OneCharMap extends Charmap {
    public OneCharMap() {
        this('#');
    }
    public OneCharMap(char c1) {
        this.width = 5;
        this.height = 5;
        charMap.put('A', new char[][]    {{' ', ' ', c1, ' ', ' '},
                                            {' ', c1, ' ', c1, ' '},
                                            {c1, c1, c1, c1, c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1}});

        charMap.put('B', new char[][]    {{c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, ' '}});

        charMap.put('C', new char[][]    {{' ', c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {' ', c1, c1, c1, ' '}});

        charMap.put('D', new char[][]    {{c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, ' '}});

        charMap.put('E', new char[][]    {{c1, c1, c1, c1, c1},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, c1, c1, c1, c1}});

        charMap.put('F', new char[][]    {{c1, c1, c1, c1, c1},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, ' ', ' ', ' ', ' '}});

        charMap.put('G', new char[][]    {{' ', c1, c1, c1, c1},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, ' ', c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {' ', c1, c1, c1, ' '}});

        charMap.put('H', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1}});

        charMap.put('I', new char[][]    {{c1, c1, c1, c1, c1},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {c1, c1, c1, c1, c1}});

        charMap.put('J', new char[][]    {{c1 , c1, c1, c1, c1},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {c1, ' ', c1, ' ', ' '},
                                            {' ', c1, ' ', ' ', ' '}});

        charMap.put('K', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', c1, ' '},
                                            {c1, c1, c1, ' ', ' '},
                                            {c1, ' ', ' ', c1, ' '},
                                            {c1, ' ', ' ', ' ', c1}});

        charMap.put('L', new char[][]    {{c1, ' ', ' ', ' ', ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, c1, c1, c1, c1}});

        charMap.put('M', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {c1, c1, ' ', c1, c1},
                                            {c1, ' ', c1, ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1}});

        charMap.put('N', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {c1, c1, ' ', ' ', c1},
                                            {c1, ' ', c1, ' ', c1},
                                            {c1, ' ', ' ', c1, c1},
                                            {c1, ' ', ' ', ' ', c1}});

        charMap.put('O', new char[][]    {{' ', c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {' ', c1, c1, c1, ' '}});

        charMap.put('P', new char[][]    {{c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, ' ', ' ', ' ', ' '}});

        charMap.put('Q', new char[][]    {{' ', c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', c1, ' ', c1},
                                            {c1, ' ', ' ', c1, c1},
                                            {' ', c1, c1, c1, c1}});

        charMap.put('R', new char[][]    {{c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1}});

        charMap.put('S', new char[][]    {{' ', c1, c1, c1, c1},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {' ', c1, c1, c1, ' '},
                                            {' ', ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, ' '}});

        charMap.put('T', new char[][]    {{c1, c1, c1, c1, c1},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '}});

        charMap.put('U', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {' ', c1, c1, c1, ' '}});

        charMap.put('V', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {' ', c1, ' ', c1, ' '},
                                            {' ', ' ', c1, ' ', ' '}});

        charMap.put('W', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, ' ', c1, ' ', c1},
                                            {' ', c1, ' ', c1, ' '}});

        charMap.put('X', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {' ', c1, ' ', c1, ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', c1, ' ', c1, ' '},
                                            {c1, ' ', ' ', ' ', c1}});

        charMap.put('Y', new char[][]    {{c1, ' ', ' ', ' ', c1},
                                            {' ', c1, ' ', c1, ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '}});

        charMap.put('Z', new char[][]    {{c1, c1, c1, c1, c1},
                                            {' ', ' ', ' ', ' ', c1},
                                            {' ', c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, c1, c1, c1, c1}});
        charMap.put(' ', new char[][]    {{' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '}});
        charMap.put('.', new char[][]    {{' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '}});
        charMap.put(',', new char[][]    {{' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', c1, ' ', ' ', ' '}});
        charMap.put('-', new char[][]    {{' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', c1, c1, c1, ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '}});
        charMap.put('_', new char[][]    {{' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {c1, c1, c1, c1, c1}});
        charMap.put('+', new char[][]    {{' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {c1, c1, c1, c1, c1},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '}});
        charMap.put('=', new char[][]    {{' ', ' ', ' ', ' ', ' '},
                                            {' ', c1, c1, c1, ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', c1, c1, c1, ' '},
                                            {' ', ' ', ' ', ' ', ' '}});
        charMap.put('/', new char[][]    {{' ', ' ', ' ', ' ', c1},
                                            {' ', ' ', ' ', c1, ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', c1, ' ', ' ', ' '},
                                            {c1, ' ', ' ', ' ', ' '}});
        charMap.put('\'', new char[][]    {{' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '}});
        charMap.put(':', new char[][]    {{' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '}});
        charMap.put('!', new char[][]    {{' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', ' ', ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '}});
        charMap.put('1', new char[][]    {{' ', ' ', c1, ' ', ' '},
                                            {' ', c1, c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', c1, c1, c1, ' '}});
        charMap.put('2', new char[][]    {{' ', c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {' ', ' ', c1, c1, ' '},
                                            {' ', c1, ' ', ' ', ' '},
                                            {c1, c1, c1, c1, c1}});
        charMap.put('3', new char[][]    {{c1, c1, c1, c1, c1},
                                            {' ', ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, c1},
                                            {' ', ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, c1}});
        charMap.put('4', new char[][]    {{' ', ' ', c1, c1, ' '},
                                            {' ', c1, ' ', c1, ' '},
                                            {c1, c1, c1, c1, c1},
                                            {' ', ' ', ' ', c1, ' '},
                                            {' ', ' ', ' ', c1, ' '}});
        charMap.put('5', new char[][]    {{c1, c1, c1, c1, c1},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, c1, c1, c1, ' '},
                                            {' ', ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, ' '}});
        charMap.put('6', new char[][]    {{' ', c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', ' '},
                                            {c1, c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {' ', c1, c1, c1, ' '}});
        charMap.put('7', new char[][]    {{c1, c1, c1, c1, c1},
                                            {' ', ' ', ' ', c1, ' '},
                                            {' ', ' ', c1, ' ', ' '},
                                            {' ', c1, ' ', ' ', ' '},
                                            {c1, ' ', ' ', ' ', ' '}});
        charMap.put('8', new char[][]    {{' ', c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, c1},
                                            {c1, ' ', ' ', ' ', c1},
                                            {' ', c1, c1, c1, ' '}});
        charMap.put('9', new char[][]    {{' ', c1, c1, c1, ' '},
                                            {c1, ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, c1},
                                            {' ', ' ', ' ', ' ', c1},
                                            {c1, c1, c1, c1, ' '}});
        charMap.put('0', new char[][]    {{' ', c1, c1, c1, ' '},
                                            {c1, ' ', ' ', c1, c1},
                                            {c1, ' ', c1, ' ', c1},
                                            {c1, c1, ' ', ' ', c1},
                                            {' ', c1, c1, c1, ' '}});
    }
}
