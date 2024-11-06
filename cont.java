import java.util.*;
public class cont {
    public static void main(String[] args) {
        // Display all number entered by user except  multiple of 10
       
        Scanner sc =new Scanner(System.in);

       
        do{
            System.out.println("Enter the value of n ");
            int n= sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }
        while(true);
    }
    
}
