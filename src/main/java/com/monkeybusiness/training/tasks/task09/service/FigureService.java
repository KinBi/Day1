package com.monkeybusiness.training.tasks.task09.service;

public class FigureService {
  public double findCircleAreaByRadius(double radius) {
    double circleArea = Math.PI * Math.pow(radius, 2);

    return circleArea;
  }

  public double findCircleLengthByRadius(double radius) {
    double circleLength = Math.PI * 2 * radius;

    return circleLength;
  }
}
