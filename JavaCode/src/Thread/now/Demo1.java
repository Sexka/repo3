package Thread.now;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("赛悠啦啦", 19),
                new Person("迪丽热巴", 18),
                new Person("古力娜扎", 17),
                new Person("马儿扎哈", 16),
        };
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
//        for (Person person : arr) {
//            System.out.println(person);
//        }
        Arrays.sort(arr, Comparator.comparingInt(Person::getAge));
        for (Person person : arr) {
            System.out.println(person);
        }
        new Thread(()->
            System.out.println("Rika"+Thread.currentThread().getName())
        ).start();
        System.out.println("______________________________________________");
        new Thread(() ->System.out.println("Rika"+Thread.currentThread().getName())).start();
    }
}
