import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.lang.Math;
class armstrong{
    public static void main (String[] args){
     int r,sum=0,temp,number;
     Scanner sc =new Scanner(System.in);
     System.out.println("enter the  number");
     int s=sc.nextInt();
     number=s;
     Scanner sb =new Scanner(System.in);
     System.out.println("enter the  power");
     int p=sb.nextInt();
     while(number!=0)
     {
        r=number%10;
        sum+=Math.pow(r,p);
        number/=10;
     }
    if( sum==s)
        System.out.println("the given number is armstrong number");
    else
     System.out.println("the given number is  not armstrong number");
     
    }
     }
    