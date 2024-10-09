package org.example.Labs.W1D4_Lab4;

import java.util.Arrays;
import java.util.Comparator;

public class P04_FractionalKnapsack {
    public static void main(String[] args) {
        int[] values = {25, 12, 24, 16, 28};
        int[] weights = {5, 6, 8, 2, 7};
        int Wmax = 20;
        System.out.println(STR."max weight in the fractional knapsack:\{fractionalKnapsack(Wmax, values, weights)}");
    }
    public static double fractionalKnapsack(int Wmax, int[] values, int[] weights) {
        int n = values.length;
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(values[i], weights[i]);
        }

        // Sort items by value/weight ratio in descending order
        Arrays.sort(items, Comparator.comparingDouble(Item -> -Item.ratio));

        double maxValue = 0;
        for (Item item : items) {
            if (Wmax - item.weight >= 0) {
                Wmax -= item.weight;
                maxValue += item.value;
            } else {
                maxValue += item.ratio * Wmax;
                break;
            }
        }
        return maxValue;
    }
}

class Item {
    int value, weight;
    double ratio;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.ratio = (double) value / weight;
    }
}
