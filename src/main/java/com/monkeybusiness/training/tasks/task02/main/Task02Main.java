package com.monkeybusiness.training.tasks.task02.main;

import com.monkeybusiness.training.tasks.task02.report.DateReport;
import com.monkeybusiness.training.tasks.task02.service.CustomDateService;

public class Task02Main {
  public static void main(String[] args) {
    int year = 2000;
    int month = 2;
    CustomDateService service = new CustomDateService();
    int res = service.findDaysOfMonthCount(year, month);
    DateReport dateReport = new DateReport();
    dateReport.daysInMonthCount(year, month, res);
  }
}
