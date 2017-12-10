

//题目描述
//        一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
public class logic_day8 {
    public static void main(String[] args) {
        int chance = JumpFloor(20);
        System.out.println("chance  = "+chance);
    }

    public static int JumpFloor(int target) {
        if(target <= 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        int before = 1,mid = 2,after = 0;
        for(int i = 3;i<=target;i++){
            after = before+mid;
            before =  mid;
            mid = after;
        }
        return after;
    }
}
