import java.util.ArrayList;
import java.util.Scanner;
public class collection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(34);
        numbers.add(0, 12);
        numbers.set(2,30);
        System.out.println("вывод элемента " + numbers.get(0));
        numbers.remove(1);
        for (Integer element : numbers) {
            System.out.println(element);
        }
    }

}