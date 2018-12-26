package com.lena.hw.book2.ex5;

/*
Задание 5
Создать программу,которая может приветствовать пользователя на трех языках: английском, русском, белорусском.
Требуемый язык и страна должны сообщаться программе в качестве входных параметров. Если входные параметры отсутствуют,
программа должна выдавать сообщение на английском.
 */

        import java.io.IOException;
        import java.util.Locale;
        import java.util.ResourceBundle;

public class GreetingsOnDifferentLanguage {

    public static void main(String[] args) {

        String language = "", country = "";

        System.out.println("Choose one of several options, type a number in the console, than press Enter:");
        System.out.println("==============================================================================");
        System.out.println("1 - English");
        System.out.println("2 - Русский");
        System.out.println("3 - Беларускі");
        System.out.println("==============================================================================");

        char i = 0;

        try {
            i = (char) System.in.read();
        } catch (IOException e1) {

            e1.printStackTrace();
        }
        switch (i) {
            case '1':
                language = "en";
                country = "US";
                break;
            case '2':
                language = "ru";
                country = "RU";
                break;
            case '3':
                language = "be";
                country = "BY";
        }

        Locale loc = new Locale(language, country);

        ResourceBundle rb = ResourceBundle.getBundle("com.lena.hw.book2.ex5.messageBundle", loc);

        String st = rb.getString("message");
        System.out.println(st);
    }
}
