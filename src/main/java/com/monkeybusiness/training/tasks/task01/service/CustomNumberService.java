package com.monkeybusiness.training.tasks.task01.service;

public class CustomNumberService {

  public int findLastDigit(int number) {
    int lastDigit = number % 10;

    return lastDigit;
  }

  public int findLastDigitOfSqr(int number) {
    int lastDigit = findLastDigit(number);
    int lastDigitSqr = (int) Math.pow(lastDigit, 2);

    int result = findLastDigit(lastDigitSqr);

    return result;
  }
}
