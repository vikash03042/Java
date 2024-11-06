import java.util.*;
public class decimaltobinary {
    public static void DecBin(int DecNum){
int MyNum=DecNum;
int pow=0;
int BinNum=0;
while(DecNum>0){

    int rem=DecNum%2;
    BinNum=BinNum+(rem*(int)Math.pow(10, pow));
    pow++;
    
    DecNum= DecNum/2;
  
}

System.out.println("Binary number of"+MyNum+"is "+BinNum);
    }
    // public static int  printDec(int n){
    //     for(int i=0;i<=n;i++){
    //       System.out.println(i);
    //     }
    //     return 0;
    //   }
      public static void main(String[] args) {
        System.out.println("enter the value of decimal number for converting to binary number");
        Scanner sc= new Scanner(System.in);
        int DecNum=sc.nextInt();
        DecBin(DecNum);
        
      }
}

