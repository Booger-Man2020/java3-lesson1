import java.util.ArrayList;

public class Box {
    public static ArrayList<Object> box1;
    public static ArrayList<Object> box2;
    public static ArrayList<Object> box3;
    public static double box2Weight;
    public static double box1Weight;


    public static void addToBox(Fruit fruit) {
        if (fruit.getClass().getName().contains("Orange")) {
            if (box1 == null) {
                box1 = new ArrayList<>();
                box1.add(fruit);
            } else {
                box1.add(fruit);
            }

        } else if (fruit.getClass().getName().contains("Apple")) {
            if (box2 == null) {
                box2 = new ArrayList<>();
                box2.add(fruit);
            } else {
                box2.add(fruit);
            }
        }
    }

    public static void getWeight() {
        int number1 = 0;
        int number2 = 0;
        if (box1 == null) {
            box1 = new ArrayList<>();
        }
        if (box2 == null) {
            box2 = new ArrayList<>();
        }

        if (box1 != null) {
            for (Object box1 : box1) {
                number1++;
            }
        } else {
            System.out.println("В коробке 1 пусто");
        }

        if (box2 != null) {
            for (Object box2 : box2) {
                number2++;
            }
        } else {
            System.out.println("В коробке 2 пусто");
        }

        if (box1.get(0).getClass().getName().equals("Orange") && box2.get(0).getClass().getName().equals("Apple")) {
            box1Weight = Orange.getWeight() * number1;
            box2Weight = Apple.getWeight() * number2;
            System.out.println("Вес апельсинов в коробке  N1 " + box1Weight + " кг");
            System.out.println("Вес яблок в коробке  N2 " + box2Weight + " кг");

        } else if (box1.get(0).getClass().getName().equals("Apple") || box2.get(0).getClass().getName().equals("Orange")) {
            box1Weight = Apple.getWeight() * number1;
            box2Weight = Orange.getWeight() * number2;
            System.out.println("Вес яблок в коробке  N1 " + box1Weight + " кг");
            System.out.println("Вес апельсинов в коробке  N2 " + box2Weight + " кг");
        }

    }


    public static void compareBox(ArrayList<Object> box1, ArrayList<Object> box2) {

        System.out.println(box1Weight == box2Weight);
    }

    public static void changeBox() {
        box3 = new ArrayList<>(box1);
        box1.removeAll(box1);
        box1 = (ArrayList<Object>) box2.clone();
        box2.removeAll(box2);

        System.out.println(box1.toString());
        System.out.println(box2.toString());

    }

}

