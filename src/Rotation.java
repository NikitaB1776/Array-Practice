//Given two n x n binary matrices mat and target, return true if it is possible to make mat equal
// to target by rotating mat in 90-degree increments, or false otherwise.

import java.util.*;

class Rotation {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 0},
                {0, 1}
        };

        int[][] target = {
                {0, 1},
                {1, 0}
        };

        Rotation solution = new Rotation();
        boolean result = solution.findRotation(mat, target);
        System.out.println("Can mat be rotated to match target? " + result);
    }

    public boolean findRotation(int[][] mat,int[][] target){
    int n = mat.length;

    for(int rotation=0;rotation<4;rotation++){
        if(equalmatrices(mat,target)){
            return true;
        }
        rotate90(mat);
    }
    return false;
    }



    private void rotate90(int[][] mat){
        int n = mat.length;

        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n ;j++){
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]= temp;
            }
        }

        for(int i=0 ; i<n ;i++){
            for(int j=0 ; j<n/2 ; j++){
                int temp = mat[i][j];
                mat[i][j]=mat[i][n-j-1];
                mat[i][n-j-1] = temp;
            }
        }


    }

    private boolean equalmatrices(int[][] mat,int[][] target){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}



