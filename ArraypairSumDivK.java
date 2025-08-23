import java.util.HashSet;
import java.util.Set;

public class ArraypairSumDivK {
    public boolean canPair(int[] nums, int k) {
       int n=nums.length;
       if(n%2!=0) return false;
       HashSet<Integer> hs=new HashSet<>();
       for(int i=0;i<n;i++){
           int remaining=nums[i]%k;
           int other_remaining=k-remaining;
           if(hs.contains(other_remaining)|| (remaining==0 && hs.contains(0))){
               hs.remove(remaining);
               hs.remove(other_remaining);
           }else{
               hs.add(remaining);
           }
       }
       return hs.size()==0;
    }
}
