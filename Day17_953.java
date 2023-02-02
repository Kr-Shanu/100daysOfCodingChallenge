import java.util.HashMap;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        HashMap<Character, Character> check = new HashMap<>();
        for(int i = 0; i < order.length(); i++) {

            char key = order.charAt(i);
            char val = (char)(i+97);
            check.put(key, val);
        }

        for(int j = 0; j < words.length; j++) {

            String s = words[j];
            String newW = "";
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                newW += check.get(ch);
            }
            words[j] = newW;
        }

        for(int i = 1; i < words.length; i++) {
            if(words[i].compareTo(words[i-1]) < 0) return false;
        }
        return true;
    }
}