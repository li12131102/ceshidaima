import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L2022211930_solution11_Test {

    private Solution solution = new Solution();

    /**
     * 测试目的：验证输入数组中存在多个不同的三元组，且这些三元组的和为0。
     * 测试用例：[-1, 0, 1, 2, -1, -4]
     * 期望结果：[[-1, -1, 2], [-1, 0, 1]]
     */
    @Test
    public void testThreeSumWithMultipleTriplets() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(expected, solution.threeSum(nums));
    }

    /**
     * 测试目的：验证输入数组中不存在和为0的三元组。
     * 测试用例：[0, 1, 1]
     * 期望结果：[]
     */
    @Test
    public void testThreeSumWithNoTriplets() {
        int[] nums = {0, 1, 1};
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, solution.threeSum(nums));
    }

    /**
     * 测试目的：验证输入数组为空的情况。
     * 测试用例：[]
     * 期望结果：[]
     */
    @Test
    public void testThreeSumWithEmptyArray() {
        int[] nums = {};
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, solution.threeSum(nums));
    }

    /**
     * 测试目的：验证输入数组只有一个元素的情况。
     * 测试用例：[0]
     * 期望结果：[]
     */
    @Test
    public void testThreeSumWithSingleElement() {
        int[] nums = {0};
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, solution.threeSum(nums));
    }

    /**
     * 测试目的：验证输入数组只有两个元素的情况。
     * 测试用例：[0, 1]
     * 期望结果：[]
     */
    @Test
    public void testThreeSumWithTwoElements() {
        int[] nums = {0, 1};
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, solution.threeSum(nums));
    }

    /**
     * 测试目的：验证输入数组中有重复元素，但存在和为0的三元组。
     * 测试用例：[-1, -1, 2, 0, 1]
     * 期望结果：[[-1, -1, 2], [-1, 0, 1]]
     */
    @Test
    public void testThreeSumWithDuplicatesAndTriplets() {
        int[] nums = {-1, -1, 2, 0, 1};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(expected, solution.threeSum(nums));
    }

    /**
     * 测试目的：验证输入数组中有重复元素，但不存在和为0的三元组。
     * 测试用例：[1, 1, 1, 1]
     * 期望结果：[]
     */
    @Test
    public void testThreeSumWithDuplicatesAndNoTriplets() {
        int[] nums = {1, 1, 1, 1};
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, solution.threeSum(nums));
    }
}
//这一行是注释
