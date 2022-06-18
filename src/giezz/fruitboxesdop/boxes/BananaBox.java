package giezz.fruitboxesdop.boxes;

import giezz.fruitboxesdop.fruits.Banana;
import giezz.fruitboxesdop.fruits.Fruit;

public class BananaBox<T extends Fruit> extends Box<T> {

    public BananaBox(Banana... fruits) {
        super(fruits);
    }
}
