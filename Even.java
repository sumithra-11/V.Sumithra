import java.util.*;
class Even
{
 public static void main(String args[])
 {
  int n,m:
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter values of n,m");
  n=sc.nextInt();
  m=sc.nextInt();
  while (m>=n)
  {
   if (m%2==0)
   {
    System.out.println(m+ " ");
   }
   m--;
  }
 }
}