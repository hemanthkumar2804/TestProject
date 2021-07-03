package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapsBasics {

	public static void main(String[] args) {
		//No Order-No Indexing
		//Stories values in Key-Value pair <k,v>
		//Key value can not contains duplicate 
		HashMap<String,String> capitalMap=new HashMap<String,String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("Hassan", null);
		capitalMap.put(null, "Hassan");	
		capitalMap.put("UK", "London01");
		System.out.println(capitalMap.get("India"));
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("UK"));
		System.out.println(capitalMap.get("Hassan"));
		System.out.println(capitalMap.get(null));
		
		//Iterators over the keys: by using keySet()
		Iterator<String>it=capitalMap.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			String value=capitalMap.get(key);
			System.out.println("Key : "+key+" Value : "+value);
		}
		
		//Iterator over the set(Pair): by using entry set
		Iterator<Entry<String, String>>It1=capitalMap.entrySet().iterator();
		while(It1.hasNext()) {
			Entry<String, String> entry=It1.next();
			System.out.println("Key"+entry.getKey()+"Value"+entry.getValue());
		}
		System.out.println("----------");
		//Iterate using Java 8 for each lambda;
		
		capitalMap.forEach((k,v) -> System.out.println("key="+k +" value"+v));


	}

}
