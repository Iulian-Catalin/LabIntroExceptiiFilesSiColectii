package colectii;

import com.sun.source.tree.Tree;

import java.util.*;

public class DemoSet {
    public static void main(String[] args) {

        // ana are mere si pere si ana are pere

        // mere -> unicat
        // {ana=2, are=2, si=2, mere=1, pere=2} -> HashMap (Implementarea Default)
        // {ana=2, are=2, mere=1, pere=2, si=2} -> TreeMap (Dupa ordinea alfabetica)
        // {ana=2, are=2, mere=1, si=2, pere=2} -> LinkedHashMap (Dupa ordinea textului)

        Set<String> unice = new HashSet<>();
        Set<String> dublicate = new HashSet<>();

//        Set<String> noDub = new HashSet<>();
//        for (String s : args){
//            noDub.add(s);
//        }
//        System.out.println("Uite cate cuvinte fara dublicate ai: "+noDub.size());
//        System.out.println(noDub);
        for(String s : args) {
            if(!unice.add(s))
                dublicate.add(s);
        }
        unice.removeAll(dublicate);

        System.out.println("Elemente unice: " + unice);
        System.out.println("Elemente dublicate:  " + dublicate);

        Map<String, Integer> nrAparitii = new LinkedHashMap<>();
        for (String s : args) {
            Integer nrAp = nrAparitii.get(s);
            nrAparitii.put(s, (nrAp==null)?1:nrAp+1);
//            if(nrAp==null)
//                nrAparitii.put(s,1);
//            else nrAparitii.put(s, nrAp+1);
            System.out.println(nrAparitii);
        }
    }
}
