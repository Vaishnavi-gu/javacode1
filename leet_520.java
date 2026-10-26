class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        int length = word.length();
        
        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }
        
        return count == length || count == 0 || (count == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
