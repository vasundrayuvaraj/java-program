import java.io.*;
import java.util.*;
import java.util.Scanner;
class  pattern{
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
     System.out.println("enter the number");
     int s=sc.nextInt();
     for(int i=1;i<s;i++){
        int number=1;
        for (int j=1;j<=i;j++){
        System.out.print(number+"");
        number++;
        }
        System.out.println("");
    }

}
}
