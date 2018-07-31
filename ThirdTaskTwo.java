import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThirdTaskTwo {
    public static void main(String [] args){
        List<Integer> numberList = new ArrayList();
        numberList.add(12);
        numberList.add(71);
        numberList.add(42);
        numberList.add(96);
        numberList.add(1);
        System.out.print(numberList + " ");
        System.out.println("\nSorted: ");
        Collections.sort(numberList);
        System.out.print(numberList + " ");
    }
}
