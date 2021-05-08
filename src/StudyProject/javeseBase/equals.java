package StudyProject.javeseBase;

import java.util.Objects;

/*
* 任何类型的空指针：类型 变量名 = null，调用equals()会报错误，应使用常量或确定有值的对象来调用equals()方法，
* 而new的集合也不会报错，集合的equals()比较的是对象之间的地址是否相等
* 创建好对象的引用类型则不会，因为默认调用了Object.equals(),该方法中已经默认处理的该种空指针，故不会报错。
*且集合和Object对象的equals是同一个.
*
* 处理办法：使用Objects.equals(a,b) 该方法已经做好空指针的处理，不会报错(注意是Objects，而不是Object)
* */
public class equals {
    public static void main(String[] args) {
        String s = null;
        int[] list = new int[4];
        Object o = null;
        int[] list_s = null;
        Object o_s = new Object();
        //list.equals();
//        try{
            list.equals("abc");//不报错
            o_s.equals("abc");//不报错
            list_s.equals("abc");//报错
            o.equals("abc");//报错
            s.equals("abc");//报错
        System.out.print(Objects.equals(s,o));//不报错,返回True

//        }catch(Exception e){
//            e.printStackTrace();
//        }

    }
}
