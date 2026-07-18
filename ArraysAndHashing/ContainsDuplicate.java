import java.io.*;
import java.util.*;

class ContainsDuplicate{
    static boolean hasDuplicate(int[] nums){
        List<Integer> numbers = new ArrayList<>();
        for(int i: nums){
            if(numbers.contains(i)){
                return true;
            }
            numbers.add(i);
        } 
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        System.out.println(hasDuplicate(nums));
    }
}
