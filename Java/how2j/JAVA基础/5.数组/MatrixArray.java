public class MatrixArray {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = (int)(Math.random() * 100);
            }
        }

        int max = -1;
        // test each: array in 2D array
        // do not need to find x and y axis
        for(int[] ii: array) {
            for( int jj: ii) {
                if(max < jj) {
                    max = jj;
                }
            }
        }
        System.out.println("Max is:" + max);
    }
}