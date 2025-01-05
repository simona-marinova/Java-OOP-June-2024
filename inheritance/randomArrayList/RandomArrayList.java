package inheritance.randomArrayList;


import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList <T> extends ArrayList <T> {
   //•	Public method: getRandomElement(): Object

    public T getRandomElement (){
        int begin = 0;
        int end = size();

        Random random = new Random();
        int index = random.nextInt(begin,end);

        return get(index);

    }
}
