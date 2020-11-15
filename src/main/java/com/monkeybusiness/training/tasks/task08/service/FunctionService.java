package com.monkeybusiness.training.tasks.task08.service;

public class FunctionService {
  public double funcArgMoreOrEqualsThanThree(double x) {
    double result = Math.pow(x, 2) + 3 * x + 9;

    return result;
  }

  public double funcArgLessThanThree(double x) {
    double result = 1 / (Math.pow(x, 3) - 6);

    return result;
  }

  public double findValue(double x) {
    double value;

    if (x >= 3) {
      value = funcArgMoreOrEqualsThanThree(x);
    } else {
      value = funcArgLessThanThree(x);
    }

    return value;
  }
}
