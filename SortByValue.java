import java.util.*;

public class SortByValue{
	public static void main(String[] args){
		HashMap<String,Integer> map = new HashMap<String,Integer>();  
        ValueComparator bvc =  new ValueComparator(map);  
        TreeMap<String,Integer> sorted_map = new TreeMap<String,Integer>(bvc);  

        map.put("A",99);  
        map.put("B",67);  
        map.put("C",67);  
        map.put("D",68);  

        System.out.println("unsorted map: "+map);  

        sorted_map.putAll(map);  

        System.out.println("results: "+sorted_map);  
	}
}
class ValueComparator implements Comparator<String>{
		private Map<String, Integer> base;
		
		public ValueComparator(Map<String, Integer> base){
			this.base = base;
		}
		
		public int compare(String a, String b){
			if(base.get(a) <= base.get(b))
				return -1;
			else
				return 1;
		}
	}