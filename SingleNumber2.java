/**
 * Author: Chih-Jye Wang
 * Date  : Dec 11, 2013
 *
 * Single Number II:
 * Given an array of integers, every element appears three times except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
import java.util.Arrays;

public class SingleNumber2
{
    public int singleNumber(int[] A)
    {
        Arrays.sort(A);
        int start = 0;
        int end = 0;
        while(end < A.length)
        {
            if(A[start] == A[end])
                end++;
            else
            {
                if(end - start == 1)
                    return A[start];
                else
                    start = end;
            }
        }
        if(end - start == 1)
            return A[start];
        return 0;
    }
}