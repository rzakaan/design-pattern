public class Demo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        circle1.setX(1);
        circle1.setY(2);
        circle1.setColor("red");

        Circle circle2 = new Circle(10);
        circle2.setX(10);
        circle2.setY(20);
        circle1.setColor("blue");

        // clone
        Circle cloneCircle = (Circle) circle1.clone();

        System.out.println(cloneCircle);
        System.out.println("circle1 == circle2       :" + circle1.equals(circle2));
        System.out.println("circle1 == cloned circle :" + circle1.equals(cloneCircle));
        System.out.println("circle2 == cloned circle :" + circle2.equals(cloneCircle));
    }
}
