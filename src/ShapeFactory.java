
public class ShapeFactory extends AbstractFactory{
	public Shape getShape(String shapeType){
		/* equals比较时,要比较大小写是否相同,
		*  而后者,忽略了大小写,ignore就是忽略的意思
		*  如,abc与Abc,前者返回false,后者返回true
		*/
		if(shapeType==null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("circle")){
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("square")){
			return new Square();
		}else if(shapeType.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		// TODO Auto-generated method stub
		return null;
	}
}
