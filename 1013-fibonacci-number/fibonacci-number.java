class Solution {
    public int fib(int n) {

        if(n == 0){ return 0;}

        int result = 1;
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