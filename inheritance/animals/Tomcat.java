package inheritance.animals;

public class Tomcat extends  Cat{
    //Tomcats are "Male".

    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
