/* Problem 8
Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?


*/

import java.lang.String;
import java.util.*;
class Problem8 {
    public static void main(String[] args) {

        System.out.println("Problem 8");
        String number = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        System.out.println("Greatest product of 13 consecutive numbers is: "+findLargestProduct(number));
    }

    public static long findLargestProduct(String number) {
        long result=0;
        int a,b,c,d,e,f,g,h,i,j,k,l,m;
        int[] aa = new int[13];
        long max=0,currentMax;
        int index=0;
        
        while(index<number.length()-13) {
            currentMax = 1;
            for(int x=0;x<13;x++) {
                aa[x] = Integer.valueOf(String.valueOf(number.charAt(index+ x)));
                currentMax *= aa[x];
            }
            /*a = Integer.valueOf(String.valueOf(number.charAt(index)));
            b = Integer.valueOf(String.valueOf(number.charAt(index+1)));
            c = Integer.valueOf(String.valueOf(number.charAt(index+2)));
            d = Integer.valueOf(String.valueOf(number.charAt(index+3)));
            e = Integer.valueOf(String.valueOf(number.charAt(index+4)));
            f = Integer.valueOf(String.valueOf(number.charAt(index+5)));
            g = Integer.valueOf(String.valueOf(number.charAt(index+6)));
            h = Integer.valueOf(String.valueOf(number.charAt(index+7)));
            i = Integer.valueOf(String.valueOf(number.charAt(index+8)));
            j = Integer.valueOf(String.valueOf(number.charAt(index+9)));
            k = Integer.valueOf(String.valueOf(number.charAt(index+10)));
            l = Integer.valueOf(String.valueOf(number.charAt(index+11)));
            m = Integer.valueOf(String.valueOf(number.charAt(index+12)));
            currentMax = a*b*c*d*e*f*g*h*i*j*k*l*m;*/
            if(currentMax>max) {
                max = currentMax;
                result = Long.valueOf( number.substring(index,index+13));
            }
            index++;
        }
        return max;
    }
}