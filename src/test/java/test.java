import org.junit.Assert;
import org.junit.Test;
//import static org.assertj.core.api.Assertions.

public class test {
    @Test
    public void test1(){
        Assert.assertEquals("Fizz",fizzBuzz.isFizzbuss(3));
         }
    @Test
    public void test2(){
        Assert.assertEquals("Buzz",fizzBuzz.isFizzbuss(5));
         }
    @Test
    public void test3(){
        Assert.assertEquals("FizzBuzz",fizzBuzz.isFizzbuss(15));
          }
    @Test
    public void test4(){
        Assert.assertEquals("1",fizzBuzz.isFizzbuss(1));
    }
}