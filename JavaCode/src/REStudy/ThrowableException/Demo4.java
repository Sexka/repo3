package REStudy.ThrowableException;

import java.util.Objects;

public class Demo4 {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj){
//    if (obj==null){
//        throw new NullPointerException();
//    }
        //Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的对象的值为null");
    }

}
