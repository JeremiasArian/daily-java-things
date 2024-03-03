public class DivisionOfTwoNumbers {
    private int firstNumber;
    private int secondNumber;

    public DivisionOfTwoNumbers(int firstNumber, int secondNumber) {
        this.setFirstNumber(firstNumber);
        this.setSecondNumber(secondNumber);
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getFirstNumber() {
        return this.firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getSecondNumber() {
        return this.secondNumber;
    }

    public int division() {
        return (getFirstNumber() / getSecondNumber());
    }

    @Override
    public String toString() {
        return "Division of numbers: " + division();
    }
}
