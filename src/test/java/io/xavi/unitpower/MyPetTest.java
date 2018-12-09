package io.xavi.unitpower;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyPetTest {

    private static IPet animalNull = new IPet(){
    public String saluda(){
        return null;
    }
    };
    private MyPet sut;

    @BeforeMethod
    public void setUp(){
        sut = new MyPet();

    }

    
    @Test
    public void dimeHola_gato_saludoGato(){

        Gato unGato = new Gato();
        String actual = sut.dimeHola(unGato);
        String expected = "Hola miau";
        Assert.assertEquals(actual, expected);

    }

    @DataProvider
    public static Object [][] animales(){
    return new Object[][]{
            {new Gato(),"Hola miau"},
            {new Perro(), "Hola guau"},
            {animalNull, "Hola"}
        };
    }

    @Test(dataProvider="animales")
    public void dimeHola_variosPets_correctResponse(IPet pet, String expected){
        String actual = sut.dimeHola(pet);
        Assert.assertEquals(actual,expected);
    }

}
