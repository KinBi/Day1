package com.monkeybusiness.training.tasks.task03.service;

import com.monkeybusiness.training.tasks.task03.service.FigureService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FigureServiceTest {
    @Test
    public void findCircleDiameterInscribedInSquareTest() {
        double area = 1;
        double expected = Math.hypot(1, 1) / 2;
        FigureService service = new FigureService();
        double actual = service.findCircleDiameterInscribedInSquare(area);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findSquareAreaByDiagonalTest() {
        double diagonal = 2;
        double expected = 2;
        FigureService service = new FigureService();
        double actual = service.findSquareAreaByDiagonal(diagonal);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findSquareSideByAreaTest() {
        double area = 4;
        double expected = 2;
        FigureService service = new FigureService();
        double actual = service.findSquareSideByArea(area);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findSquareInscribedInCircleAreaTest() {
        double diameter = 2;
        double expected = 2;
        FigureService service = new FigureService();
        double actual = service.findSquareInscribedInCircleArea(diameter);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findTimesDiffersTest() {
        double area1 = 4;
        double area2 = 2;
        double expected = 2;
        FigureService service = new FigureService();
        double actual = service.findTimesDiffers(area1, area2);
        Assert.assertEquals(actual, expected);
    }
}
