package dto;

public class ExpressionData {
    private final long firstOperand;
    private final long secondOperand;
    private final char operation;

    public ExpressionData(long firstOperand, long secondOperand, char operation) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operation = operation;
    }

    public long getFirstOperand() {
        return firstOperand;
    }

    public long getSecondOperand() {
        return secondOperand;
    }

    public char getOperation() {
        return operation;
    }
}
