/* Problem 9
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

class Problem9 {
    public static void main(String[] args) {
        System.out.println("Problem 9");
        System.out.println(findPythTriplet(1000));
    }

    public static int findPythTriplet(int num) {
        int result = 0;
        
        for(int a=1;a<num;a++){
            for(int b=a;b<num-a;b++){
                int c = num - a - b;
                if(a*a + b*b == c*c){
                    result = a*b*c;
                    System.out.println("a:"+a+" b:"+b+" c:"+c+" product:"+result);
                    break;
                }
            }
        }

        return result;
    }

}