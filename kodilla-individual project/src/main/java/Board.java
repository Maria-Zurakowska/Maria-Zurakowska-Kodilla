
public class Board {

// wymiary mojej planszy
    private int boardHeight = 40;
    private int boardLength = 40;

    public Board(int boardHeight, int boardLength) {
        this.boardHeight = boardHeight;
        this.boardLength = boardLength;
    }

    public int getBoardHeight() {
        return boardHeight;
    }

    public void setBoardHeight(int boardHeight) {
        this.boardHeight = boardHeight;
    }

    public int getBoardLength() {
        return boardLength;
    }

    public void setBoardLength(int boardLength) {
        this.boardLength = boardLength;
    }
}
