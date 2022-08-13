package src.Leetcode.Array;

import java.util.*;

public class _682_baseball_game {

    public static int calPoints(String[] ops){
        Stack<String> st = new Stack<>();
        for (String s1: ops){
            if (Objects.equals(s1, "C")) st.pop();
            else if (Objects.equals(s1, "D")){
                int element = Integer.parseInt(st.peek());
                element *= 2;
                st.push(Integer.toString(element));
            }
            else if (Objects.equals(s1, "+")){
                String a = st.pop();
                String b = st.pop();
                st.push(b);
                st.push(a);
                int sum = (Integer.parseInt(a) + Integer.parseInt(b));
                st.push(Integer.toString(sum));
            }
            else{
                st.push(s1);
            }
        }
        int count = 0;
        for (String s: st){
            count += Integer.parseInt(s);
        }
        return count;
    }

}
