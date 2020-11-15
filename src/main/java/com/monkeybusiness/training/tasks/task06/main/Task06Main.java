package com.monkeybusiness.training.tasks.task06.main;

import com.monkeybusiness.training.tasks.task06.report.TimeReport;
import com.monkeybusiness.training.tasks.task06.service.CustomTimeService;

public class Task06Main {
  public static void main(String[] args) {
    int seconds = 14456;
    CustomTimeService service = new CustomTimeService();
    int hours = service.fullHoursFromSeconds(seconds);
    int minutes = service.fullMinutesFromSeconds(seconds);
    TimeReport report = new TimeReport();
    report.fullHoursMinutesFromSeconds(hours, minutes, seconds);
  }
}
