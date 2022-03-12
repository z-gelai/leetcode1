import com.sun.javafx.collections.SortHelper;
import com.sun.javafx.image.IntPixelGetter;

import javax.lang.model.element.VariableElement;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new LinkedList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i]>0) {
                break;
            }
            if (i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            int l=i+1,r=nums.length-1;
            while (l<r){
                if (nums[l]+nums[r]==(-nums[i])) {
                    res.add(Arrays.asList(nums[l],nums[r],-nums[i]));
                    ++l;
                    --r;
                    while (l<r && nums[l]==nums[l+1]){
                        ++l;
                    }
                    while (l<r && nums[r]==nums[r-1]){
                        --r;
                    }
                }else if(nums[l]+nums[r]<(-nums[i])){
                    ++l;
                }else --r;
            }
        }
        return res;
    }
}








