// Реализовать простой калькулятор Введите число 2 
// Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4
//package Java.S1;

import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите chislo1: ");
        int num1 = iScanner.nextInt();
        System.out.println("Выберете операцию:");
        System.out.println("1-Сумма");
        System.out.println("2-Разность");
        System.out.println("3-Умножение");
        System.out.println("4-Деление");
        System.out.printf("Ваш выбор: ");
        int menu = iScanner.nextInt();
        System.out.printf("Введите chislo2: ");
        int num2 = iScanner.nextInt();

        int result=0;
        
        switch (menu) {
            case(1): 
                result=num1+num2;
                System.out.printf("%d+%d=%d\n", num1, num2, result);
                break;
            case(2): 
                result=num1-num2;
                System.out.printf("%d-%d=%d\n", num1, num2, result);
                break;
            case(3): 
                result=num1*num2;
                System.out.printf("%d*%d=%d\n", num1, num2, result);
                break;
            case(4): 
                result=num1/num2;
                System.out.printf("%d/%d=%d\n", num1, num2, result);
                break;
            default:
                System.out.println("Нет такого знака");
               break;
        };
        iScanner.close();
    }
}
