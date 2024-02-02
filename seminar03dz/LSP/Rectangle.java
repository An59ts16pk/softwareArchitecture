package seminar03dz.LSP;

public class Rectangle extends FigurePerimetr {
    String name = "Rectangle";
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double perimeter() {
        return height * 2 + width * 2;
    }
}
