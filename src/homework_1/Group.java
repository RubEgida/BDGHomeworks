package homework_1;
/**
 * Տնային առաջադրանքի կատարում:
 * Տրված փոփոխականների ստեղծում և կամայական արժեքների վերագրում:
 * Տրված փոփոխականների տպում console -ում:
 * Integer խմբի, տվյալների պարզունակ տեսակների Max and Min արժեքների տպումը console -ում:
 * Floating point number խմբի, տվյալների պարզունակ տեսակների Max and Min արժեքների տպումը console -ում:
 * Տրված արժեքների վերագրում float կամ double տիպերի:
 * char s-ի և char w-ի տպում:
 * char t-ին 9 թվի վերագրում(Առանց այս եղանակի char t = '9';):
 * Տրված կոդի հատվածի ստուգում:
 */
public class Group {
    public static void main(String[] args) {

        /*Group (Integer)
        ***************************************************************************
        ***************************************************************************
        ***************************************************************************
        ***************************************************************************
        ***************************************************************************
         */

        //Ստեղծել byte a և byte b փոփոխականները և վերագրել կամայական արժեքներ:
        byte a = -13, b = 48;

        //Ստեղծել short c և short d փոփոխականները և վերագրել կամայական արժեքներ:
        short c = -4890, d = 1786;

        //Ստեղծել int e և int f փոփոխականները և վերագրել կամայական արժեքներ:
        int e = -64789, f = 697888;

        //Ստեղծել long g և long h փոփոխականները և վերագրել կամայական արժեքներ:
        long g = -878876770, h = 987654433;


        //Տպել console -ում բոլոր փոփոխականները:
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //Տպել, Integer խմբի, տվյալների պարզունակ տեսակների Max and Min արժեքները;
        System.out.println("byte type min value - " + Byte.MIN_VALUE);
        System.out.println("byte type max value - " + Byte.MAX_VALUE);
        System.out.println("short type min value - " + Short.MIN_VALUE);
        System.out.println("short type max value - " + Short.MAX_VALUE);
        System.out.println("int type min value - " + Integer.MIN_VALUE);
        System.out.println("int type max value - " + Integer.MAX_VALUE);
        System.out.println("long type min value - " + Long.MIN_VALUE);
        System.out.println("long type max value - " + Long.MAX_VALUE);


        /*Group (Floating point number)
         ***************************************************************************
         ***************************************************************************
         ***************************************************************************
         ***************************************************************************
         ***************************************************************************
         */

        //Ստեղծել float j և float k փոփոխականները և վերագրել կամայական արժեքներ:
        float j = -243.534f, k = 19883.34f;

        //Ստեղծել double l և float m փոփոխականները և վերագրել կամայական արժեքներ:
        double l = -12.456, m = 345.678;

        float x = 34.567839023f, y = 12.345f, z = 8923.1234857f, w = 3456.091f;

        //Տպել console -ում բոլոր փոփոխականները:
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);

        //Տպել, Floating point number խմբի, տվյալների պարզունակ տեսակների Max and Min արժեքները;
        System.out.println("float type min value - " + Float.MIN_VALUE);
        System.out.println("float type max value - " + Float.MAX_VALUE);
        System.out.println("double type min value - " + Double.MIN_VALUE);
        System.out.println("double type max value - " + Double.MAX_VALUE);

        //Ստուգել տրված արժեքներից, որն է float տիպի, որը double տիպի:
        System.out.println(x + " - this number is double type");
        System.out.println(y + " - this number is float and double type");
        System.out.println(z + " - this number is double type");
        System.out.println(w + " - this number is float and double type");


        /*Group (Character)
         ***************************************************************************
         ***************************************************************************
         ***************************************************************************
         ***************************************************************************
         ***************************************************************************
         */

        //Ստեղծել char n և char o փոփոխականները և վերագրել կամայական արժեքներ:
        char n = 'F', o = 56;

        char s = '7', w1 = '1', w2 = '0', w3 = '9';

        //Վերագրել char t-ին 9 թիվ արժեքը:
        char t = 57;

        //Տպել console -ում բոլոր փոփոխականները:
        System.out.println("n = " + n);
        System.out.println("o = " + o);

        //Տպել char s = 77; և char w = 109; արժեքները:
        System.out.println("s = " + s + s);
        System.out.println("w = " + w1 + w2 + w3);


        System.out.println("t = " + t);


        /*Group (Boolean)
         ***************************************************************************
         ***************************************************************************
         ***************************************************************************
         ***************************************************************************
         ***************************************************************************
         */

        //Ստեղծել boolean p և boolean q փոփոխականները և վերագրել կամայական արժեքներ:
        boolean p = 4 > 0, q = 4 < 0;

        //Տպել console -ում բոլոր փոփոխականները:
        System.out.println("p = " + p);
        System.out.println("q = " + q);

        /* Ի՞նչ կտպի կոդի այս հատվածը և ինչու՞։
        * int year = 201l;
          System.out.print (year);
          * Կոդի այս հատվածը չի տպի, քանի որ int-ը չի կարող ընդունել տրված արժեքը:
        */

    }
}
