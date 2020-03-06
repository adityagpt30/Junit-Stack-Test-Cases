package SoftwareProcess;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
public class TestCase {
private static int stack_size = 4;
stack s = new stack(stack_size);
 @Test public void Test1() //Test Push and Push Stack Full
{
 assertEquals(s.isEmpty(), Boolean.TRUE);
 s.push(1);
 s.push(2);
 s.push(3);
 s.push(4);
 }
 // If we push any other element in above test case i.e "s.push(5);", then it will
print "Stack is Full".

@Test public void Test2() //Test Pop
{
assertEquals(s.isEmpty(), Boolean.TRUE);
s.push(1);
s.push(2);
assertEquals(2, s.pop());
assertEquals(1, s.pop());
}
// So in this we inserted two values and removed both the values using normal
pop.
@Test public void Test3() //Test Pop Stack full
{
 assertEquals(s.isEmpty(), Boolean.TRUE);
 s.push(1);
 assertEquals( 1, s.pop());
}
// In this will pop on this first element an we can even push other elements
and pop them.
@Test public void Test4() //Test push then pop
{
int a ='4';
s.push(a);
assertEquals(a,s.pop());
}
}