package com.monkeybusiness.training.tasks.task10.entity;

public class Segment {
  private double a;
  private double b;

  public Segment(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Segment{");
    sb.append("a=").append(a);
    sb.append(", b=").append(b);
    sb.append('}');
    return sb.toString();
  }
}
