package homework_7;

import java.util.Scanner;

public class StringUtil {
    /*
    *******************************************************************************************************************
    *******************************************************************************************************************
    *********************************************CONCATENATION*********************************************************
    ************************************************Task1**************************************************************
    *******************************************************************************************************************
     */

    //**********************************************STRING*************************************************************

    /**
     * Two Strings concatenation.
     * @param param1
     * @param param2
     * @return parameters concatenation
     */
    public String concatenation1(String param1, String param2) {
        return param1 + param2;
    }

    /**
     * Two numbers and String concatenation.
     * @param param1
     * @param param2
     * @param param3
     * @return parameters concatenation
     */
    public String concatenation2(int param1, int param2, String param3) {
        return param1 + param2 + " " + param3;
    }

    /**
     * String, number and String concatenation.
     * @param param1
     * @param param2
     * @param param3
     * @return parameters concatenation
     */
    public String concatenation3(String param1, int param2, String param3) {
        return param1 + param2 + param3;
    }

    /**
     * String, two numbers and String concatenation.
     * @param param1
     * @param param2
     * @param param3
     * @param param4
     * @return parameters concatenation
     */
    public String concatenation4(String param1, int param2, int param3, String param4) {
        return param1 + param2 + param3 + param4;
    }

    //************************************************StringBuilder****************************************************

    /**
     * StringBuilders concatenation.
     * @param param1
     * @param param2
     * @return parameters concatenation
     */
    public String concatenation_1(StringBuilder param1, StringBuilder param2) {
        return param1.toString() + param2.toString();
    }

    /**
     * Two numbers and StringBuilder concatenation.
     * @param param1
     * @param param2
     * @param param3
     * @return parameters concatenation
     */
    public String concatenation_2(int param1, int param2, StringBuilder param3) {
        return param1 + param2 + param3.toString();
    }

    /**
     * StringBuilder, number and StringBuilder concatenation.
     * @param param1
     * @param param2
     * @param param3
     * @return parameters concatenation
     */
    public String concatenation_3(StringBuilder param1, int param2, StringBuilder param3) {
        return param1.toString() + param2 + param3.toString();
    }

    /**
     * StringBuilder, two numbers and StringBuilder concatenation.
     * @param param1
     * @param param2
     * @param param3
     * @param param4
     * @return parameters concatenation
     */
    public String concatenation_4(StringBuilder param1, int param2, int param3, StringBuilder param4) {
        return param1.toString() + param2 + param3 + param4.toString();
    }

    /*
     *******************************************************************************************************************
     ***************************************************Task2***********************************************************
     *******************************************************************************************************************
     */

    /**
     * Replace spaces whit new lines.
     * @param param
     * @return string line
     */
    public String replacing(String param) {
        return param.replace(' ', '\n');
    }

    /*
     *******************************************************************************************************************
     ***************************************************Task3***********************************************************
     *******************************************************************************************************************
     */

    /**
     * Reversed the string.
     * @param param
     * @return revers parameter
     */
    public String reveresString(StringBuilder param) {
        return param.reverse().toString();
    }

    /*
     *******************************************************************************************************************
     ***************************************************Task4***********************************************************
     *******************************************************************************************************************
     */

    /**
     * Find count of token in text.
     * @param line
     * @param token
     * @return how many token value in text
     */
    public int tokenInString(String line, String token) {
        int count = 0;
        for (int i = 0; i < line.length() - 1; i++) {
            if (line.substring(i, (i + 2)).contains(token)) {
                count++;
            }
        }
        return count;
    }

    /*
     *******************************************************************************************************************
     ***************************************************Task5***********************************************************
     *******************************************************************************************************************
     */

    //*******************************************String*****************************************************************

    /**
     * The word return uppercase.
     * @param param
     * @return uppercase string
     */
    public String upperCase(String param) {
        return param.toUpperCase();
    }

    //*******************************************StringBuilder**********************************************************

    /**
     * The word return uppercase.StringBuilder.
     * @param param
     * @return uppercase string
     */
    public String upperCaseStringBuilder(StringBuilder param) {
        return param.toString().toUpperCase();
    }

    /*
     *******************************************************************************************************************
     ***************************************************Task6***********************************************************
     *******************************************************************************************************************
     */

    /**
     * If the word length is less than twenty, adds the * sign.
     * @param param
     * @return twenty length word
     */
    public StringBuilder twentyLengthString(StringBuilder param) {
        for (int i = 0; i < 20; i++) {
            if (param.length() < 20) {
                param.append('*');
            } else {
                param.delete(20, 100);
            }
        }
        return param;
    }

    /*
     *******************************************************************************************************************
     ***************************************************Task7***********************************************************
     *******************************************************************************************************************
     */

