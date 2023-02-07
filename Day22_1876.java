class Solution {
    public int countGoodSubstrings(String s) {
        
        if(s.length() < 3) return 0;
        int a = (int)s.charAt(0)-'a', 
        b = (int)s.charAt(1)-'a', 
        c = (int)s.charAt(2)-'a';
        
        int i = 3, count = 0;

        for(; i < s.length(); i++) {

            if(a != b && b != c && c != a) count++;

            a = b;
            b = c;
            c = (int)s.charAt(i)-'a';
        }
        if(a != b && b != c && c != a) count++;
        return count;
    }
}
