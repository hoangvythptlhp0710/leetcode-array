package Leetcode.Array;

import java.util.Arrays;
import java.util.Comparator;

/**
 *              1710. MAXIMUM UNITS ON A TRUCK
 *
 *      You are assigned to put some amount of boxes onto one truck.  You are given
 *      a 2D array boxTypes, there boxTypes[i] = [numberOfBoxes, numberOfUnitsPerBox]:
 *          - numberOfBoxes is the number of boxes of type i.
 *          - number of Units PerBox is the number of units in each box of the type i.
 *
 *      You are also given an integer truckSize, which is the maximum number
 */

public class _1710_maximum_units_on_a_truck {

    public static int maximumUnits(int[][] boxTypes, int truckSize){
        int total = 0, i = 0;
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        while (truckSize > 0 & i < boxTypes.length){
            if (boxTypes[i][0] < truckSize){
                total += boxTypes[i][0] * boxTypes[i][1];
            }
            else{
                total += truckSize * boxTypes[i][1];
            }
            truckSize -= boxTypes[i][0];
            i++;
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        int truckSize = 10;
        System.out.println(maximumUnits(boxTypes, truckSize));
    }
}
