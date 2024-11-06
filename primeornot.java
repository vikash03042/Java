import java.util.*;
public class primeornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int n=sc.nextInt();
        if(n==2){
            System.out.println("number is prime");
        }
        else{
boolean isprime=true;
for(int i=2;i<n-1;i++){
    if(n%i==0){
        isprime=false;
    }
}
if(isprime==true){
    System.out.println("number is prime");
}
else {
    System.out.println("NUMBER IS NOT PRIME");
}

        }
    }
}
