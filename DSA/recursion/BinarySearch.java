package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int index = search(arr, 5, 0, arr.length - 1);
        System.out.println("Found at index " + index);
    }

    static int search(int[] arr, int target, int start, int end){
        if(start >= end){
            return -1;
        }
        if(arr[start] == target){
            return start;
        }
        int mid = start + (end - start) / 2;
        if(target > arr[mid]){
           return search(arr, target, mid + 1, end);
        }
        else {
           return search(arr, target, start, mid - 1);
        }
    }
}
