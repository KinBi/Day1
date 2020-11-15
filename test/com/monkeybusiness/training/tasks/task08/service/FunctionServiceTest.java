package com.monkeybusiness.training.tasks.task08.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionServiceTest {
    @Test
    public void findValueTest() {
        double x = 1;
        double expected = 1. / -5;
        FunctionService service = new FunctionService();
        double actual = service.findValue(x);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void funcArgLessThanThreeTest() {
        double x = 1;
        double expected = 1. / -5;
        FunctionService service = new FunctionService();
        double actual = service.funcArgLessThanThree(x);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void funcArgMoreOrEqualsThanThreeTest() {
        double x = 3;
        double expected = 27;
        FunctionService service = new FunctionService();
        double actual = service.funcArgMoreOrEqualsThanThree(x);
        Assert.assertEquals(actual, expected);
    }
}
