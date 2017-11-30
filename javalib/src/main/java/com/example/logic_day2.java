import java.util.Arrays;
import java.util.Scanner;

//Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
//
//        If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
//
//        The replacement must be in-place, do not allocate extra memory.
//
//        Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
public class logic_day2 {
    public static void main(String[] args) {
        int[] num = {1,2,3,6,5,4,3,2};
        indexforbigNum(num);
    }

    public static void indexforbigNum(int[] nums){
        int len = nums.length;
        int s = 0;
        for(int i = len-1;i>0;i--){
            if (nums[i] > nums[i-1]){
                s = i-1;
                break;
            }
        }
        for(int j = len-1;j>s;j--){
            if(nums[s] < nums[j]){
                int temp = 0;
                temp = nums[s];
                nums[s] = nums[j];
                nums[j] = temp;
//                exchange(nums[s],nums[j]);
                break;
            }
        }

        System.out.println("s = "+ s);
        System.out.println("排序前"+ Arrays.toString(nums));
        for(int k = s+1,t = len-1;k<(k+(len-k-1)/2);k++,t--){
            int temp = 0;
            temp = nums[k];
            nums[k] = nums[t];
            nums[t] = temp;
//            exchange(nums[k],nums[t]);
        }
        System.out.println("比输入大的最小的数是"+ Arrays.toString(nums));
    }

    //java不能传数组的地址，不能单独写方法
    public static void exchange(int a,int b){
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
    }
}
