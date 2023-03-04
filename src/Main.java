import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число :");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("Сумма чисел от 1 до "+n+" равна "+sum(5));
        System.out.println("Произведение чисел от 1 до "+n +" равно "+fact(3));
    }

    public static int sum(int n) {
        int sum = 0;
        if (n == 2) return 3;
        else if (n == 1) return 1;
        else if (n == 0) return 0;
        sum = n + n - 1;
        return sum + sum(n - 2);
    }

    public static int fact(int n) {
        int fact = 0;
        if (n == 0 || n == 1) {
            return 1;
        }
        fact = fact(n - 1) * n;
        return fact;
    }
}