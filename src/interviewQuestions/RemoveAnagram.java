package interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveAnagram {

    public static void main(String[] args) {
    	String[] words= {"cat","nitin","Raj","NItin","tAc","Jaga","man","NaM"};
    	Map<String, List<String>> groupedWords= 
    			Arrays.stream(words)
    				.collect(Collectors.groupingBy(word -> {
    					char[] ch= word.toLowerCase().toCharArray();
    					Arrays.sort(ch);
    					return new String(ch);
    				}
    			));
    	
    	System.out.println(groupedWords);
    	
    	List<String> result = groupedWords.values().stream()
    		.filter(value -> value.size() == 1)
    		.flatMap(List::stream)
    		.collect(Collectors.toList());
    	System.out.println(result);
    }
}





























/*
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveAnagram {

	public static void main(String[] args) {
		String[] words= {"cat","nitin","Raj","NItin","tAc","Jaga","man","NaM"};
		Map<String,String> uniqueKeyValue=new HashMap<>();
		Set<String> duplicates=new HashSet<>();
		
		Arrays.stream(words).forEach(word ->{
			char[] ch=word.toLowerCase().toCharArray();
			Arrays.sort(ch);
			String key=new String(ch);
			if(uniqueKeyValue.containsKey(key)) {
				duplicates.add(key);
			}else {
				uniqueKeyValue.put(key, word);
			}
		});
		
		List<String> uniqueWords = uniqueKeyValue.keySet().stream().
							filter( entry -> ! duplicates.contains(entry)).
							map(entry -> uniqueKeyValue.get(entry)).
							collect(Collectors.toList());
		System.out.println(uniqueWords);
	}

}
*/


