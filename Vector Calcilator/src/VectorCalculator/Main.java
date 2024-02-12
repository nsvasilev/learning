package VectorCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте,Выберите тип вектора:");
        System.out.println("1.Двумерный");
        System.out.println("2.Трехмерный");
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.println(" введите кардинаты вектора.");
            int x = in.nextInt();
            int y = in.nextInt();
        TwoDimensional twoDimensional = new TwoDimensional(x,y);}
        else if (choice ==2 ) {
            System.out.println(" введите кардинаты вектора.");
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
        ThirdDimensional thirdDimensional = new ThirdDimensional(x,y, z);}
        else {
            System.out.printf("Долбаеб? Пошел нахуй");
            System.exit(0);
        }
    }
}
