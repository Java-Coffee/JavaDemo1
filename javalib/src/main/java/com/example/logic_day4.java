import java.util.Arrays;

public class logic_day4 {
    public static void main(String[] args) {
        int[] input = {2,6,7,4,3,2,1,5,8,4};
        System.out.println("选择排序"+Arrays.toString(xuanze(input)));
        System.out.println("冒泡排序"+Arrays.toString(maopao(input)));
        System.out.println("插入排序"+Arrays.toString(insertSort(input)));

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

    public static int[] maopao(int[] s){
        int temp = 0;
        int len = s.length;
        for(int i = 0;i<len;i++){
            for(int j = i;j<len-i-1;j++){
                if(s[j] > s[j+1]){
                    temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
        return s;
    }

    public static int[] insertSort(int[] s){
        int index = 0;//要插入的位置
        int temp = 0;
        for(int i = 1;i<s.length;i++){
            temp = s[i];
            index = i;  //初始要插入的位置
            for (int j = i-1;j>= 0;j--){
                if(s[j]<temp)break;
                index = j;
                s[j+1] = s[j];
            }
            s[index] = temp;
        }
        return s;
    }
}
