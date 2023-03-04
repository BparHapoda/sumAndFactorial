import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Сумма чисел от 1 до " + n + " равна " + sum(5));
        System.out.println("Произведение чисел от 1 до " + n + " равно " + fact(3));
        System.out.println("Простые числа от 1 до 1000 :");
        System.out.println(simple(1000));
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

    public static ArrayList<Integer> simple(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int count;
        for (int i = 0; i <= n; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count > 2) {
                    break;
                }
            }
            if (count == 2) {
                result.add(i);
            }
        }
        return result;
    }


}
