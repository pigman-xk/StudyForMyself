package StudyProject.dataStructure.Search;

import java.util.ArrayList;
import java.util.List;

//二分查找数组必须有序
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 89, 100, 599};
        System.out.println(binarySearch(a, 0, a.length - 1, 999));
    }

    public static int binarySearch(int[] arr, int left, int right, int finalVal) {
        if (left > right) {//终止条件，当没有数可以取时终止
            return -1;
        }
        int mid = (left + right) / 2;//取中值下标
        int midVal = arr[mid];//取中值
        if (finalVal > midVal) {//若大于该中值，则数必定在数组的右分组
            return binarySearch(arr, mid + 1, right, finalVal);
        } else if (finalVal < midVal) {//若小于该中值，则数必定在数组的左分组
            return binarySearch(arr, left, mid - 1, finalVal);
        } else{ //若当前中值为要找的值，返回其下标
            return mid;
        }
    }
    public static ArrayList<Integer> binarySearch2(int[] arr, int left, int right, int finalVal) {
        if (left > right) {//终止条件，当没有数可以取时终止
            return new ArrayList<Integer>();
        }
        int mid = (left + right) / 2;//取中值下标
        int midVal = arr[mid];//取中值
        if (finalVal > midVal) {//若大于该中值，则数必定在数组的右分组
            return binarySearch2(arr, mid + 1, right, finalVal);
        } else if (finalVal < midVal) {//若小于该中值，则数必定在数组的左分组
            return binarySearch2(arr, left, mid - 1, finalVal);
        } else{ //若当前中值为要找的值，返回其下标  改进：返回多个值
            ArrayList<Integer> array = new ArrayList<Integer>();
            int temp = mid-1;
            while(true){
                if(temp<0||arr[temp]!=finalVal){
                    break;
                }
                array.add(temp);
                temp--;
            }
            array.add(mid);
            temp=mid+1;
            while(true){
                if(temp>arr.length-1||arr[temp]!=finalVal){
                    break;
                }
                array.add(temp);
                temp+=1;
            }

            return array;
        }
    }
}