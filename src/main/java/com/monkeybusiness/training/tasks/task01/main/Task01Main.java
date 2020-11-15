package com.monkeybusiness.training.tasks.task01.main;

import com.monkeybusiness.training.tasks.task01.report.NumberReport;
import com.monkeybusiness.training.tasks.task01.service.CustomNumberService;

public class Task01Main {
  public static void main(String[] args) {
    int number = 527;
    CustomNumberService service = new CustomNumberService();
    int res = service.findLastDigitOfSqr(number);
    NumberReport report = new NumberReport();
    report.lastDigitOfSquare(number, res);
  }
}
