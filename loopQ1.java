import java.util.*;
public class loopQ1 {
    public static void main(String[] args) {
        /*Write a program that reads a set of integers, and then prints the sum of the
even and odd integers*/
Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number you want to search");
// int n=sc.nextInt();
// for(int i=1;i<=n;i++){
//     if(i%2==0){
//         int even=0;
//         even+=i;
//         even++;
//         System.out.println("Even and sum is:"+even);
//     }
//     else{
//         int odd=0;
//         odd+=i;
//         odd++;
//         System.out.println("odd and sum is :"+odd);
//     }
// }
int number;
int choice;
int evenSum = 0;
int oddSum = 0;
do {
System.out.print("Enter the number ");
number = sc.nextInt();
if( number % 2 == 0) {
evenSum += number;
}
 else {
oddSum += number;
}
System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
choice = sc.nextInt();
} while(choice==1);
System.out.println("Sum of even numbers: " + evenSum);
System.out.println("Sum of odd numbers: " + oddSum);
    }
}

