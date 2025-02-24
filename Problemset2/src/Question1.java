import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        while(b>0){
            System.out.println(a);
            b--;
        }
    }
}
