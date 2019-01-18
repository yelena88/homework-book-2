package com.lena.hw.book2.ex10.ex10MyTask;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public class CarDOMParser {

  public CarCatalog parseXML(String inputXmlFile) {

    DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
    builderFactory.setIgnoringElementContentWhitespace(true);
    DocumentBuilder documentBuilder = null;
    Document document = null;

    try {
      documentBuilder = builderFactory.newDocumentBuilder();
      document = documentBuilder.parse(inputXmlFile);
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

    assert document != null;
    return doParsing(document);
  }

  private CarCatalog doParsing(Document document) {

    CarCatalog carCatalog = new CarCatalog(new ArrayList<>());
    Element carCatalogRoot = document.getDocumentElement();
    NodeList childNodes = carCatalogRoot.getElementsByTagName(TagsAndAttributes.CAR.getName());
    for (int i = 0; i < childNodes.getLength(); i++) {
      Node currentChild = childNodes.item(i);
      Car currentCar = createCar(currentChild);
      carCatalog.add(currentCar);
    }
    return carCatalog;
  }

  private Car createCar(Node carNode) {
    Car car = new Car();
    Element carElement = (Element) carNode;
    car.setYear(carElement.getAttribute(TagsAndAttributes.YEAR.getName()));
    car.setMake(carElement.getAttribute(TagsAndAttributes.MAKE.getName()));
    car.setModel(carElement.getAttribute(TagsAndAttributes.MODEL.getName()));
    car.setColor(carElement.getAttribute(TagsAndAttributes.COLOR.getName()));
    car.setEngine(carElement.getAttribute(TagsAndAttributes.ENGINE.getName()));
    car.setNumberOfDoors(carElement.getAttribute(TagsAndAttributes.NUMBER_OF_DOORS.getName()));
    car.setAccessories(carElement.getAttribute(TagsAndAttributes.ACCESSORIES.getName()));
//      car.setItems(carElement.getAttribute(TagsAndAttributes.ITEMS.getName));

    NodeList grandChildNodes = carNode.getChildNodes();

    for (int i = 0; i < grandChildNodes.getLength(); i++) {

      Node currentGrandChild = grandChildNodes.item(i);

      if (isYEARNode(currentGrandChild)) {
        car.setYear(currentGrandChild.getTextContent());

      }
      if (isMAKENode(currentGrandChild)) {
        car.setMake(currentGrandChild.getTextContent());

      }
      if (isMODELNode(currentGrandChild)) {
        car.setModel(currentGrandChild.getTextContent());

      }
      if (isCOLORNode(currentGrandChild)) {
        car.setColor(currentGrandChild.getTextContent());

      }
      if (isENGINENode(currentGrandChild)) {

        car.setEngine(currentGrandChild.getFirstChild().getNextSibling().getNodeName());


        car.setNumberOfCylinders(currentGrandChild.getFirstChild().getNextSibling().getAttributes().getNamedItem("number_of_cylinders").getNodeValue());
        car.setFuelSystem(currentGrandChild.getFirstChild().getNextSibling().getAttributes().getNamedItem("fuel_system").getNodeValue());
        car.setTransmissionType(currentGrandChild.getFirstChild().getNextSibling().getAttributes().getNamedItem("transmission_type").getNodeValue());
        car.setNumberOfGears(currentGrandChild.getFirstChild().getNextSibling().getAttributes().getNamedItem("number_of_gears").getNodeValue());
        car.setDriveTrain(currentGrandChild.getFirstChild().getNextSibling().getAttributes().getNamedItem("drive_train").getNodeValue());
        car.setFuelTankCapacity(currentGrandChild.getFirstChild().getNextSibling().getAttributes().getNamedItem("fuel_tank_capacity").getNodeValue());
        car.setMaximumSpeed(currentGrandChild.getFirstChild().getNextSibling().getAttributes().getNamedItem("maximum_speed").getNodeValue());


        }
        if (isNUMBER_OF_DOORSNode(currentGrandChild)) {
          car.setNumberOfDoors(currentGrandChild.getTextContent());

        }
        if (isACCESSORIESNode(currentGrandChild)) {

          car.setAccessories(currentGrandChild.getFirstChild().getNextSibling().getNodeName());

        car.setRadio(currentGrandChild.getFirstChild().getNextSibling().getAttributes().getNamedItem("radio").getNodeValue());
        car.setAirConditioner(currentGrandChild.getFirstChild().getNextSibling().getAttributes().getNamedItem("air_conditioner").getNodeValue());
        car.setCruiseControl(currentGrandChild.getFirstChild().getNextSibling().getAttributes().getNamedItem("cruise_control").getNodeValue());
        car.setClimateControl(currentGrandChild.getFirstChild().getNextSibling().getAttributes().getNamedItem("climate_control").getNodeValue());
        car.setRearParkingSensor(currentGrandChild.getFirstChild().getNextSibling().getAttributes().getNamedItem("rear_parking_sensor").getNodeValue());
        car.setCorneringLights(currentGrandChild.getFirstChild().getNextSibling().getAttributes().getNamedItem("cornering_lights").getNodeValue());

        }
      }
      return car;
    }

    private boolean isYEARNode (Node grandChild){
      return TagsAndAttributes.YEAR.getName().equalsIgnoreCase(grandChild.getNodeName());
    }

    private boolean isMAKENode (Node grandChild){
      return TagsAndAttributes.MAKE.getName().equalsIgnoreCase(grandChild.getNodeName());

    }

    private boolean isMODELNode (Node grandChild){
      return TagsAndAttributes.MODEL.getName().equalsIgnoreCase(grandChild.getNodeName());

    }

    private boolean isCOLORNode (Node grandChild){
      return TagsAndAttributes.COLOR.getName().equalsIgnoreCase(grandChild.getNodeName());

    }

    private boolean isENGINENode (Node grandChild){
      return TagsAndAttributes.ENGINE.getName().equalsIgnoreCase(grandChild.getNodeName());

    }

    private boolean isNUMBER_OF_DOORSNode (Node grandChild){
      return TagsAndAttributes.NUMBER_OF_DOORS.getName().equalsIgnoreCase(grandChild.getNodeName());

    }

    private boolean isACCESSORIESNode (Node grandChild){
      return TagsAndAttributes.ACCESSORIES.getName().equalsIgnoreCase(grandChild.getNodeName());

    }
  }



