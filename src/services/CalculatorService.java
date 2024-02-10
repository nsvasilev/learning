package services;

import dto.ExpressionData;

import java.util.Scanner;

public class CalculatorService {

    public ExpressionData readExpression() {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        char operation = scanner.next(".").charAt(0);
        int secondNum = scanner.nextInt();

        return new ExpressionData(firstNum, secondNum, operation);
    }


    public double getExpressionResult(ExpressionData expressionData) {
        double result = 0.0;

        switch (expressionData.getOperation()) {
            case '+':
                result = (expressionData.getFirstOperand() + expressionData.getSecondOperand());
                System.out.println("Результат операции" + result);
                break;
            case '-':
                result = (expressionData.getFirstOperand() - expressionData.getSecondOperand());
                System.out.println("Результат операции" + result);
                break;
            case '*':
                result = (expressionData.getFirstOperand() * expressionData.getSecondOperand());
                System.out.println("Результат операции" + result);
                break;
            case '/':
                if (expressionData.getSecondOperand() == 0) {
                    System.out.println("На ноль делить нельзя, долбаеб. Пока");
                    System.exit(0);
                } else {
                    result = ((double) expressionData.getFirstOperand() / expressionData.getSecondOperand());
                    System.out.println("Результат операции" + result);
                }
                break;
            default:
                System.out.println("Нет такой операции. Пока");
                System.exit(0);
        }

        return result;
    }

}
