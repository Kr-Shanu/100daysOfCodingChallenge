import java.util.*;
public class Day30_989 {
    
}
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> result = new ArrayList<>();t
        List<Integer> k_el = new ArrayList<>();
        while(k > 0) {
            int temp = k % 10;
            k_el.add(temp);
            k /= 10;
        }

        int j = 0;
        int a = 0, b = 0, carry = 0;

        for(int i = num.length-1; i >= 0; i--) {

            a = num[i];
            if(j < k_el.size()) b = k_el.get(j++);
            else b = 0;

            int val = a+b+carry;

            if(val >= 10) {
                carry = 1;
                val -= 10;
            }
            else carry = 0;
            result.add(val);
        }

        if(j < k_el.size()) {
            while(j < k_el.size()) {
                int val = carry + k_el.get(j++);

                if(val >= 10) {
                    carry = 1;
                    val -= 10;
                }
                else carry = 0;
                result.add(val);
            }
        }


        if(carry > 0) result.add(carry);

        List<Integer> final_res = new ArrayList<>();
        for(int i = result.size()-1; i >= 0; i--) final_res.add(result.get(i));
        System.out.println(result);
        return final_res;
    }
}