    //*******************************************String*****************************************************************

    /**
     * Deleted << a >> symbols.
     * @param param
     * @return word without a
     */
    public String delete_a_symbols(String param) {
        return param.replaceAll("a", "");
    }

    //*******************************************StringBuilder**********************************************************

    /**
     * deleted << a >> symbols.StringBuilder.
     * @param param
     * @return word without a
     */
    public String deleteSymbol_a(StringBuilder param) {
        return param.toString().replaceAll("a", "");
    }

    /*
     *******************************************************************************************************************
     ***************************************************Task8***********************************************************
     *******************************************************************************************************************
     */

    /**
     * Replaced a symbols with *.
     * @param param
     * @return * instead of a
     */
    public String replaceSymbol_a(String param) {
        return param.replaceAll("a", "*");
    }

    /*
     *******************************************************************************************************************
     ***************************************************Task9***********************************************************
     *******************************************************************************************************************
     */

    /**
     * Find the largest word between spaces.
     * @param param
     * @return largest word
     */
    public String largestWord(String param) {
        String[] arr = param.split(" ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].length() > arr[i + 1].length()) {
                arr[i + 1] = arr[i];
            }
        }
        return arr[arr.length - 1];
    }

    /*
     *******************************************************************************************************************
     ***************************************************Task10**********************************************************
     *******************************************************************************************************************
     */

    /**
     * Find the first index in text for given symbol.
     * @param param1
     * @param param2
     * @return first index given symbol
     */
    public int firstIndexForGivenChar(String param1, String param2) {
        return param1.indexOf(param2);
    }

    /*
     *******************************************************************************************************************
     ***************************************************Task11**********************************************************
     *******************************************************************************************************************
     */

    //*******************************************String*****************************************************************

    /**
     * Print substring for 0 at n index.
     * @param line
     * @param n
     */
    public void printAtZeroForFourIndexes(String line, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(line.charAt(i));
        }
    }

    //*******************************************StringBuilder**********************************************************

    /**
     * Print substring for 0 at n index. StringBuilder.
     * @param line
     * @param n
     */
    public void printSubstring(StringBuilder line, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(line.charAt(i));
        }
    }
    /*
     *******************************************************************************************************************
     ***************************************************Task12**********************************************************
     *******************************************************************************************************************
     */

    /**
     * Check that the given string parameter is empty or no.
     * @param param
     * @return empty or no
     */
    public boolean emptyString(String param) {
        return param.isEmpty();
    }

    /*
     *******************************************************************************************************************
     ***************************************************Task13**********************************************************
     *******************************************************************************************************************
     */

    /**
     * Find the largest word between commas(,).
     * @param text
     * @return largest word
     */
    public String largestWordBetweenCommas(String text) {
        String[] arr = text.split(",");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].length() > arr[i+1].length()){
                arr[i+1] = arr[i];
            }
        }
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        StringUtil str = new StringUtil();
        Scanner sc = new Scanner(System.in);

        /*
        Concatenation with String. Task 1,1.
            System.out.print("Type the word 'hello': ");
            String word1 = sc.next();
            System.out.print("Type the word 'world': ");
            String word2 = sc.next();
            System.out.print("Concatenation result: " + str.concatenation1(word1, word2));
         */

        /*
        Concatenation with String. Task 1,2.
            System.out.print("Type the number '1': ");
            int param1 = sc.nextInt();
            System.out.print("Type the number '2': ");
            int param2 = sc.nextInt();
            System.out.print("Type the word 'hello': ");
            String param3 = sc.next();
            System.out.println("Concatenation result: " + str.concatenation2(param1, param2, param3));
         */

        /*
        Concatenation with String. Task 1,3.
            System.out.print("Type the word '1': ");
            String param1 = sc.next();
            System.out.print("Type the number '2': ");
            int param2 = sc.nextInt();
            System.out.print("Type the word 'hello': ");
            String param3 = sc.next();
            System.out.print("Concatenation result: " + str.concatenation3(param1, param2, param3));
         */

        /*
        Concatenation with String. Task 1,4.
            System.out.print("Type the word 'hello': ");
            String param1 = sc.next();
            System.out.print("Type the number '1': ");
            int param2 = sc.nextInt();
            System.out.print("Type the number '2': ");
            int param3 = sc.nextInt();
            System.out.print("Type the word 'world': ");
            String param4 = sc.next();
            System.out.print("Concatenation result: " + str.concatenation4(param1, param2, param3, param4));
         */

        /*
        Concatenation with StringBuilder. Task 1,1.
            System.out.print("Type the word 'hello': ");
            String param1 = sc.next();
            System.out.print("Type the word 'world': ");
            String param2 = sc.next();
            System.out.print("Concatenation result: " +
                    str.concatenation_1(new StringBuilder(param1),new StringBuilder(param2)));
         */

        /*
        Concatenation with StringBuilder. Task 1,2.
            System.out.print("Type the number '1': ");
            int param1 = sc.nextInt();
            System.out.print("Type the number '2': ");
            int param2 = sc.nextInt();
            System.out.print("Type the word 'hello': ");
            String param3 = sc.next();
            System.out.print("Concatenation result: " + str.concatenation_2(param1, param2, new StringBuilder(param3)));
         */

        /*
        Concatenation with StringBuilder. Task 1,3.
            System.out.print("Type the word '1': ");
            String param1 = sc.next();
            System.out.print("Type the number '2': ");
            int param2 = sc.nextInt();
            System.out.print("Type the word 'hello': ");
            String param3 = sc.next();
            System.out.print("Concatenation result: " +
                    str.concatenation_3(new StringBuilder(param1), param2, new StringBuilder(param3)));
         */

        /*
        Concatenation with StringBuilder. Task 1,4.
            System.out.print("Type the word 'hello': ");
            String param1 = sc.next();
            System.out.print("Type the number '1': ");
            int param2 = sc.nextInt();
            System.out.print("Type the number '2': ");
            int param3 = sc.nextInt();
            System.out.print("Type the word 'world': ");
            String param4 = sc.next();
            System.out.print("Concatenation result: " +
                    str.concatenation_4(new StringBuilder(param1), param2, param3, new StringBuilder(param4)));
         */

        /*
        Task 2.
            System.out.print("Type any sentence: ");
            String param = sc.nextLine();
            System.out.print(str.replacing(param));
         */

        /*
        Task 3.
            System.out.print("Type any word: ");
            String param = sc.next();
            System.out.print("Reverse result: " + str.reveresString(new StringBuilder(param)));
         */

        /*
        Task 4.
            System.out.print("Type any sentence: ");
            String text = sc.nextLine();
            System.out.print("Type any token: ");
            String token = sc.next();
            System.out.print("Token count in text: " + str.tokenInString(text, token));
         */

        /*
        Whit String parameter.Task 5.
            System.out.print("Type any word: ");
            String param = sc.next();
            System.out.print("Uppercase result: " + str.upperCase(param));
         */

        /*
        Whit StringBuilder parameter. Task 5.
            System.out.print("Type any word: ");
            String param = sc.next();
            System.out.println("Uppercase result: " + str.upperCaseStringBuilder(new StringBuilder(param)));
         */

        /*
        Task 6.
            System.out.print("Type any word: ");
            String param = sc.next();
            System.out.print("Result: " + str.twentyLengthString(new StringBuilder(param)));
         */

        /*
        Whit string. Task 7.
            System.out.print("Type any sentence: ");
            String param = sc.nextLine();
            System.out.print("Result: " + str.delete_a_symbols(param));
         */

        /*
        With StringBuilder. Task 7.
            System.out.print("Type any sentence: ");
            String param = sc.nextLine();
            System.out.print("Result: " + str.deleteSymbol_a(new StringBuilder(param)));
         */

        /*
        Task 8.
            System.out.print("Type any sentence: ");
            String text = sc.nextLine();
            System.out.print("Result: " + str.replaceSymbol_a(text));
         */

        /*
        Task 9.
            System.out.print("Type any sentence: ");
            String text = sc.nextLine();
            System.out.print("The largest word in the text: " + str.largestWord(text));
         */

        /*
        Task 10.
            System.out.print("Type the sentence: ");
            String text = sc.nextLine();
            System.out.print("Type the symbol: ");
            String symbol = sc.next();
            System.out.print("Result: " + "Index " + str.firstIndexForGivenChar(text, symbol));
         */

        /*
        With String. Task 11.
            System.out.print("Type the sentence: ");
            String line = sc.nextLine();
            System.out.print("Enter number for last index: ");
            int n = sc.nextInt();
            System.out.print("Result: ");
            str.printAtZeroForFourIndexes(line, n);
         */

        /*
        With StringBuilder. Task 11.
            System.out.print("Type the sentence: ");
            String line = sc.nextLine();
            System.out.print("Enter number for last index: ");
            int n = sc.nextInt();
            System.out.print("Result: ");
            str.printSubstring(new StringBuilder(line), n);
         */

        /*
        Task 12.
            System.out.print("Enter word or nothing: ");
            String word = sc.next();
            System.out.print("Result: " + str.emptyString(word));
         */

        /*
        Task 13.
            System.out.print("Type any sentence: ");
            String param = sc.nextLine();
            System.out.print("Result: " + str.largestWordBetweenCommas(param));
         */

    }
}
