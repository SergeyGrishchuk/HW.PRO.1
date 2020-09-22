package HomeWork1;

import HomeWork1.Fruit.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxWithFruits<T extends Fruit> {
    private List<T> capacity;

    public BoxWithFruits(T... fruits) {
        this.capacity = new ArrayList(Arrays.asList(fruits));
    }

    public void add(T fruit){
        capacity.add(fruit);
    }

    public boolean makeComparison(BoxWithFruits<?> any){
        return Math.abs(this.getWeight() - any.getWeight()) < 0.01;
    }

    public float getWeight() {
        float w = 0.0f;
        for (T fruit : capacity) {
            w += fruit.getWeight();
        }
        return w;
    }

    public void shifting(BoxWithFruits<? super T> any) {
        if(any == this){
            return;
        }
        any.capacity.addAll(this.capacity);
        this.capacity.clear();
    }
}
