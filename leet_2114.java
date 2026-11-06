class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String s : sentences) {
            int spaces = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    spaces++;
                }
            }
            int wordCount = spaces + 1;
            
            if (wordCount > maxWords) {
                maxWords = wordCount;
            }
        }
        
        return maxWords;
    }
}
