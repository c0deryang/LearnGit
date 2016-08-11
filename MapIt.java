import java.util.*;

public class MapIt{
	public static void main(String[] args){
		Map<String, String> m = new HashMap<String, String>();
		m.put("1", "yangyang");
		m.put("2", "chenxi");
		m.put("3", "yangxinyue");
		/* method No.1
		for(Map.Entry<String, String> entry: m.entrySet()){
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		
		method No.2
		for(String key: m.keySet()){
			System.out.println("key = " + key);
		}
		for(String value: m.values()){
			System.out.println("value = " + value);
		}
		*/
		
		Iterator<Map.Entry<String, String>> i = m.entrySet().iterator();
		while(i.hasNext()){
			Map.Entry<String, String> entry = i.next();
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
	}
}