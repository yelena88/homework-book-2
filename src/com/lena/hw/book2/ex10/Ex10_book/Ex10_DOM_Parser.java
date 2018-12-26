package com.lena.hw.book2.ex10.Ex10_book;

public class Ex10_DOM_Parser {

  private static final String INPUT_XML_FILE_PATH = "src/com/lena/hw/book2/ex10/Ex10_book/PointsList.xml";

  public static void main(String[] args) {

    DOMParser domParser = new DOMParser();
    PointsList pointsList = domParser.parseXML(INPUT_XML_FILE_PATH);
    String result = pointsList.arrangeEveryPointPerLineWithUnits();
    System.out.println("Результат разбора XML файла:\n" + result);
  }

}
