package StudyProject.javeseBase;
/*
* instance除了判断是否是它字类之外，还可以判断是否为某类
* */
public class instanceDemo {
    public static void main(String[] args) {
        Object obj =new Object();
        String s = "abc";
        String s_s = "ac";
        System.out.println(s instanceof Object);//True
        System.out.println(s instanceof String);//True
    }
}
