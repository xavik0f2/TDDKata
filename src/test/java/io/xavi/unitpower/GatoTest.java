package io.xavi.unitpower;

import org.junit.Test;
import org.testng.Assert;

public class GatoTest {

    @Test
    public void saluda_nada_miau(){
        Gato sut = new Gato();
        String actual = sut.saluda();
        String expected = "miau";
        Assert.assertEquals(actual,expected);
    }
}
