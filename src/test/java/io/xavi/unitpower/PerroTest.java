package io.xavi.unitpower;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PerroTest {

    @Test
    public void saluda__nada__guau(){
        //SUT es la clase bajo test
        Perro sut = new Perro();
        //Actual es lo que voy a testear
        String actual = sut.saluda();

        //Ctrl+P ver las sobrecargas
        String expected ="guau";
        Assert.assertEquals(actual,expected);
    }
}
