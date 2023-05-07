public class Circle extends Shape {
    public double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle) || !super.equals(obj))
            return false;
        Circle shape2 = (Circle) obj;
        return shape2.radius == radius;
    }

    @Override
    public String toString() {
        return String.format("Circle [radius=%.1f, color=%s] ", this.radius, this.color);
    }
}
