public class ShapeDrawer2 extends Drawer implements StairCaseDrawer, SquareDrawer{
    public ShapeDrawer2(int i, char c, char d) {
        super(i, c, d);
    }

    public void drawStairCase() {
        for (int j = 0; j < sideLength; j++) {
            drawSquare(j);
        }
    }

    public void drawSquare(int multiplier) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength*(multiplier+1); j++) {
                System.out.print(filler);
            }
            System.out.println();
        }
    }

    public void drawSpecialSquare() {
    }
}