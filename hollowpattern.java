public class hollowpattern {
    
    public static  void hpattern(int row,int column){
for(int i=1;i<=row;i++){
    for(int j=1;j<=column;j++){
        if(i==1||i==row||j==1||j==column){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
}
    }
    public static void main(String[] args) {
        hpattern(5,5);
    }
}
