package decorator;

public class GreenShapeDecorator extends ShapeDecorator {

    public GreenShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setColor("green");
    }

    @Override
    void setColor(String color) {
        System.out.println("the color is "+color);
    }
}
