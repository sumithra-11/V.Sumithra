class Solution {
   public: 
    int subtractProductAndSum(int n) {
        int r,product=1,sum=0,result;
        while(n!=0)
        {
            r=n%10;
            product=product*r;
            sum=sum+r;
            n=n/10;
        }
        result=product-sum;
        return(result);
     }
};
