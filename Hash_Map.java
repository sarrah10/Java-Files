import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap hmap = new HashMap<>();

        //checking HashMap is empty or not
        boolean empty = hmap.isEmpty();
        System.out.println(empty);

        //Adding entries in hmap
        hmap.put("Elena", 9827382723L);
        hmap.put("Caroline", 9828837823L);
        hmap.put("Damon", 8728736276L);
        hmap.put("Stefan", 7878238633L);

        int size = hmap.size();
        System.out.println(size);
        System.out.println(hmap);

        hmap.put(null, null);
        System.out.println("Updated " + hmap);
        hmap.put("Ben", null);
        System.out.println("Value " + hmap);

        //removing
        hmap.remove("Ben");
        System.out.println(hmap);
    }
}
