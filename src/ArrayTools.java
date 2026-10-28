public class ArrayTools {
    private static int[] testint = new int[]{1,2,3,4,5};
    private static int[] array1 = {7,3,1};
    private static int[] array2 = {-5,12,0,2,3};
    public static int head (int[] array){

        return array[0];
    }
    public static int last(int[] array){
        return array[array.length-1];
    }

    public static String arrayToString(int[] array){
        String Arrays = "[";
        for (int i = 0; i < array.length; i++) {
            Arrays = Arrays + array[i] +", ";
        }
        return Arrays + "]";
    }
    public static String arrayToString(char[] array){
        String Arrays = "[";
        for (int i = 0; i < array.length; i++) {
            Arrays = Arrays + array[i] +", ";
        }
        return Arrays + "]";
    }
    public static int[] copy(int[] array){
        int[] arrays = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrays[i] = array[i];
        }
        return arrays;
    }

    public static int[] copy(int[] array, int start, int end){
        int[] arrays =new int[end-start];
        for (int i = start; i < end; i++) {
            arrays[i-start] = array[i];
            System.out.println(array[i]);
        }
        return arrays;
    }

    public static int[] addSlot(int[] array){
        int [] arrays = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            arrays[i] = array[i];
        }
        return arrays;
    }
    public static int[] addSlots(int[] array, int amount){
        int[] arrays = new int[array.length + amount];
        for (int i = 0; i < array.length; i++) {
            arrays[i] = array[i];
        }
        return arrays;
    }
    public static int[] append(int[] array, int value){
        int[] arrays = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrays[i] = array[i];
        }
        arrays[array.length] = value;
        return arrays;
    }
    public static int[] addToAll(int[] array, int value){
        int[] arrays = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrays[i] = array[i] + value;
        }
        return arrays;
    }

    public static void main(String[] args) {
        System.out.println(countChar("Mississippi", 's',0,0));
    }
    public static float[] swap(float[] array, int index1, int index2){
        float tempvalue = array[index1];
        array[index1] = array[index2];
        array[index2] = tempvalue;
        return array;
    }
    public static char[] leftShift(char[] array){
        char[] arrays = new char[array.length];
        if (array.length != 0){
            char tempchar = array[0];
            for (int i = 0; i < array.length-1; i++) {
                arrays[i] = array[i+1];
            }
            arrays[array.length-1] = tempchar;
        }
        return arrays;
    }
    public static int[] concat(int[] array1, int[] array2){ //connect
        int[] arr = new int[array1.length + array2.length];
        for (int i = 0; i < arr.length; i++) {
            if (i< array1.length) {
                arr[i] = array1[i];
            }else arr[i] = array2[i-array1.length];
        }
        return arr;

    }
    public static int[] remove(int[] array, int index){
        int[] arr = new int[array.length-1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                arr[i] = array[j];
            }
            j++;
        }
        return arr;
    }
    public static int indexOfMin(int[] arr){
        int minIndex = -1;
        if (arr.length > 0){
            minIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]){
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }
    public static long power(long oldBase, int exp, long base){
        if (exp == 0){
            return 1;
        }
        if (exp == 1){
            return base;
        }
        base = base * oldBase;
        exp--;
        return power(oldBase, exp, base);
    }
    public static int sum(int[] toSum, int sum,int i){
        if(i >=toSum.length){
            return sum;
        }
        sum = sum + toSum[i];
        i++;
        return sum(toSum, sum, i);
    }
    public static int countChar(String s, char c,int i, int j){
        if (i >= s.length()){
            return j;
        }
        if (s.charAt(i) == c){
            j++;
        }
        i++;
        return countChar(s, c, i, j);
    }

}
