package decorator;

import org.junit.jupiter.api.Test;

public class ShapeDecoratorTest {

    @Test
    public void test(){
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        GreenShapeDecorator greenShapeDecorator = new GreenShapeDecorator(circle);
        greenShapeDecorator.draw();

        System.out.println("\n");
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(rectangle);
        redShapeDecorator.draw();
    }
}
