package src.Leetcode.Array;

import java.util.Deque;
import java.util.LinkedList;

public class _84_largest_rectangle_im_histogram {

    public static int largestRectangleArea(int[] height){
        Deque<Integer> stack = new LinkedList<>();
        int maxArea = 0;
        int area = 0;
        int i;
        for (i = 0; i < height.length; i++){
            if (stack.isEmpty() || height[stack.peekFirst()] <= height[i]){
                stack.offerFirst(i++);
            }
            else{
                int top = stack.pollFirst();
                if (stack.isEmpty()){
                    area = height[top] * i;
                }
                else{
                    area = height[top] * (i - stack.peekFirst() - 1);
                }
                if (area > maxArea){
                    maxArea = area;
                }
            }
        }
        while(!stack.isEmpty()){
            int top = stack.pollFirst();
            if (stack.isEmpty()){
                area = height[top] * i;
            }
            else{
                area = height[top] * (i - stack.peekFirst() - 1);
            }
            if (area > maxArea) maxArea = area;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(height));
    }
}
