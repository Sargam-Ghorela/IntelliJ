package Oct12;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5] ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
      //  for (int i = arr.length-1; i >=0; i--) {
        //    System.out.println(arr[i]);
        //}

        int start= 0;
        int end = arr.length-1;
         while (start<end){
             int temp= arr[start];
             arr[start]= arr[end];
             arr[end]= temp;
             start++;
             end--;
         }
         //for element integer in given array ,print the array
        for (int element :arr){
            System.out.println(element);
        }
    }
}