package Code.Iterator;

import java.util.*;

import Models.pets.Pet;
import Models.pets.Pets;

public class CrossContainerIteration {
  public static void display(Iterator<Pet> it) {
    while(it.hasNext()) {
      Pet p = it.next();
      System.out.print(p.id() + ":" + p + " ");
    }
    System.out.println();
  }	
  public static void main(String[] args) {
    ArrayList<Pet> pets = Pets.arrayList(8);
    //arraytoinked
    LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
    
    
    
    HashSet<Pet> petsHS = new HashSet<Pet>(pets);
    TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
    
    display(pets.iterator());
    
    display(petsLL.iterator());
    display(petsHS.iterator());
    display(petsTS.iterator());
  }
  
  public void fun()
  {}
}