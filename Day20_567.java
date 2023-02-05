class Solution {

    // instead of HashMap use Arrays.
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;        

        int[] freq = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            
            char ch = s1.charAt(i);
            freq[ch-'a']++;
        }

        for(int i = 0; i < s2.length(); i++) {

            int temp[] = new int[26];

            for(int j = i; j < (i+s1.length()) && j < s2.length(); j++) {
                
                char ch = s2.charAt(j);
                temp[ch-'a']++;
            }
            if(Arrays.equals(temp, freq)) return true;
        }
        return false;
    }
}
