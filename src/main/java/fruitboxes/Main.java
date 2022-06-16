package fruitboxes;

import fruitboxes.fruits.Apple;

public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>(new Apple(), new Apple());
        appleBox.addFruit(new Apple());

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());


        System.out.println("apple box weight = " + appleBox.getBoxWeight());
        System.out.println("apple box 1 weight = " + appleBox1.getBoxWeight());

        appleBox.moveTo(appleBox1);

        System.out.println("apple box 1 weight = " + appleBox1.getBoxWeight());
        System.out.println("apple box weight = " + appleBox.getBoxWeight());

    }
}
