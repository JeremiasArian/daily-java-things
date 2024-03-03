public class ProductOfNumbers {
    private int firstNumber;
    private int secondNumber;

    public ProductOfNumbers(int firstNumber, int secondNumber) {
        this.setFirstNumber(firstNumber);
        this.setSecondNumber(secondNumber);
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int product() {
        return (getFirstNumber() * getSecondNumber());
    }

    @Override
    public String toString() {
        return "Product of numbers: " + product();
    }
}
