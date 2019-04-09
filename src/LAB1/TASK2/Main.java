package LAB1.TASK2;


public class Main {

    public static void main(String[] args) {

    int a, b;

    Triangle temp = new Triangle();
    for(int i=0; i<2; i++){
        for(int j=0; j<3;j++){
            temp.set(i, j);
        }
    }

    System.out.print("Периметр: ");
    System.out.println(temp.perimeter());

    System.out.println("Площадь");
    System.out.println(temp.square());
    }
}
