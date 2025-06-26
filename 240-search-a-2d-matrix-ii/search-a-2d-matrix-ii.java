class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int st = 0;
        boolean check = false;

        for(int i = 0; i < m; i++){
            int n = matrix[i].length;
            int end = matrix[i].length;

            for(int j = 0; j < n; j++){
                int mid = (st+end)/2;

                if(matrix[i][mid] == target){
                    check = true;
                    break;
                }
                if(matrix[i][mid] > target){
                    end = mid;
                }
                else{
                    st = mid;
                }
            }

            st = 0;

        }
        return check;
        
    }
}