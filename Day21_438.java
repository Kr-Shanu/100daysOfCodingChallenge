class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> answer = new ArrayList<>();
        int[] freq = new int[26];
        for(char ch: p.toCharArray()) {
            freq[ch-'a']++;
        }

        for(int i = 0; i <= s.length()-p.length(); i++) {

            int[] temp = new int[26];
            for(int j = i; j < i+p.length(); j++) {

                char ch = s.charAt(j);
                temp[ch-'a']++;
            }
            if(Arrays.equals(temp, freq)) answer.add(i);
        }
        return answer;
    }
}
