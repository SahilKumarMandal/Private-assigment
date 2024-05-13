// Define the Matrix class
class Matrix {
    private int rows;
    private int columns;
    private int[][] data;

    // Constructor to initialize the matrix with given dimensions
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }

    // Method to set value at a specific position in the matrix
    public void setValue(int row, int column, int value) {
        this.data[row][column] = value;
    }

    // Method to get value at a specific position in the matrix
    public int getValue(int row, int column) {
        return this.data[row][column];
    }

    // Method to get the number of rows in the matrix
    public int getRows() {
        return this.rows;
    }

    // Method to get the number of columns in the matrix
    public int getColumns() {
        return this.columns;
    }

    // Method to add two matrices
    public static Matrix add(Matrix matrix1, Matrix matrix2) {
        // Check if matrices have the same dimensions
        if (matrix1.getRows() != matrix2.getRows() || matrix1.getColumns() != matrix2.getColumns()) {
            System.out.println("Matrices must have the same dimensions to perform addition.");
            return null;
        }

        Matrix result = new Matrix(matrix1.getRows(), matrix1.getColumns());

        // Iterate over each element of the matrices and add them
        for (int i = 0; i < matrix1.getRows(); i++) {
            for (int j = 0; j < matrix1.getColumns(); j++) {
                result.setValue(i, j, matrix1.getValue(i, j) + matrix2.getValue(i, j));
            }
        }

        return result;
    }
}

public class MatrixAddition {
    public static void main(String[] args) {
        // Define matrices
        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2, 2);

        // Assign values to matrices
        matrix1.setValue(0, 0, 1);
        matrix1.setValue(0, 1, 2);
        matrix1.setValue(1, 0, 3);
        matrix1.setValue(1, 1, 4);

        matrix2.setValue(0, 0, 5);
        matrix2.setValue(0, 1, 6);
        matrix2.setValue(1, 0, 7);
        matrix2.setValue(1, 1, 8);

        // Add matrices
        Matrix sumMatrix = Matrix.add(matrix1, matrix2);

        // Display the sum matrix
        if (sumMatrix != null) {
            System.out.println("Sum of the matrices:");
            for (int i = 0; i < sumMatrix.getRows(); i++) {
                for (int j = 0; j < sumMatrix.getColumns(); j++) {
                    System.out.print(sumMatrix.getValue(i, j) + " ");
                }
                System.out.println();
            }
        }
    }
}
