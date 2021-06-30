import java.util.*;
class Solution 
{
    public static void main(String[] args) 
    {
        int i,n,res;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=10;i++)
        {
            res=0;
            res=n*i;
            System.out.println((n+" x " +i)+" = " +res);
        }
        
    }
}