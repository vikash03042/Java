import java.util.*;
public class prime {
    public static void main(String[] args) {
        // check input is  prime or not
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number you want to check the prime or not ");
    int n= sc.nextInt(); 
    if(n==2){
        System.out.println("input is prime number");

    }
    else{
        boolean isprime =true;
        for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            isprime=false;
        }
         
        }
        if(isprime == true){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime ");
        }
        }
    }
    }

