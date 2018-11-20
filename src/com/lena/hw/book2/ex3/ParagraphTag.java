package com.lena.hw.book2.ex3;

/*
Задание 3
Написать программу , выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры,
например <p id="p1">, и замену их на простые теги абзацев <p>.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphTag {
    public static void main(String[] args) {

        final String regex = "<p \\S*>";

        String string = "<p id=\"p1\"> test sentence <p id=df> <p id> with tag 3 <p >";
        System.out.println("Первоначальный string: " + string);

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);

        Matcher m = pattern.matcher(string);

        while (m.find()) {
            string = string.replaceAll(m.group(), "<p>");
        }
        System.out.println("Измененный string: " + string);
    }
}

