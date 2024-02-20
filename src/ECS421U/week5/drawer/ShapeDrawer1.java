public class ShapeDrawer1 extends Drawer implements SquareDrawer{
    public ShapeDrawer1(int i, char c, char d) {
        super(i, c, d);
    }

    public void drawSquare(int multiplier) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print(filler);
            }
            System.out.println();
        }
    }

    public void drawSpecialSquare() {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == j || i + j == sideLength - 1) {
                    System.out.print(special);
                } else {
                    System.out.print(filler);
                }
            }
            System.out.println();
        }
    }
}