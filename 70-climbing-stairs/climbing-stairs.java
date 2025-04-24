class Solution {
    public int climbStairs(int n) {

        int a=0;
        int b=0;
        int c=0;
        int result=0;

        for(int i = 1 ; i <= n ; i++){
            
            if(i==1){
                a = 1;
                if(n == 1){
                    result = n;
                }
            }
            if(i==2){

                b = 2;

                if( n == 2){
                    result = n;
                }
                
            }

            if(i>2){
                c = a + b ;
                a = b ; 
                b = c ;
                result = b;
            }





        }
        return result;
    
    }
}