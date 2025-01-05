package inheritance.stackOfStrings;


import java.util.ArrayList;

public class StackOfStrings {
    //•	Private field: data: ArrayList<String>
    //•	Public method: push(String item): void
    //•	Public method: pop(): String
    //•	Public method: peek(): String
    //•	Public method: isEmpty(): boolean

    private ArrayList<String> data;

    public void push(String item){
        this.data.add(item);
    }

    public String pop (){
        return this.data.remove(data.size()-1);
    }

    public String peek(){
        return data.get(data.size()-1);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }


}
