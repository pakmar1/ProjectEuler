/* Problem 10

*/
class Problem10 {

public static void main(String[] args){
    System.out.println("Problem 10");
    System.out.println(primeSum(2000000));
    
}
public static long primeSum(int n) {
        long sum=2;
        int count = 1;
        boolean flag;
        int i=3;
        for(i=3;i<=n;i+=2){
            flag = true;
            for(int j=2;j<=Math.sqrt(i);j++) {
                if(i%j == 0){
                    flag = false;
                    //break;
                }
            }
            if(flag){
                sum+=i;
                count++;
            }
            if(count==n){
                break;
            }
        }


        return sum;
    }

}