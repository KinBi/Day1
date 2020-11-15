package com.monkeybusiness.training.tasks.task04_05.service;

public class CurrentIntNumberService {
  public boolean isTwoOrMoreEven(int... numbers) {
    int count = 0;
    boolean hasTwoEven = false;

    int i = 0;
    while (i < numbers.length) {
      if (isEven(numbers[i])) {
        count++;
      }

      if (count >= 2) {
        hasTwoEven = true;
        break;
      }

      i++;
    }

    return hasTwoEven;
  }

  public boolean isEven(int number) {
    boolean numberEven = number % 2 == 0;

    return numberEven;
  }

  public boolean isPerfect(int number) {
    int divisorsSum = 0;

    for (int i = 1; i <= number / 2; i++) {
      if (number % i == 0) {
        divisorsSum += i;
      }
    }

    boolean numberPerfect = divisorsSum == number;

    return numberPerfect;
  }
}
