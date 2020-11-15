import java.util.ArrayList;

class Problem3{
    public static void main(String[] args){
        long n = 600851475143l;
        System.out.println("Largest Prime Factor is:"+ largestPrimeFactor(n));
    }

    static long largestPrimeFactor(long num){
        long largestFact = 0;
        long[] factors = new long[2];
        for (long i = 2; i * i < num; i++) {
            if (num % i == 0) { // It is a divisor
                factors[0] = i;
                factors[1] = num / i;
         
                for (int k = 0; k < 2; k++) {
                    boolean isPrime = true;
                    for (long j = 2; j * j <  factors[k]; j++) {
                        if (factors[k] % j == 0) {
                            isPrime = false;
                            break;
                         }
                     }
                     if (isPrime && factors[k] > largestFact) {
                        largestFact = factors[k];
                    }
                }
            }
        }
        return largestFact;
    }
}