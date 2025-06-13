class Solution {
    public int fib(int n) {

        int a = 1;
        int b = 1;
        int c = 1;

        int i = 3;
 
        if(n == 0){
            return 0;
        }

        if(n == 2 || n == 1){
            return 1;
        }

        while(i<=n){

            c = a+b;
            a = b;
            b = c;

            i++;
        }

        return c;


    }
}