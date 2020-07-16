package miscellaneous;

import java.util.Random;

public class ZAD2 {

    // metoda przyjmuje jako argument tablice o elementach i rozmiarze losowanych
    // z przedzialu <1, 100> i zwraca 3 tablice:
    // w pierwszej sa same liczby z przedzialu <1, 30>
    // w drugiej sa same liczby z przedzialu (30, 66>
    // w trzeciej pozostale

    static int countElementsInRange(int[] arr, int a, int b) {

        int counter = 0;
        for (int value : arr) {
            if (value >= a && value <= b) {
                ++counter;
            }
        }
        return counter;
    }

    static int[] generateArray(int[] arr, int a, int b) {
        int size = countElementsInRange(arr, a, b);

        if (size <=0){
            throw new IllegalArgumentException("size is not correct");
        }

        if (arr == null) {
            throw new IllegalArgumentException("array is null");
        }

        if (a > b) {
            throw new IllegalArgumentException("incorrect range");
        }

        int[] resultArr = new int[size];

        // TODO - sprawdzic czy do tej pory wszystko dziala. Dokończyć zadanie

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= a && arr[i] <= b) {
                resultArr[idx] = arr[i];
                idx++;
            }
        }

        return resultArr;
    }

    static int[] generateArrayWithNumbersInRange(int a, int b) {
        Random random = new Random();
        int size = random.nextInt(100) + 1;

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            int value = random.nextInt(b-a)+a;
            arr[i] = value;
        }
        return arr;
    }



    public static void main(String[] args) {

        // metoda countElements... działa poprawnie

        int[] input = generateArrayWithNumbersInRange(1,100);
        int[] arr1 = generateArray(input,1,30);
        int[] arr2 = generateArray(input,31,66);
        int[] arr3 = generateArray(input,67,100);
        System.out.println("");



    }

    // TODO
    // Napisz program w ktorym metoda przyjmuje jako argument tablice liczb calkowitych i zwraca
    // dwie tablic - w jednej sa liczby parzyste z tablice podanej jako argument a w drugiej sa
    // liczby nieparzyste z tablicy podanej jako argument. Uwaga tablica wejsciowa moze zawierac
    // rowniez liczby ujemne a my zakladamy ze liczby ujemne w tablicach wynikowych nie sa brane pod
    // uwage
}
