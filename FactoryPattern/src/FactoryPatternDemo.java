
public class FactoryPatternDemo {
	public static void main(String args[]) {
		ShapeFactory shapes = new ShapeFactory();
		Shape shape1 = shapes.getShape("Circle");
		shape1.draw();
	}
}
