class Solution {
    public int fib(int n) {

        if(n == 0){ return 0;}
        if(n == 1 || n == 2){ return 1;}

        int result = 0;
        int x = 0;
        int y = 1;

        for( int i = 1 ; i < n ; i++ ){
            result = x + y;
            x = y;
            y = result;
        }

        return result;
    }
}