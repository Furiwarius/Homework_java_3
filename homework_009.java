import java.util.ArrayList;

/**
 * homework_009
 * Реализовать алгоритм сортировки слиянием
 */

public class homework_009 {
    public static void main(String[] args) {
        ArrayList<Integer> array = arrayGenerator();
        printArray(array.toArray(), "Коллекция случаных чисел");
        array = mergeSorted(array);
        printArray(array.toArray(), "Отсортированный список чисел");
    }


    public static void printArray(Object[] array, String massage) {
        System.out.println(massage);
        for (Object i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }


    public static ArrayList<Integer> merge(ArrayList<Integer> l, ArrayList<Integer> r) {
        ArrayList<Integer> mergerList = new ArrayList<Integer>();
        int rIndex = 0;
        int lIndex = 0;
        while (lIndex<l.size() & rIndex<r.size()) {
            if (l.get(lIndex)<r.get(rIndex)) {
                mergerList.add(l.get(lIndex));
                lIndex++;
            } else {
                mergerList.add(r.get(rIndex));
                rIndex++;
            }
        }
        if (lIndex==l.size()) {
            ArrayList<Integer> right = new ArrayList<Integer>(r.subList(rIndex, r.size()));
            mergerList.addAll(right);
        } else {
            ArrayList<Integer> left = new ArrayList<Integer>(l.subList(lIndex, l.size()));
            mergerList.addAll(left);
        }
        return mergerList;
    }


    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> array) {
        if (array.size()<=1) {
            return array;
        }
        ArrayList<Integer> l = new ArrayList<Integer>(array.subList(0, (int)array.size()/2));
        ArrayList<Integer> left = mergeSorted(l);
        ArrayList<Integer> r = new ArrayList<Integer>(array.subList((int)array.size()/2, array.size()));
        ArrayList<Integer> right = mergeSorted(r);
        return merge(left, right);
    }


    public static ArrayList<Integer> arrayGenerator() {
        // генерация коллекции случайной длины со случайными значениями без повторений
        int amount = (int) (Math.random()*15)+5; // [5:20]
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        boolean flag = true;
        int value;
        for (int i = 0; i < amount; i++) {
            while (flag){
                value = (int) (Math.random()*50)+1; // [1:50]
                if (newArray.indexOf(value)==-1) {
                    newArray.add(value);
                    flag = false;
                }
            }
            flag = true;
        }
        return newArray;
    }
}