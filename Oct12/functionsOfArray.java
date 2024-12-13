package Oct12;

import java.util.Scanner;

public class functionsOfArray {

    public  int [] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int scan = sc.nextInt();
        int [] arr = new int[scan];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public int findMinimumElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int findMaximumElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public int  secondFindMaxElement(int [] arr){
        System.out.println("Now finding the maximum element of the array");
        int start=0;
        int end=arr.length-1;
        int temp=0;
        while(start<end){
            if (arr[start]>arr[end]){
                temp=arr[start];
            }
            else{
                temp=arr[end];
            }
            start++;
            end--;
        }

        return temp;
    }
    public int[]  reverseOfArray(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }


}
