import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the String: ");
        String s=sc.nextLine();
        System.out.print("Enter the character: ");
        char a=sc.next().charAt(0);
        System.out.println("The integer is: "+n+" the string is: "+s+" the character is: "+a);

    }
}
