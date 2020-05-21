package JavaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.iterators.EntrySetMapIterator;
import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;

public class RetrieveValuesMap2 {

	public static void main(String[] args) {
			Map<String,Integer> map = new LinkedHashMap<String, Integer>();
			map.put("A"	,1);
			map.put("B"	,2);
			map.put("C"	,3);
			map.put("D"	,4);
			map.put("E"	,5);
			int len=map.size();
			for (Entry<String,Integer> eachentry :map.entrySet()) {
				System.out.println(eachentry.getKey() +" --> " +eachentry.getValue());
				
			}
				
			
			
//			
//			
				
			}
			}
				
		 

