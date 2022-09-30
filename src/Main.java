import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) System.out.println(0);
        m:
        for (int i = 1; i <= 9; ++i) {
            int a = n;
            while (n > 0) {
                if (n % 10 == i){
                    System.out.println(i);
                    break m;
                }
                n /= 10;


            }
        }


    }
}
