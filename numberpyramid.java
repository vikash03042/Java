import java.util.*;
public class numberpyramid {
    public static void num(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of turn");
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
        num(n);
    }
}
