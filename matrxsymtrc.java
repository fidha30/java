import java.util.Scanner;

public class matrxsymtrc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if (rows != cols) {
            System.out.println("The matrix is not symmetric (must be square).");
            sc.close();
            return;
        }

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isSymmetric = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                    }
            }
        }

        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }

        sc.close();
    }
}
