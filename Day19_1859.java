import java.util.*;

class Solution {
    public String sortSentence(String s) {
        
        int max = 0;
        HashMap<Integer, String> sent = new HashMap<>();
        char[] chars = s.toCharArray();

        String temp = "", ans = "";

        for(char ch: chars) {
            
            if(ch == ' ') continue;

            if((int)ch >= 48 && (int)ch <= 57) {

                int val = ch-'0';
                sent.put(val, temp);
                temp = "";
                max = Math.max(max, val);
            }
            else temp += ch;
        }

        int i = 1;
        for(; i < max; i++) {

            ans += sent.get(i);
            ans += " ";
        }
        ans += sent.get(i);
        return ans;
    }
}