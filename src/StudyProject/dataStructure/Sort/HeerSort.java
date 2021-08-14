package StudyProject.dataStructure.Sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HeerSort {
    public static void main(String[] args){
//        int[] a = new int[200000];
//        for(int i = 0; i<200000;i++){
//            a[i]=(int)(Math.random()*200000);
//        }
        int[] a = {4,1,5,3,7,10,4,5};
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println(date);
        heerSort(a);
        Date date2 = new Date();
        System.out.println(date2);
        System.out.println(Arrays.toString(a));

    }
    public static void heerSort(int[] arr){
        int n = arr.length;
        for(int i=n/2;i>0;i=i/2){//从大到小遍历增量序列
            for(int j = 0;j<i;j++){//遍历所有增量分组
                for(int k = j+i;k<n;k=k+i){//遍历无序表
                    int insertVal =arr[k];
                    int insertIndex = k-i;
                    while(insertIndex>=0&&arr[insertIndex]>insertVal){//遍历比较有序表并交换位置
                            arr[insertIndex+i]=arr[insertIndex];
                            insertIndex=insertIndex-i;
                    }
                    arr[insertIndex+i]=insertVal;
                }
            }
        }
    }
}
