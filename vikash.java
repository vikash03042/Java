import java.util.*;
import java.util.Scanner;
public class vikash {
    public static void main (String args[]){
        System.out.println("Enter the number that you want to Reverse");
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int rev=0;
   
    while(n>0){
        int lastDigit = n%10;
        rev=(rev*10)+lastDigit;
        n= n/10;
    }
    System.out.println("The Reverse number is as below");
    System.out.println(rev);
    }
}
