package Oct12;

import java.util.Scanner;

public class dimensionArray {

    public int [][] createDimensionArray(int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                arr[row][col]=sc.nextInt();
            }
        }
        return arr;
    }
    public void displayDimensionArray(int [][] arr,int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(arr[row][col]+"   ");
            }
            System.out.println();
        }
    }

    public int[][] summArr(int [][]arr1 ,int[][] arr2,int rows,int cols) {
        int [][] sum = new int [rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                sum[row][col]=arr1[row][col]+ arr2[row][col];
            }
        }
       displayDimensionArray(sum,rows,cols);
        return sum;
    }
}
