package demosortorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoSimpleSort {

    public static void main(String[] args) {

        Person p1 = new Person("Ionel", 45);
        Person p2 = new Person("Iulia", 35);
        Person p3 = new Person("Ligia", 13);
        Person p4 = new Person("Tatiana", 9);

        List<Person> myFamily = new ArrayList<>();
        myFamily.add(p1);
        myFamily.add(p2);
        myFamily.add(p4);
        myFamily.add(p3);

        Collections.sort(myFamily);
        for(Person x : myFamily) {
            System.out.println(x.getName()+":"+x.getAge());
        }
    }
}