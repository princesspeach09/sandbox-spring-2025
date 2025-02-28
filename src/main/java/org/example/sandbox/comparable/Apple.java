package org.example.sandbox.comparable;

public class Apple extends Fruit implements Comparable<Fruit> {

    private String variety;

    public Apple(String name, String color, double weight, String variety) {
        super(name, color, weight);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Apple{")
                .append("name='").append(name).append('\'')
                .append(", color='").append(color).append('\'')
                .append(", weight=").append(weight)
                .append(", variety='").append(variety).append('\'')
                .append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Apple apple = new Apple("Apple", "Red", 150.0, "Gala");
        System.out.println(apple);
    }
}