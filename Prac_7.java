// Name : Savaliya Prasa Ashvinbhai
// ID : 21CE121
// Div: CE2 B2
// Aim: Display numbers in a pyramid pattern.
//                  1
//                1 2 1
//              1 2 4 2 1
//            1 2 4 8 4 2 1
//          1 2 4 8 16 8 4 2 1
//       1 2 4 8 16 32 16 8 4 2 1
//    1 2 4 8 16 32 64 32 16 8 4 2 1
// 1 2 4 8 16 32 64 128 64 32 16 8 4 2 1

import java.util.*;
public class Prac_7 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter Number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Solution is : ");

    for(int i=1;i<=n;i++)
    {
    //for space 
    //for space according to rows and colomns.
        for(int j=1;j<=(n-i);j++)
        {
            System.out.print("   ");
        }
        int sum=1;
        System.out.print("1");

        //for half left part    
        //for half left part    
        if(i!=1){
        for(int k=1;k<i;k++)
        {   
            sum=sum*2;
            System.out.printf("%3d",sum);
        }            
        //for half right part
        //for half right part
        for(int b=i-1;b>1;b--)
        {
            sum=sum/2;                                                  
            System.out.printf("%3d",sum);
        }
            System.out.print(" 1");
        }
            System.out.println("");
        }
        System.out.println("21CE121_PrasanSavaliya");
    }
    
}