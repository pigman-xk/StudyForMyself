package StudyProject.dataStructure.sparseArray;

import java.io.*;
import java.util.Arrays;

public class SparseArray {
        public static void main(String[] args) throws IOException {
                //创建一个原始的二维数组11*11大小
                //0：表示没有棋子，1表示黑子，2表示蓝子
                int chessArr1[][] =new int[11][11];
                chessArr1[1][2]=1;
                chessArr1[2][3]=2;
                chessArr1[4][5]=2;
                System.out.println("原始的二维数组");
                for (int [] row:chessArr1){//row 为一维数组，对二维数组每行进行遍历
                        for (int data:row){//对行中每列元素进行遍历
                                System.out.printf("%d\t",data);//格式化输出，一个数字+间隔
                        }
                        System.out.println();//遍历完一行，换行
                }

                //1.遍历这个chessArr1得到非0数据的个数
                int sum = 0;//非零值的总个数
                for (int i = 0;i<11;i++){
                        for (int j = 0;j<11;j++){
                                if(chessArr1[i][j]!=0){
                                        sum++;
                                }
                        }
                }

                //2.创建对应的稀疏数组
                int sparseArr[][]=new int[sum+1][3];//稀疏数组
                //稀疏数组记录原数组的大小
                sparseArr[0][0] = 11;
                sparseArr[0][1] = 11;
                sparseArr[0][2] = sum;

                //3.遍历二维数组，将非0的数组存放到sparseArr中
                int count = 1;//用于记录是第几个非0数据
                for (int i = 0;i<11;i++){
                        for (int j = 0;j<11;j++){
                                if(chessArr1[i][j]!=0){
                                        sparseArr[count][0] = i;
                                        sparseArr[count][1] = j;
                                        sparseArr[count][2] = chessArr1[i][j];
                                        count++;
                                }
                        }
                }

                //输出稀疏数组的形式

                System.out.println();
                System.out.println("得到的稀疏数组为以下形式：");
                for (int i = 0; i < sparseArr.length; i++) {
                        System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],
                                                         sparseArr[i][1],
                                                         sparseArr[i][2]);
                }
                System.out.println();

                //稀疏数组->二维数组

                int row = sparseArr[0][0];
                int collum = sparseArr[0][1];
                //1.根据稀疏数组的第一行数据创建二维数组
                int chessArray2[][]=new int[row][collum];

                //2.在读取稀疏数组后几行的数据，并赋给原始的二维数据即可
                //从第二行开始
                for (int i =1;i<sparseArr.length;i++ ){
                        chessArray2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
                }

                //输出恢复吼的二维数组
                System.out.println();
                System.out.println("恢复后的二维数组");

                for (int [] row2:chessArray2){//row 为一维数组，对二维数组每行进行遍历
                        for (int data:row2){//对行中每列元素进行遍历
                                System.out.printf("%d\t",data);//格式化输出，一个数字+间隔
                        }
                        System.out.println();//遍历完一行，换行
                }


                String path = "E:\\store.txt";
                File file = new File(path);
                FileWriter fileOutputStream = new FileWriter(file);
                BufferedWriter bufferedOutputStream = new BufferedWriter(fileOutputStream);
                for (int[] row3:sparseArr) {
                        for (int j = 0; j < row3.length; j++) {
                                bufferedOutputStream.write(Integer.toString(row3[j]));
                                System.out.println(row3[j]);
                        }
                        bufferedOutputStream.newLine();
                }
                bufferedOutputStream.close();

                FileReader fileInputStream = new FileReader(file);
                BufferedReader bufferedInputStream = new BufferedReader(fileInputStream);
                int b ;
                while((b = bufferedInputStream.read()) !=-1){
                        System.out.println();
                }
                bufferedInputStream.close();
        }
        }
