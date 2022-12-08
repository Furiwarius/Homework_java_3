import java.util.ArrayList;

/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. 
 * 
 */

public class homework_011 {
    public static void main(String[] args) {
        ArrayList<Integer> newArray = homework_009.arrayGenerator();
        homework_009.printArray(newArray.toArray(), "Коллекция случаных чисел");
        printMin(newArray);
        printMax(newArray);
        printAverage(newArray);
    }

    public static void printMin(ArrayList<Integer> array) {
        int min = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            min = Math.min(min, array.get(i));
        }
        System.out.printf("Минимальное в списке: %d\n", min);
    }


    public static void printMax(ArrayList<Integer> array) {
        int max = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            max = Math.max(max, array.get(i));
        }
        System.out.printf("Максимальное в списке: %d\n", max);
    }


    public static void printAverage(ArrayList<Integer> array) {
        double sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum+=array.get(i);
        }
        double average = sum/(double)array.size();
        System.out.printf("Среднее в списке: %.2f", average);
    }
}
