import java.io.*;
import java.util.Scanner;
import java.util.*;
class reverse{
    public static void main (String[] args){
     int r,sum=0,temp,number;
     Scanner sc =new Scanner(System.in);
     System.out.println("enter the  number");
     int s=sc.nextInt();
     number=s;
     while(number!=0)
     {
        r=number%10;
        sum=(sum*10)+r;
        number/=10;
     }

        System.out.println("the reverseof the  given number is "+sum);
    
     
    }
     }
    