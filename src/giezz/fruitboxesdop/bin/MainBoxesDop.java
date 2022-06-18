package giezz.fruitboxesdop.bin;

import giezz.fruitboxesdop.boxes.AppleBox;
import giezz.fruitboxesdop.boxes.BananaBox;
import giezz.fruitboxesdop.boxes.Box;
import giezz.fruitboxesdop.fruits.Apple;
import giezz.fruitboxesdop.fruits.Banana;
import giezz.fruitboxesdop.fruits.Fruit;
import giezz.fruitboxesdop.fruits.Orange;

public class MainBoxesDop {
    public static void main(String[] args) {

        /* TODO
        *   добавить класс банан
        *   в банан можем через конструктор только бананы
        *   через метод add яблоки и апельсины и банан
        *   пересыпать можем все в бананы
        *   добавление в яблоки только через пересыпку и через add
        */

        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange());

        Box<Apple> appleBox1 = new Box<>(new Apple());

        AppleBox<Apple> appleBox = new AppleBox<>();
        appleBox.addFruit(new Apple());

        BananaBox<Fruit> bananaBox = new BananaBox<>(new Banana(), new Banana());

        bananaBox.showWhatInside();
        orangeBox.moveTo(bananaBox);
        appleBox.moveTo(bananaBox);
        appleBox1.moveTo(bananaBox);
        bananaBox.showWhatInside();

        System.out.println();
        System.out.println(bananaBox.getBoxWeight());

        appleBox.moveTo(appleBox1);
        appleBox1.showWhatInside();

        System.out.println(bananaBox.compareTo(orangeBox));

    }
}
