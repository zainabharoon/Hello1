import java.util.Scanner;

public class area {
    public static void main(String[] args){
        int area;
        int w,h;

        Scanner Sc   =  new Scanner(System.in);{
            System.out.println("enter height");
            h=Sc.nextInt();
            System.out.println("enter width");
            w=Sc.nextInt();

            area=w*h/2;
            System.out.println("area of a triangle is:"+area);
        }
    }
}
