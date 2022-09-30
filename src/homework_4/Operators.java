package homework_4;

/**
 * Տնային առաջադրանքի կատարում:
 * Java Operators
 * @author Ruben
 */
public class Operators {

    /**
     * Given variables printing in console.
     * @param args
     */
    public static void main(String[] args) {

        ArithmeticOperators x = new ArithmeticOperators();
        System.out.println(x.Arithmetic());

        UnaryOperators y = new UnaryOperators();
        System.out.println(y.unary());

        AssignmentOperators z = new AssignmentOperators();
        System.out.println(z.assignment());

        RelationalOperators v = new RelationalOperators();
        System.out.println(v.relational());

        BitwiseLogicOperators m = new BitwiseLogicOperators();
        System.out.println(m.bitwise());

        ShiftOperator n = new ShiftOperator();
        System.out.println(n.shift());

    }

    int f;
}

/*
******************************************************************************************************
******************************************************************************************************
**************************************Arithmetic operators********************************************
******************************************************************************************************
******************************************************************************************************
 */

/**
 * Arithmetic operators perform.
 */
class ArithmeticOperators {

    //Declaring variables.
    public int a = 8;
    public int b = 6;

    //Declaring variables.
    public double c = 6.4;
    public double d = 0.03;

    //Declaring variables.
    public int x = 2 * ((5 + 3) * 4 - 8);
    public int y = 2 * 5 + 3 * 4 - 8;

    /**
     * Arithmetic operators printing.
     * @return end
     */
    public String Arithmetic(){

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a % b);

        System.out.println(c + d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c - d);
        System.out.println(c % d);

        System.out.println(x);
        System.out.println(y);

        return "Arithmetic operators printing end!";
    }

}

/*
 ******************************************************************************************************
 ******************************************************************************************************
 *******************************************Unary operators********************************************
 ******************************************************************************************************
 ******************************************************************************************************
 */

/**
 * Unary operators perform.
 */
class UnaryOperators {

    //Declaring variables.
    public int e = 10;
    public int f = -88;
    public boolean n1 = true;

    //Declaring variables.
    public int x = 3;
    public int y = ++x * 5 / x-- + --x;

    /**
     * Unary operators printing.
     * @return end
     */
    public String unary() {

        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e + 92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);

        System.out.println("x is " + x);
        System.out.println("y is " + y);

        return "Unary operators printing end!";
    }

}

/*
 ******************************************************************************************************
 ******************************************************************************************************
 **************************************Assignment operators********************************************
 ******************************************************************************************************
 ******************************************************************************************************
 */

/**
 * Assignment operators perform.
 */
class AssignmentOperators {

    //Declaring variables.
    public int x = (int) 1.0;

    //Declaring variables.
    public short y = (short) 1921222;

    //Declaring variables.
    public long z = 2147483647;

    //Declaring variables.
    public long x1;
    public long y1 = (x1 = 3);

    //Declaring variables.
    public boolean y2 = false;
    public boolean x2 = (y2 = true);

    /**
     * Assignment operators printing.
     * @return end
     */
    public String assignment() {

        System.out.println(x);
        System.out.println(y);
        System.out.println(++z);
        System.out.println(y1);
        System.out.println(x2);

        return "Assignment operators printing end!";
    }

}

/*
 ******************************************************************************************************
 ******************************************************************************************************
 **************************************Relational operators********************************************
 ******************************************************************************************************
 ******************************************************************************************************
 */

/**
 * Relational operators perform.
 */
class RelationalOperators {

    //Declaring variables.
    public int aa = 10;
    public int bb = 20;

    /**
     * Relational operators printing.
     * @return end
     */
    public String relational() {

        System.out.println(aa < bb);
        System.out.println(aa <= bb);
        System.out.println(aa >= bb);
        System.out.println(aa > bb);

        return "Relational operators printing end!";
    }
}

/*
 ******************************************************************************************************
 ******************************************************************************************************
 ******************************************Additional tasks********************************************
 ******************************************************************************************************
 ******************************************************************************************************
 */

/**
 * Additional tasks.
 * Correction of mistakes.
 */
class Additional {

    //Correction of mistakes.
    float y = 2.1f;

    //Correction of mistakes.
    byte a = 5;
    byte b = 10;
    byte c = (byte) (a + b);

    //Correction of mistakes.
    short m = 10;
    short n = 3;
    short k = (short) (m * n);


    /**
     * Correction of mistakes.
     */
    public void add() {

        long d = 10;
        int f = 5;

        f = (int) (f * d);
        System.out.println(f);
    }

}

/**
 * Additional tasks.
 * By places of variable values the change.
 */
class Additional2 {

    /**
     * Variable values changing.
     * @param args
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int z = x;
        x = y;
        y = z;

        System.out.println(x);
        System.out.println(y);
    }

}

/**
 * Additional tasks.
 * By places of variable values the change without a third variable.
 */
class Additional3 {

    /**
     * Variable values changing without a third variable.
     * @param args
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        x = x + y - (y = x);

        System.out.println(x);
        System.out.println(y);
    }
}

/**
 * Additional tasks.
 * Counting the sum of numbers from 1 to 100.
 */
class Additional4 {

    /**
     * Counting the sum of numbers from 1 to 100
     * @param a
     * @param b
     * @return sum
     */
    public static int sum(int a, int b) {

        if (a > b) {
            return 0;
        }
        return a + sum(a + 1, b);
    }

    /**
     * Sum printing.
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(sum(1, 100));
    }
}

/*
 ******************************************************************************************************
 ******************************************************************************************************
 ************************************Bitwise & Logical operators***************************************
 ******************************************************************************************************
 ******************************************************************************************************
 */

/**
 * Bitwise and Logical operators perform.
 */
class BitwiseLogicOperators {

    //Declaring variables.
    public int a = 8;
    public int b = 3;

    /**
     * Bitwise and Logical operators printing.
     * @return end
     */
    public String bitwise() {

        System.out.println(a & b);
        System.out.println(a ^ b);
        System.out.println(a | b);
        System.out.println(~a);
        System.out.println(true || (a < 4));
        System.out.println((b >= 6) || (++a <= 7));
        System.out.println((a < b) ? a:b);
        System.out.println(b ^ b);

        return "Bitwise and Logical operators printing end!";
    }
}

/*
 ******************************************************************************************************
 ******************************************************************************************************
 ******************************************Shift operators*********************************************
 ******************************************************************************************************
 ******************************************************************************************************
 */

/**
 * Shift operator perform.
 */
class ShiftOperator {


    /**
     * Shift operator printing.
     * @return end
     */
    public String shift() {

        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 2);
        System.out.println(15 >> 3);

        return "Shift operator printing end!";
    }

    /**
     * The given variable multiply with 8 and 16, without ( * ) symbol.
     * @param args
     */
    public static void main(String[] args) {

        int a = 1;

        System.out.println(a *= 8);
        System.out.println(a *= 16);
    }
}


