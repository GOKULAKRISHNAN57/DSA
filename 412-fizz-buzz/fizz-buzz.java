import java.util.Arrays;
import java.util.List;
class Solution {
    public List<String> fizzBuzz(int n) {
        
        String array[] = new String[n];
        
        for (int i = 0; i < array.length; i++) {
            int num = i + 1; 
            if (num % 3 == 0 && num % 5 == 0) {
                array[i] = "FizzBuzz";
            } 
            else if (num % 3 == 0) {
                array[i] = "Fizz";
            } 
            else if (num % 5 == 0) {
                array[i] = "Buzz";
            } 
            else {
                array[i] = String.valueOf(num);
            }
        }
        return Arrays.asList(array);
    }
}