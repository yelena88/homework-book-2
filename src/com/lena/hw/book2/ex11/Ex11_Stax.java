package com.lena.hw.book2.ex11;

/*
Задание 11
Напишите программу, которая будет разбирать xml файл сделанный в предыдущих заданиях
с помощью StAX, и выводить его на экран в текстовом виде. Каждая точка должна выводиться
на отдельной строке в виде двух чисел, разделенных запятой, при этом должна выводиться
единица измерения. Например 10рх, 30рх
 */

public class Ex11_Stax {

    private static final String INPUT_XML_FILE_PATH = "src/com/lena/hw/book2/ex11/Ex11.xml";

    public static void main(String[] args) {

      STAXParser staxParser = new STAXParser();
      PointsList pointsList = staxParser.parseXML(INPUT_XML_FILE_PATH);
      String result = pointsList.arrangeEveryPointPerLineWithUnits();
      System.out.println("Результат разбора XML файла:\n" + result);
    }
  }
