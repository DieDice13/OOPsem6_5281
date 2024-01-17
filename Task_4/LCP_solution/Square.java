package Task_4.LCP_solution;

public class Square extends Rectangle {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public int area() {
        return this.side * this.side;
    }
}