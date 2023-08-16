//arraylist is a modified array
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

        //adding the element
        ArrayList<Integer> a = new ArrayList<>();  //generic paramneter
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(6);
        a.add(5);
        a.add(9);

        //using AddAll for adding all b elements to a
        ArrayList<Integer> b = new ArrayList<>(5);
        b.add(15);
        b.add(16);
        a.addAll(b);

        //boolean(T or F) to check weather the element is present in the list or not
        System.out.println(a.contains(25));

        //show index of given element
        System.out.println(a.indexOf(7));
        System.out.println(a.indexOf(6));     //take the first index by deafult
        System.out.println(a.lastIndexOf(6)); //take the last index

        //removing element from array
        System.out.println(a.remove(4));

        //to set element in place of specific index
        a.set(1, 599);

        //printing the array, size() returns the element of list
        for(int i=0; i<a.size(); i++){
            System.out.print(a.get(i));
            System.out.print(",");
        }

    }
}
