public class Calculator {

    private int x;
    private int y;

    public Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public double divide(double x, double y) {
        return x / y;
    }
}
