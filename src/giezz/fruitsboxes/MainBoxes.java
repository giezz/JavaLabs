package giezz.fruitsboxes;

import giezz.fruitsboxes.boxes.Box;
import giezz.fruitsboxes.fruits.Apple;

public class MainBoxes {
    public static void main(String[] args) {

        /* TODO
        *   добавить класс банан
        *   в банан можем через конструктор только бананы
        *   через метод add яблоки и апельсины и банан
        *   пересыпать можем все в бананы
        *   добавление в яблоки только через пересыпку
        */
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>(new Apple(), new Apple());
        appleBox2.addFruit(new Apple());

        System.out.println("aaple box 1");
        appleBox1.showWhatInside();
        System.out.println("aaple box 2");
        appleBox2.showWhatInside();

        appleBox1.moveTo(appleBox2);

        System.out.println("aaple box 1");
        appleBox1.showWhatInside();
        System.out.println("aaple box 2");
        appleBox2.showWhatInside();

    }
}
