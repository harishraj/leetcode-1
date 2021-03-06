/**
 * Author: Chih-Jye Wang
 * Date  : Sep 15 2015
 *
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).
 *
 * Follow up:
 * If this function is called many times, how would you optimize it?
 *
 * Related problem: Reverse Integer
 */

public class ReverseBits {
    public int reverseBits(int n) {
        int mask = 0x80000000;
        int sum = 0;
        for(int i = 0; i < 32; i++) {
            if((n & mask) != 0)
                sum += 1 << i;
            mask >>>= 1;
        }
        return sum;
    }
}