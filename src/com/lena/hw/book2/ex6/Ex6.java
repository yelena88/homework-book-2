package com.lena.hw.book2.ex6;

/*
  Задание 6
  Создать простейший логгер, выводящий сообщения об ошибках в тестовый файл. Объект логгера должен быть создан
 с помощью ШП Singleton. У объекта должен быть обязательным один метод, получающий на вход текст сообщения об
 ошибке и записывающий его в файл вместе с информацией о дате и времени проишествия.
*/

public class Ex6 {


    public static void main(String[] args) {
        Test1 firstTest = new Test1();
        Test2 secondTest = new Test2();
        firstTest.exceptionThrowing();
        secondTest.exceptionThrowing();
    }
}
