package services;

import dto.UserData;

import java.util.Scanner;

public class LoginService {

    private final UserData validUserData = new UserData("Админ", "1234");

    public UserData readLoginAndPassword(){
        System.out.println("Здравствуйте, введите логин и пароль");
        Scanner in = new Scanner(System.in);
        System.out.print("Логин: ");
        String login = in.nextLine();
        System.out.print("Пароль: ");
        String password = in.nextLine();
        return new UserData(login, password);
    }

    public boolean checkLoginAndPassword(UserData userData){
        if(userData.equals(validUserData)){
            System.out.println("Здравстуйте Админ");
            System.out.println("Добро пожаловать в калькулятор.");
            System.out.println("Операции выполняются только с целыми числами.");
            System.out.println("последовательно введите первое число, мат.функцию и второе число");
            return true;
        }
        System.out.println("Вы не Админ");
        System.out.println("Пароль неверный, пошел нахуй");
        return false;
    }
}
