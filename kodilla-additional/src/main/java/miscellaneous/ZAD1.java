package miscellaneous;

/*
    Pobierasz od usera napis i na jego podstawie generujesz tablice znakow ktora
    sklada sie z tych znakow pobranego napisu, ktore maja kod o lacznej sumie
    cyfr wiekszej niz podany argument x
*/


import java.util.Scanner;

public class ZAD1 {

    static String getString(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    static int charCodeDigitsSum(char c) {
        int sum = 0;
        while (c > 0) {
            sum += c % 10;
            c /= 10;
        }
        return sum;
    }

    static char[] findCharsWithCodeDigitsSumGreaterThan(String expression, int x) {

        if (expression == null) {
            throw new IllegalArgumentException("expression string is null");
        }

        if (x <= 0) {
            throw new IllegalArgumentException("incorrect integer value");
        }

        StringBuilder sb = new StringBuilder();

        for (char c : expression.toCharArray()) {
            if (charCodeDigitsSum(c) > x) {
                sb.append(c);
            }
        }

        return sb
                .toString()
                .toCharArray();
    }

    public static String[] stringsWithCodeDigitsSumGreaterAndLesserThan(String secondExpression, int x) {

        if (secondExpression == null) {
            throw new IllegalArgumentException("expression string is null");
        }

        if (x <= 0) {
            throw new IllegalArgumentException("incorrect integer value");
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (char c : secondExpression.toCharArray()) {
            if (c < x) {
                sb1.append(c);
            } else if (c > x) {
                sb2.append(c);
            }
        }

        String[] result = new String[2];
        result[0] = sb1.toString();
        result[1] = sb2.toString();

        return result;
    }

    public static void main(String[] args) {
//        String expression = getString("Enter string:");
//        char[] chars = findCharsWithCodeDigitsSumGreaterThan(expression, 15);
//        System.out.println(Arrays.toString(chars));
        //----------
//        String secondExpression = getString("Enter second String: ");
//        String[] strings = stringsWithCodeDigitsSumGreaterAndLesserThan(secondExpression,15);
//        System.out.println(Arrays.toString(strings));
        String[] arr = stringsWithCodeDigitsSumGreaterAndLesserThan("Kasia", 10);
        //System.out.println(arr);
            for (String s : arr ){
                System.out.println(s);
            }

    }

    // TODO
    // Pobierz od usera napis i zwroc tablice dwoch napisow
    // Pierwszy napis w tablicy zawiera znaki ktorych kod jest mniejszy od podanej jako argument
    // wartosci x.
    // Drugi napis w tablicy zawiera znaki ktorych kod jest wiekszy od podanej jako argument
    // wartosci x.
}
