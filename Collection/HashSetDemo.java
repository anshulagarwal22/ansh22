package Collection;

import java.util.HashSet;
import java.util.Iterator;

/*  
Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.
The important points about Java HashSet class are:
HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.
 */
public class HashSetDemo {
	
	public static void main(String args[]) {
	
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("Ram");
		hashset.add("Raju");
		hashset.add("Kalyan");
		hashset.add("Shaan");
		hashset.add(null);
		hashset.add(null);
		
		Iterator<String> itr=hashset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}