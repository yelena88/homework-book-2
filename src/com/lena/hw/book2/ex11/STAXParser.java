package com.lena.hw.book2.ex11;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class STAXParser {

  private PointsList pointsList;
  private Point point;
  private TagsAndAttributes currentElement;

  public PointsList parseXML(String inputXmlFilePath) {
    try (InputStream inputStream = new FileInputStream(inputXmlFilePath)) {
      XMLInputFactory inputFactory = XMLInputFactory.newInstance();
      XMLStreamReader reader = inputFactory.createXMLStreamReader(inputStream);
      doParsing(reader);
    } catch (XMLStreamException e) {
      System.err.println("Error occurred during parsing XML: " + inputXmlFilePath);
      e.printStackTrace();
    } catch (FileNotFoundException e) {
      System.err.println("File not found: " + inputXmlFilePath);
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return pointsList;
  }

  private void doParsing(XMLStreamReader reader) throws XMLStreamException {
    while (reader.hasNext()) {
      int currentNodeType = reader.next();
      if (currentNodeType == XMLStreamConstants.START_ELEMENT) {
        processStartElement(reader);
      } else if (currentNodeType == XMLStreamConstants.CHARACTERS) {
        processCharacters(reader);
      } else if (currentNodeType == XMLStreamConstants.END_ELEMENT) {
        processEndElement(reader);
      }
    }
  }

  private void processStartElement(XMLStreamReader reader) {
    currentElement = TagsAndAttributes.valueOf(reader.getLocalName().toUpperCase());
    if (currentElement == TagsAndAttributes.POINTSLIST) {
      pointsList = new PointsList(new ArrayList<>());
    } else if (currentElement == TagsAndAttributes.POINT) {
      point = new Point();
      if (TagsAndAttributes.UNIT == TagsAndAttributes.valueOf(reader.getAttributeLocalName(0).toUpperCase())) {
        point.setUnit(reader.getAttributeValue(0));
      }
    }
  }

  private void processCharacters(XMLStreamReader reader) {
    if (reader.isWhiteSpace()) {
      return;
    }
    if (currentElement == TagsAndAttributes.X) {
      point.setX(Double.parseDouble(reader.getText()));
    } else if (currentElement == TagsAndAttributes.Y) {
      point.setY(Double.parseDouble(reader.getText()));
    }
  }

  private void processEndElement(XMLStreamReader reader) {
    currentElement = TagsAndAttributes.valueOf(reader.getLocalName().toUpperCase());
    if (currentElement == TagsAndAttributes.POINT) {
      pointsList.add(point);
    }
  }
}