package com.monkeybusiness.training.tasks.task04_05.main;

import com.monkeybusiness.training.tasks.task04_05.report.IntNumberReport;
import com.monkeybusiness.training.tasks.task04_05.service.CurrentIntNumberService;

public class Task04_05Main {
  public static void main(String[] args) {
    int[] numbers = {1, 3, 6, 16};
    CurrentIntNumberService service = new CurrentIntNumberService();
    boolean res1 = service.isTwoOrMoreEven(numbers);
    IntNumberReport report = new IntNumberReport();
    report.hasTwoOrMoreEven(res1);
    int perfectNum = 28;
    boolean res2 = service.isPerfect(perfectNum);
    report.isPerfectNum(perfectNum, res2);
  }
}
