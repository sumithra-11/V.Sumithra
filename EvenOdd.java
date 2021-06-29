import java.util.*;
class EvenOdd
{
  public static void main(String args[])
  {
    int count,count1,r,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any value");
    n=sc.nextInt();
    count=0,count1=0;
    while(n!=0)
    {
      r=n%10;
      if(r%2==0)
      { 
        count++;
      }
      else if(r%2==1)
      {
        count1++;
      }
      n=n/10;
    }
    System.out.println("even digits="+count);
    System.out.println("odd digits="+count1);
  }
}