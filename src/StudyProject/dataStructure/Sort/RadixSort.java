package StudyProject.dataStructure.Sort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] a = {5,9,2,4,5,63,8};
        radixSort(a);
        System.out.println(Arrays.toString(a));
    }


    public static void radixSort(int[] arr){
        /*
        * 基数排序要求的数据结构：
        *   桶：二维数组bucket
        *   统计每个桶元素个数的一维数组用于遍历桶时确定要遍历的个数来覆盖原数组
        *   最大数的最高位长度，用于要进行多少次桶排序
        * 具体：
        *   遍历低位数到高位数：
        *       遍历数组，将数组元素加入各个桶，并统计每个桶元素数量
        *       将桶中元素覆盖到原数组，并将统计桶元素数量的数组重置为0用于下轮桶排序
        * */
        int[][] bucket = new int[10][arr.length];
        int[] bucketElementCounts = new int[10];
        int max = arr[0];
        for(int i =0;i<arr.length;i++){//找出最大值
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int maxLength = (max+"").length();//找出最大位数
        for(int i =0,n=1;i<maxLength;i++,n*=10){//第i轮
                for(int j = 0;j<arr.length;j++){//遍历此轮arr，将每个元素放入对应桶
                    int num = arr[j]/n%10;//位数
                    //放入桶中
                    bucket[num][bucketElementCounts[num]]=arr[j];
                    bucketElementCounts[num]++;//桶元素数量数组默认元素为0
                }
                int index = 0;//辅助指针
                //将桶中元素覆盖到原数组中
                for(int k = 0;k<bucket.length;k++){//遍历0-9的桶
                    for(int z = 0;z<bucketElementCounts[k];z++){//遍历桶中元素
                        arr[index++] = bucket[k][z];//赋值，后置++：先执行，再赋值
                    }
                    bucketElementCounts[k]=0;//赋值完重置桶数量数组
                }
        }
    }
}
