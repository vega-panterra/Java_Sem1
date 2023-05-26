package sem1;

import java.util.Scanner;

// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите число n: ");
        Scanner Number = new Scanner(System.in);
        int n = Number.nextInt();
        int sum = 0;
        int NumberSum = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            NumberSum *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d = %d%n", n, sum);
        System.out.printf("Произведение чисел от 1 до %d = %d%n ", n, NumberSum);
        Number.close();
    }
}