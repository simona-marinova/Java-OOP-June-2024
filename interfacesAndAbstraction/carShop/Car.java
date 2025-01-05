package interfacesAndAbstraction.carShop;


import java.io.Serializable;

public interface Car extends Serializable {
    Integer TIRES = 4;

    //+getModel(): String
    //+getColor(): String
    //+getHorsePower(): Integer
    //+countryProduced(): String

    String getModel ();

    String getColor();

    Integer getHorsePower ();

    String countryProduced();
}
