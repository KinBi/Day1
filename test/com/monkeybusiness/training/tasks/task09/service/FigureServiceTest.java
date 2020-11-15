package com.monkeybusiness.training.tasks.task09.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FigureServiceTest {
    @Test
    public void findCircleAreaByRadiusTest() {
        double radius = 1;
        double expected = Math.PI;
        FigureService service = new FigureService();
        double actual = service.findCircleAreaByRadius(radius);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findCircleLengthByRadiusTest() {
        double radius = 1;
        double expected = Math.PI * 2;
        FigureService service = new FigureService();
        double actual = service.findCircleLengthByRadius(radius);
        Assert.assertEquals(actual, expected);
    }
}
