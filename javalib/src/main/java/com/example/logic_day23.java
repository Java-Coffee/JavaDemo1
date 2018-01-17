//春节期间小明使用微信收到很多个红包，非常开心。在查看领取红包记录时发现，
//        某个红包金额出现的次数超过了红包总数的一半。请帮小明找到该红包金额。
//        写出具体算法思路和代码实现，要求算法尽可能高效。
//        给定一个红包的金额数组gifts及它的大小n，请返回所求红包的金额。
//        若没有金额超过总数的一半，返回0。
public class logic_day23 {
    public static void main(String[] args) {
        int[] gifts = {3,7,2,5,1};
        getValue(gifts,5);
    }
    public static int getValue(int[] gifts, int n) {
        // write code here
        int count=1;
        int re=gifts[0];
        for(int i=1;i<n;i++){
            if(gifts[i]!=re){
                count--;
                if(count==0)
                {
                    count=1;
                    re=gifts[i];


                }

            }else{
                count++;
            }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(gifts[i]==re){
                count++;
            }

        }
        if(count>n/2){
            return re;
        }else return 0;


    }

}
