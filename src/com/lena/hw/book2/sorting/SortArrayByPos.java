package com.lena.hw.book2.sorting;

/*
Задание 4.1
Выполнить сортировку только четных элементов массива (нечетные элементы
остаются на своих местах)
 */

import java.util.Arrays;

public class SortArrayByPos {
    public static void main(String[] args) {
        int[] array = {12, 54, 31, 86, 14, 21, 5, 91, 44};
        sortEvenArr(array);
    }

    private static void sortEvenArr(int[] array) {
        int[] temp = new int[array.length];
        int even = 0, odd = 0;

        // Размер четного и нечетного массива
        for (int anArray : array) {
            if (anArray % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        int[] evenSorted = new int[even], oddUnsorted = new int[odd];
        // Расспределим массив на четные и нечетные элементы массива
        for (int anArray : array) {
            if (anArray % 2 == 0) { // if even number
                int j = 0;
                while (evenSorted[j] != 0) {
                    j++;
                }
                evenSorted[j] = anArray;

            } else {
                int j = 0;
                while (oddUnsorted[j] != 0) {
                    j++;
                }
                oddUnsorted[j] = anArray;
            }
        }
        //Сортируем только четные элементы массива
        Arrays.sort(evenSorted);

        System.arraycopy(evenSorted, 0, temp, 0, evenSorted.length);
        for (int i = 0; i < temp.length; i++) {
            for (int anOddUnsorted : oddUnsorted) {
                while (temp[i] != 0) {
                    i++;
                }
                temp[i] = anOddUnsorted;
            }
        }

        System.out.print("Первоначальный вид массива: ");
        for (int i : array) {
            System.out.print(i + ", ");
        }

        System.out.print("\nОтсортированный массив: ");
        for (int i : temp) {
            System.out.print(i + ", ");
        }
    }
}
