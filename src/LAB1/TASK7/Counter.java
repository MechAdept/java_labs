package LAB1.TASK7;

public class Counter {
    public static void Input(int a, int b){//a = 10, b = 1
        int c = Math.min(a,b); //c = 1
        b = Math.max(a,b);// b = 10
        a =c;
        for(;a<=b;a++){
            for(int i = 0;i < a; i++){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
