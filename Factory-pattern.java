//Step 1
public interface Shape{
    public abstract void draw();
}
//Step 2
class Circle implements Shape{
    @Override
    public void draw(){
        System.out.print("Implement draw inside Circle class");
    }
}

class Square implements Shape{
    @Override
    public void draw(){
        System.out.print("Implement draw inside Square class");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.print("Implement draw inside Rectangle class");
    }
}
//Step 3
public class ShapeFactory{
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
ksdk