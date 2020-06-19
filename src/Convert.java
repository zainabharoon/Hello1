import java.util.Scanner;

public class Convert {
    public static void main(String[] args){
        long hrs;
        Scanner Sc   =  new Scanner(System.in);{
            System.out.println("enter hours");
            hrs=Sc.nextInt();
            long sec=hrs*60*60;
            System.out.println("sec"+sec);
        }
    }
}


