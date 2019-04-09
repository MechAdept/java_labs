package LAB1.TASK6;

import java.util.Scanner;

public class Ticket {
    public static void Input(){
        while(true){
            int temp;
            System.out.print("Введите число: ");
            Scanner input = new Scanner(System.in);
            temp = input.nextInt();
            if(temp < 100000 || temp > 999999){
                System.out.println("Вы ввели не 6-значное число");
            }
            else {
                int a = ((temp%10)+(temp/10%10)+(temp/100%10));
                int b = ((temp/1000%10)+(temp/10000%10)+(temp/100000%10));
                if(a == b){
                    System.out.println("Счастливый билет!!!");
                }
                else {
                    System.out.println("Повезёт в следующий раз.");
                }
            }

        }
    }
}
