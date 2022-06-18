package giezz.arrays;

import giezz.fruitsboxes.fruits.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainArrays {
    public static void main(String[] args) {

        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(integers));
        swap(integers, 0, 1);
        System.out.println(Arrays.toString(integers));
        List<Integer> integerList = toArrayListMethodOne(integers);
        List<Integer> integerList1 = toArrayListMethodTwo(integers);
        System.out.println(integerList.getClass());
        System.out.println(integerList1.getClass());

        String[] strings = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        System.out.println(Arrays.toString(strings));
        swap(strings, 1, 2);
        System.out.println(Arrays.toString(strings));

        Boolean[] booleans = new Boolean[]{true, false, true, false};
        System.out.println(Arrays.toString(booleans));
        swap(booleans, 2, 3);
        System.out.println(Arrays.toString(booleans));

        Apple[] apples = new Apple[]{ new Apple(), new Apple()};
        System.out.println(Arrays.toString(apples));
        swap(apples, 0, 1);
        System.out.println(Arrays.toString(apples));
    }

    public static <T> void swap(T[] arr, int x1, int x2) {
        T temp = arr[x1];
        arr[x1] = arr[x2];
        arr[x2] = temp;
    }

    public static <T> List<T> toArrayListMethodOne(T[] array) {
        return Arrays.asList(array);
    }

    public static <T> List<T> toArrayListMethodTwo(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
