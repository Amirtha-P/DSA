import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int s=sc.nextInt();
        switch (s){
            case 30:
                System.out.println("Medium");
                break;
            case 38:
                System.out.println("Large");
                break;
            case 42:
                System.out.println("XLarge");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
