package seminar03dz.LSP;

public class MainLSP {
    public static void main(String[] args) {
        Square sqr = new Square(5);
        System.out.println(sqr.name + " perimetr = " + sqr.perimeter());

        Rectangle rct = new Rectangle(10, 20);
        System.out.println(rct.name + " perimetr = " + rct.perimeter());

        Triangle trg = new Triangle(5, 5, 7);
        System.out.println(trg.name + " perimetr = " + trg.perimeter());
    }
}
