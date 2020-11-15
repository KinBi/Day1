package com.monkeybusiness.training.tasks.task10.service;

import com.monkeybusiness.training.tasks.task10.entity.Segment;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionServiceTest {
    @Test
    public void findValuesTest() {
        Segment segment = new Segment(1, 1);
        double step = 1;
        double[][] expected = {{},{}};
        FunctionService service = new FunctionService();
        double[][] actual = service.findValues(segment, step);
        Assert.assertEquals(actual, expected);
    }
}
