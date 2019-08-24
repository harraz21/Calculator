package sample;

public class Operations {
    private double num1;
    private double num2;
    private int type;
    private double result;
    private int index;

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public Operations(double num1, double num2, int type) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
    }


    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public int getType() {
        return type;
    }

    public double getResult() {
        return result;
    }


    private void addO() {
        this.result = num1 + num2;
    }

    private void subtractO() {
        this.result = this.num1 - this.num2;
    }

    private void divideO() {
        this.result = this.num1 / this.num2;
    }

    private void multiplyO() {
        this.result = this.num1 * this.num2;
    }

    public void makeOperation() {
        switch (this.type) {
            case 1:
                this.addO();
                break;
            case 2:
                this.subtractO();
                break;
            case 3:
                this.multiplyO();
                break;
            case 4:
                this.divideO();
                break;
            default:
                break;
        }
    }

}
