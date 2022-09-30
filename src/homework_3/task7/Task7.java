package homework_3.task7;

/**
 * Տնային առաջադրանքի կատարում:
 * Տրված class-ների ստեղծում:
 * Տրված փոփոխականների ստեղծումև և տրված արժեքների վերագրում:
 * Տրված method-ների ստեղծում:
 * @author Ռուբեն
 */
public class Task7 {

    /**
     * Object-ների կառուցում:
     * @param args
     */
    public static void main(String[] args) {

        Employee a = new Employee();
        a.printEmployee(21982723432l, "Gor", 822, 32, "men");

        Employee b = new Employee();
        b.printEmployee(21982187232l, "David", 822, 32, "men");

        Employee c = new Employee();
        c.printEmployee(98203187232l, "Roz", 817, 37, "woman");
    }
}

/**
 * Սահմանել Address class:
 */
class Employee {

    public static void printEmployee(long id, String name, int department, int age, String gender) {

    }
}