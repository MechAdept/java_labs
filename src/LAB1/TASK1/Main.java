package LAB1.TASK1;


public class Main {

    public static void main(String[] args) {
    double tf;
    Temperature temp = new Temperature();
	temp.set();
	temp.fahrenheit();
	temp.celsius();
	System.out.println(temp.fahrenheit());
	System.out.print(temp.celsius());
    }
}
