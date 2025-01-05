package shape;

public class Rectangle extends Shape{
    //o	height: Double
    //o	width: Double

    private Double height;
    private Double width;

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {
        return (height+width)*2;
    }

    @Override
    public Double calculateArea() {
        return height*width;
    }
}
