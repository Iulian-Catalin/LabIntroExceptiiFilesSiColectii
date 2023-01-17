package colectii;

import java.util.*;

public class colectii {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add("Ionel este vanator");
//        list.add(2);
//        list.add(false);
//
//        Object o = list.get(0); // verificare
//        if ( o instanceof Integer) {
//            String a = (String)list.get(0);
//            System.out.println(a);
//        }

        List<String> list = new ArrayList<>();
        list.add("ana");
        list.add("maria");
        list.add("ana");
        list.add("ana-maria");
        list.get(1);

        Collection c;
        List<String> l = new ArrayList<>();

        // traversari

        for(String sss : list){
            System.out.println(sss);
        }

        for( int i = 0; i< list.size();i++){
            System.out.println(list.get(i));
        }
        Iterator<String> i = list.iterator();
        while(i.hasNext()) {
            String s = i.next();
            System.out.println(s);
            //i.remove();
        }

        Set<String> noDub = new HashSet<>(list);
        for(String sss : noDub){
            System.out.println(sss);
        }
    }
}
