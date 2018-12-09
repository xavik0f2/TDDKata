package io.xavi.unitpower;

public class MyPet {
    public String dimeHola(IPet pet) {
        String saludo = (pet.saluda() == null) ? "" : pet.saluda();
        String SaludoCompuesto = "Hola " +pet.saluda() ;
        return SaludoCompuesto.trim();
    }
}
