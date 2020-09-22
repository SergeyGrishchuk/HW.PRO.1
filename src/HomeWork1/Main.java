package HomeWork1;

import HomeWork1.Fruit.Apple;
import HomeWork1.Fruit.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String[] arr = {"one", "two", "three", "four", "five"};
        ArrayList<String> list = arrayList(arr);
        System.out.println(list);

        BoxWithFruits<Apple> box1 = new BoxWithFruits<>();
        BoxWithFruits<Orange> box2 = new BoxWithFruits<>();
    }

    public static <T> ArrayList<T> arrayList(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static <T> void replacement(T[] arr, int number1, int number2){
        T object = arr[number1];
        arr[number1] = arr [number2];
        arr[number2] = object;
    }
}
