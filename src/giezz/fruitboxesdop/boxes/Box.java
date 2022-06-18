package giezz.fruitboxesdop.boxes;

import giezz.fruitboxesdop.fruits.Banana;
import giezz.fruitboxesdop.fruits.Fruit;

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

    @SuppressWarnings({"unchecked"})
    public Box(Banana... fruits) {
        for (Banana fruit : fruits) {
            fruitList.add((T) fruit);
        }
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

    @Deprecated
    public boolean compareTo(Box<? extends Fruit> fruitBox) {
        return this.getBoxWeight() == fruitBox.getBoxWeight();
    }

    public void moveTo(Box<T> fruitBox) {
        for (T t : fruitList) {
            fruitBox.addFruit(t);
        }

        this.fruitList = Collections.emptyList();
    }

    public void moveTo(BananaBox<Fruit> bananaBox) {
        for (T t : fruitList) {
            bananaBox.addFruit(t);
        }
        this.fruitList = Collections.emptyList();
    }

    @Deprecated
    @SuppressWarnings({"unchecked"})
    public <E extends Fruit> void fillFrom(Box<E> fruitBox) {
        for (int i = 0; i < fruitBox.size(); i++) {
            fruitList.add((T) fruitBox.getFruit(i));
        }

        fruitBox.fruitList = Collections.emptyList();
    }

    public void showWhatInside() {
        if (!this.fruitList.isEmpty()) {
            System.out.println(fruitList.get(0).getClass().getSimpleName() + " " + getClass().getSimpleName());
            for (T t : fruitList) {
                System.out.println(t);
            }
        } else System.out.println("box is empty");
    }

    @Deprecated
    public int size() {
        return this.fruitList.size();
    }

    @Deprecated
    public List<T> getFruitList() {
        return this.fruitList;
    }
}