package Looping;

public class ForLoop {
    public static void main(String[] args) {
        for (int count = 1; count <= 5; count++) {
            if (count == 5){
                System.out.print(count + ".");
            }else{
                System.out.print(count + ", ");
            }
        }
    }
}
