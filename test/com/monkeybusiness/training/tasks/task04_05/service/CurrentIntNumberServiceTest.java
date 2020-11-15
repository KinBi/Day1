package com.monkeybusiness.training.tasks.task04_05.service;

import com.monkeybusiness.training.tasks.task04_05.service.CurrentIntNumberService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CurrentIntNumberServiceTest {
    @Test
    public void hasTwoOrMoreEvenTest() {
        int[] numbers = {1, 8, 3, 4};
        CurrentIntNumberService service = new CurrentIntNumberService();
        boolean actual = service.isTwoOrMoreEven(numbers);
        Assert.assertTrue(actual);
    }

    @Test
    public void isEvenTest() {
        int number = 1;
        CurrentIntNumberService service = new CurrentIntNumberService();
        boolean actual = service.isEven(number);
        Assert.assertFalse(actual);
    }

    @Test
    public void isPerfectTest() {
        int number = 6;
        CurrentIntNumberService service = new CurrentIntNumberService();
        boolean actual = service.isPerfect(number);
        Assert.assertTrue(actual);
    }
}
