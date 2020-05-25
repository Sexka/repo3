package REStudy.ThrowableException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
     /*   Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy,mm,dd,HH,mm,ss");
        try {
            Date parse = sdf.parse("1920,02,18,12,12,23");
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
     /*   int[] arr ={1,2,3,};
        try {
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("后续代码");*/
        int[] arr = new int[1024 * 1024];//OutOfMemoryError内存溢出错误必须修改源代码
        System.out.println("后续代码");
    }
}
