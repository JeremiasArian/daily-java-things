public class SumOfNumbers {
    private int firstNumber;
    private int secondNumber;

    public SumOfNumbers(int firstNumber, int secondNumber) {
        this.setFirstNumber(firstNumber);
        this.setSecondNumber(secondNumber);
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int sum() {
        return (this.getFirstNumber() + this.getSecondNumber());
    }
}
