package Oct8;

import java.util.Stack;

public class StaticMethod {

    static {

        System.out.println("static block");
    }

    public static void test()
    {
        System.out.println("This is the method");
    }


}

class Main{

    public static void main(String[] args) {

        StaticMethod.test();
        new StaticMethod();
    }
}
