import java.util.Arrays;

public class logic_day4 {
    public static void main(String[] args) {
        int[] input = {2,6,7,4,3,2,1,5,8,4};
        System.out.println("选择排序"+Arrays.toString(xuanze(input)));
        System.out.println("冒泡排序"+Arrays.toString(maopao(input)));
        System.out.println("插入排序"+Arrays.toString(insertSort(input)));
        System.out.println("快速排序"+Arrays.toString(kuaisusort(input,0,input.length-1)));
        System.out.println("希尔排序"+Arrays.toString(shellSort(input)));


    }
    //test

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

    public static int partition(int []array,int lo,int hi){
        //固定的切分方式
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){//从后半部分向前扫描
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){//从前半部分向后扫描
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
        return hi;
    }

    public static int[] kuaisusort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return array;
        }
        int index=partition(array,lo,hi);
        kuaisusort(array,lo,index-1);
        kuaisusort(array,index+1,hi);
        return array;
    }

    public static int[] shellSort(int[] s){
        int len = s.length;
        if(len < 2){
            return s;
        }
        int index =0;
        for(index = len/2;index >1;index/=2){
            for(int i= len-index-1;i<len;i++){
                for(int j=i-index;j>0;j-=index){
                    if(s[j]>s[j+index]){
                        swap(s,j,j+index);
                    }
                }
            }
        }

        return s;
    }

    private static void swap(int[] s, int a, int b) {
        int temp = 0;
        temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}
