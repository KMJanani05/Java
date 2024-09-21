//Get 3 no , now multiply it and store it in d and add it and store it in e,then divide d by e.
import java.util.Scanner;
public class sum3
{
    public static void main(String [] args) {
        Scanner var = new Scanner (System.in);
        int a = var.nextInt();
        int b = var.nextInt();
        int c = var.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        System.out.println("Multiply : "+d);
        System.out.println("Add : "+e);
        System.out.println("Divide : "+d/e);
    }
}