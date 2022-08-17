package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topLine;
    private final int bottomLine;
    private final int height;

    public IsoscelesTrapezoid(String color, int topLine, int bottomLine, int height) {
        super(color);
        this.topLine = topLine;
        this.bottomLine = bottomLine;
        this.height = height;
    }

    @Override
    public double obtainArea() {
        return ((topLine + bottomLine) * height) / 2.0;
    }

    @Override
    public void displayFigure() {
        System.out.println("Figure, isosceles trapezoid, area: " + obtainArea()
                + " sq.units, topLine: " + topLine
                + " units, bottomLine: " + bottomLine
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
