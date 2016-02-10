package main.java;

/**
 * Created by jjohnson on 1/19/2016.
 */
public class Test {

    public static void main(String[] args) {
        int value = 50;

        for (int i = 0; value > i; value--) {
            value += value - 1;
        }
        System.out.println(value);
    }
}
