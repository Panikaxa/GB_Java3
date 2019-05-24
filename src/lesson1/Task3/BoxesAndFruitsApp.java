package lesson1.Task3;

import lesson1.Task3.fruits.Apple;
import lesson1.Task3.fruits.Orange;

public class BoxesAndFruitsApp {
    public static void main(String[] args) {
        BoxWithFruits<Apple> box1 = new BoxWithFruits<>();
        box1.addFruit(5, new Apple());

        BoxWithFruits<Orange> box2 = new BoxWithFruits<>();
        box2.addFruit(5, new Orange());

        BoxWithFruits<Apple> box3 = new BoxWithFruits<>();
        box3.addFruit(5, new Apple());

        BoxWithFruits<Orange> box4 = new BoxWithFruits<>();
        box4.addFruit(4, new Orange());

        System.out.println("Вес box1 " + box1.getWeight());
        System.out.println("Вес box2 " + box2.getWeight());
        System.out.println("Вес box3 " + box3.getWeight());
        System.out.println("Вес box4 " + box4.getWeight());

        System.out.println(box1.compareByWeight(box2));
        System.out.println(box1.compareByWeight(box3));
        System.out.println(box1.compareByWeight(box4));

        box1.putFruitsInAnotherBox(box3);

        System.out.println(box1.getWeight());
        System.out.println(box3.getWeight());

    }
}
