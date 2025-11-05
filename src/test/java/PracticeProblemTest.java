import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class PracticeProblemTest {

@Test
@DisplayName("")
void fibonacciTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
