package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        String[] strings = {"1", "2", "3"};
        Integer[] integers = {1, 2, 3, 4};
        System.out.println(toArrayList(strings).size());
        System.out.println(toArrayList(integers).size());
    }

    /**
     * Метод преобразует массив ссылочного типа в ArrayList
     * @param array - исходный массив, который будет преобразован в ArrayList
     * @return - возвращет ArrayList
     */
    private static <T> ArrayList toArrayList(T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }
}