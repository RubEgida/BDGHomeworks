package homework_3.task8;

/**
 * Տնային առաջադրանքի կատարում:
 * Տրված class-ների ստեղծում:
 * Տրված փոփոխականների ստեղծումև և տրված արժեքների վերագրում:
 * Տրված method-ների ստեղծում:
 * @author Ռուբեն
 */
public class Task8 {

    /**
     * Object-ների կառուցում:
     * @param args
     */
    public static void main(String[] args) {

        Car x = new Car();
        x.model = "Mercedes C203";
        x.color = "black";
        x.currentSpeed = 250;
        x.isEngineStart = true;

        Car y = new Car();
        y.model = "Mercedes S505";
        y.color = "white";
        y.currentSpeed = 280;
        y.isEngineStart = false;
    }
}

/**
 * Սահմանել Car class:
 */
class Car {

    //Ստեղծել model փոփոխականը:
    public String model;

    //Ստեղծել color փոփոխականը:
    public String color;

    //Ստեղծել currentSpeed փոփոխականը:
    public int currentSpeed;

    //Ստեղծել cisEngineStart փոփոխականը:
    public boolean isEngineStart;

    /**
     * stopEngine() method-ի ստեղծում:
     */
    public static void stopEngine() {

        System.out.println("անջատում է մատոռը");
    }

    /**
     * startEngine() method-ի ստեղծում:
     */
    public static void startEngine() {

        System.out.println("միացնում է մատոռը");
    }
}
