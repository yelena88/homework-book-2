package com.lena.hw.book2.ex10.ex10_My_Task;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarDOMParser {
  public static void main(String[] args) {
    String filepath = "src/com/lena/hw/book2/ex10/ex10_My_Task/Car_catalog.xml";
    File xmlFile = new File(filepath);
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder;
    try {
      builder = factory.newDocumentBuilder();
      Document document = builder.parse(xmlFile);
      document.getDocumentElement().normalize();
      System.out.println("Корневой элемент: " + document.getDocumentElement().getNodeName());
      // получаем узлы с именем Car
      // теперь XML полностью загружен в память
      // в виде объекта Document
      NodeList nodeList = document.getElementsByTagName("*");

      // создадим из него список объектов Car
      List<Car> carList = new ArrayList<>();
      Car car= new Car();
      for (int i = 0; i < nodeList.getLength(); i++) {

//        if (nodeList.item(i).getFirstChild() != null) {
          switch (nodeList.item(i).getNodeName()) {
            case "year":
              car.setYear(nodeList.item(i).getFirstChild().getNodeValue());
              break;
            case "make":
              car.setMake(nodeList.item(i).getFirstChild().getNodeValue());
              break;
            case "model":
              car.setModel(nodeList.item(i).getFirstChild().getNodeValue());
              break;
            case "color":
              car.setColor(nodeList.item(i).getFirstChild().getNodeValue());
              break;
            case "engine":
              car.setEngine(nodeList.item(i).getFirstChild().getNextSibling().getNodeName());
              car.setNumber_of_cylinders(nodeList.item(i).getFirstChild().getNextSibling().getAttributes()
                      .getNamedItem("number_of_cylinders").getNodeValue());
              car.setFuel_system(nodeList.item(i).getFirstChild().getNextSibling()
                      .getAttributes().getNamedItem("fuel_system").getNodeValue());
              car.setTransmission_type(nodeList.item(i).getFirstChild().getNextSibling()
                      .getAttributes().getNamedItem("transmission_type").getNodeValue());
              car.setNumber_of_gears(nodeList.item(i).getFirstChild().getNextSibling()
                      .getAttributes().getNamedItem("number_of_gears").getNodeValue());
              car.setDrive_train(nodeList.item(i).getFirstChild().getNextSibling()
                      .getAttributes().getNamedItem("drive_train").getNodeValue());
              car.setFuel_tank_capacity(nodeList.item(i).getFirstChild().getNextSibling()
                      .getAttributes().getNamedItem("fuel_tank_capacity").getNodeValue());
              car.setMaximum_speed(nodeList.item(i).getFirstChild().getNextSibling()
                      .getAttributes().getNamedItem("maximum_speed").getNodeValue());
              break;
            case "number_of_doors":
              car.setNumber_of_doors(nodeList.item(i).getFirstChild().getNodeValue());
              break;
            case "accessories":
//              car.setAccessories(nodeList.item(i).getFirstChild().getNextSibling().getNodeName());
              car.setRadio(nodeList.item(i).getFirstChild().getNextSibling().getAttributes()
                      .getNamedItem("radio").getNodeValue());
              car.setAir_conditioner(nodeList.item(i).getFirstChild().getNextSibling()
                      .getAttributes().getNamedItem("air_conditioner").getNodeValue());
              car.setCruise_control(nodeList.item(i).getFirstChild().getNextSibling()
                      .getAttributes().getNamedItem("cruise_control").getNodeValue());
              car.setClimate_control(nodeList.item(i).getFirstChild().getNextSibling()
                      .getAttributes().getNamedItem("climate_control").getNodeValue());
              car.setRear_parking_sensor(nodeList.item(i).getFirstChild().getNextSibling()
                      .getAttributes().getNamedItem("rear_parking_sensor").getNodeValue());
              car.setCornering_lights(nodeList.item(i).getFirstChild().getNextSibling()
                      .getAttributes().getNamedItem("cornering_lights").getNodeValue());
              carList.add(car);
              car = new Car();
              break;
          }
        }
//      }
      carList.forEach(car1 -> System.out.println(car1.toString() + "\n"));

    } catch (ParserConfigurationException e) {
      System.out.println("Error during configuration parser");
      e.printStackTrace();
    } catch (SAXException e) {
      System.out.println("Error occurred during parsing XML");
      e.printStackTrace();
    } catch (IOException e) {
      System.out.println("File not found");
      e.printStackTrace();
    }
  }

  // создаем из узла документа объект Language
  private static Car getCar(Node node) {
    Car car = new Car();
    if (node.getNodeType() == Node.ELEMENT_NODE) {
      Element element = (Element) node;
//      car.setYear((getTagValue("year", element, car)));
//      car.setMake((getTagValue("make", element, car)));
//      car.setModel(getTagValue("model", element, car));
//      car.setColor(getTagValue("color", element, car));
//      car.setEngine(getTagValue("engine", element, car));
//      car.setPetrol(getTagValue("Petrol", element));
//      car.setDiesel(getTagValue("Diesel", element));
//      car.setNumber_of_doors(getTagValue("number_of_doors", element, car));
//      car.setAccessories(getTagValue("accessories", element, car));
    }
    return car;
  }

  // получаем значение элемента по указанному тегу
  private static void getTagValue(String tag, Element element, Car car) {
    NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
    Node node = nodeList.item(0);

    car.setYear(node.getNodeValue());

    for (int i = 0; i < nodeList.getLength(); i++) {
      System.out.println(nodeList.item(i).getNodeValue());
    }
  }
}

