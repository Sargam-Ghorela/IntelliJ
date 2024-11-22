package CodingBat;

public class PracticeString {
    public static void main(String[] args) {

        String sample="a";
        int len = sample.length();

        if(len>1)
        {
            System.out.println( sample.substring(1,len-1));
        }
        else{
            System.out.println("");
        }
    }
    }

