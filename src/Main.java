import dto.ExpressionData;
import dto.UserData;
import services.CalculatorService;
import services.LoginService;

/**
 * SOLID-принципы. Single responsibility principle - принцип единственной ответсвенности
 */
public class Main {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        UserData userData = loginService.readLoginAndPassword();
        boolean isValidUserData = loginService.checkLoginAndPassword(userData);

        CalculatorService calculatorService = new CalculatorService();
        if (isValidUserData) {
            ExpressionData expressionData = calculatorService.readExpression();
            double expressionResult = calculatorService.getExpressionResult(expressionData);
            System.out.println(expressionResult);
        }
    }
}


