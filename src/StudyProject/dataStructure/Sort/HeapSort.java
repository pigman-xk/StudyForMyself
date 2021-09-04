package StudyProject.dataStructure.Sort;

public class HeapSort {
    public static void main(String[] args) {
        //要求升序使用大顶堆
    }
    //编写堆排序
    public static void heapSort(int arr[]){
        int temp = 0;
        //建堆
        for(int i = arr.length/2-1;i>=0;i--){//i=[(arr.length-1)-1]/2=arr.length/2-1，
                                            // 倒数第一个非叶子结点，从下至上，从左至右
            adjustHeap(arr,i,arr.length);//对每个元素调用
        }
        //建堆完成后进行排序
        for(int j=arr.length-1;j>0;j--){//从最后一个元素开始进行交换
            //与大顶堆的根节点与最后一个结点，意味完成一个最大数提取
            //即数组第一个和最后一个交换
            temp = arr[j];
            arr[0] = temp;
            adjustHeap(arr,0,j);//交换完成后，维持堆的性质，对交换后的根结点进行重建
        }
    }
    /**
     * 完成 以i指向的非叶子节点的树调整成大顶堆
     *arr:待调整数组
     * i:数组中非叶子结点的索引
     * n 表示对多少个元素继续调整
     */
    public static void adjustHeap(int arr[],int n ,int i){
        int largest = i;
        int lson=2*i+1;
        int rson=2*i+2;
        if(lson<n&&arr[largest]<arr[lson])//左孩子大于父结点
            largest=lson;
        if(rson<n&&arr[largest]>arr[rson])//右孩子大于父结点
            largest=rson;
        if(largest!=i){//倘若largest不为i则，有孩子结点比父结点大，替换
            int temp = arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            int changeIndex = largest;
            adjustHeap(arr,n,changeIndex);//替换过后，结点位置发生改变，要维护堆的性质，
                                         // 必须对改变后的子结点的左右孩子再进行维护
        }
    }
}
