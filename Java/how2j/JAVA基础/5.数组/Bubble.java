public class Bubble {
    public static void main(String[] args) {
        int[] test = {
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100)
        };

        int tmp, i=test.length-1;
        while(i>0) {
            for(int j=0;j<i;j++){
                if(test[j]<test[j+1]){
                    tmp = test[j];
                    test[j] = test[j+1];
                    test[j+1] = tmp;
                }
            }
            i--;
        }

        for(int each : test) {
            System.out.println(each);
        }
    }
}