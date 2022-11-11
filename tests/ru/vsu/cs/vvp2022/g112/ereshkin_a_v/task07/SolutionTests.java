package ru.vsu.cs.vvp2022.g112.ereshkin_a_v.task07;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static ru.vsu.cs.vvp2022.g112.ereshkin_a_v.task07.Main.solution;

public class SolutionTests {
    @Test
    public void test1() {
        int[] input = new int[]{0, 0, 1, 0};
        int[] result = new int[]{0, 0, 1};
        assertEquals(Arrays.toString(result), Arrays.toString(solution(input)));
    }

    @Test
    public void test2() {
        int[] input = new int[]{0, 1, 0, 0};
        int[] result = new int[]{1, 0, 0};
        assertEquals(Arrays.toString(result), Arrays.toString(solution(input)));
    }

    @Test
    public void test3() {
        int[] input = new int[]{15, 10, 5, 0};
        int[] result = new int[]{15, 10, 5, 0};
        assertEquals(Arrays.toString(result), Arrays.toString(solution(input)));
    }

    @Test
    public void test4() {
        int[] input = new int[]{0, 5, 10, 15};
        int[] result = new int[]{0, 5, 10, 15};
        assertEquals(Arrays.toString(result), Arrays.toString(solution(input)));
    }

    @Test
    public void test5() {
        int[] input = new int[]{2, 1, 3, 3, 3, 3, 2, 1, 2, 3};
        int[] result = new int[]{3, 3, 3, 3, 2, 1, 2, 3};
        assertEquals(Arrays.toString(result), Arrays.toString(solution(input)));
    }

    @Test
    public void test6() {
        int[] input = new int[]{2, 1, 1, 1, 1, 2, 3, 3, 3, 3, 2, 1, 2, 3};
        int[] result = new int[]{2, 1, 1, 1, 1, 2, 3, 3, 3, 3};
        assertEquals(Arrays.toString(result), Arrays.toString(solution(input)));
    }

    @Test
    public void test7() {
        int[] input = new int[]{3, 3, 4, 8, 8, 10, 7, 4, 10, 7, 7, 4, 3, 3, 8, 9, 1};
        int[] result = new int[]{10, 7, 7, 4, 3, 3, 8, 9};
        assertEquals(Arrays.toString(result), Arrays.toString(solution(input)));
    }

    @Test
    public void test8() {
        int[] input = new int[]{6, 9, 8, 1, 13, 14, 9, 4, 7, 7, 14, 3, 0, 3};
        int[] result = new int[]{14, 9, 4, 7, 7, 14};
        assertEquals(Arrays.toString(result), Arrays.toString(solution(input)));
    }

    @Test
    public void test9() {
        int[] input = new int[]{15, 14, 7, 11, 8, 6, 5};
        int[] result = new int[]{11, 8, 6, 5};
        assertEquals(Arrays.toString(result), Arrays.toString(solution(input)));
    }

    @Test
    public void test10() {
        int[] input = new int[]{2, 3};
        int[] result = new int[]{2, 3};
        assertEquals(Arrays.toString(result), Arrays.toString(solution(input)));
    }

    @Test
    public void test11() {
        int[] input = new int[]{3, 2};
        int[] result = new int[]{3, 2};
        assertEquals(Arrays.toString(result), Arrays.toString(solution(input)));
    }

    @Test
    public void test12() {
        int[] input = new int[]{3};
        int[] result = new int[]{3};
        assertEquals(Arrays.toString(result), Arrays.toString(solution(input)));
    }

    @Test
    public void test13() {
        int[] input = new int[]{3, 3, 3, 3, 3};
        int[] result = new int[]{3, 3, 3, 3, 3};
        assertEquals(Arrays.toString(result), Arrays.toString(solution(input)));
    }

    @Test
    public void test14() {
        int[] input = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 1, 2, 1, 2};
        int[] result = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 1, 2};
        assertEquals(Arrays.toString(result), Arrays.toString(solution(input)));
    }

}
