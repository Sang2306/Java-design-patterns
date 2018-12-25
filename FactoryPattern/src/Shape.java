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
//Step 3 -- see ShapeFactory.java