


//链接：https://www.nowcoder.com/questionTerminal/a2d5b1875bb0408384278f40d1f236c9
//        来源：牛客网
//
//        一个合法的括号匹配序列有以下定义:
//        1、空串""是一个合法的括号匹配序列
//        2、如果"X"和"Y"都是合法的括号匹配序列,"XY"也是一个合法的括号匹配序列
//        3、如果"X"是一个合法的括号匹配序列,那么"(X)"也是一个合法的括号匹配序列
//        4、每个合法的括号序列都可以由以上规则生成。
//        例如: "","()","()()","((()))"都是合法的括号序列
//        对于一个合法的括号序列我们又有以下定义它的深度:
//        1、空串""的深度是0
//        2、如果字符串"X"的深度是x,字符串"Y"的深度是y,那么字符串"XY"的深度为max(x,y) 3、如果"X"的深度是x,那么字符串"(X)"的深度是x+1
//        例如: "()()()"的深度是1,"((()))"的深度是3。牛牛现在给你一个合法的括号序列,需要你计算出其深度。
//输入描述:
//        输入包括一个合法的括号序列s,s长度length(2 ≤ length ≤ 50),序列中只包含'('和')'。
//输出描述:
//        输出一个正整数,即这个序列的深度。
public class logic_day7 {
    public static void main(String[] args) {
        String s= "()()()()(()((()()))())";
        int depth = getStringDepth(s);
        System.out.println("depth = "+depth);
        System.out.println("递归斐波那契数列第30位 = "+RFibonacci(30));
        System.out.println("非递归斐波那契数列第30位 = "+Fibonacci(30));
    }

    private static int RFibonacci(int i) {
        if(i == 0){
            return 0;
        }else if(i == 1){
            return 1;
        }else {
            return RFibonacci(i-1)+RFibonacci(i-2);
        }

    }

    private static int getStringDepth(String s) {
        int len = s.length();
        int max = 0;
        int depth = 0;
        for(int i=0;i<len;i++){
            if(s.charAt(i) == '('){
                depth++;
                max = Math.max(max,depth);
            }else {
                depth--;
            }

        }
        return max;
    }

    //非递归求斐波那契数列
    public static int Fibonacci(int n) {
        int a=1,b=1,c=0;
        if(n==0){
            return 0;
        }else if(n == 1||n==2){
            return 1;
        }else{
            for(int i =3;i<=n;i++){
                c = a+b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}
