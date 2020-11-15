package com.monkeybusiness.training.tasks.task06.service;

import com.monkeybusiness.training.tasks.task06.service.CustomTimeService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomTimeServiceTest {
    @Test
    public void fullHoursFromSecondsTest() {
        int seconds = 3600;
        int expected = 1;
        CustomTimeService service = new CustomTimeService();
        int actual = service.fullHoursFromSeconds(seconds);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void fullMinutesFromSecondsTest() {
        int seconds = 600;
        int expected = 10;
        CustomTimeService service = new CustomTimeService();
        int actual = service.fullMinutesFromSeconds(seconds);
        Assert.assertEquals(actual, expected);
    }
}
