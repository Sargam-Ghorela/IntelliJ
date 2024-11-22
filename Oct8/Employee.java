package Oct8;

public class Employee {

    int id;
    String name;
    String email;

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.companyName = companyName;
    }

   static String companyName="Microsoft";

    public void printEmployee(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(companyName);

    }


}
