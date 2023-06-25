public class findTheNumber {
    public static void findNumbers(int matrix[][], int find) {
        int value = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if (find == matrix[i][j])
                    value++;
            }
        }
        System.out.println(value);
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{6,2,3,1},{2,6,4,8}};
        int find = 6;
        findNumbers(matrix, find);

    }
    
}
