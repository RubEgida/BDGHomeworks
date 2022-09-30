package homework_6;

import java.util.*;

/**
 * Homework performance.
 * Creation of given methods.
 * @author Ruben
 */
public class Array {
    /**
     *Print the positive numbers of n array.
     */
    public void positiveNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of elements for array: ");
        int num = sc.nextInt();
        int[] n = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter number " + (i + 1) + " integer element: ");
            n[i] = sc.nextInt();
        }
        System.out.print("Positive elements n array: ");
        for (int i = 0; i < num; i++) {
            if (n[i] > 0) {
                System.out.print(n[i] + ", ");
            }
        }
    }

    /**
     * Printing of s array at reverse order.
     */
    public void reverseOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of elements for array: ");
        int num = sc.nextInt();
        short[] s = new short[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter number " + (i + 1) + " integer element: ");
            s[i] = sc.nextShort();
        }
        System.out.print("Elements at reverse order: ");
        for (int i = num - 1; i >= 0 ; i--) {
            System.out.print(s[i] + ", ");
        }
    }

    /**
     * Print the biggest element of l array.
     */
    public void theBiggestElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of elements for array: ");
        int num = sc.nextInt();
        long[] l = new long[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter number " + (i + 1) + " integer element: ");
            l[i] = sc.nextLong();
        }
        long biggest = l[0];
        for (int i = 1; i < num; i++) {
            if (l[i] > biggest) {
                biggest = l[i];
            }
        }
        System.out.print("The biggest element: " + biggest);
        /*
        Second version of resolving for this task.
            for (int i = 0; i < num - 1; i++) {
                if (l[i] > l[i + 1]) {
                    l[i + 1] = l[i];
                }
            }
            System.out.print(l[num - 1]);
         **********************************************
         Third version.
            System.out.print(Arrays.stream(l).max());
         */
    }

    /**
     * Print the smallest element of f array.
     */
    public void theSmallestElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of elements for array: ");
        int num = sc.nextInt();
        float[] f = new float[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter number " + (i + 1) + " floating point(with ,) element: ");
            f[i] = sc.nextFloat();
        }
        float smallest = f[0];
        for (int i = 1; i < num; i++) {
            if (f[i] < smallest) {
                smallest = f[i];
            }
        }
        System.out.print("The smallest element: " + smallest);
        /*
        Second version.
            for (int i = 0; i < num - 1; i++) {
                if (f[i] < f[i + 1]) {
                    f[i + 1] = f[i];
                }
            }
            System.out.print("The smallest element: " + f[num - 1]);
        */

    }

    /**
     * m array take elements at n array.
     */
    public void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of elements for array: ");
        int num = sc.nextInt();
        int[] n = new int[num];
        int[] m = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter number " + (i + 1) + " integer element: ");
            n[i] = sc.nextInt();
        }
        System.out.print("The n array: ");
        for (int i = 0; i < num; i++) {
            System.out.print(n[i] + ", ");
        }
        System.out.print('\n');
        System.out.print("The m array: ");
        for (int i = 0; i < num; i++) {
            System.out.print((m[i]=n[i]) + ", ");
        }
        /*
        Second version.
            m = n.clone();
            for (int i:n) {
                System.out.print(i + ", ");
            }
        *********************************************
        Third version.
            System.arraycopy(n, 0, m, 0, num);
            System.out.print('\n');
            System.out.print("The m array: ");
            for (int i = 0; i < m.length; i++) {
                 System.out.print(m[i] + ", ");
            }
        */
    }

    /**
     * The third array gets its elements from the addition of the elements of the first and second arrays.
     */
    public void threeArrays() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of elements for arrays: ");
        int num = sc.nextInt();
        int[] first = new int[num];
        int[] second = new int[num];
        int[] third = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter number " + (i + 1) + " integer element for first array: ");
            first[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.print("Enter number " + (i + 1) + " integer element for second array: ");
            second[i] = sc.nextInt();
        }
        System.out.print("The third array: ");
        for (int i = 0; i < num; i++) {
            System.out.print((third[i] = first[i] + second[i]) + ", ");
        }
    }

    /**
     * Prints how many elements equal to k are in the array.
     */
    public void givenNumberInArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of elements for array: ");
        int num = sc.nextInt();
        System.out.print("Enter k number: ");
        int k = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter number " + (i + 1) + " integer element: ");
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (k == arr[i]) {
                    count++;
            }
        }
        System.out.print("Your k number matches the elements of the array " + count + " times.");
    }

    /**
     * All methods calling.
     * @param args
     */
    public static void main(String[] args) {
        Array a = new Array();

        System.out.println("***************FIRST TASK***************");
        a.positiveNumbers();
        System.out.println('\n');
        System.out.println("***************SECOND TASK***************");
        a.reverseOrder();
        System.out.println('\n');
        System.out.println("***************THIRD TASK***************");
        a.theBiggestElement();
        System.out.println('\n');
        System.out.println("***************FOURTH TASK***************");
        a.theSmallestElement();
        System.out.println('\n');
        System.out.println("***************FIFTH TASK***************");
        a.transfer();
        System.out.println('\n');
        System.out.println("***************SIXTH TASK***************");
        a.threeArrays();
        System.out.println('\n');
        System.out.println("***************SEVENTH TASK***************");
        a.givenNumberInArray();

    }
}

