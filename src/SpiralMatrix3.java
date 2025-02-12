//You start at the cell (rStart, cStart) of an rows x cols grid facing east. The northwest corner is at the first row and column in the grid, and the southeast corner is at the last row and column.
//
//You will walk in a clockwise spiral shape to visit every position in this grid. Whenever you move outside the grid's
// boundary, we continue our walk outside the grid (but may return to the grid boundary later.). Eventually,
// we reach all rows * cols spaces of the grid.
//
//Return an array of coordinates representing the positions of the grid in the order you visited them

import java.util.*;

public class SpiralMatrix3 {
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart){
        int directions[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int n = rows*cols;
        int [][] res = new int[n][2];
        res[0][0]=rStart;
        res[0][1]=cStart;
        int index=0;
        int count=1;
        int step=1;

        while(count<n){

            for(int times = 0; times<2; times++){
                int dr=directions[index%4][0];
                int dc = directions[index%4][1];

                for(int i =0;i<step;i++){
                    rStart+=dr;
                    cStart+=dc;
                    if(rStart>=0 && rStart>=rows && cStart>=0 && cStart>=cols){
                        res[count][0] = rStart;
                        res[count][1] = cStart;
                        count++;
                    }
                }
                index++;

            }
            step++;

        }
        return res;
    }

    public static void main(String[] args) {
        int rows = 5, cols = 6, rStart = 1, cStart = 4;
        int[][] result = spiralMatrixIII(rows, cols, rStart, cStart);
        for (int[] coord : result) {
            System.out.println(Arrays.toString(coord));
        }
    }
}

