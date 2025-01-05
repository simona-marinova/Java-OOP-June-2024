//package encapsulation.pizza;
package pizza;

public class Dough {

    private String flourType; //white or wholegrain
    private String bakingTechnique; //crispy, chewy, or homemade.
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if(!flourType.equals("White") && !flourType.equals("Wholegrain")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!bakingTechnique.equals("Crispy") && !bakingTechnique.equals("Chewy") && !bakingTechnique.equals("Homemade")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if(weight<1 || weight>200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    //+	calculateCalories (): double
    //Every ingredient has 2 calories per gram as a base and a modifier that gives the exact calories.
    //Dough Modifiers
    //•	White – 1.5;
    //•	Wholegrain – 1.0;
    //•	Crispy – 0.9;
    //•	Chewy – 1.1;
    //•	Homemade – 1.0;

public double calculateCalories () {
      double firstModifier=0;
      switch(flourType) {
          case "White" -> firstModifier =1.5;
          case "Wholegrain" -> firstModifier=1.0;
      }
      double secondModifier =0;
      switch (bakingTechnique) {
          case "Crispy" -> secondModifier=0.9;
          case "Chewy" -> secondModifier =1.1;
          case "Homemade" -> secondModifier=1.0;
      }
        return 2*weight*firstModifier*secondModifier;
}
}
