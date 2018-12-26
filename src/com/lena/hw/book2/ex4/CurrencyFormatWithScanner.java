package com.lena.hw.book2.ex4;

/*
Задание 4 (вариант решения через Scanner)
Написать код выводящий любое число, введенное через Scanner, в денежном виде для Украины
 */

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatWithScanner {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type a number in the console, then press Enter:");
            String a = scanner.nextLine();
            NumberFormat format = NumberFormat.getNumberInstance(Locale.getDefault());
            double ad = format.parse(a).doubleValue();

            try {
                double ad2 = Double.parseDouble(a);
            } catch (NumberFormatException e) {
                System.out.println("You have made a non-numeric. Please try again!\n" + "===============================================");
                main(args);
            }

            CurrencyTransaction(ad);
        } catch (ParseException e) {
            System.out.println("You have made a non-numeric. Please try again!\n" + "===============================================");
            main(args);
        }
    }

    private static void CurrencyTransaction(double a) {
        // language type from ISO 639 Language codes
        // country type from ISO 3166 Country Codes
        Locale loc = new Locale("uk", "UA");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(loc);
        System.out.println("Число " + a + " в денежном виде для " + loc + " " + numberFormat.format(a));
    }
}
