package io.xavi.unitpower;

import org.junit.Test;
import org.testng.Assert;

public class CalculatorTest {

    @Test
    public void add_empty_zero(){
        Calculator sut = new Calculator();
        int actual = sut.add("");
        int expected = 0;
        Assert.assertEquals(actual,expected);
    }
}
