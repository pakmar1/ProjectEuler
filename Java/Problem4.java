class Problem4{
    public static void main(String[] args){
        System.out.println(largestPalindromeNum());
    }

    public static int largestPalindromeNum(){
        int largest = 0;
        int temp = 0;
        for(int i = 999;i>=100;i--){
            for(int j=999;j>=100;j--){
                if(isPalindrome((i*j))){
                    temp = i*j;
                    if(temp>largest){
                        largest = temp;
                    }
                }
            }
        }
        return largest;
    }

    public static boolean isPalindrome(int num){
        char[] num_ = String.valueOf(num).toCharArray();
        int i=0;int j=num_.length-1;
        boolean isPalindrome = true;
        while(i<num_.length/2) {
            
            if(num_[i]!=num_[j]){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }
}