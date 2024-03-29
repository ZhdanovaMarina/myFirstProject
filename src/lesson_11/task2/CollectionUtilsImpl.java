package lesson_11.task2;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        if (a == null || b == null) {
            System.out.println("Коллекции не могут быть null!");
            return result;
        }
        /*for (Integer integer : a){
            result.add(integer);
        }
        for (Integer integer : b){
            result.add(integer);
        }*/
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> result = new ArrayList<>();
        if (a == null || b == null) {
            System.out.println("Коллекции не могут быть null!");
            return result;
        }
        for (Integer integerA : a) {
            if (b.contains(integerA)) {
                result.add(integerA);
            }
        }
        for (Integer integerB : b) {
            if (a.contains(integerB)) {
                result.add(integerB);
            }
        }

        return result;

    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new TreeSet<>();
        if (a == null || b == null) {
            System.out.println("Коллекции не могут быть null!");
            return result;
        }
        result.addAll(a);
        result.addAll(b);

        return result;

    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>(a);
        if (a == null || b == null) {
            System.out.println("Коллекции не могут быть null!");
            return result;
        }

        result.retainAll(b);
        return result;

    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> result = new ArrayList<>();
        if (a == null || b == null) {
            System.out.println("Коллекции не могут быть null!");
            return result;
        }
        for (Integer integerA : a){
            if (! b.contains(integerA)){
                result.add(integerA);
            }
        }
        for (Integer integerB : b){
            if (! a.contains(integerB)){
                result.add(integerB);
            }
        }
        return result;

    }
}
