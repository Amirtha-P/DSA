import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the firstname: ");
        String s=sc.nextLine();
        System.out.print("Enter the lastname: ");
        String s1=sc.nextLine();
        System.out.print("Number of times to be repeated: ");
        int n=sc.nextInt();
        while(n>0){
            System.out.println(s+s1);
            n--;
        }
    }
}
