public class Day16_1812 {
    
}

class Solution {

    public boolean squareIsWhite(String str) {
        
        int row = str.charAt(1)-'0', col = str.charAt(0)-'a'+1;
        if(row%2 == 0 && col%2 != 0) return true;
        if(row%2 != 0 && col%2 == 0) return true;
        return false;
    }
}