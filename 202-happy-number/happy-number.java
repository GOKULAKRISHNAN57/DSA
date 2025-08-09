class Solution {
    public boolean isHappy(int n) {

        int check = 0;

        while(true){

            int digit = n%10;

            check = check + (int) Math.pow(digit,2);
            n = n / 10;

            if(n == 0){
                if(check > 0 && check < 10 && check != 7){
                    break;
                }
                n = check;
                check = 0;
            }

        }

        return check == 1;
        
    }
}