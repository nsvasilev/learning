
import java.util.Scanner;

public class calculate {
    public static  void main(String[] args) {
        System.out.println("Здравствуйте, введите логин и пароль");
        Scanner in = new Scanner(System.in);
        System.out.print("Логин: " );
        String login = in.nextLine();
        System.out.print("Пароль: " );
        String password = in.nextLine();
        check1(login, password);
        int firstNum = in.nextInt();
        String simvol = in.next();
        char simvolConvert = simvol.charAt(0);
        int SecondNum = in.nextInt();
mat1(firstNum,
        simvolConvert,
        SecondNum);
    }
    public static void check1 (String checkLogin, String checkPassword){

        if (checkLogin.equals("Админ"))
        {
            System.out.println("Здравстуйте Админ");
        }
        else  {
            System.out.println("Вы не Админ");
        }
        if (checkPassword.equals("1234")){
            System.out.println("Добро пожаловать в калькулятор.");
            System.out.println("Операции выполняются только с целыми числами.");
            System.out.println("последовательно введите первое число, мат.функцию и второе число");

        }
        else {

            System.out.println("Пароль неверный, пошел нахуй");
System.exit(0);
        }
    }
    public static void mat1 (int num1, char operation, int num2)  {
        switch (operation) {
            case '+':
            System.out.println("Результат операции" + (num1 + num2));
            break;
            case '-':
                System.out.println("Результат операции" + (num1 - num2));
                break;
            case '*':
                System.out.println("Результат операции" + (num1 * num2));
                break;
            case '/':
                if (num2 == 0){
                    System.out.println("На ноль делить нельзя, долбаеб. Пока");
                    System.exit(0);
                }
                else {
                System.out.println("Результат операции" + (num1 / num2));
                }
                break;
            default:
                System.out.println("Нет такой операции. Пока");
                System.exit(0);
        }



        }
        }


