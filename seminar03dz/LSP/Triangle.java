package seminar03dz.LSP;

public class Triangle extends FigurePerimetr {
    String name = "Triangle";
    double leg_1;
    double leg_2;
    double hypotenuse;

    public Triangle(double leg_1, double leg_2, double hypotenuse) {
        this.leg_1 = leg_1;
        this.leg_2 = leg_2;
        this.hypotenuse = hypotenuse;
    }

    @Override
    double perimeter() {
        return leg_1 + leg_2 + hypotenuse;
    }
}
