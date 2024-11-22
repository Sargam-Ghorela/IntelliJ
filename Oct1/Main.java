package Oct1;

public class Main {

    public static void main(String [] args){
Student student=new Student();

student.firstName="Sargam";
student.lastName="Ghorela";
student.id=123;
System.out.println(student.firstName);
System.out.println(student.lastName);
System.out.println(student.id);

Car car=new Car();
car.Engine="V6";
car.make="JEEP";
car.model="Wrangler";
System.out.println(car.make);
System.out.println(car.model);
car.getColor(car.make);

Bank bank= new Bank();
bank.setTransactionType("withdraw");
bank.balance=3000;
System.out.println(bank.getTransactionType());
bank.customerName="Sargam Ghorela";



    }
}
