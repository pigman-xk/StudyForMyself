package StudyProject.dataStructure.Quene;

import java.util.Scanner;
//目前数据使用一次就不能使用，没有达到复用的效果
//将这个数据使用算法，改进成一个环形数组，取模：%
public class ArrayQueueDemo {
    public static void main(String[] args) {//静态方法中不能直接使用动态方法
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key=' ';//接收用户输入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while(loop){
            System.out.println("s(show):显示队列");
            System.out.println("s(exit):退出程序");
            System.out.println("s(add):添加数据到队列");
            System.out.println("s(get):从队列取出数据");
            System.out.println("h(head):查看队列头数据");
            key = scanner.next().charAt(0);
            switch (key){
                case's':
                    arrayQueue.showQuene();
                    break;
                case 'a':
                    System.out.println("输入一个数");
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = arrayQueue.getQueue();
                        System.out.printf("取出的数据是%d\n",res);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = arrayQueue.headQueue();
                        System.out.printf("取出的队列头数据是%d\n",res);
                    }catch (Exception e ){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop=false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出~~");

    }
}

class ArrayQueue{
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;//该数组用于存放数据

    //创建队列的构造器
    public ArrayQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;//指向队列头部，分析出front指向队列头的前一个位置
        rear = -1; //指向队列尾
    }
    public boolean isFull(){
        return rear==maxSize-1;
    }

    public boolean isEmpty(){
        return rear==front;
    }

    public void addQueue(int n){
        //判断队列是否满
        if (isFull()){
            System.out.println("队列满不能加入");
            return ;
        }
        rear++;//让rear后移
        arr[rear]=n;
    }

    //获取队列的数据
    public int getQueue(){
        if(isEmpty()){
            //通过抛出一个异常
//            System.out.println("队列为空");
            throw new RuntimeException("队列空，不能取出数据");//会直接导致代码return
        }
        front++;
        return arr[front];
    }

    //显示队列所有数据
    public void showQuene(){
        if (isEmpty()){
            System.out.println("队列空的，没有数据");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }

        //改进环形数组，遍历真实数据个数次数
//        for (int i = front; i < front+(rear+maxSize-front) ;  i++) {
//            int index = i%maxSize;//真实下标
//        }
    }

    //显示队列的头数据，注意不是取数据
    public int headQueue(){
        //判断是否为空
        if (isEmpty()){
            System.out.println("队列空的，没有数据");
            throw new RuntimeException("队列空，不能取出数据");//会直接导致代码return
        }
        return arr[front+1];
    }


}