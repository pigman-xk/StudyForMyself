package StudyProject.dataStructure.Sort;

import java.lang.annotation.Native;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,7,2,3};
        insertSort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }



    //插入排序
    public static void insertSort(int[] arr){
        //定义待插入的数
        for(int i = 1;i<arr.length;i++) {//0下标为第一个有序表元素，故从无序表第一个元素插入，即1
            int insertVal = arr[i];//将插入元素取出
            int insertIndex = i - 1;//用于比较元素的下标，开始为插入元素的前一个元素
            while (insertIndex >= 0 && arr[insertIndex] > insertVal) {//若前一个元素大于插入元素，则该元素后移再对前一个元素进行比较，还大于插入元素继续后移
                                                                      //若想从大到小排，则将上面的大于号改为小于号
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if(insertIndex+1!=i){
                arr[insertIndex+1] = insertVal; //若发现插入元素大于插入下标的元素的了，那么这个插入下标的后一位就是插入位置
            }
        }
    }
}
