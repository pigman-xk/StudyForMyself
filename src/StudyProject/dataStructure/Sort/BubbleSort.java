package StudyProject.dataStructure.Sort;

import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {3,9,-1,10,-2};
//        int temp = 0;
//        boolean flag = false;
        //冒泡排序，每次一定找到此次排序一个最大的数放在最后,总共要找n-1次最大的数，最后一个不用找，已经排在第一位了
        //                                          每次找最大数，需要进行n-1-i，i为第几趟，因为已经找出i个最大数不用参与排序.
        //n-1趟排序,时间复杂度为n^2
//        for(int i = 0;i<arr.length-1;i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    flag=true;//表明信号进入过此排序
//                }
//            }
//            System.out.println("第"+(i+1)+"趟排序后的数组");
//            System.out.println(Arrays.toString(arr));
//            if(flag){
//                flag=false;//重置为没有进入的状态
//            }
//            else {
//
//                break;
//            }
//        }




//        System.out.println("第一趟排序后的数组");
//        System.out.println(Arrays.toString(arr));
//        //第二趟排序
//        for(int j =0;j<arr.length-1-1;j++){//不同点，已排序后的最大的数不参与比较
//            if(arr[j]>arr[j+1]){
//                temp = arr[j];
//                arr[j]=arr[j+1];
//                arr[j+1]=temp;
//            }
//        }
//        System.out.println("第二趟排序后的数组");
//        System.out.println(Arrays.toString(arr));
//        //第三趟排序
//        for(int j =0;j<arr.length-1-2;j++){//不同点，已排序后的最大的数不参与比较
//            if(arr[j]>arr[j+1]){
//                temp = arr[j];
//                arr[j]=arr[j+1];
//                arr[j+1]=temp;
//            }
//        }
//        System.out.println("第三趟排序后的数组");
//        System.out.println(Arrays.toString(arr));
//        //第四趟排序
//        for(int j =0;j<arr.length-1-3;j++){//不同点，已排序后的最大的数不参与比较
//            if(arr[j]>arr[j+1]){
//                temp = arr[j];
//                arr[j]=arr[j+1];
//                arr[j+1]=temp;
//            }
//        }
//        System.out.println("第四趟排序后的数组");
//        System.out.println(Arrays.toString(arr));

        //创建80000个数据的数组;
        int[] arr = new int[80000];
        for(int i =0;i<80000;i++){
            arr[i]= (int)(Math.random()*80000);//生成一个[0,80000)数
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time1=simpleDateFormat.format(date1);
        System.out.println("排序前时间是:"+time1);

        bubblesort(arr);

        Date date2 = new Date();
        String time2=simpleDateFormat.format(date2);
        System.out.println("排序后时间是:"+time2);//8w数据用时大概15s左右



    }

    public static void bubblesort(int[] arr){
        if(arr==null){
            return;
        }
        int temp = 0;
        boolean flag = false;
        //冒泡排序，每次一定找到此次排序一个最大的数放在最后,
        // 总共要找n-1次最大的数，最后一个不用找，已经排在第一位了,
        // 每次找最大数，需要进行n-1-i，i为第几趟，因为已经找出i个最大数不用参与排序.
        //n-1趟排序,时间复杂度为n^2
        for(int i = 0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag=true;//表明信号进入过此排序
                }
            }
            if(flag){
                flag=false;//重置为没有进入的状态
            }
            else {
                break;
            }
        }
    }
}
