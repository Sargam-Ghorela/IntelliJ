package Oct1;

public class Car {

    String model;
    String make;
    int year;
    String Engine;;
    String color;

    public String getColor(String make)
    {
        if(make=="JEEP"){
        return "white";
    }
        else{
            return "grey";
        }

     };

    Car()
    {
        System.out.println("THIS CLASS DEFINES THE CAR PROPERTIES");

    };


}
