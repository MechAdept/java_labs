package LAB1.TASK5;

import java.util.Scanner;

public class Check {
    public static void Input(){
        int sum = 0;
        int n = 0;
        while(true){
            int temp;
            System.out.print("Введите число: ");
            Scanner input = new Scanner(System.in);
            temp = input.nextInt();
            if(temp != 0){
                sum += temp;
                n += 1;
            }
            else {
                System.out.println("Количество введённых чисел: " + n);
                System.out.println("Сумма введённых чисел: " + sum);
                System.out.println("Среднее арифметическое: " + sum/n);
                break;
            }

        }
    }
}
