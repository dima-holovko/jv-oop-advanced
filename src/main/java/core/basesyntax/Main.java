package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figure = new Figure[6];
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figure[i] = figureSupplier.getRandomFigure();
                figure[i].displayFigure();
            } else {
                figure[i] = figureSupplier.getDefaultFigure();
                figure[i].displayFigure();
            }
        }
    }
}
