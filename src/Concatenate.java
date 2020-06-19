import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args){
      String first;
      String second;
      String full;
        Scanner Sc   =  new Scanner(System.in);
        System.out.println("enter the first string");
        first=Sc.next();
        System.out.println("enter the second string");
        second=Sc.next();
        full=first+second;
        System.out.println("concatenate two string:"+full);

    }
}

