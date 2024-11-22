package Oct5;

public class Quiz {

    static  int x=10;

    public static void  change(int x ){
        x=20;
        System.out.println(x);
    }

    public static void main(String [] args){
        change(x);
        System.out.println(x);

    }
}
