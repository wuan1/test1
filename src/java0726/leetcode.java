package java0726;

import java.util.Arrays;

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


//    public static boolean threeConsecutiveOdds(List<Integer> arr) {
//        for (int i = 0; i < arr.size() - 2; i++) {
//            if (arr.get(i) % 2 != 0 && arr.get(i + 1) % 2 != 0 &&
//                    arr.get(i + 2) % 2 != 0) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(5);
//        arr.add(8);
//        boolean ret = threeConsecutiveOdds(arr);
//        System.out.println(ret);
//    }


    //冒泡排序
//    public static void bubbleSort(int[] arr){
//        int bound = 0;
//        for(;bound < arr.length; bound++){
//            for(int cur = arr.length - 1; cur > bound; cur--){
//                if(arr[cur - 1] > arr[cur]){
//                    swap(arr,cur - 1,cur);
//                }
//            }
//        }
//    }
//
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //快速排序(基准值）
    //递归
    public static void quickSort(int[] arr) {
        _quickSort(arr, 0, arr.length - 1);
    }

    public static void _quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int index = partation(arr, left, right);
        _quickSort(arr, left, index - 1);
        _quickSort(arr, index + 1, right);

    }

    public static int partation(int[] arr, int left, int right) {
        int v = arr[right];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && arr[i] <= v) {
                i++;
            }
            while (i < j && arr[j] >= v) {
                j--;
            }
            swap(arr, i, j);
        }
        swap(arr, i, right);
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 9, 6, 7};
        //bubbleSort(arr);
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

