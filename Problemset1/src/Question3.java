import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total mark: ");
        int tot=sc.nextInt();
        if(tot>=90)
            System.out.println("Grade A");
        else if(tot>=80)
            System.out.println("Grade B");
        else if(tot>=60)
            System.out.println("Grade C");
        else if(tot>=35)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
    }
}
