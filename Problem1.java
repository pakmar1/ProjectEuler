/* Project Euler Solution Attempts */
class Problem1{
    public static void main(String args[]) {
        System.out.println("sum is::"+ problem1());

    }

    //problem 1
    public static int problem1() {
        int sum = 0;

        for(int i=1;i<=1000;i++){
            if(i%3==0 || i%5==0)
                sum+=i;    
        }
        return sum;
    }

}
