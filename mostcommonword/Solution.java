package mostcommonword;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
                Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordCount = new HashMap<>();
        String mostCommonWord = "";
        int maxCount = 0;
        
        StringBuilder wordBuilder = new StringBuilder();
        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            
            if (Character.isLetter(c)) {
                wordBuilder.append(Character.toLowerCase(c));
            } else if (wordBuilder.length() > 0) {
                String word = wordBuilder.toString();
                if (!bannedWords.contains(word)) {
                    int count = wordCount.getOrDefault(word, 0) + 1;
                    wordCount.put(word, count);
                    
                    if (count > maxCount) {
                        mostCommonWord = word;
                        maxCount = count;
                    }
                }
                wordBuilder.setLength(0);
            }
        }
        
        if (wordBuilder.length() > 0) {
            String lastWord = wordBuilder.toString();
            if (!bannedWords.contains(lastWord)) {
                int count = wordCount.getOrDefault(lastWord, 0) + 1;
                wordCount.put(lastWord, count);
                
                if (count > maxCount) {
                    mostCommonWord = lastWord;
                    maxCount = count;
                }
            }
        }
        
        return mostCommonWord;
    }
}