package com.monkeybusiness.training.tasks.task02.service;

public class CustomDateService {
  public static final int LEAP_YEAR_FEBRUARY_DAYS_COUNT = 29;
  public static final int USUAL_YEAR_FEBRUARY_DAYS_COUNT = 28;
  public static final int JANUARY_DAYS_COUNT = 31;
  public static final int MARCH_DAYS_COUNT = 30;
  public static final int FOUR_HUNDRED = 400;
  public static final int FOUR = 4;
  public static final int HUNDRED = 100;

  public int findDaysOfMonthCount(int year, int monthNum) {
    int daysCount = 0;
    switch (monthNum) {
      case 2:
        daysCount = isLeapYear(year)
                ? LEAP_YEAR_FEBRUARY_DAYS_COUNT
                : USUAL_YEAR_FEBRUARY_DAYS_COUNT;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        daysCount = MARCH_DAYS_COUNT;
      default:
        daysCount = JANUARY_DAYS_COUNT;
        break;
    }

    return daysCount;
  }

  public boolean isLeapYear(int year) {
    boolean yearLeap = (year % FOUR_HUNDRED == 0) || (year % FOUR == 0 && year % HUNDRED != 0);

    return yearLeap;
  }
}
