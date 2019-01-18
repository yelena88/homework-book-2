package com.lena.hw.book2.ex10.ex10MyTask;


import java.util.List;

public class CarCatalog {

  protected List<Car> carCatalog;

  public CarCatalog(List<Car> carCatalog) {
    this.carCatalog = carCatalog;

  }

public void add(Car car) {
  carCatalog.add(car);
}

  public String arrangeEveryCarPerLine() {
    StringBuilder resultList = new StringBuilder();
    for (Car currentCar : carCatalog) {
      resultList.append("car:").append("\n");
      resultList.append("year = '").append(currentCar.getYear()).append("'\n");
      resultList.append("make = '").append(currentCar.getMake()).append("'\n");
      resultList.append("model = '").append(currentCar.getModel()).append("'\n");
      resultList.append("color = '").append(currentCar.getColor()).append("'\n");
      resultList.append("Engine: \n\t").append(currentCar.getEngine()).append(":\n");
      resultList.append("\t\tnumber of cylinders = '").append(currentCar.getNumberOfCylinders()).append("'\n");
      resultList.append("\t\tfuel system = '").append(currentCar.getFuelSystem()).append("'\n");
      resultList.append("\t\ttransmission type = '").append(currentCar.getTransmissionType()).append("'\n");
      resultList.append("\t\tnumber of gears = '").append(currentCar.getNumberOfGears()).append("'\n");
      resultList.append("\t\tdrive train = '").append(currentCar.getDriveTrain()).append("'\n");
      resultList.append("\t\tfuel tank capacity = '").append(currentCar.getFuelTankCapacity()).append("'\n");
      resultList.append("\t\tmaximum speed = '").append(currentCar.getMaximumSpeed()).append("'\n");
      resultList.append("number of doors = '").append(currentCar.getNumberOfDoors()).append("'\n");
      resultList.append("accessories: \n\t").append(currentCar.getAccessories()).append(":\n");
      resultList.append("\t\tradio = '").append(currentCar.getRadio()).append("'\n");
      resultList.append("\t\tair conditioner = '").append(currentCar.getAirConditioner()).append("'\n");
      resultList.append("\t\tcruise control = '").append(currentCar.getCruiseControl()).append("'\n");
      resultList.append("\t\tclimate control = '").append(currentCar.getClimateControl()).append("'\n");
      resultList.append("\t\trear parking sensor = '").append(currentCar.getRearParkingSensor()).append("'\n");
      resultList.append("\t\tcornering lights = '").append(currentCar.getCorneringLights()).append("'\n\n");

    }
    return resultList.toString();
  }
}