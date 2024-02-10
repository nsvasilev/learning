import java.util.Scanner;

public class function {
    public static void main(String[] args) {
int c = 5;
int c1 = 6;
    info("Hello");
    /*info1();
    info2();
    info3(5,7);
    */Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int num2 = in.nextInt();
    info4(num,num2);
    }

    public static void info(String word) {
        System.out.println(word);

    }

    public static void info1() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a + b);

    }
    public static void info2 ()
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a - b);
    }
    public static void info3 (int a, int b) {

        System.out.println(a * b);
    }
    public static void info4 (int a, int b) {
        int res = a +b;
        System.out.println(res);
    }
}
