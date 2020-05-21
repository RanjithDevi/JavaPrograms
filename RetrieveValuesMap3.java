package JavaPrograms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


 
public class RetrieveValuesMap3 {

	
		public static void main(String[] args) {
			Map<String,Integer> map = new LinkedHashMap<String, Integer>();
			map.put("A"	,1);
			map.put("B"	,2);
			map.put("C"	,3);
			map.put("D"	,4);
			map.put("E"	,5);
			int len=map.size();
			int c=0;
		    Iterator<Entry<String,Integer>> iterator =map.entrySet().iterator();
		    iterator.forEachRemaining((eachentry)->System.out.println(eachentry.getKey() +"-->" +eachentry.getValue()));
		    
		}			
		}
