package JavaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class RetrieveValueMap3 {

	 	public static void main(String[] args) {
			Map<String,Integer> map = new LinkedHashMap<String, Integer>();
			map.put("A"	,1);
			map.put("B"	,2);
			map.put("C"	,3);
			map.put("D"	,4);
			map.put("E"	,5);
			map.keySet().forEach((eachkey)->System.out.println(eachkey+"-->" +map.get(eachkey)));
	}

}
