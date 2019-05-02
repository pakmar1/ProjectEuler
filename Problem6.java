/*Problem6
    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

*/
class Problem6{

    private static int findDifference() {
        int diff=0;
        int sqrnum = 0;
        for(int i=1;i<=100;i++) {
            diff += (i*i);
            sqrnum +=i;
        }
        sqrnum *= sqrnum;
        diff = sqrnum - diff;

        return diff;
    }

    public static void main(String[] args) {
        System.out.println("hey, this is problem 6");
        System.out.println(findDifference());
    }
}