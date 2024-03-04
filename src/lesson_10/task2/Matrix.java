package lesson_10.task2;

public class Matrix implements IMatrix {

    private double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int rows, int columns) {
        if ((rows < 1) || columns < 1) {
            System.out.println("Переданные параметры некорректны, матрица будет иметь значение 1");
            matrix = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
            return;
        }
        matrix = new double[rows][columns];
    }

    @Override
    public int getRows() { // количество строк матрицы
        return matrix.length;
    }


    @Override
    public int getColumns() { // количество колонок матрицы
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        matrix[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не совпадает количество строк!");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не совпадает количество колонок!");
            return null;
        }

        Matrix result = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не совпадает количество строк!");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не совпадает количество колонок!");
            return null;
        }

        Matrix result = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {

        Matrix result = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++){
            for (int j =0; j < getColumns(); j++){
                result.setValueAt(i, j, getValueAt(i, j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() { // является ли текущая матрица нулевой
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() { // является ли текущая матрица квадратной

        if (getRows() == getColumns()) {
            System.out.println("Эта Матрица является квадратной");
        } else {
            System.out.println("Эта Матрица не является квадратной");
        }   return false;
    }

    @Override
    public void printToConsole() {
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + "   ");
            }
            System.out.println();
        }
    }
}

