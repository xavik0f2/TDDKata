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

    @Test
    public void add_oneInputNumber_InputNumber(){
        Calculator sut = new Calculator();
        int actual = sut.add("1");
        int expected = 1;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void add_TwoPlusThree_Five(){
        Calculator sut = new Calculator();
        int actual = sut.add("2,3");
        int expected = 5;
        Assert.assertEquals(actual,expected);
    }
}
