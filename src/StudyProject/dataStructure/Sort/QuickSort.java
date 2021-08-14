package StudyProject.dataStructure.Sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {1,2,1,55,44,78,69,2,5,4,5,8,9,3,4,5,4,5,2,3,2,1};
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println(date);
        quickSort(a,0,a.length-1);
        Date date2 = new Date();
        System.out.println(date2);
        System.out.println(Arrays.toString(a));
    }
    public static void quickSort(int[] arr , int left, int right){
       if(left>=right){
           return;
       }
       int l=left;int r = right;
       int pivot = arr[left];
       while(l<r){
           while(l<r&&arr[r]>=pivot){
               r--;
           }
           if(l<r){
               arr[l]=arr[r];
           }
           while (l<r&&arr[l]<=pivot){
               l++;
           }
           if(l<r){
               arr[r]=arr[l];
           }
           if(l==r){
               arr[l]=pivot;
           }
       }
       quickSort(arr,left,r-1);
       quickSort(arr,l+1,right);
    }

    public static void Sort(int[] arr , int left, int right){
        int l=left;int r = right;
        int pivot = arr[(l+r)/2];//中轴
        while(l<r){
            //找出小于等于和大于等于中轴数的两个数
            while(arr[r]>pivot){
                r--;
            }
            while (arr[l]<pivot){
                l++;
            }
            if(l>=r){//若已经有序，则退出
                break;
            }
            //交换两个数
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;

            //防止两数遇到都是pivot值，然后无限循环下去
            if(arr[r]==pivot){
                l++;
            }
            if(arr[l]==pivot) {
                r--;
            }
        }
        //l==r，不进入循环，无限递归，栈溢出，故指针前移
        if(l==r){
            l++;
            r--;
        }
        if(r>left){//只有左边的数组长度大于0就继续排序
            Sort(arr,left,r);
        }
       if(l<right){//右边数组同理
           Sort(arr,l,right);
       }
    }










}
