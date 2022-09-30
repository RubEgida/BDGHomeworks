package homework_2;
/**
 * Տնային առաջադրանքի կատարում:
 * Տրված մեթոդների կազմում:
 */
public class Methods {
    public static void main(String[] args) {
        /*
        ********************************************************************************************
        ********************************************************************************************
        *************************************CASTING************************************************
        ********************************************************************************************
        ********************************************************************************************
         */


        //Ստեղծել int aa = 7 և long bb փոփոխականներ, կատարել Cast գործողություն aa->bb:
        int aa = 7;
        long bb = aa;

        //Ստեղծել int myInt = 7 և double myDouble փոփոխականներ, կատարել Cast գործողություն myInt->myDouble:
        int myInt = 7;
        double myDouble = myInt;

        //Ստեղծել double dd = 9.78d և int ii փոփոխականներ, կատարել Cast գործողություն dd->ii:
        double dd = 9.78d;
        int ii = (int) dd;

        //Ստեղծել int ff = 9999 և byte gg փոփոխականներ, կատարել Cast գործողություն ff->gg:
        int ff = 9999;
        byte gg = (byte) ff;

        //Տպել console -ում բոլոր կատարած Cast-երը:
        System.out.println("aa->bb - " + bb);
        System.out.println("myInt->myDouble - " + myDouble);
        System.out.println("dd->ii - " + ii);
        System.out.println("ff->gg - " + gg);


        /*
        Գտնել սխալը և ուղղել․
        * long max = 3123456789;
        * double d = 1000_.00;
        * char i =’i’; char j=’j’; char ij = i +j;
        * int 7a = 8;
        * long h = h + 8;
        * int n, m = 11; m = n;
         */
        long max = 3123456789l;
        double d = 1000_00; //Կամ double d = 1000.00; :
        char i = 'i'; char j = 'j'; char ij = 'i' + 'j';
        int $7a = 8;
        long h = 8; //?
        int n, m = 11;
        n = m;


        //Methods.
        first(9, 123);
        second();
        third(true, false);
        fourth('a');
        fifth(3.44f, 7.097f);
        //sixth();
    }

    /*
     ********************************************************************************************
     ********************************************************************************************
     *************************************METHODS************************************************
     ********************************************************************************************
     ********************************************************************************************
     */

    /**
     * Write a method which .has two input parameters type int and return 0.
     * @param a
     * @param b
     * @return
     */
    public static int first(int a,int b) {

        return 0;
    }

    /**
     * Write a method which has not input parameters and returns nothing.
     */
    public static void second() {

    }

    /**
     * Write a method which .has a boolean input parameters and print “Hello World”.
     * @param x
     * @param y
     */
    public static void third(boolean x, boolean y) {

        System.out.println("Hello World");
    }

    //Write a method which .has a char input parameter and return this input parameter.
    public static char fourth(char z) {

        return z;
    }

    /**
     * Write a method which .has two float input parameters and return one of them.
     * @param m
     * @param n
     * @return
     */
    public static float fifth(float m, float n) {

        return m;
    }

    /**
     * Write a method which .has called itself inside body(recursion).
     */
    public static void sixth() {

        sixth();
    }
}
