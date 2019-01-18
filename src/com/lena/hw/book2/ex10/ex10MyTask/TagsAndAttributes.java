package com.lena.hw.book2.ex10.ex10MyTask;

public enum TagsAndAttributes {
  CARCATALOG {
    @Override
    public String getName (){
      return "car_catalog";
    }

  },
  CAR {
    @Override
    public String getName (){
      return "car";
    }
  },
  YEAR {
    @Override 
    public String getName (){
      return "year";
    }
  },
  MAKE {
    @Override
    public String getName (){
      return "make";
    }
  },
  MODEL {
    @Override
    public String getName (){
      return "model";
    }
  },
  COLOR {
    @Override
    public String getName (){
      return "color";
    }
  },
  ENGINE {
    @Override 
    public String getName () {
      return "Engine";
    }
  },
  PETROL {
    @Override 
    public String getName () {
      return "Petrol";
    }
  },
  DIESEL {
    @Override 
    public String getName () {
      return "Diesel";
    }
  },
  NUMBER_OF_DOORS {
    @Override
    public String getName () {
      return "numberOfDoors";
    }
  },
  ACCESSORIES {
    @Override 
    public String getName () {
      return "accessories";
    }
  },
  ITEMS {
    @Override
    public String getName() {
      return "Items";
    }
  };

  public String getName;

  public abstract String getName();
}
