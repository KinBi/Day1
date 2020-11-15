package com.monkeybusiness.training.tasks.task10.report;

public class FunctionReport {
  public void funcValues(double[][] values) {
    System.out.println("Arg\t\t\t\tFunc");
    for (int i = 0; i < values[0].length; i++) {
      System.out.println(values[0][i] + "\t\t\t\t" + values[1][i]);
    }
  }
}
