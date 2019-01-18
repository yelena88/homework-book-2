package com.lena.hw.book2.ex12;

import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

  public class XMLTransformer {

    public void transformXMLToHTML(String inputXmlFilePath, String stylesheetXslFilePath, String outputHtmlFilePath) throws TransformerException, FileNotFoundException {
      StreamSource streamSource = new StreamSource(new File(stylesheetXslFilePath));
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Templates templates = transformerFactory.newTemplates(streamSource);
      Transformer transformer = templates.newTransformer();
      transformer.transform(new StreamSource(new File(inputXmlFilePath)), new StreamResult(new FileOutputStream(new File(outputHtmlFilePath))));
    }
  }

