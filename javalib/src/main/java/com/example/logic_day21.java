//有一个长为n的数组A，求满足0≤a≤b<n的A[b]-A[a]的最大值。
//
//        给定数组A及它的大小n，请返回最大差值。

public class logic_day21 {
    public static void main(String[] args) {
        int[] a = {1,4,7,5,3,67,6,8,3,5};
        getDis(a,10);
    }
    public static int getDis(int[] A, int n) {
        // write code here
        int B=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(B<(A[i]-A[j])){
                    B=A[i]-A[j];
                }
            }
        }

        return B;

    }
}
