import java.io.IOException;
import java.util.Scanner;

public class char12 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = 3;
        String a2 = in.next();
        char a3 = a2.charAt(0);
        String n1  = String.valueOf(a);
        int a1 = 6;
        String n2  = String.valueOf(a1);
        String res = n1 + a3 + a1;
        System.out.println(res);

    }

}
