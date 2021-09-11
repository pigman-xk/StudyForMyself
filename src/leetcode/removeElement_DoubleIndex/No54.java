package leetcode.removeElement_DoubleIndex;

import java.util.ArrayList;
import java.util.List;

public class No54 {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            int left = 0;
            int right = matrix[0].length-1;
            int top = 0;
            int bottom = matrix.length-1;
            int k =matrix.length*matrix[0].length;
            List<Integer> arr = new ArrayList<Integer>();
            while(k>0){
                for(int i =left;i<=right&&k>0;i++){
                    arr.add(matrix[top][i]);
                    k--;
                }
                top++;
                for(int i=top;i<=bottom&&k>0;i++){
                    arr.add(matrix[i][right]);
                    k--;
                }
                right--;
                for(int i=right;i>=left&&k>0;i--){
                    arr.add(matrix[bottom][i]);
                    k--;
                }
                bottom--;
                for (int i =bottom;i>=top&&k>0;i--){
                    arr.add(matrix[i][left]);
                    k--;
                }
                left++;
            }
            return arr;
        }
    }
}
