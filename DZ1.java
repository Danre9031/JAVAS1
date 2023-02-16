//package Java.S1;
//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);

        while (true){
            
            System.out.println("1-Найти сумму всех чисел N");
            System.out.println("2-Найти факторил от N");
            System.out.println("0-Выход");
            System.out.printf("Ваш выбор: ");
            int menu = iScanner.nextInt();
            
            if(menu==1){
                System.out.printf("n+: ");
                int num = iScanner.nextInt();
                int result = 1;
                if(num==1){
                    System.out.println(result);
                }
                else if(num==0){
                    result=0;
                    System.out.println(result);
                }
                else{
                    for  (int i=2;i<=num;i++){
                        result=result+i;
                    }
                    System.out.println(result);
                }
            }
            else if(menu==2){
                System.out.printf("n!: ");
                int num = iScanner.nextInt();
                int result = 1;
                
                    for  (int i=1;i<=num;i++){
                        result=result*i;
                    }
                System.out.println(result);
            }
            else if(menu==0){
                iScanner.close();
                break;
            }
            
        }
        iScanner.close();
    }
}