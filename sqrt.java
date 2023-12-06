import java.io.*;
import java.util.Scanner;
import java.util.*;
class sqrt{
    public static void main (String[] args){
   
     Scanner sc =new Scanner(System.in);
     System.out.println("enter the  number");
     int s=sc.nextInt();
     System.out.println(squareroot(s));
    }

    public static double squareroot (int num)
    {
      double t;
      double s=num/2;
      do{
         t=s;
         s=(t+(num/t))/2;
      
      }
while((t-s)!=0);
return s;
    }
}