package com.lena.hw.book2.ex4;

/*
Задание 4
Написать код выводящий число 153.5 в денежном виде для Украины
 */

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {
    public static void main(String[] args){
        double currency = 153.5;
        Locale loc = new Locale("uk","UA");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(loc);
        String currencyOut = currencyFormatter.format(currency);
        System.out.println("Число " + currency + " в денежном виде для " + loc + " " + currencyOut);
        }

}
