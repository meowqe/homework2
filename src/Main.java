import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 11;
        int b = 2;
        int nyam = 0;
        int x;

        for (x = 1; x < n; ++x) {
            if (x % 2 != 0) {
                a = a *3;
                System.out.println(a);



            } else if (x % 2 == 0) {
                a -= 10 * b;
                nyam +=10 * b;


            }
            if (nyam>=70) {
               b += 1;
               nyam -= 70;
           }
        }   System.out.println(String.valueOf(a) + " " + String.valueOf(b)+ " " + String.valueOf(nyam));


    }
}



