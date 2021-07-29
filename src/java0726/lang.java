package java0726;

import java.util.Arrays;

public class lang {
    //冒泡排序
    public static void bubbleSort(int[] arr){
        int bound = 0;
        for(; bound < arr.length; bound++){
            for(int cur = arr.length - 1; cur > bound; cur--){
                if(arr[cur - 1] > arr[cur]){
                    swap(arr,cur - 1,cur);
                }
            }
        }
    }


    //快速排序
    public static void quickSort(int[] arr){
        _quickSort(arr,0,arr.length - 1);
    }

    public static void _quickSort(int[] arr, int left, int right) {
        if(left >= right){
            return;
        }
        int index = partation(arr,left,right);
        _quickSort(arr,left,index - 1);
        _quickSort(arr,index + 1,right);
    }

   public static int partation(int[] arr, int left, int right) {
        int v = arr[right];
        int i = left;
        int j = right;
        while(i < j){
            while(i < j && arr[i] <= v){
                i++;
            }
            while(i < j && arr[j] >= v){
                j--;
            }
            swap(arr,i,j);
        }
        swap(arr,i,right);
        return i;
    }

    //插入排序
    public static void insertSort(int[] arr){
        int bound = 1;
        for(;bound < arr.length; bound++){
            int v = arr[bound];
            int cur = bound - 1;
            for(; cur >= 0; cur--){
                if(arr[cur] > v){
                    arr[cur + 1] = arr[cur];
                }else{
                    break;
                }
            }
            arr[cur + 1] = v;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {6,4,2,9,1,5,7};
       // bubbleSort(arr);
        //quickSort(arr);
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
