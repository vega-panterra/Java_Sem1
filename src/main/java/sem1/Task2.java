package sem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 2) Вывести все простые числа от 1 до 1000

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите выбранное положительное число от 1 до 1000: ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            boolean Number2 = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    Number2 = false;
                    break;
                }
            }

            if (Number2) {
                primes.add(i);
            }
        }

        System.out.println("Простые числа в указанном числе = " + primes);
    }
}