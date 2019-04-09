package LAB8.task1;

public class Main {

    public static void main(String[] args) {
        Pair obj = new Pair(88, "обобщения");

        System.out.println(obj.Encoder(1023456789));
        System.out.println(obj.Decoder(obj.Encoder(1023456789)));
    }
}
