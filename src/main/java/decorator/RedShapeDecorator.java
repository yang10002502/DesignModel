package decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setColor("red");
    }

    @Override
    void setColor(String color) {
        System.out.println("the color is "+color);
    }
}
