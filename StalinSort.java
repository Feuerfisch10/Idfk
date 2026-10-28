public class StalinSort {
    public static int[] sort(int[] arr, int value){ //e xecute/remove
        int j = 0;
        for (int k : arr) {
            if (k == value) {
                j++;
            }
        }
        int[] arr2 = new int[j];
        j = 0;
        for (int k : arr) {
            if (k == value) {
                arr2[j] = k;
                j++;
            }
        }
        return arr2;
    }
    public static int[] sort2(int[] arr, int value){
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = value;
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,3,4,5};
        System.out.println(ArrayTools.arrayToString(sort2(arr,1)));
    }
}
