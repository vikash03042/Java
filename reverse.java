public class reverse {
    public static void main(String[] args) {
        int n=10899;
        while(n>0){
            // for lastdigit number%10
            int lastdigit=n%10;
            System.out.print(lastdigit);
            // for removing the last digit we will use n/10
            n=n/10;
        }
        // for extra line
        System.out.println();
    }
}
// another method to find reverse is  first of all we have to  initialize the rev =0; then we will find last digit then we will use this formula rev =(rev*10)+lastdigit
 