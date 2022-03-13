public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Fruit apple2 = new Apple();
        Fruit apple3 = new Apple();
        Fruit apple4 = new Apple();
        Fruit apple5 = new Apple();
        Fruit apple6 = new Apple();
        Fruit apple7 = new Apple();

        Fruit orange1 = new Orange();
        Fruit orange2 = new Orange();
        Fruit orange3 = new Orange();
        Fruit orange4= new Orange();
        Fruit orange5 = new Orange();


        Box.addToBox(apple1);
        Box.addToBox(apple2);
        Box.addToBox(apple3);
        Box.addToBox(apple4);
        Box.addToBox(apple5);
        Box.addToBox(apple6);
        Box.addToBox(apple7);

        Box.addToBox(orange1);
        Box.addToBox(orange2);
        Box.addToBox(orange3);
        Box.addToBox(orange4);
        Box.addToBox(orange5);

        Box.getWeight();

        Box.compareBox(Box.box1, Box.box2);
        Box.changeBox();
        Box.getWeight();


    }
}
