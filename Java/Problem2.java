class Problem2{

    public static void main(String[] args){
        System.out.println("Sum of Even Fibonacci numbers is:"+sumOfEvenFibo(1,2));
    }

    static int sumOfEvenFibo(int num1,int num2){
        int sum = 0;
        int ans = 0;
        if(num1%2==0) {
            ans+=num1;
        }        
        if(num2%2==0) {
            ans+=num2;
        }
        while(sum<=4000000) {
            //System.out.print(" "+sum);
            sum = num1+num2;
            num1 = num2;
            num2 = sum;

            if(sum%2==0) {
                ans+=sum;
            }
        }
        return ans;
    }
}