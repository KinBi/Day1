package com.monkeybusiness.training.tasks.task10.service;

import com.monkeybusiness.training.tasks.task10.entity.Segment;

public class FunctionService {
  public double[][] findValues(Segment segment, double step) {
    int count = (int) ((segment.getB() - segment.getA()) / step);
    double[][] values = new double[2][count];

    int j = 0;
    for (double i = segment.getA(); i < segment.getB(); i += step) {
      values[0][j] = i;
      values[1][j] = Math.tan(i);
      j++;
    }

    return values;
  }
}
