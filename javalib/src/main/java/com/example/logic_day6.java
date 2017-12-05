import java.util.Arrays;

//堆排序
public class logic_day6 {
    private static int[] sort=new int[]{5,4,7,4,9,1,3,2,6,11,
            10};

    public static void main(String[] args) {
        buildheap(sort);
        heapSort(sort);
        System.out.println("堆排序"+ Arrays.toString(sort));

    }

    private static void buildheap(int[] s){
        int start = getParentIndex(s.length);

        for(int i= start;i>=0;i--){
            maxHeap(s,s.length,i);
        }
    }

    private static void maxHeap(int[] s, int length, int i) {
        int left = i*2+1;
        int right = i*2+2;
        int max = i;
        if(left>= length){
            return;
        }
        if(left < length && s[left]>s[i]){
            max = left;
        }
        if(right < length && s[right]>s[max]){
            max = right;
        }
        if(max != i){
            int temp = s[max];
            s[max] = s[i];
            s[i] = temp;
            maxHeap(s,length,max);
        }
    }

    private static void heapSort(int[] s){
        int len = s.length;
        int temp = 0;
        for(int i =len-1;i>0;i--){
            temp = s[i];
            s[i] = s[0];
            s[0] = temp;
            maxHeap(s,i,0);
        }
    }

    private static int getParentIndex(int len){
        return len/2;
    }

    }
