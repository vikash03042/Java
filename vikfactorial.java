public class vikfactorial{
    public static void fact(int n){
        int f=1;
for(int i=1;i<=n;i++){
    f*=i;
   System.out.println(f);
}
System.out.println("factorial of given number is"+f+"");
return;
    }
    public static void main(String args[]){

        int n;
        fact(5);
    }
}