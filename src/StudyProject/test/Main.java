package StudyProject.test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("07"));
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        String time = "6:00";
        String[] times = time.split(":");
        float hour = Integer.parseInt(times[0]);
        float min = Integer.parseInt(times[1]);
        float finalresult = 0;
        float mintangle = min/60*360;
        float hourtangle = hour/12*360;
        if(hourtangle>mintangle){
            finalresult=hourtangle-mintangle;
        }else{
            finalresult=mintangle-hourtangle;
        }
        times = Float.toString(finalresult).split(".");
        if(Integer.parseInt(Character.toString(times[1].charAt(1)))>5){
            time = times[0]+"."+Integer.toString(Integer.parseInt(Character.toString(times[1].charAt(0))+1));
        }else{
            time = times[0]+"."+Integer.toString(Integer.parseInt(Character.toString(times[1].charAt(0))));
        }

    }
}