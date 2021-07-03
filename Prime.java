import java.util.*;
public class Prime
{
  public static void main(String args[])
  { 
    int i,j,n,t=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter last number in the range");
    n=sc.nextInt();
    if(n<=1)
    { 
      System.out.println("no prime numbers in the given range");
    }
    else
    {
      for(i =2;i<=n;i++)
      {
        int count=0;
        for(j=1;j<=i;j++)	
        {
	  if(i%j==0)
	  count=count+1;
        }
        if(count==2)
         t++;
      }
      System.out.println("the total count of prime numbers in the given range are :" +t);
    }
  }
}