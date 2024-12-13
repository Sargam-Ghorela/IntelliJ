package Oct8;

import java.util.Stack;

public class StaticMethod {

    static {

        System.out.println("static block 1");
    }
    {
        System.out.println("instance  block ");
    }
    static {

        System.out.println("static block 2");
    }
    StaticMethod() {
        System.out.println("Const block");
    }
    public static void test()
    {
        System.out.println("This is the test method");
    }


}

class Main{

    public static void main(String[] args) {

        StaticMethod.test();
        new StaticMethod();
    }
}
