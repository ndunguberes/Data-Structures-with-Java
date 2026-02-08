package Looping;

public class DoWhile {
    public static void main(String[] args) {
        int count = 1;
        do {
            if (count == 5){
                System.out.print(count + ".");
            }else{
                System.out.print(count + ", ");
            }
            count++;
        } while (count <= 5);
    }
}
