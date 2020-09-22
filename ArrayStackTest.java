import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * Tests ArrayStack
 *
 */
public class ArrayStackTest {
  public static void main(String args[]) {
    ArrayStackTest test = new ArrayStackTest();
    test.test_isEmpty();
    test.test_push();
    test.test_peekTop();
    test.test_pop();
  }
  @Test
  /**
   * Tests the push method of the ArrayStack.
   */
  public void test_push() {
    /**
     * Tests the generic use of the push method.
     */
    ArrayStack<Integer> t1 = new ArrayStack<Integer>();
    t1.push(1);
    t1.push(2);
    assertEquals("ArrayStack should have pushed 2.", (int)t1.peekTop(), 2);
    t1.push(3);
    assertEquals("ArrayStack should have pushed 2.", (int)t1.peekTop(), 3);

    /**
     * Tests the end case of the push method(Array is full).
     */
    ArrayStack<Integer> t2 = new ArrayStack<Integer>();
    for (int i = 0; i < 100; i++) {
      t2.push(1);
    }
    try {
      t2.push(2);
      t2.push(2);
    } catch (Exception e) {
      System.out.println("ArrayStack is not able to push another integer.");
    }
  }

  /**
   * Tests the peekTop method of the ArrayStack.
   */
  public void test_peekTop() {
    /**
     * Tests the generic use of the peekTop method.
     */
    ArrayStack<Integer> t1 = new ArrayStack<Integer>();
    t1.push(1);
    t1.push(2);
    assertEquals("peekTop should have returned 2 but it returned " + (int)t1.peekTop(), (int)t1.peekTop(), 2);
    t1.push(3);
    assertEquals("peekTop should have returned 3 but it returned " + (int)t1.peekTop(), (int)t1.peekTop(), 3);

    /**
    *Tests end case of peekTop.
    */
    ArrayStack<Integer> t2 = new ArrayStack<Integer>();
    try{
      t2.peekTop();
    }
    catch(StackException e){
      System.out.println("You caught the StackException in peekTop!");
    }
  }
  /**
   * Tests the pop method of the ArrayStack.
   */
  public void test_pop() {
    /**
     * Tests the generic use of the pop method.
     */
    ArrayStack<Integer> t1 = new ArrayStack<Integer>();
    t1.push(1);
    t1.push(2);
    assertTrue("pop should have returned 2", (int)t1.pop()==2);
    assertTrue("pop did not remove the object on top of the stack", (int)t1.peekTop()==1);

    /**
    *Tests end case of pop.
    */
    ArrayStack<Integer> t2 = new ArrayStack<Integer>();
    try{
      t2.pop();
    }
    catch(StackException e){
      System.out.println("You caught the StackException in pop!");
    }
  }
  /**
   * Tests the isEmpty method of the ArrayStack.
   */
  public void test_isEmpty() {
    /**
     * Tests the generic use of the pop method.
     */
    ArrayStack<Integer> t1 = new ArrayStack<Integer>();
    assertTrue("isEmpty returned false when it should have returned true",t1.isEmpty());
    t1.push(1);
    assertFalse("isEmpty returned true when it should have returned false",t1.isEmpty());
  }

}
