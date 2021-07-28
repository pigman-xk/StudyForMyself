package StudyProject.test;

import java.util.*;
import java.util.concurrent.Callable;

public class IteratorDemo {
    public static void main(String[] args) {
//        ArrayList a =new ArrayList();
//        a.add(0);
//        a.add(1);
//        a.add(2);
//        Iterator iterator = a.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        for (Object i : a){
//            System.out.println(i);

//        }
//    String [] strs = new String[]{"1","2","3","4"};
//    LinkedList a = new LinkedList();
//        int a = 0;

        ClassDemo classDemo = (int a ,int b)->{//只能用于接口
            return a+b;
        };
    }
    interface  ClassDemo{

         int add(int a ,int b);
    }
}
