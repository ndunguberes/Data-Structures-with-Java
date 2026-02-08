package Looping;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 5) {
            if (count == 5){
                System.out.print(count + ".");
            }else{
                System.out.print(count + ", ");
            }
            count++;
        }
    }

}
