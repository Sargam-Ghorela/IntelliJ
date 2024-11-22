import java.util.Scanner;
import java.util.*;

public class StringTest {
    public static void main (String [] args) {
        String s = "<<>>";
        int length=s.length();
        System.out.println(length);
        String sub=s.substring(length-2);
        System.out.println(sub);
        String s1 = s.substring(0, 2);
        String s2 = s.substring(2, 4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.toString());

    }

    }
