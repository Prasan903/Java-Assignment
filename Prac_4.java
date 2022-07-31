// Name : Savaliya Prasa Ashvinbhai
// ID : 21CE121
// Div: CE2 B2
// Aim: Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
//      array123([1, 1, 2, 3, 1]) → true
//      array123([1, 1, 2, 4, 1]) → false
//      array123([1, 1, 2, 1, 2, 3]) → true

import java.util.*;
public class Prac_4 {
    public static void main(String[] args)
    {    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int d = array123(arr);
        if(d==1)
        System.out.println("true");
        if(d==0)
        System.out.println("false");
        sc.close();
        System.out.println("21CE121_PrasanSavaliya");
    }

     
    public static int array123(int[] ar)
    {
        int c=0;

        for(int i=0 ;i < ar.length-2 ; i++)
        {
//check 1 ,2, 3 are present (in seqence) in String
            if(ar[i]==1 )
            {
                if(ar[i+1]==2)
                {
                    if(ar[i+2]==3)
                    {
                        c=1;
                        break;
                    }
                }
            }
            else
            continue;
        }
        return c;
    }
    
}