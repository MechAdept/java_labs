package LAB1.TASK8;


public class Rectangle {
    public int height;
    public int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void out(){
        for(int i = 0; i < height; i++){
            System.out.println();
            for(int j = 0; i < width; j++){
                if (i == 0 || i == height-1 || j == 0 || j == width-1){
                    System.out.println("o");
                }
                else {
                    System.out.println("1");
                }
            }
        }
    }
}


