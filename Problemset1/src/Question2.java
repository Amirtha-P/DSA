import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //Triangle can be formed
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the angle 1: ");
        int a=sc.nextInt();
        System.out.print("Enter the angle 2: ");
        int b=sc.nextInt();
        System.out.print("Enter the angle 3: ");
        int c=sc.nextInt();
        if(a+b+c==180)
            System.out.println("The triangle can be formed from the given angle");
        else
            System.out.println("The triangle cannot be formed");
    }
}
