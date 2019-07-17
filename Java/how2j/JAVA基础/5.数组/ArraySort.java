import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[][] arrays = new int[5][8];

        for(int i = 0; i < arrays.length; i++) {
            System.out.println("i:" + i);
            for(int j = 0; j < arrays[0].length; j++) {
                arrays[i][j] = (int)(Math.random() * 100);
                System.out.println("j:" + j);
                System.out.println(arrays[i][j]);
            }
        }

        for(int i = 0; i < arrays.length; i++) {
            Arrays.sort(arrays[i]);
        }

        System.out.println("\n");
        for(int i = 0; i < arrays.length; i++) {
            System.out.println("i:" + i);
            for(int j = 0; j < arrays[0].length; j++) {
                System.out.println("j:" + j);
                System.out.println(arrays[i][j]);
            }
        }
    }
}