public class pattern5 {
    public static void main(String[] args) {
        int n=4;
        int tot=0;
        for(int i=1;i<=2*n;i++){
            tot=n-i;
            if(i>n){
                tot=i-n;
            }
            for(int space=1;space<=tot;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(n-tot)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}