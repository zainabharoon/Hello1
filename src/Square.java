import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        int num;
        Scanner Sc = new Scanner(System.in);
        {
            System.out.println("enter number");
            num = Sc.nextInt();
            int sqr = num * num;
            System.out.println("square of a number is:" + sqr);
        }
    }
}