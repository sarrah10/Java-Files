//function overloading and polymorphism
import java.util.Collections;
import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {
        
        LinkedList fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Dragon fruit");
        fruits.add("Cherry");

        //Displaying linked list using  foreach loop
        System.out.println("Linked list elements");
        for(Object fruit : fruits){
            System.out.println(fruit);
        }
    //inserting elements in the beginning and the end 
    fruits.addFirst("Mango");
    fruits.addLast("Papaya");
    System.out.println("using addfirst: " + fruits);

    //removing first and last elements
    fruits.removeFirst();
    fruits.removeLast();
    System.out.println("using removefirst: " + fruits);

    //removing element using element name
    String elementToRemove = "Apple";
    boolean removed = fruits.remove(elementToRemove);
    if(removed){
        System.out.println(elementToRemove + " removed");
    }
    else{
        System.out.println(elementToRemove + " not found");
    }
    System.out.println("Updated list: " + fruits);

    //removing element using index
    int indexToRemove = 1;
    if(indexToRemove >= 0 && indexToRemove < fruits.size()){
        Object removedElement = fruits.remove(indexToRemove);
        System.out.println("Removed element: " + removedElement);
        System.out.println("Updated list: " + fruits);
    }
    else{
        System.out.println("Invalid index");
    }

    //searching for the index of element
    int index = fruits.indexOf("Cherry");
    System.out.println("Index of cherry is: " + index);


    //reverse operation on list
    LinkedList reversedlist = new LinkedList<>();
    for(Object fruit : fruits){
        reversedlist.addFirst(fruit);
    }
    System.out.println("Reverse list: " + reversedlist);

    //merging to linked list
    LinkedList mergedlist = new LinkedList<>();
    mergedlist.addAll(fruits);
    mergedlist.addAll(reversedlist);
    System.out.println("Merged list: " + mergedlist);

    //sorting the list in ascending order
    Collections.sort(mergedlist);
    System.out.println("Sorted list: " + mergedlist);

    }
}