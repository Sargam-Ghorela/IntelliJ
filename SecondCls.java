import java.util.Scanner;
import java.util.*;
public class SecondCls {

    public static void main(String []args){
        //Variables
     //   int x=10;
     //   char y='A';
        float z= .2F;
        //double i = 1.22;
      //  long j=21132342;
       boolean k=true;
     /*  System.out.println("Value for x"+x);
       System.out.println("Value for y"+y);
       System.out.println("Value for z"+x);
       System.out.println("Value for y"+y);
       System.out.println("Value for i"+i);
       System.out.println("Value for j"+j);
       System.out.println("Value for k"+k);*/
System.out.println("Please enter the choices from 1 to 6 to perform the desired functions");
        System.out.println("If statement will work in choice 1");
        System.out.println("Switch case will work in choice 2");
        Scanner scan=new Scanner(System.in);
        int number1=scan.nextInt();
        System.out.println("You entered the response"+ number1);

        if (number1==1){

            System.out.println("Lets perform a simple addition");

        }
        else if (number1==2){
                switch(number1){

                    case 2:
                    System.out.println("Inside Switch statement");
                    break;
                }
            }
        else if(number1 ==3){
            System.out.println("Lets choose the color scheme choice to test switch for Strings");
            String color=scan.next();
            //scan.next() reads until it sees white space;
            //scan.nextLine"() will read the whole space;

            switch(color){

                case "Blue":
            System.out.println("Colour entered by the user is"+color);
                break;
            }
        }
        else if(number1==4){
            System.out.println("Please enter the number  for which we will perform the factorial with the help of do while ");
            int number2=scan.nextInt();
           // int sum=1;
            int fact=1;
            do {

                fact =fact* number2;
                number2--;
                if(number2==1){
                    System.out.println("The factorial of entered number is" + fact);
                    break;
                }
            }
            while (number2>1);

        }
        else if(number1==5){
            System.out.println("Will print all the natural numbers till the limit entered and avoid the multiples of 3 by hello");
            System.out.println("Please type in the limit");
            int limit=scan.nextInt();
            for (int i=0;i<=limit;i++){
                if(i%3==0){
                    System.out.println("hello");
                    continue;
                }
                System.out.println(i);
            }
        }

        else if(number1==6){

            for(int i=1;i<=5;i++){
                for(int j=1;j<=5;j++){
                    System.out.print("     "+j*i);
                }
                System.out.println();
            }
        }

        }





      // System.out.println("Please enter the first number to check the operators ");
       //int x= scan.nextInt();
        //System.out.println("Please enter the second number to check the operators ");
        //int y= scan.nextInt();













}
