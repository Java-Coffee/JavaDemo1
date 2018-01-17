//世界上有10种人，一种懂二进制，一种不懂。
//        那么你知道两个int32整数m和n的二进制表达，有多少个位(bit)不同么？
public class logic_day20 {
    public static void main(String[] args) {
        countBitDiff(67,125);
    }
    /**
     * 获得两个整形二进制表达位数不同的数量
     *
     * @param m 整数m
     * @param n 整数n
     * @return 整型
     */
    public static int countBitDiff(int m, int n) {
        int[] a =new int[1000];int[] b=new int[1000];
        int i=0,j=0,k,count=0;
        while(m!=0){
            a[i]=m%2;
            m/=2;
            i++;
        }
        while(n!=0){
            b[j]=n%2;
            n/=2;
            j++;
        }
        int max;max=i>j?i:j;
        for(k=0;k<max;k++)
            if(a[k]!=b[k])
                count++;
        return count;
    }
}
