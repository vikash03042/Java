import java.util.*;
public class svik {
   public static void main(String args[]){
  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a=sc.nextInt();
    System.out.println("Enter the value of b");
    int b= sc.nextInt();
    System.out.println("Enter the operator");
    char operator= sc.next().charAt(0);
   
    switch(operator){
        case '+': System.out.println(a+b);
        break;
        case '-':System.out.println(a-b);
        break;
        case '*': System.out.println(a*b);
        break;
        case '/': System.out.println(a/b);
        break;
        case '%':System.out.println(a%b);
        break;
        default:System.out.println("You have Entered  Wrong input");
    }
   } 
}
