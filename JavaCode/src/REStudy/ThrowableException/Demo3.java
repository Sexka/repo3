package REStudy.ThrowableException;

public class Demo3 {
    public static void main(String[] args) {
       // int[] arr = null;
        int[]arr = new int[3];
        int element = getElement(arr, 3);
        System.out.println(element);
    }
    public static int getElement(int[]arr,int index){
    if (arr==null){
        throw new NullPointerException("传递的类型是空");
    }if (index<0||index>arr.length-1){
        throw new ArrayIndexOutOfBoundsException("数组索引越界异常");
        }
        int ele = arr[index];
    return ele;
    }
}
