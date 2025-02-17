package recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverseArray(arr, 0, arr.length - 1);
        System.out.print("{");
        for(int i : arr){
            System.out.print(i + ",");
        }
        System.out.print("}");
    }
    static void reverseArray(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, ++start, --end);
    }
}
