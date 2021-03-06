import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.print.attribute.standard.Finishings;

//HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
//        今天测试组开完会后,他又发话了:在古老的一维模式识别中,
//        常常需要计算连续子向量的最大和,当向量全为正数的时候,
//        问题很好解决。但是,如果向量中包含负数,是否应该包含某个负数,
//        并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},
//        连续子向量的最大和为8(从第0个开始,到第3个为止)。
//        你会不会被他忽悠住？(子向量的长度至少是1)
public class logic_day16 {
    public static void main(String[] args) {
        int[] arr = {1,4,6,3,7,2,6,9};
        FindGreatestSumOfSubArray(arr);
    }
    public static int FindGreatestSumOfSubArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            int sum = 0;
            for(int j=i;j<array.length;j++){
                sum += array[j];
                list.add(sum);
            }
        }
        if(list.size() <=0) return 0;
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}
