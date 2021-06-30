[12:23 AM, 6/30/2021] Hadassa <3: import java.util.*;
class Digit
{
  public static void main(String args[])
  {
  int n,r,s=0,t1=0,t2=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter any value");
  n=sc.nextInt();
  while(n!=0)
  {
    r=n%10;
    s=(s*10)+r;
    n=n/10;
  }
  while(s!=0)
  {
    r=s%10;
    if(r%2==0)
    {
      t1=(t1*10)+r;
    }
    else if(r%2==1)
    {
      t2=(t2*10)+r;
    }
    s=s/10;
  }
  System.out.println(t1+" "+t2);
}
}
