import java.util.*;

class TwoNumberSum {
  public static int[] twoNumberSum(int[] array, int targetSum) {
  	/*
  	Difference between Hashmap and Hashtable -
  	HashMap is not scynchronized and allow one null key and multiple null values
  	Hashtable does not allow null keys and values
  	HashMap is faster than Hastable
  	Hashtable is of Dictionary class, whearas HashMap inherits AbstractMap class
	Create a hashtable -
  	 	Hashtable<Integer, String> ht1 = new Hashtable<>();
	Cant store Duplicate key is HashMap, if tried it will replace the value for that Key
  	HashMap functions ->
  	1. containsKey(num) -> return true false based on the if it contains the key -> O(1)
  	2. get(key) -> return the value if the key is present in the HashMap
  	3. put(K,v) -> Put key value in the Map.
  	4. remove(key) or remove(key, value) -> To remove an element
  	5. replave(key, value) -> To replace the value for a key

	Looping in HashMap ->
		1. for(String i : map.keySet()){}
		2. for(String i : map.values()){}
		3. Using Map.Entry<k,v> -> for(Map.Entry<String, String> entry: map.entrySet()){
									entry.getKey();
									entry.getValue();
									}
  	 */
		HashMap<Integer, Integer> rSum = new HashMap<Integer, Integer>();
		
		for(int i: array) {
			if(rSum.containsKey(i)) {
				int[] arr = {i, rSum.get(i)};
				return(arr);
			}
			else {
				rSum.put(targetSum - i, i);
			}
		}
    return new int[0];
  }
}
