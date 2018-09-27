public class Rectangle {
    
    private double width;
    private double height;
    
    public Rectangle()
    {
        
        this.width=1;
        this.height=1;
        
    }

    public Rectangle(double width, double height) 
    {
        this.width = width;
        this.height = height;
    }
    
    public double getArea()
    {
        return this.width*this.height;
    }
    
    public double getPerimeter()
    {
        return 2*(this.height+this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
    public double getWidth()
    {
        return this.width;
    }
    
    
}