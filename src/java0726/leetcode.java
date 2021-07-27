package java0726;

import java.util.ArrayList;
import java.util.List;

public class leetcode {
    //数组中存在连续三个数字都是奇数
//    public boolean threeConsecutiveOdds(int[] arr) {
//        for (int i = 0; i < arr.length - 2; i++) {
//            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
//                return true;
//            }
//        }
//        return false;
//    }


    public static boolean threeConsecutiveOdds(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 2; i++) {
            if (arr.get(i) % 2 != 0 && arr.get(i + 1) % 2 != 0 &&
                    arr.get(i + 2) % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(8);
        boolean ret = threeConsecutiveOdds(arr);
        System.out.println(ret);
    }
}
