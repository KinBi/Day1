package com.monkeybusiness.training.tasks.task09.main;

import com.monkeybusiness.training.tasks.task09.report.FigureReport;
import com.monkeybusiness.training.tasks.task09.service.FigureService;

public class Task09Main {
  public static void main(String[] args) {
    double radius = 10;
    FigureService service = new FigureService();
    double area = service.findCircleAreaByRadius(radius);
    double length = service.findCircleLengthByRadius(radius);
    FigureReport report = new FigureReport();
    report.circleArea(area);
    report.circleLength(length);
  }
}
