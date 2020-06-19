import java.util.Scanner;

public class Perimeter {

    public static void main(String[] args){
    int l;
    int w;

        Scanner Sc   =  new Scanner(System.in);{
            System.out.println("enter the lenght");
            l=Sc.nextInt();
            System.out.println("enter width");
            w=Sc.nextInt();
            int per=2*(l+w);
            System.out.println("perimeter of a triangle is:"+per);
        }
    }
}

