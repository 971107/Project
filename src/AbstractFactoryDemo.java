
public class AbstractFactoryDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory=FactoryProducer.getChioce("shape");
		Shape s1=shapeFactory.getShape("square");
		s1.show();
		Shape s2=shapeFactory.getShape("circle");
		s2.show();
		Shape s3=shapeFactory.getShape("rectangle");
		s3.show();
		
		
		AbstractFactory colorFactory=FactoryProducer.getChioce("color");
		Color c1=colorFactory.getColor("red");
		c1.fill();
		Color c2=colorFactory.getColor("green");
		c2.fill();
		Color c3=colorFactory.getColor("blue");
		c3.fill();
	}
}
