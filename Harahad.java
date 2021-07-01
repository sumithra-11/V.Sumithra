import java.util.*;
public class Harshad
{
  public static void main(String args[])
  {
    int n,r,t,s=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n value");
    n=sc.nextInt();
    t=n;
    while(n!=0)
    {
      r=n%10;
      s=s+r;
      n=n/10;
    }
    if(t%s==0)
      System.out.println(t+ " is a harshad number");
  }
}
