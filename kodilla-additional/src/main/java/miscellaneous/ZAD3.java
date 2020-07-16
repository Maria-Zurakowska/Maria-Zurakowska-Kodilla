package miscellaneous;

// // Napisz program w ktorym metoda przyjmuje jako argument tablice liczb calkowitych i zwraca
//    // dwie tablic - w jednej sa liczby parzyste z tablice podanej jako argument a w drugiej sa
//    // liczby nieparzyste z tablicy podanej jako argument. Uwaga tablica wejsciowa moze zawierac
//    // rowniez liczby ujemne a my zakladamy ze liczby ujemne w tablicach wynikowych nie sa brane pod
//    // uwage

import java.util.Random;

public class ZAD3 {

    public static int[] selectWithRemainder(int[] arr, int r) {
        int counter = 0;

        for (int n : arr) {
            if (n % 2 == r && n>=0) {
                counter++;
            }
        }
        int[] result = new int[counter];
        int idx = 0;
        for (int n : arr) {
            if (n % 2 == r && n>=0) {
                result[idx] = n;
                idx++;
            }
        }
        return result;
    }


    public static void main(String[] args) {

        Random random = new Random();
        int size = random.nextInt(100) + 50;

        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            int value = random.nextInt(100) - 50;
            input[i] = value;
        }
        int[] even = selectWithRemainder(input,0);
        int[] odd = selectWithRemainder(input,1);
        System.out.println("");
    }


}
