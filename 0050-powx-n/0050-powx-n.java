class Solution {
    public double myPow(double x, int n) {
        
        if(n<0){
            return 1/pow(x,-n);
        }
        else{
            return pow(x,n);
        }
    }

    public double pow(double x, int n){

        if(n ==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        // check odd power or even power
        double ans = pow(x*x, n/2);
        if(n%2==0){
            return ans;
        }
        else{
            return x* ans;
        }

    }
}