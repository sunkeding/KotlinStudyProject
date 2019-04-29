package com.sunkeding.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlgorithimPractice {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 7};
//        twoNum(nums, 3);
//        twoNumFaster(nums, 8);
//        print();

        int f = f(3);
        System.out.println(f);

    }

    private static void print() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的数组：");
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("请输入你的target：");
        int target = sc.nextInt();
        twoNum(nums, target);


    }

    //求一个数组中两个数加起来为target的数组下标,垃圾算法
    private static int[] twoNum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i]);
                    System.out.println(nums[j]);
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    //求一个数组中两个数加起来为target的数组下标,更快的算法
    private static int[] twoNumFaster(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println(nums[map.get(complement)]);
                System.out.println(nums[i]);
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);

        }
        return new int[0];
    }


    //0、1、1、2、3、5、8、13、21
    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

}
