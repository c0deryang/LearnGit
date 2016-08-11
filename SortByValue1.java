import java.util.*;

public class SortByValue1{
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap<String,Integer>();
        
        map.put("A",55);  
        map.put("B",99);  
        map.put("C",67);  
        map.put("D",68);  
		Map<String,Integer> sorted_map = new LinkedHashMap<String,Integer>(
				MapUtil.sortByValue(map)); 

        System.out.println("unsorted map: "+map);  

        sorted_map.putAll(map);  

        System.out.println("results: "+sorted_map);
	}
}

class MapUtil  
{  
    public static <String, Integer extends Comparable<? super Integer>> Map<String, Integer>   
        sortByValue( Map<String, Integer> map )  
    {  
        List<Map.Entry<String, Integer>> list =  
            new LinkedList<Map.Entry<String, Integer>>( map.entrySet() );  
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()  
        {  
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )  
            {  
                return (o1.getValue()).compareTo( o2.getValue());  
            }  
        } );

        Map<String, Integer> result = new LinkedHashMap<String, Integer>();  
        for (Map.Entry<String, Integer> entry : list)  
        {  
            result.put( entry.getKey(), entry.getValue() );  
        }  
        return result;  
    }  
}  