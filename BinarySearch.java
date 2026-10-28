public class BinarySearch { // wait this aint binary search????? wtf kinda search algorithm did i build?
    public static int search(int[] arr, int low, int high, int value){
        if(arr.length == 0){
            return -1;
        }
        int mid = middel(low, high);
        if (arr[mid] == value){
        return mid;
        }
        if (arr[mid] > value){
            high = mid;
        }
        if (value > arr[mid]){
            low = mid;
        }
        return search(arr, low, high, value);
    }
    private static int middel(int low, int high){
        return ((low + high) / 2)+ (low + high) % 2;
    }

    public static void main(String[] args) {
        int low = 0;
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        int high = arr.length -1;
        System.out.println(middel(1,6));
        search(arr,low,high,4);
    }
}
