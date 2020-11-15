package com.monkeybusiness.training.tasks.task02.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomDateServiceTest {
    @Test
    public void findDaysOfMonthCountTest() {
        int year = 2000;
        int month = 2;
        int expected = 29;
        CustomDateService service = new CustomDateService();
        int actual = service.findDaysOfMonthCount(year, month);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void isLeapYearTest() {
        int year = 2000;
        boolean expected = true;
        CustomDateService service = new CustomDateService();
        boolean actual = service.isLeapYear(year);
        Assert.assertEquals(actual, expected);
    }
}
