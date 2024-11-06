import java.util.Scanner;
import java.util.*;
public class binarytodecimal {
    public static void bindec(int BinNum){
     
  int MyNum= BinNum;
  int pow=0;
  int dec=0;
  while(BinNum>0){
  
    int lastdigit = BinNum%10;
    dec=dec+(lastdigit*(int)Math.pow(2,pow));
  
    BinNum =BinNum/10;
    pow++;
  }
  System.out.println("decimal of "+MyNum+ "is"+dec);
  
  }
    
 
    public static void main(String[] args) {
        System.out.println("Enter the value of binary number ");
     
      Scanner sc = new Scanner(System.in);
      int BinNum =sc.nextInt();


     bindec(BinNum) ;
    }
}
