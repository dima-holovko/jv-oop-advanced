package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double obtainArea() {
        return side * side;
    }

    @Override
    public void displayFigure() {
        System.out.println("Figure, square, area: " + obtainArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor());
    }
}
