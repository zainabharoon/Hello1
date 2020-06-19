import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        int yr;
        System.out.println("enter the year");
        Scanner Sc = new Scanner(System.in);
        {
            yr = Sc.nextInt();
            if (yr % 400 == 0)
                System.out.println(" leap year");
            else if (yr % 4 == 0)
                System.out.println(" leap year");
            else

                System.out.println(" not leap year");

        }
    }
}