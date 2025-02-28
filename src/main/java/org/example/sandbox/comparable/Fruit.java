package org.example.sandbox.comparable;

import java.util.*;

import static java.lang.Double.compare;

public class Fruit implements Comparable<Fruit> {

    protected String name;
    protected String color;
    protected double weight;

    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public int compareTo(Fruit other) {

        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        }

        int colorComparison = this.color.compareTo(other.color);
        if (colorComparison != 0) {
            return colorComparison;
        }

        return compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fruit{name='").append(name).append('\'')
                .append(", color='").append(color).append('\'')
                .append(", weight=").append(weight)
                .append('}');
        return sb.toString();
    }

    public static void main(String[] args) {

        Fruit banana = new Fruit("Banana", "Yellow", 120.0);
        Fruit apple = new Fruit("Apple", "Red", 150.0);
        Fruit cherry = new Fruit("Cherry", "Red", 10.0);

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(banana);
        fruits.add(apple);
        fruits.add(cherry);

        fruits.forEach(System.out::println);
        System.out.println();

        Collections.sort(fruits);

        fruits.forEach(System.out::println);
    }
}