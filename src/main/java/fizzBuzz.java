public class fizzBuzz {

    public static String isFizzbuss(int i) {
        //最小公倍数计算
        String returnValue = "";
        if (i % 15 == 0) {
            returnValue = "FizzBuzz";
        }
        if (i % 3 == 0) {
            returnValue = "Fizz";
        }
        if (i % 5 == 0) {
            returnValue = "Buzz";
        }
        returnValue = String.valueOf(i);
        return returnValue;
    }
    /**
     * 主类 运行方法
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println(isFizzbuss(i));

        }

    }
}
