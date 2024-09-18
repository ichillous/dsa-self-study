package org.ichillous.tests.dsastudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemDuplicates {
    public static void main(String[] args) {
        int[] a = { 0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(a);
    }
    public static int removeDuplicates(int[] nums) {

        List<String> map = new ArrayList<>();
        for( int i = 0; i <= nums.length -1; i++ ) {
            map.add(String.valueOf(nums[i]));
        }
        for(int i = 0; i < map.size(); i++){
            for(int j = map.size() -1; j > 0; j--){
                if(Objects.equals(map.get(i), map.get(j))){

                    map.remove(j -1);

                    System.out.println(i + " " + j);
                }
            }
        }
        System.out.println(Arrays.toString(map.toArray()));
        return map.size();
    }
}
