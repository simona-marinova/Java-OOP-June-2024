package inheritance.animals;

public class Kitten extends  Cat{
    //Kittens are "Female"


    public Kitten(String name, int age) {
        super(name, age, "Female");
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
