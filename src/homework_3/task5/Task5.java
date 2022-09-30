package homework_3.task5;

/**
 * Տնային առաջադրանքի կատարում:
 * Տրված class-ների ստեղծում:
 * Տրված փոփոխականների ստեղծում և տրված արժեքների վերագրում:
 * Method-ի միջոցով ուղղանկյան մակերեսի հաշվում:
 * @author Ռուբեն
 */
public class Task5 {

    /**
     * Ստեղծել ուղղանկյուն (բարձրություն 5, լայնք 14) և հաշվել ուղղանկյան մակերեսը։
     * @param args
     */
    public static void main(String[] args) {

        Rectangle x = new Rectangle();
        x.calculateArea(5,14);

    }


}

/**
 * Սահմանել Rectangle class:
 */
class Rectangle {

    /**
     * Սահմանել method( calculateArea() ):
     * @param length
     * @param width
     * @return
     */
    public static int calculateArea(int length, int width) {

        int s = length * width;
        return s;

    }


}