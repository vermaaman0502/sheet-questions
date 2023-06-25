public class transposeMatrix {

    public static void printMatrix(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{2,3,7},{5,6,7}};
        int row =2,  col =3;
        printMatrix(matrix);

        System.out.println();


        int Transpose [][] = new int[col][row];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                Transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(Transpose);
    }
    
}
