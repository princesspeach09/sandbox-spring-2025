package org.example.sandbox.streamapi;

public class Fluentapi {

    public static void main(String[] args) {

        // Fluent API usage
        Widget widget = Widget.buildWidget()
                .withLength(10)
                .withWidth(5)
                .withHeight(2)
                .build();
        System.out.println(widget);

    }
}