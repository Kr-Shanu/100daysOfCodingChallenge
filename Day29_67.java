class Solution {
    public String addBinary(String a, String b) {
        
        int av = 0, bv = 0, carry = 0, val = 0;
        int i = a.length()-1, j = b.length()-1;

        String result = "";

        while(i >= 0 || j >= 0) {

            if(i >= 0) av = a.charAt(i--) - '0';
            else av = 0;
            if(j >= 0) bv = b.charAt(j--) - '0';
            else bv = 0;

            val = av+bv+carry;

            switch(val) {

                case 0: 
                    result = '0'+result;
                    carry = 0;
                    break;
                case 1: 
                    result = '1' + result;
                    carry = 0;
                    break;
                case 2: 
                    result = '0' + result;
                    carry = 1;
                    break;
                case 3:
                    result = '1' + result;
                    carry = 1;
                    break;
                default: System.out.println("It wont happen");
            }
        }
        if(carry == 1) result = '1' + result;
        return result;
    }
}