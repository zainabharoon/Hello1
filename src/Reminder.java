import java.util.Scanner;

public class Reminder {
    public static void main(String[] args){
        int rem,divident,divisor;
        Scanner Sc   =  new Scanner(System.in);{
            System.out.println("enter divident");
            divident=Sc.nextInt();
            System.out.println("enter divisor");
            divisor=Sc.nextInt();
            rem=divident%divisor;
            System.out.println("reminder of two number is:"+rem);
        }
    }
}
