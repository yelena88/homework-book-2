package com.lena.hw.book2.ex11;

public enum TagsAndAttributes {

  POINTSLIST {
    @Override
    public String getName() {
      return "pointsList";
    }
  },
  POINT {
    @Override
    public String getName() {
      return "point";
    }
  },
  UNIT {
    @Override
    public String getName() {
      return "unit";
    }
  },
  X {
    @Override
    public String getName() {
      return "x";
    }
  },
  Y {
    @Override
    public String getName() {
      return "y";
    }
  };

  public abstract String getName();
}