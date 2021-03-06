package com.lena.hw.book2.ex10.ex10Book;

import java.util.List;

public class PointsList {

  private List<Point> pointsList;

  public PointsList(List<Point> pointsList) {
    this.pointsList = pointsList;
  }

  public void add(Point point) {
    pointsList.add(point);
  }

  public String arrangeEveryPointPerLineWithUnits() {
    StringBuilder resultList = new StringBuilder();
    for (Point currentPoint : pointsList) {
      resultList.append("x: ").append(currentPoint.getX()).append(currentPoint.getUnit()).append(", ");
      resultList.append("y: ").append(currentPoint.getY()).append(currentPoint.getUnit()).append('\n');
    }
    return resultList.toString();
  }
}