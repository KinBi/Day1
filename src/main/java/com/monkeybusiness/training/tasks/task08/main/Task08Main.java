package com.monkeybusiness.training.tasks.task08.main;

import com.monkeybusiness.training.tasks.task08.report.FunctionReport;
import com.monkeybusiness.training.tasks.task08.service.FunctionService;

public class Task08Main {
  public static void main(String[] args) {
    double x = 5;
    FunctionService service = new FunctionService();
    double res = service.findValue(x);
    FunctionReport report = new FunctionReport();
    report.funcValue(res);
  }
}
