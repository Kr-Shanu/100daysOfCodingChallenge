class Solution {

    static int mini = 10001;

    public static int min_Jump(int indx, int[] arr, int[] memo) {

        if(indx >= arr.length-1) return 0;
        if(arr[indx] == 0) return 10001;
        if(memo[indx] != -1) return memo[indx];

        int val = arr[indx], end = indx + val;

        for(int i = indx+1; i <= (indx + arr[indx]); i++) 
            mini = Math.min(mini, 1 + min_Jump(i, arr, memo));
        
        return memo[indx] = mini;
    }

    public int jump(int[] nums) {
        
        int memo[] = new int[nums.length];
        Arrays.fill(memo, -1);
        mini = nums.length;
        return min_Jump(0, nums, memo);
    }
}
