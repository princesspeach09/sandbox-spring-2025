package org.example.sandbox.streamapi;

import java.util.Objects;

public class Widget {

    private double length;
    private double width;
    private double height;

    public Widget() {
    }

    public Widget(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Widget{");
        sb.append("length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(length, width, height);
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Widget widget = (Widget) o;
        return Double.compare(widget.length, length) == 0 &&
                Double.compare(widget.width, width) == 0 &&
                Double.compare(widget.height, height) == 0;
    }

    public static WidgetBuilder buildWidget() {
        return new WidgetBuilder();
    }

    // Builder
    public static class WidgetBuilder {

        private double length;
        private double width;
        private double height;

        public WidgetBuilder withLength(double length) {
            this.length = length;
            return this;
        }

        public WidgetBuilder withWidth(double width) {
            this.width = width;
            return this;
        }

        public WidgetBuilder withHeight(double height) {
            this.height = height;
            return this;
        }

        public Widget build() {
            return new Widget(length, width, height);
        }
    }
}



