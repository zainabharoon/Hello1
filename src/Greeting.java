import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        String name;

        System.out.println("enter name");
        Scanner Sc   =  new Scanner(System.in);
        name=Sc.nextLine();
        System.out.println("hello:"+name);
    }
}


