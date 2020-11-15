package com.monkeybusiness.training.tasks.task03.service;

public class FigureService {

  public double findSquareSideByArea(double area) {
    double side = Math.sqrt(area);

    return side;
  }

  public double findSquareAreaByDiagonal(double diagonal) {
    double area = Math.pow(diagonal, 2) / 2;

    return area;
  }

  public double findCircleDiameterInscribedInSquare(double area) {
    double squareSide = findSquareSideByArea(area);
    double diameter = Math.hypot(squareSide, squareSide) / 2;

    return diameter;
  }

  public double findSquareInscribedInCircleArea(double diameter) {
    double area = findSquareAreaByDiagonal(diameter);

    return area;
  }

  public double findTimesDiffers(double area1, double area2) {
    double timesDiffers = area1 / area2;

    return timesDiffers;
  }
}
