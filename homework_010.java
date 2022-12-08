import java.util.ArrayList;
import java.util.ListIterator;

/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 * 
 */

public class homework_010 {
    public static void main(String[] args) {
        ArrayList<Integer> newArray = homework_009.arrayGenerator();
        homework_009.printArray(newArray.toArray(), "Коллекция случаных чисел");
        newArray = removalEven(newArray);
        homework_009.printArray(newArray.toArray(), "Коллекция чисел без четных");
    }

    public static ArrayList<Integer> removalEven(ArrayList<Integer> array) {
        ListIterator<Integer> it = array.listIterator();
        int value;
        while (it.hasNext()) {
            value = it.next();
            if (value%2==0) {
                it.remove();
            }
        }
        return array;
    }
}
