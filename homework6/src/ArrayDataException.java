public class ArrayDataException extends Exception{
    private int row,col;

    public ArrayDataException(int row, int col) {
        super("Invalid data at "+ row+ col);
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
