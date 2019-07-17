public class Mergearray {
    public static void main(String[] args) {
        int [] array1 = new int [(int) (Math.random() * 5) + 5];
        int [] array2 = new int [(int) (Math.random() * 5) + 5];
        int [] mergeArray = new int [array1.length + array2.length];

        System.out.println("数组1的内容:");
        for(int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100);
            System.out.println("第" + i + "个内容为" + array1[i]);
        }

        System.out.println("\n数组2的内容:");
        for(int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 100);
            System.out.println("第" + i + "个内容为" + array2[i]);
        }

        System.arraycopy(array1, 0, mergeArray, 0, array1.length);
        System.arraycopy(array2, 0, mergeArray, array1.length, array2.length);

        System.out.println("\n合并数组的内容:");
        for(int i = 0; i < mergeArray.length; i++) {
            System.out.println("第" + i + "个内容为" + mergeArray[i]);
        }
    }
}