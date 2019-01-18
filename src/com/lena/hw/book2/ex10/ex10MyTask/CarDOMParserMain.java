package com.lena.hw.book2.ex10.ex10MyTask;


public class CarDOMParserMain {

  private static final String INPUT_XML_FILE = "src/com/lena/hw/book2/ex10/ex10MyTask/CarCatalog.xml";

  public static void main(String[] args) {
    CarDOMParser carDOMParser = new CarDOMParser();
    CarCatalog carCatalog = carDOMParser.parseXML(INPUT_XML_FILE);
    String result = carCatalog.arrangeEveryCarPerLine();
    System.out.println("Result of parsing the XML file:\n" + result);
  }

}
