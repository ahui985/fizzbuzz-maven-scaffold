public class fizzBuzz {

    public static String isFizzbuss(int i){
        //最小公倍数计算
        if(i % 15 ==0)return "FizzBuzz";
        if(i % 3 ==0) return "Fizz";
        if(i % 5 ==0) return "Buzz";
        return String.valueOf(i);
    }
    public static void main(String[] args) {

        for (int i=1; i<=100; i++) {
            System.out.println(isFizzbuss(i));

        }

    }
}
