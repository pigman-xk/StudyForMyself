package leetcode.removeElement_DoubleIndex;

public class No59 {
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] arr = new int[n][n];
            int k = 1;
            int i =0;
            while(k<=n*n-1){//坑！！当n为奇数时，中心位置无法添加，降低限制条件，循环外判断处理
                for(int z=i;z<n-i-1;z++){
                    arr[i][z] = k;
                    k++;
                }
                for(int z=i;z<n-i-1;z++){
                    arr[z][n-i-1] = k;
                    k++;
                }

                for(int z = n-i-1;z>i;z--){
                    arr[n-i-1][z] = k;
                    k++;
                }
                for(int z = n-i-1;z>i;z--){
                    arr[z][i]=k;
                    k++;
                    System.out.println(k);
                }
                i++;
            }
            if(n*n%2==1){
                arr[i][i]=n*n;
            }
            return arr;
        }
    }
}
