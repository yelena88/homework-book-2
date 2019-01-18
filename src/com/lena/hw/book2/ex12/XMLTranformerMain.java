package com.lena.hw.book2.ex12;

 /* Задание 12
 Напишите программу, преобразующую созданный в предыдущих заданиях xml файл в html, аналогично данному примеру, в каждой ячейке дополнительно к координате должны выводиться единицы измерения. Результат должен записываться в файл на диске. */

public class XMLTranformerMain {
    public static void main(String[] args) {

      final String INPUT_XML_FILE_PATH = "src/com/lena/hw/book2/ex12/PointsList.xml";
      final String STYLE_SHEET_XSL_FILE_PATH = "src/com/lena/hw/book2/ex12/pointListStylesheet.xsl";
      final String OUTPUT_HTML_FILE_PATH = "src/com/lena/hw/book2/ex12/pointsList.html";

      XMLTransformer transformer = new XMLTransformer();
      try {
        transformer.transformXMLToHTML(INPUT_XML_FILE_PATH, STYLE_SHEET_XSL_FILE_PATH, OUTPUT_HTML_FILE_PATH);
      } catch (Throwable e) {
        e.printStackTrace();
      }
    }
  }

