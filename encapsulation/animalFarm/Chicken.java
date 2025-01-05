package encapsulation.animalFarm;

public class Chicken {
    private String name;
    private int age;

    //Chicken(String, int)
    //setName(String) : void
    //setAge (int): void
    //productPerDay (): double
    //toString(): Override
    //calculateProductPerDay() : double


    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if(name.isBlank() || name==null){
            throw new IllegalArgumentException("Name cannot be empty.\n");
        }
        this.name = name;
    }

   private void setAge(int age) {
        if(age<0 || age>15){
            throw new IllegalArgumentException("Age should be between 0 and 15.\n");
        }
        this.age = age;
    }

    public double productPerDay () {
return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (%d) can produce %.2f eggs per day.", name, age,productPerDay());
    }

    private double calculateProductPerDay() {
//•	First 6 years it produces 2 eggs per day [0 - 5].
//•	Next 6 years it produces 1 egg per day [6 - 11].
//•	And after that, it produces 0.75 eggs per day.
        if(age>=0 && age<=5){
         return 2;
        }
        else if(age<=11){
            return 1;
        }
        else {
            return 0.75;
        }
    }
}
