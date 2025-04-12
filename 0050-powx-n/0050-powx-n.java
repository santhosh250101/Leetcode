class Solution {
    public double myPow(double x, int n) {
        
        if(n<0){
            return (double)1/pow(x,-n);
        }
        else{
            return pow(x,n);
        }
    }

    public double pow(double x, int n){

        if(n ==0){
            return (double)1;
        }
        if(x==0){
            return (double)0;
        }
        // check odd power or even power

        if(n%2==1){
            return x* pow(x,n-1);
        }
        else{

            return pow(x*x, n/2);
        }

    }
}