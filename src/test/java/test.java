import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
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
        Assert.assertEquals("null",fizzBuzz.isFizzbuss(1));
    }
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void should_trow_IAE_given_number_le_0() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Invalid input");
        fizzBuzz.isFizzbuss(0);
    }

}