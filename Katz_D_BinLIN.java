import java.io.*;
import java.util.Scanner;
class bintest
{

   public static int seqSearch( int[] array, int searchItem )
  {
int iterations = 0;
     for ( int j=0; j  < array.length; j++ ){
  iterations++;
          if ( array[j] == searchItem)
   return iterations ; // Target found.

     }
     return -1 ; // Target not found
  }
  
  public static int binSearch(int [] array, int searchItem)
    {
       int iterations = 0;
       int start = 0;
       int end = array.length-1;
       int mid;
       while (start <= end)
       {
    iterations++;
           mid = (start+end)/2;
           if (searchItem == array[mid])
             {
               return iterations;
             }
           else if (searchItem < array[mid])
             {
               end = mid-1;
             }
           else
             {
               start = mid+1;
             }
       }
       return -1;
    }

public static void main(String [] args)
{
  double avgbin,avglin;
  int val,val2,sum=0,sum2=0;
  Scanner scanner = new Scanner( System.in );
  Scanner scan= new Scanner( System.in );
  int[] array= new int [20];
  int i,j;
  for(i=0;i<array.length;i++)
  {
    System.out.println("Input into the array");
    array[i]=scanner.nextInt();
  }
  
  for(j=0;j<array.length;j++)
  {
    val= binSearch(array,array[j]);
    System.out.println(array[j]+" Number of iterations for binary search was "+val);
sum=sum+val;
  }
  
  for(int k=0;k<array.length;k++)
  {
    val2=seqSearch(array,array[k]);
    System.out.println(array[k]+" Number of iterations for linear search was "+val2);
      sum2=sum2+val2;
  }
  
 avgbin=sum/(array.length);
 avglin=sum2/(array.length);
 
 System.out.println(avgbin+" Average of iterations for Binary search");
 System.out.println(avglin+" Average of iterations for linear search");
  
}
}
