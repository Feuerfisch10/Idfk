import java.util.Random;

public class RunTimeAnalysis{

    public static void main(String[] args) {
        long avarage = 0;
        for (int i = 0; i < 5; i++) {
            int[] array = new int[4500000];
            System.out.println(array.length);
            Random random = new Random(System.currentTimeMillis());
            for (int b = 0; b < array.length; b++) {
                array[b] = random.nextInt(10000);
            }
            long startTime = System.currentTimeMillis();
            Quicksort.sort(array, 0, array.length-1);
            long end = System.currentTimeMillis();
            long delta = end - startTime;
            avarage = avarage + delta;
            System.out.println(array.length + ";" + delta);
            System.out.println(BinarySearch.search(array,0,array.length-1, 47));
        }
        avarage = avarage/5;
        System.out.println(avarage);
    }
}
