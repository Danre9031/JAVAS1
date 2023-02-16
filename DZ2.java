//package Java.S1;
//Вывести все простые числа от 1 до 1000
public class DZ2 {
    public static void main(String[] args) {
        int num = 1000;
        int chek=0;
        for(int i = 2;i<=num;i++){
            for(int del = 2;del<=num;del++){
                if(i%del==0){
                    chek++;
                }
            }
            if(chek==1){ 
                System.out.printf("%s ", i);
            }
            chek=0;
        }
    }
}
