import java.util.Scanner;
public class getstrint
{
    public static void main(String [] args) {
        Scanner var = new Scanner (System.in);
        System.out.print("Enter Name : ");
        String a = var.nextLine();
        System.out.print("Enter Age : ");
        int b = var.nextInt();
        System.out.print(a +" "+ b);
    }
}