
public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		// TODO Auto-generated method stub
		if(colorType==null){
			return null;
		}
		if(colorType.equalsIgnoreCase("red")){
			return new red();
		}else if(colorType.equalsIgnoreCase("green")){
			return new green();
		}else if(colorType.equalsIgnoreCase("blue")){
			return new blue();
		}
		return null;
	}

}
