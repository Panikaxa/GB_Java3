package lesson1.Task3;

import lesson1.Task3.fruits.Fruit;
import java.util.ArrayList;

public class BoxWithFruits<T extends Fruit> {
    private ArrayList<T> box;

    public BoxWithFruits() {
       box = new ArrayList<>();
    }

    public float getWeight() {
        float weight = 0.0f;
        for(T fruit: box) weight += fruit.getWeight();
        return weight;
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public boolean compareByWeight(BoxWithFruits<?> anotherBox) {
        return getWeight() == anotherBox.getWeight();
    }

    public void addFruit(T fruit){
        box.add(fruit);
    }

    public void addFruit(int amount, T fruit){
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }

    public void putFruitsInAnotherBox(BoxWithFruits<T> anotherBox){
        anotherBox.getBox().addAll(anotherBox.getBox().size()-1, this.box);
        this.box.clear();
    }
}
