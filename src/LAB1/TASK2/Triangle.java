package LAB1.TASK2;

import java.util.Scanner;

public class Triangle {
    private int cds[][] = new int[3][2];
    private double sides[] = new double[3];



    public void set(int i, int j){
        Scanner input = new Scanner(System.in);
        cds[i][j] = input.nextInt();
        sides[0] = Math.sqrt(Math.abs((cds[1][0]-cds[0][0])*(cds[1][0]-cds[0][0])+(cds[1][1]-cds[0][1])*(cds[1][1]-cds[0][1])));
        sides[1] = Math.sqrt(Math.abs((cds[2][0]-cds[1][0])*(cds[2][0]-cds[1][0])+(cds[2][1]-cds[1][1])*(cds[2][1]-cds[1][1])));
        sides[2] = Math.sqrt(Math.abs((cds[0][0]-cds[2][0])*(cds[0][0]-cds[2][0])+(cds[0][1]-cds[2][1])*(cds[0][1]-cds[2][1])));
    }

    public double perimeter() {
        return (sides[0] + sides[1] + sides[2]);
    }

    public double square() {
        double p = perimeter() / 2;
        return Math.sqrt(Math.abs(p*p-sides[0])*(p-sides[1])*(p-sides[2]));
    }
}