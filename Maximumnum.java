import java.util.*;
class Maximumnum                         
{
  public static void main(String args[])
  {
    int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    f=sc.nextInt();
    g=sc.nextInt();
    h=sc.nextInt();
    i=sc.nextInt();
    j=sc.nextInt();
    k=sc.nextInt();
    l=sc.nextInt();
    m=sc.nextInt();
    n=sc.nextInt();
    o=sc.nextInt();
    p=sc.nextInt();
    int a1=(int)(Math.max(Math.min(a,b),Math.max(c,d)));
    int a2=(int)(Math.max(Math.max(e,f),Math.max(g,h)));
    int a3=(int)(Math.max(Math.max(i,j),Math.max(k,l)));
    int a4=(int)(Math.max(Math.max(m,n),Math.max(o,p)));
    int a5=(Math.max(Math.max(a1,a2),Math.max(a3,a4)));
    System.out.print("Maximumnum:"+a5);
  }
}