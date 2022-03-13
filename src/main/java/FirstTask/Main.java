package FirstTask;

public class Main {
    public static void main(String[] args) {

        Integer[] integers = new Integer[10];
        for (int j = 0; j < integers.length; j++) {
            integers[j] = j + 1;
        }

        for (int j = 0; j < integers.length; j++) {
            System.out.print(integers[j]);
        }
        System.out.println();


        int index1 = 6, index2 = 2;
        Integer current1 = null, current2 = null;
        for (int j = 0; j < integers.length; j++) {
            if (j == index1) {           //если объект или srting то  equals
                current1 = integers[j];
                integers[j] = null;
            } else if (j == index2) {
                current2 = integers[j];
                integers[j] = current1;
            }
        }

        for ( int j = integers.length; j >=0; j--) {
            if (j == index1){
                integers[j]= current2;
            } else if (j == index2){
                integers[j]= current1;
            }
        }

        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }


    }
}