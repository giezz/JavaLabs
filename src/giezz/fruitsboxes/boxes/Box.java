package giezz.fruitsboxes.boxes;

import giezz.fruitsboxes.fruits.Fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruitList = new ArrayList<>();

    public Box() {

    }

    @SafeVarargs
    public Box(T... fruits) {
        Collections.addAll(fruitList, fruits);
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public T getFruit(int i) {
        return fruitList.get(i);
    }

    public float getBoxWeight() {
        if (!fruitList.isEmpty()) {
            float weight = 0;
            for (T t : fruitList) {
                weight += t.getWeight();
            }
            return weight;
        }
        return -1.0f;
    }

    public boolean compareTo(Box<? extends Fruit> fruitBox) {
        return this.getBoxWeight() == fruitBox.getBoxWeight();
    }

    public void moveTo(Box<T> fruitBox) {
        for (int i = 0; i < this.fruitList.size(); i++) {
            fruitBox.addFruit(this.getFruit(i));
        }

        this.fruitList = Collections.emptyList();
    }

    public void showWhatInside() {
        for (T t : fruitList) {
            System.out.println(t);
        }
    }
}