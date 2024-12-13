package Oct12;

import java.util.Scanner;

public class dimensionArrayRuns {
    public static void main(String[] args) {
       int [] arr= {1,2};
        dimensionArray dim = new dimensionArray();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row size of the array");
        int rows = scan.nextInt();
        System.out.println("Enter the cols size of the array");
        int cols = scan.nextInt();
        int[][] newarr=dim.createDimensionArray(rows,cols);
        dim.displayDimensionArray(newarr,rows,cols);
        System.out.println("Enter the second array");
        int[][] newSecarr=dim.createDimensionArray(rows,cols);
        dim.displayDimensionArray(newSecarr,rows,cols);
        dim.summArr(newarr,newSecarr,rows,cols);
    }
}
