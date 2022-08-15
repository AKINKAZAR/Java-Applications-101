package Arrays;

public class NestedArrays {

    public static void tryArray(int[][] matrix) {
        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];

            for (int j = 0; j < row.length; j++) {
                row[j] = number;
                number++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

        public static void main (String[]args){

            int[][] matrix = new int[3][4];
          /*
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = number++;
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

           */

            tryArray(matrix);
        }
    }
