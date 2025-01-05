package interfacesAndAbstraction.carShopExtended;


public interface Car {
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
