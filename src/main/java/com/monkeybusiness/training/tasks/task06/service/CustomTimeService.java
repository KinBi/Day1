package com.monkeybusiness.training.tasks.task06.service;

public class CustomTimeService {
  public static final int SECONDS_IN_MINUTE = 60;
  public static final int MINUTES_IN_HOUR = 60;

  public int fullHoursFromSeconds(int seconds) {
    return fullMinutesFromSeconds(seconds) / MINUTES_IN_HOUR;
  }

  public int fullMinutesFromSeconds(int seconds) {
    return seconds / SECONDS_IN_MINUTE;
  }
}
