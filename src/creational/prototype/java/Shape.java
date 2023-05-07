/*
 * Pros
 * ----
 * 
 * Cons
 * ----
 */

import java.util.Objects;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color;

    public Shape() {
    }

    public Shape(Shape shape) {
        if (shape != null) {
            this.x = shape.x;
            this.y = shape.y;
            this.color = shape.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape))
            return false;

        Shape shape = (Shape) obj;
        return shape.x == x && shape.y == y && Objects.equals(shape.color, color);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}