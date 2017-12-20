
import java.util.Arrays;

//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
//        例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
//        由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
public class logic_day15 {
    public static void main(String[] args) {
        int[] array = {5,3,6,11,2,7,3,7,6,2,8};
        MoreThanHalfNum_Solution(array);
    }
    public static int MoreThanHalfNum_Solution(int [] array) {
        int len=array.length;
        if(len<1){
            return 0;
        }
        int count=0;
        Arrays.sort(array);
        int num=array[len/2];
        for(int i=0;i<len;i++){
            if(num==array[i])
                count++;
        }
        if(count<=(len/2)){
            num=0;
        }
        return num;
    }
}
