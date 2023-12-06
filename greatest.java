import java.io.*;
import java.util.Scanner;
import java.util.*;
class greatest{
    public static void main (String[] args){
     Scanner sc =new Scanner(System.in);
     System.out.println("enter number");
     int a=sc.nextInt();
      System.out.println("enter number");
     int b=sc.nextInt();
      System.out.println("enter number");
     int c=sc.nextInt();
     if(a>b && a>c){
      System.out.println("the number is greater"+a);
     }
     else if(b>c && b>a){
      System.out.println("the number is greater"+b);
     }
    else{
       System.out.println("the number is greater"+c);
    }
            

    }
}