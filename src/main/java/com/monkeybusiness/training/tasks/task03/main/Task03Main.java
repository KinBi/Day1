package com.monkeybusiness.training.tasks.task03.main;

import com.monkeybusiness.training.tasks.task03.report.FigureReport;
import com.monkeybusiness.training.tasks.task03.service.FigureService;

public class Task03Main {
  public static void main(String[] args) {
    double squareArea = 16;
    FigureService service = new FigureService();
    double diameter = service.findCircleDiameterInscribedInSquare(squareArea);
    double res = service.findSquareInscribedInCircleArea(diameter);
    double times = service.findTimesDiffers(squareArea, res);
    FigureReport report = new FigureReport();
    report.squareInscribedInCircleInscribedInSquareArea(squareArea);
    report.timesBigger(squareArea, res, times);
  }
}
