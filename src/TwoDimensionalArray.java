public class TwoDimensionalArray {
    private int row;
    private int column;

    public TwoDimensionalArray(int row, int column) {
        this.setRow(row);
        this.setColumn(column);
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return this.row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getColumn() {
        return this.column;
    }

    public String arrayAsString(int[][] matrix) {
        int rows = this.getRow();
        int columns = this.getColumn();
        StringBuilder builder = new StringBuilder();

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                builder.append(matrix[row][column]).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return "Two dimensional array: \n" + arrayAsString(new int[this.getRow()][this.getColumn()]);
    }
}
