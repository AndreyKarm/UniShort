public class ShapeDrawer2 extends Drawer implements StairCaseDrawer, SquareDrawer{
    public ShapeDrawer2(int i, char c, char d) {
        super(i, c, d);
    }

    public void drawStairCase() {
        for (int j = 0; j < sideLength; j++) {
            drawSquareLong(j);
        }
    }

    public void drawSquareLong(int width) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength*(width+1); j++) {
                System.out.print(filler);
            }
            System.out.println();
        }
    }

    public void drawSquare() {
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