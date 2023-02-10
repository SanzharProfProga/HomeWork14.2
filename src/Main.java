public class Main {
    public static void main(String[] args) {

        Banana banana = new Banana("Banana", "Yellow", 0.300, new Vitamin('C'));
        Apple apple = new Apple("Apple", "Green", 0.244, new Vitamin('E'));
        Orange orange = new Orange("Orange", "Orange", 0.430, new Vitamin('H'));
        Fruits[] fruits = {banana, apple, orange};
        for (Fruits f : fruits) {
            System.out.println(f.toString());
        }


    }
}