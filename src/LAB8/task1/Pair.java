package LAB8.task1;


public class Pair<T, V> {
    private T first;
    private V second;

    public Pair(T tofirst, V tosecond){
        this.first = tofirst;
        this.second = tosecond;
    }

    public String Encoder(int numb){
            String output = "";
            char[] str;
            str = Integer.toString(numb).toCharArray();
            int[] ascii = new int[str.length];
            for (int i = 0; i < ascii.length; i++){
            ascii[i] = str[i]+17;
            str[i] = (char) ascii[i];
            output += str[i];
            }
            return output;
    }

    public int Decoder(String str){
    int number = 0;
    char[] temp = str.toCharArray();
        for (int i = 0; i < temp.length; i++){
            temp[i] = (char)((int)temp[i]-17);
            number += (Character.getNumericValue(temp[i]))*Math.pow(10,temp.length-(i+1));
        }
    return number;
    }
}
