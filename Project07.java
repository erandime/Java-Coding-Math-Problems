package project07;

/**
 *
 * @author erandi
 */
public class Project07 {

    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = i;
                    sum = sum + i;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of diagonal elements is:" + sum);
    }
}
