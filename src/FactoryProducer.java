
public class FactoryProducer {
	public static AbstractFactory getChioce(String choiceType){
		if(choiceType==null){
			return null;
		}
		if(choiceType.equalsIgnoreCase("shape")){
			return new ShapeFactory();
		}else if(choiceType.equalsIgnoreCase("color")){
			return new ColorFactory();
		}
		return null;
	}
}
