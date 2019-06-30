public class GoldenSection {
    public static void main(String[] args) {
        boolean x_even;
        float tmp,limit = (1.0f - 0.618f);
        final float GOLDEN = 0.618f;
        float limit_x=0.0f, limit_y=0.0f;
        for(int x=1;x<=20;x++) {
            if (x%2==1)
                x_even = false;
            else
                x_even = true;

            for(int y=x+1;y<=20;y++) {
                if(y%2==0 && x_even)
                    continue;

                tmp = (float)x/y - GOLDEN;
                if(tmp < 0)
                        tmp = -tmp;

                if(tmp < limit) {
                    limit = tmp;
                    limit_x = x;
                    limit_y = y;
                }
            }
        }
        System.out.println("离黄金分割点(0.618)最近的两个数相除是"
                +(int)limit_x+"/"+(int)limit_y+"="+(limit_x/limit_y));
    }
}