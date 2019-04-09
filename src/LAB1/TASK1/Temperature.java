package LAB1.TASK1;

import java.util.Scanner;

public class Temperature {
     private double tf;
    public void set(){
        System.out.print("Введите температуру в градусах фаренгейта: ");
        Scanner input = new Scanner(System.in);
        tf = input.nextDouble();
    }
    public double fahrenheit()    {
        return tf;
    }
    public double celsius (){

        return  (tf-32)*5/9;
    }
}