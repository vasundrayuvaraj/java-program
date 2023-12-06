import java.io.*;
import java.util.Scanner;
import java.util.*;
class prime{
    public static void main (String[] args){
     Scanner sc =new scanner(System.in);
     System.out.println("enter the number");
     int s=sc.nextInt();
     if(s%2==0){
        System.out.println("the given number is prime");
     }
     else
         System.out.println("the given number is not prime");
    }
}