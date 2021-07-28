package StudyProject.test;

import java.util.Arrays;
import java.util.Comparator;

public class pulbicString implements Comparator {
    public static void main(String[] args) {
        String s = "123";
        String [] string = new String[]{"BS","aSDAS","SAF"};
        Arrays.sort(string);
        System.out.println(s.substring(0,0));
    }


    @Override
    public int compare(Object o1, Object o2) {
        if(((String)o1).length()>((String)o2).length()){
            return 1;
        }else if(((String)o1).length()<((String)o2).length()){
            return -1;
        }else{
            return 0;
        }
    }
}
