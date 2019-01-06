package com.company;

public class Board {

    private int line;
    private int column;

    private String[][] gameBoard;

    public Board(int line, int column) {
        this.line = line;
        this.column = column;
        initBoard(line, column);
    }

    private void initBoard(int line, int column) {
        gameBoard = new String[line][column];
    }


}
