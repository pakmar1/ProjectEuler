class Problem5{
    public static void main(String[] args){
        System.out.println("answer is:"+smallestMultipleBrut(20));
    }

    

    public static int smallestMultipleBrut(int num1){
        int num=2520;
        int index;

        while(true) {
            boolean alldivisible = true;
            for(index=2;index<=num1;++index)    {
                if(num % index != 0)   {
                    alldivisible = false;
                }
            }
            if(index-1==num1 && alldivisible){
                return num;
            }
            else{num++;}
        
        }
        
    }
}