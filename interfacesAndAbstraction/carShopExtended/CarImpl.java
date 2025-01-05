package interfacesAndAbstraction.carShopExtended;

public class CarImpl implements Car{
    //+CarImpl(model, color, horsePower, countryProduced)
    //+toString(): String
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    public CarImpl(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    public String toString() {
        //String.format(
        //            "%s is %s color and have %s horse power",
        return  "This is %s produced in %s and have %d tires".formatted(model, countryProduced, TIRES);
    }


    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String countryProduced() {
        return countryProduced;
    }
}
