package Matrix;

import java.util.Scanner;

public class TraversingMatrixInSpiralFormat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] mat = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                mat[i][j] = in.nextInt();
            }
        }

    }
    static void traverse(int[][] mat){

    }
}
