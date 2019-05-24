package lesson1;

public class Task1 {
    public static void main(String[] args) {

        String[] strings = {"1", "2", "3"};
        Integer[] integers = {1, 2, 3};
        changePosition(strings, 0, 1);
        System.out.println();
        changePosition(integers, 1, 2);
    }

    /**
     * Обощенный метод, меняющий местами элементы на указанных позициях
     * @param array - исходный массив
     * @param firstPos - позиция первого элемента для замены
     * @param secondPos - позиция второго элемента для замены
     */
    private static <T> void changePosition(T[] array, int firstPos, int secondPos){
        T temp = array[firstPos];
        array[firstPos] = array[secondPos];
        array[secondPos] = temp;
        for (T element : array) System.out.print(element);
    }
}
