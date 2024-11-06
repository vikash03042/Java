import java.util.Scanner;

public class vikarry {
    public static void results(int m[]){
        
      
        for(int i=0;i<=m.length;i++){
            m[i]=m[i]+1;
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject");
        int n =  sc.nextInt();
        System.out.println("Enter the marks of "+n+"subject");
        int m[] = new int[n];
        for(int i=0;i<=n;i++){
        m[i]=sc.nextInt();
        

    }

    for(int i=0;i<=n;i++){

        System.out.print("you have entered these marks "+m[i]+"");

    }
    System.out.println();
     }
}
