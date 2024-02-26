import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import Oops.finallyBlock;
import Recursion.reverString;

class Solution {
    public static void main(String[] args) {
        int[] arr = { 2,2,3,3 };
       int res=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:arr){
             res += hm.getOrDefault(i, 0);
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        System.out.println(res);
        
    }
}
