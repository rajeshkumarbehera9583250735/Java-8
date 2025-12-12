package interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DisplayAnagramWords {

    public static void main(String[] args) {
        String[] words = {"cat", "nitin", "Raj", "NItin", "tAc", "Jaga", "man", "NaM"};

        Map<String, List<String>> groupedWords =
                Arrays.stream(words)
                        .collect(Collectors.groupingBy(word -> {
                            char[] ch = word.toLowerCase().toCharArray();
                            Arrays.sort(ch);
                            return new String(ch);
                        }));

        // All anagrams in one single list
        List<String> allAnagrams = groupedWords.values().stream()
                .filter(group -> group.size() > 1)    // keep only anagram groups
                .flatMap(List::stream)                // flatten into single list
                .collect(Collectors.toList());

        System.out.println(allAnagrams);
    }
}
