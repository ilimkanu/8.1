import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        if (a < 0){
            System.exit(0);
        }
        if (a > 11){
            System.exit(0);
        }
        System.out.println("0 * "+a+" = "+0*a);
        System.out.println("1 * "+a+" = "+1*a);
        System.out.println("2 * "+a+" = "+2*a);
        System.out.println("3 * "+a+" = "+3*a);
        System.out.println("4 * "+a+" = "+4*a);
        System.out.println("5 * "+a+" = "+5*a);
        System.out.println("6 * "+a+" = "+6*a);
        System.out.println("7 * "+a+" = "+7*a);
        System.out.println("8 * "+a+" = "+8*a);
        System.out.println("9 * "+a+" = "+9*a);
        System.out.println("10 * "+a+" = "+10*a);
    }
}
