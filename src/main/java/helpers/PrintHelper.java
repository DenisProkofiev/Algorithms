package helpers;

import java.util.Arrays;

public class PrintHelper {
    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
