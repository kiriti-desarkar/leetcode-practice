package countandsay;

public class Solution {
    public String countAndSay(int n) {
    char[] prev = {'1'};
        
    for (int i = 2; i <= n; i++) {
        StringBuilder sb = new StringBuilder(prev.length * 2);
        int count = 1;
        char prevChar = prev[0];
        
        for (int j = 1; j < prev.length; j++) {
            char currChar = prev[j];
            
            if (currChar == prevChar) {
                count++;
            } else {
                sb.append(count).append(prevChar);
                count = 1;
                prevChar = currChar;
            }
        }
        
        sb.append(count).append(prevChar);
        prev = sb.toString().toCharArray();
    }
    
    return new String(prev);
}
}
