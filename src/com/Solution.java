package com;

public class Solution {

    public int solution(int A, int B) {
        while (A < 0) {
            A++;
        }
        return (int) (Math.floor(Math.sqrt(B)) - Math.ceil(Math.sqrt(A)) + 1);
    }
}
