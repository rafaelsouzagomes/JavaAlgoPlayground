package dp.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Cria um objeto Circle e chama o método draw()
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Cria um objeto Square e chama o método draw()
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        // Cria um objeto Rectangle e chama o método draw()
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();
    }
}

