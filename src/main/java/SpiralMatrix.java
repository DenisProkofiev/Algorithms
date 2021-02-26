import helpers.PrintHelper;

import java.util.Arrays;

public class SpiralMatrix {
        public static void fillSpiralMatrix(int side) {
           int[][] arr = new int[side][side];
           int count = 0;

            for (int x = 0; x < arr.length / 2; x++) {
                for (int i = x; i < arr.length - x; i++) {
                    arr[x][i] = ++count;
                }
                for (int i = x + 1; i < arr.length - x; i++) {
                    arr[i][arr.length - x - 1] = ++count;
                }
                for (int i = arr.length - 2 - x; i >= x; i--) {
                    arr[arr.length - x - 1][i] = ++count;
                }
                for (int i = arr.length - 2 - x; i > x; i--) {
                    arr[i][x] = ++count;
                }
            }

            if (arr.length % 2 != 0) {
                arr[arr.length / 2][arr.length / 2] = ++count;
            }

            PrintHelper.printMatrix(arr);
        }

}
