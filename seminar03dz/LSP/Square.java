package seminar03dz.LSP;

public class Square extends FigurePerimetr {
    String name = "Square";
    double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    double perimeter() {
        return edge * 4;
    }
}
