package com.monkeybusiness.training.tasks.task01.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomNumberServiceTest {
    @Test
    public void findLastDigitTest() {
        int number = 345;
        int expected = 5;
        CustomNumberService service = new CustomNumberService();
        int actual = service.findLastDigit(number);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findLastDigitOfSquareTest() {
        int number = 345;
        int expected = 5;
        CustomNumberService service = new CustomNumberService();
        int actual = service.findLastDigitOfSqr(number);
        Assert.assertEquals(actual, expected);
    }
}
