import java.util.*;

public class CollectionAssignment {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 10, 4, 3, 20, 15));
        int k = 3;
        Collections.sort(list);
        System.out.println("Kth smallest: " + list.get(k - 1));

        
        String text = "java is fun java is powerful";
        String[] words = text.split(" ");
        TreeMap<String, Integer> wordMap = new TreeMap<>();
        for (String w : words) {
            wordMap.put(w, wordMap.getOrDefault(w, 0) + 1);
        }
        System.out.println("Word Frequencies: " + wordMap);

        
        PriorityQueue<Integer> stackPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> queuePQ = new PriorityQueue<>();

        TreeMap<Integer, String> studentMap = new TreeMap<>();
        studentMap.put(101, "Alice - CS");
        studentMap.put(102, "Bob - IT");
        System.out.println("Students: " + studentMap);

        LinkedList<String> l1 = new LinkedList<>(Arrays.asList("A", "B"));
        LinkedList<String> l2 = new LinkedList<>(Arrays.asList("A", "B"));
        boolean isEqual = l1.equals(l2);
        System.out.println("Lists Equal: " + isEqual);

        HashMap<Integer, String> empMap = new HashMap<>();
        empMap.put(5001, "Engineering");
        empMap.put(5002, "Marketing");
        System.out.println("Employees: " + empMap);
    }
}
