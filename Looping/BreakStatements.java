package Looping;

public class BreakStatements {
    public static void main(String[] args) {
        int num = 0;
        while (num<5){
            if (num==2){
                System.out.println("Slow down buddy!!");
                break;
            }
            System.out.println("Number: " + num);
            num++;
        }
    }
}
