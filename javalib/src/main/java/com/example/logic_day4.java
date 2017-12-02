import java.util.Arrays;

public class logic_day4 {
    public static void main(String[] args) {
        int[] input = {2,6,7,4,3,2,1,5,8,4};
        System.out.println(Arrays.toString(xuanze(input)));

    }

//选择排序
    public static int[] xuanze(int[] s){
        int temp = 0;
        int len = s.length;
        System.out.println("len = "+len);
        for(int i = 0;i<len;i++){
            for(int j = i+1;j<len;j++){
                if(s[i] > s[j]){
                    temp = s[j];
                    s[j] = s[i];
                    s[i] = temp;
                }
            }
        }
        return s;
    }
}
