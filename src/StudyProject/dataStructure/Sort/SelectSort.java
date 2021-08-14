package StudyProject.dataStructure.Sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {101,34,119,1};
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        selectSort2(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));

    }

    //选择排序
    public static void selectSort(int[] arr) {
        //每趟选一个最小的数放在前面,总共需要n-1躺,n-1时已经排序完毕.
        //每趟在[j,n]进行排序
        //min和minIndex初始化为第j位的元素和下标
        //然后在[j+1,n]之间寻找最小值
        //若最小值就位于第j位,则不交换;若位于[j+1,n]则交换位置
        //时间复杂度仍然是n^2,大约为4s左右,选择排序效率比冒泡时间快.
        for (int j = 0; j < arr.length-1; j++) {
            int min = arr[j];
            int minIndex = j;
            for (int i = j+1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            if(minIndex!=j) {
                arr[minIndex] = arr[j];
                arr[j] = min;
            }
        }
    }
    public static void selectSort2(int[] arr) {//理解再编码
        for (int j = 0; j < arr.length; j++) {
            int min = arr[j];
            int index = j;
            for (int i = j+1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    index = i;
                }
            }
            if (index != j) {
                arr[index] = arr[j];
                arr[j] = min;
            }
        }
    }

}
