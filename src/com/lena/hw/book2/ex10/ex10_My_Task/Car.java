package com.lena.hw.book2.ex10.ex10_My_Task;

public class Car {
  String year;
  String make;
  String model;
  String color;
  String engine;
  String Petrol;
  String Diesel;
  String number_of_cylinders;
  String fuel_system;
  String transmission_type;
  String number_of_gears;
  String drive_train;
  String fuel_tank_capacity;
  String maximum_speed;
  String number_of_doors;
  String accessories;
  String radio;
  String air_conditioner;
  String cruise_control;
  String climate_control;
  String rear_parking_sensor;
  String cornering_lights;

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public String getPetrol() {
    return Petrol;
  }

  public void setPetrol(String petrol) {
    Petrol = petrol;
  }

  public String getDiesel() {
    return Diesel;
  }

  public void setDiesel(String diesel) {
    Diesel = diesel;
  }

  public String getNumber_of_cylinders() {
    return number_of_cylinders;
  }

  public void setNumber_of_cylinders(String number_of_cylinders) {
    this.number_of_cylinders = number_of_cylinders;
  }

  public String getFuel_system() {
    return fuel_system;
  }

  public void setFuel_system(String fuel_system) {
    this.fuel_system = fuel_system;
  }

  public String getTransmission_type() {
    return transmission_type;
  }

  public void setTransmission_type(String transmission_type) {
    this.transmission_type = transmission_type;
  }

  public String getNumber_of_gears() {
    return number_of_gears;
  }

  public void setNumber_of_gears(String number_of_gears) {
    this.number_of_gears = number_of_gears;
  }

  public String getDrive_train() {
    return drive_train;
  }

  public void setDrive_train(String drive_train) {
    this.drive_train = drive_train;
  }

  public String getFuel_tank_capacity() {
    return fuel_tank_capacity;
  }

  public void setFuel_tank_capacity(String fuel_tank_capacity) {
    this.fuel_tank_capacity = fuel_tank_capacity;
  }

  public String getMaximum_speed() {
    return maximum_speed;
  }

  public void setMaximum_speed(String maximum_speed) {
    this.maximum_speed = maximum_speed;
  }

  public String getNumber_of_doors() {
    return number_of_doors;
  }

  public void setNumber_of_doors(String number_of_doors) {
    this.number_of_doors = number_of_doors;
  }

  public String getAccessories() {
    return accessories;
  }

  public void setAccessories(String accessories) {
    this.accessories = accessories;
  }

  public String getRadio() {
    return radio;
  }

  public void setRadio(String radio) {
    this.radio = radio;
  }

  public String getAir_conditioner() {
    return air_conditioner;
  }

  public void setAir_conditioner(String air_conditioner) {
    this.air_conditioner = air_conditioner;
  }

  public String getCruise_control() {
    return cruise_control;
  }

  public void setCruise_control(String cruise_control) {
    this.cruise_control = cruise_control;
  }

  public String getClimate_control() {
    return climate_control;
  }

  public void setClimate_control(String climate_control) {
    this.climate_control = climate_control;
  }

  public String getRear_parking_sensor() {
    return rear_parking_sensor;
  }

  public void setRear_parking_sensor(String rear_parking_sensor) {
    this.rear_parking_sensor = rear_parking_sensor;
  }

  public String getCornering_lights() {
    return cornering_lights;
  }

  public void setCornering_lights(String cornering_lights) {
    this.cornering_lights = cornering_lights;
  }

  @Override
  public String toString() {
    return "Car {" +
            "year='" + year + '\'' +
            ", make='" + make + '\'' +
            ", model='" + model + '\'' +
            ", color='" + color + '\'' +
            ", engine='" + engine + '\'' +
            ", number_of_cylinders='" + number_of_cylinders + '\'' +
            ", fuel_system='" + fuel_system + '\'' +
            ", transmission_type='" + transmission_type + '\'' +
            ", number_of_gears='" + number_of_gears + '\'' +
            ", drive_train='" + drive_train + '\'' +
            ", fuel_tank_capacity='" + fuel_tank_capacity + '\'' +
            ", maximum_speed='" + maximum_speed + '\'' +
            ", number_of_doors='" + number_of_doors + '\'' +
            ", accessories: radio='" + radio + '\'' +
            ", air_conditioner='" + air_conditioner + '\'' +
            ", cruise_control='" + cruise_control + '\'' +
            ", climate_control='" + climate_control + '\'' +
            ", rear_parking_sensor='" + rear_parking_sensor + '\'' +
            ", cornering_lights='" + cornering_lights + '\'' +
            '}';
  }
}
