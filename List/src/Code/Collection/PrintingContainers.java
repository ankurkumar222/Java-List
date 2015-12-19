package Code.Collection;

//: holding/PrintingContainers.java
// Containers print themselves automatically.
import java.util.*;
import static Util.Print.*;

public class PrintingContainers {
  static Collection fill(Collection<String> collection) {
    collection.add("rat");
    collection.add("cat");
    collection.add("dog");
    collection.add("dog");
  
    return collection;
  }
  static Map fill(Map<String,String> map) {
    map.put("rat", "Fuzzy");
    map.put("cat", "Rags");
    map.put("dog", "Bosco");
    map.put("dog", "Spot");
    return map;
  }	
  public static void main(String[] args) {
    fill(new ArrayList<String>());
    fill(new LinkedList<String>());
    fill(new HashSet<String>());
    fill(new TreeSet<String>());
    fill(new LinkedHashSet<String>());
    fill(new HashMap<String,String>());
    fill(new TreeMap<String,String>());
    fill(new LinkedHashMap<String,String>());
  }
} /* Output:
[rat, cat, dog, dog]
[rat, cat, dog, dog]
[dog, cat, rat]
[cat, dog, rat]
[rat, cat, dog]
{dog=Spot, cat=Rags, rat=Fuzzy}
{cat=Rags, dog=Spot, rat=Fuzzy}
{rat=Fuzzy, cat=Rags, dog=Spot}
*///:~
