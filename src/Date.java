import java.util.Scanner;

public class Date {
    public static void main(String[] args){
        long min;
        Scanner Sc   =  new Scanner(System.in);{
            System.out.println("enter mins");
          min=Sc.nextInt();
            long sec=min*60;
            System.out.println("sec"+sec);
        }
    }
}
