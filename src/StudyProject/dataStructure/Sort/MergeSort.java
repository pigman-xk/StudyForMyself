package StudyProject.dataStructure.Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {4,5,8,200,-20,7,8,9,5,6,2,4,5,963,31};
        int[] temp = new int[a.length];
        mergeSort(a,0,a.length-1,temp);
        System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(int[] arr,int left,int right,int[] temp){
        if(left<right) {//限制条件，分拆为2个数进行合并
            int l = left;
            int r = right;
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid, temp);//分拆左边的数组
            mergeSort(arr, mid + 1, right, temp);//分拆右边的数组
            Merge(arr,left,mid,right,temp);//合并
        }
    }
    public static void Merge(int[] arr,int left, int mid,int right,int[] temp){
        int i = left;
        int j = mid+1;
        int t = 0;//指向temp数组的当前索引
        //将左右两个有序数组合并
        while(i<=mid&&j<=right){
            if(arr[i]<=arr[j]) {
                temp[t] = arr[i];
                t++;
                i++;
            }else {
                temp[t]=arr[j];
                t++;
                j++;
            }
        }
        //将剩余未合并部分的数组合并
        while(i<=mid){
            temp[t]=arr[i];
            i++;
            t++;
        }
        while(j<=right){
            temp[t]=arr[j];
            j++;
            t++;
        }
        t=0;//初始化t
        //复制数组到对应的位置
        while(left<=right){//此处使用left<=right
            arr[left]=temp[t];
            t++;
            left++;
        }
    }
}
