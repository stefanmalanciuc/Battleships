package com.company;

public class PlayGames {

    public static void main(String[] args) {
	// write your code here
        Board board = new Board(10,10);
        int x = 2;
        char letter = (char)('A' + x);
        //System.out.println(Utility.showLetterInAlphabet(-30));
        System.out.println(board.displayBoard());
    }
}
