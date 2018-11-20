package com.lena.hw.book2.ex2;

/*
Задание 2
Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записанных по правилам Java, с помощью регулярных выражений и вывести их на страницу
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularOf16Numbers {

    public static void main(String[] args) {

        final String regex = "0[xX][0-9a-fA-F]+";
        final String string = "0x7FFF 13 0xBC 1хUN 0x2D3E8F 34";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        System.out.print("Текст для поиска 16-теричных чисел: ");
        System.out.println(string);

        for (int i=1;matcher.find();i++)
            System.out.format("Полное соответствие №%d: %s\n", i, matcher.group());


    }


}
