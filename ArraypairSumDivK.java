import java.util.HashSet;
import java.util.Set;

public class ArraypairSumDivK {
    public boolean canPair(int[] nums, int k) {
        int n = nums.length;

        if (n % 2 == 1) {
            return false;
        }

        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int remain = nums[i] % k;
            int other_remain = k - remain;

            if (st.contains(other_remain) || ((remain == 0) && (st.contains(0)))) {
                st.remove(remain);
                st.remove(other_remain);
            } else {
                st.add(remain);
            }
        }

        return st.size() == 0;
    }
}
