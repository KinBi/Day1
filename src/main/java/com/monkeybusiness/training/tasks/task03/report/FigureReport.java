package com.monkeybusiness.training.tasks.task03.report;

public class FigureReport {
  public void squareInscribedInCircleInscribedInSquareArea
          (double squareArea) {
    System.out.println("Area of square is: " + squareArea);
  }

  public void timesBigger(double area1,
                          double area2,
                          double times) {
    System.out.println("Area " + area1
            + " area " + area2
            + " differs by " + times + " times");
  }
}
