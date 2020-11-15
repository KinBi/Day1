package com.monkeybusiness.training.tasks.task10.main;

import com.monkeybusiness.training.tasks.task10.entity.Segment;
import com.monkeybusiness.training.tasks.task10.report.FunctionReport;
import com.monkeybusiness.training.tasks.task10.service.FunctionService;

public class Task10Main {
  public static void main(String[] args) {
    Segment segment = new Segment(2, 5);
    double step = 1;
    FunctionService service = new FunctionService();
    double[][] res = service.findValues(segment, step);
    FunctionReport report = new FunctionReport();
    report.funcValues(res);
  }
}
