import java.util.*;
public class revision{
// prerequist - sorted array
    public static int Binary(int num[],int key){
        int start = 0, end=num-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key)
        {
            return mid;
        }
        if(num[mid]>key){
            mid=mid+1;
        }
        else{
            mid-=1;
        }

        
        }
        return -1;
    }
    public static void main(String[] args) {
      int num[]={1,2,3,4,5,6,7,8,9};
      int key=8;
       
      System.out.print("Number found at"+Binary(num, key));
    }
}
