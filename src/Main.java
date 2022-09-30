import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = n%10;
        String a = String.valueOf(n + " " + "tort");
        if (n / 1000 >= 11 && n / 1000 <= 14) {
            a += "ov";
        } switch (x) {
            case 1:
                a += "";
                break;
            case 2:
            case 3:
            case 4:
                a += "a";
                break;
            default:
                a += "ov";
                break;



            }
         System.out.println(a);




        }

    }
