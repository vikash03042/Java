import java.util.*;
public class calc {
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Eneter the value of a and b");
int a= sc.nextInt();
int b= sc.nextInt();
System.out.println("Enter the opertor which you want to perfprm a operation ");
char n= sc.next().charAt(0);
switch(n){
    case '*':{
        System.out.print(a*b);
break;
    }
    case '/':{
        System.out.print(a/b);
        break;
            }
            case '+':{
                System.out.print(a+b);
                break;
                    }
                    case '-':{
                        System.out.print(a-b);
                        break;
                            }
                            case '%':{
                                System.out.print(a%b);
                                break;
                                    }
                                    default:
                            System.out.println("You have entered wrong input");

}

    }
} 
