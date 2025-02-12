

import java.util.Arrays;

class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix){

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRow = false , firstCol = false;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    if(i==0) firstRow=true;
                    if(j==0) firstCol=true;
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstRow){
            for(int j=0;j<cols;j++){
                matrix[0][j]=0;
            }
        }
        if(firstCol){
            for(int i=0;i<rows;i++){
                matrix[i][0]=0;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        SetMatrixZeroes.setZeroes(matrix);

        System.out.println("Matrix after setZeroes:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

