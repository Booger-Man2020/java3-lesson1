package SecondTask;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        for (int j = 0; j < array.length; j++) {
            array[j] = j + 1;
        }
        ArrayList<Integer> arrayList = new ArrayList();
        Collections.addAll(arrayList,array);

        System.out.println(arrayList.toString());

    }


}
