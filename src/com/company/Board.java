import javax.sound.sampled.Line;

public class Board {

    int line;
    int column;



    String[][] gameBoard= new String[10][10];

    public Board(int line, int column) {
        this.line = line;
        this.column = column;
    }


}
