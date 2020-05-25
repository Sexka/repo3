package REStudy.ThrowableException;

public class Demo02 {
    public static void main(String[] args) {
    int[]arr ={1,2,34,34,52,42};
        int element = getElement(arr, 4);
        System.out.println(element);
    }
    public static int getElement(int[]arr,int index){
    int ele = arr[index];
    return ele;
    }
}
