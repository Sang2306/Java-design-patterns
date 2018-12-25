public class ShapeFactory {
	public Shape getShape(String shapeName){
        if(shapeName.isEmpty()){
            return null;
        }
        if(shapeName.compareToIgnoreCase("Circle")==0){
            return new Circle();    
        }else if (shapeName.compareToIgnoreCase("Rectangle")==0){
            return new Rectangle();    
        }else if(shapeName.compareToIgnoreCase("Square")==0){
            return new Square();    
        }
        return null;
    }
}
//Step 4 -- see FactoryPatternDemo.java