/*Q2: Calculate the sum of all the elements in the given array.
Take input of length and all the elements. */
import java.util.*;
public class Practice2 {
    public void sum(int arr[])
    {
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.print("Sum = "+sum);
     }
     public static void main(String [] args)
     {
     Scanner sc=new Scanner(System.in);
     System.out.print("Number of elements in an Array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Practice2 ob= new Practice2();
        ob.sum(arr);
     }
}
