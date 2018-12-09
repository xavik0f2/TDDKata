package io.xavi.unitpower;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator sut;

    @BeforeMethod
    public void setUp(){
        sut = new Calculator();
    }

    @Test
    public void add_empty_zero(){
        int actual = sut.add("");
        int expected = 0;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void add_oneInputNumber_InputNumber(){
        int actual = sut.add("1");
        int expected = 1;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void add_TwoPlusThree_Five(){
        int actual = sut.add("2,3");
        int expected = 5;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void add_MultipleNumbers_Sum(){
        int actual = sut.add("12,15,105,100");
        int expected = 232;
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void add_MultipleNumbersAndMultipleDelimiters_Sum(){
        int actual = sut.add("1\n2,3");
        int expected = 6;
        Assert.assertEquals(actual,expected);

    }
}
