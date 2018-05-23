
public class ShapeFactory extends AbstractFactory{
	public Shape getShape(String shapeType){
		/* equals�Ƚ�ʱ,Ҫ�Ƚϴ�Сд�Ƿ���ͬ,
		*  ������,�����˴�Сд,ignore���Ǻ��Ե���˼
		*  ��,abc��Abc,ǰ�߷���false,���߷���true
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
