import java.util.Scanner;

public class TwoDArrays {
    public static void search(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("key not found in the 2d array");
        return;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
        matrix[i][j] = sc.nextInt();
        }
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int key = 5;
        search(matrix, key);
    }
}
