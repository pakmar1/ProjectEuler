/* Problem 7
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

n th prime number
*/

class Problem7 {

    public static int findNthPrime(int n) {
        int count = 1;
        boolean flag;
        int i=3;
        for(i=3;count<=n;i+=2){
            flag = true;
            for(int j=2;j<=Math.sqrt(i);j++) {
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
            if(count==n){
                break;
            }
        }


        return i;
    }
    public static void main(String[] args){
        System.out.println("Problem 7:");
        int n = 10001;
        System.out.println(n+" the prime: "+findNthPrime(n));
        
    }
 }