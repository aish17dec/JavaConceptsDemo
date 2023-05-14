package CollectionsFramework;
import java.util.*;

public class LinkedListExamples {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(5);
        ll.add(4); ll.add(3); ll.add(2); ll.add(1);

        ll.addFirst(10);
        ll.addLast(100);
//        System.out.println(ll);
//        ll.clear();

        List<Integer> l = new ArrayList<Integer>();
        l.add(51); l.add(52); l.add(53);

        ll.addAll(0,l);
        System.out.println(ll.get(0));

        System.out.println(ll);

        Iterator itr = ll.descendingIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        ListIterator itr2 = l.listIterator();

        while(itr2.hasPrevious()){
            System.out.println(itr2.previous());
        }
    }
}
