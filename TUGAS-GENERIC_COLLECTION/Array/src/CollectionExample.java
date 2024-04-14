import java.util.ArrayList;
import java.util.ArrayDeque;

public class CollectionExample {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Ralph Lauren");
        arrayList.add("Chanel");
        arrayList.add("Saint Laurent");

        System.out.println("Isi ArrayList:");
        for (String clothes : arrayList) {
            System.out.println(clothes);
        }

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);

        arrayDeque.addLast(4);
        arrayDeque.addLast(5);
        arrayDeque.addLast(6);

        System.out.println("\nIsi ArrayDeque:");
        while (!arrayDeque.isEmpty()) {
            System.out.println(arrayDeque.pollFirst()); 
        }
    }
}
