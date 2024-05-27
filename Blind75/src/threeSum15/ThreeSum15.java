package threeSum15;

import java.util.*;

public class ThreeSum15 {

	public static void main(String[] args) {
		ThreeSum15 p = new ThreeSum15();
		int nums[] = {-1,0,1,2,-1,-4};
		p.threeSum(nums);
	}

	public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> finalList = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> setFinal= new HashSet<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            HashSet<Integer> set= new HashSet<Integer>();
            
            for(int j=i+1;j<nums.length;j++){
                int k = -(nums[i]+nums[j]);
                if(set.contains(k)){
                	ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(k);
                    if(!setFinal.contains(list)){
                        setFinal.add(list);
                        finalList.add(list);
                    }
                    //break;
                }
                //else{
                    set.add(nums[j]);
                //}
            }
            set.add(nums[i]);
        }
        return finalList;
    }
}
