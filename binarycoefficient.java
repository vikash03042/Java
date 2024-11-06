
import java.util.Scanner;

public class binarycoefficient{
    public static int fac(int n){
       
        int f=1;
    
        for(int i=1;i<=n;i++){
f=f*i;
        }
        return f;
    }
    public static int bincoeff(int n,int r){
        int fact_n =fac(n);
        int fact_r=fac(r);
        int fact_nmr=fac(n-r);

        int bincoeff = fact_n/(fact_r*fact_nmr);
        return bincoeff;
    }

    public static void main(String[] args) {
        System.out.print(bincoeff(4,2));
    }
}