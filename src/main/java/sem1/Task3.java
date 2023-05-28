package sem1;

import java.util.Scanner;

// 3) Реализовать простой калькулятор

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int Number1 = ScanNumber();
        System.out.println("Введите выбранного оператора из следующих действий: +, -, *, /");
        String Operator = ScanOperator();
        System.out.println("Введите второе число: ");
        int Number2 = ScanNumber();
        int Result = GetResult(Operator, Number1, Number2);
        System.out.printf("Ваш результат: %d %s %d = %d", Number1, Operator, Number2, Result);
    }

    static int ScanNumber() {
        Scanner scan = new Scanner(System.in);
        int Number0 = scan.nextInt();
        return Number0;
    }

    static String ScanOperator() {
        Scanner scan = new Scanner(System.in);
        String Operator = scan.nextLine();
        return Operator;
    }

    static int GetResult(String Operations, int Number1, int Number2) {
        int Result = 0;
        switch (Operations) {
            case "+":
                Result = Number1 + Number2;
                break;
            case "-":
                Result = Number1 - Number2;
                break;
            case "*":
                Result = Number1 * Number2;
                break;
            case "/":
                Result = Number1 / Number2;

            default:
                System.out.println("Введите выбранного оператора из следующих действий: +, -, *, /");
                break;
        }
        return Result;

    }
}