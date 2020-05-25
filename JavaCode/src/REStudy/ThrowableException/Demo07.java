package REStudy.ThrowableException;

import java.lang.reflect.Array;
import java.util.List;

public class Demo07 {
    public static void main(String[] args) {

        /*try {
            int []arr ={1,2,3};
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }try {
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        }catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println("后续代码！");*/
        try {
            int[]arr ={1,2,3};//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            //System.out.println(arr[3]);
                            //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }finally {
            System.out.println("资源释放！");
        }
        System.out.println("后续代码");
    }
}